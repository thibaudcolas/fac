
package com.example.project;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Xml;

/**
 * This class parses XML feeds from stackoverflow.com.
 * Given an InputStream representation of a feed, it returns a List of entries,
 * where each list element represents a single Image (post) in the XML feed.
 */
public class XmlParserImage {
    private static final String ns = null;

    // We don't use namespaces

    public ArrayList<Image> parse(InputStream in) throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);
            parser.nextTag();
            return readFeed(parser);
        } finally {
            in.close();
        }
    }

    private ArrayList<Image> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList<Image> entries = new ArrayList<Image>();

        parser.require(XmlPullParser.START_TAG, ns, "feed");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            // Starts by looking for the Image tag
            if (name.equals("Image")) {
                entries.add(readImage(parser));
            } else {
                skip(parser);
            }
        }
        return entries;
    }

    // This class represents a single Image (post) in the XML feed.
    // It includes the data members "title," "link," and "summary."
    public static class Image {
        public final String name_en;
        public final String name_fr;
        public final String address;

        private Image(String name_en, String name_fr, String address) {
            this.name_en = name_en;
            this.name_fr = name_fr;
            this.address = address;
        }
    }

    // Parses the contents of an Image. If it encounters a title, summary, or link tag, hands them
    // off
    // to their respective &quot;read&quot; methods for processing. Otherwise, skips the tag.
    private Image readImage(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "Image");
        String name_en = null;
        String name_fr = null;
        String address = null;
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("name_en")) {
                name_en = readReponseEN(parser);
            } else if (name.equals("name_fr")) {
                name_fr = readReponseFR(parser);
            } else if (name.equals("address")) {
                address = readAddress(parser);
            } else {
                skip(parser);
            }
        }
        return new Image(name_en, name_fr, address);
    }

 // Processes name_en tags in the feed.
    private String readReponseEN(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "name_en");
        String name = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "name_en");
        return name;
    }
    // Processes name_fr tags in the feed.
    private String readReponseFR(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "name_fr");
        String name = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "name_fr");
        return name;
    }

    // Processes summary tags in the feed.
    private String readAddress(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "address");
        String address = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "address");
        return address;
    }

    // For the tags title and summary, extracts their text values.
    private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

    // Skips tags the parser isn't interested in. Uses depth to handle nested tags. i.e.,
    // if the next tag after a START_TAG isn't a matching END_TAG, it keeps going until it
    // finds the matching END_TAG (as indicated by the value of "depth" being 0).
    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
            case XmlPullParser.END_TAG:
                    depth--;
                    break;
            case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }
}
