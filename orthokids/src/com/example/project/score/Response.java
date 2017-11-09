package com.example.project.score;

public class Response {

    private Long id;
    /** Not-null value. */
    private String lang;
    /** Not-null value. */
    private String value;
    private long imageId;

    public Response() {
    }

    public Response(Long id) {
        this.id = id;
    }

    public Response(Long id, String lang, String value, long imageId) {
        this.id = id;
        this.lang = lang;
        this.value = value;
        this.imageId = imageId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getLang() {
        return lang;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /** Not-null value. */
    public String getValue() {
        return value;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setValue(String value) {
        this.value = value;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

}
