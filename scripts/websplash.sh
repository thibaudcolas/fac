#!/usr/bin/env bash
# https://github.com/emarref/webicon
# http://mobile.tutsplus.com/tutorials/iphone/iphone-web-app-meta-tags/

######################################
# INITIALIZE VARS

CONVERT_CMD=`which convert`
SRC_IMAGE=$1
PWD=`pwd`
TRANSPARENT_COLOUR="#FFFFFF"
IMAGE_NAME="splashscreen"
SPLASH_DIR="/sites/all/themes/cofinogafr/images/splashscreens"

######################################
# REQUIREMENTS

if [ -z $CONVERT_CMD ] || [ ! -f $CONVERT_CMD ] || [ ! -x $CONVERT_CMD ];
then
    echo "ImageMagick needs to be installed to run this script"
    exit;
fi

if [ -z $SRC_IMAGE ];
then
    echo "You must supply a source image as the argument to this command."
    exit;
fi

if [ ! -f $SRC_IMAGE ];
then
    echo "Source image \"$SRC_IMAGE\" does not exist."
    exit;
fi

function generate_png {
    local WIDTH=$1
    local HEIGHT=$2
    local SOURCE=$3

    if [ -z "$SOURCE" ]; then
        SOURCE="$IMAGE_NAME-1496x2048.png"
    fi

    if [ -z $SOURCE ];
    then
        echo "Could not find the source image $SOURCE"
        exit 1;
    fi

    echo "$IMAGE_NAME-${WIDTH}x${HEIGHT}.png"
    $CONVERT_CMD $SOURCE -resize ${WIDTH}x${HEIGHT}! -alpha On $IMAGE_NAME-${WIDTH}x${HEIGHT}.png
}

echo "Generating square base image"
# Converts the source image to 256 square, ignoring aspect ratio
generate_png 1496 2048 $SRC_IMAGE

######################################
# GENERATE THE VARIOUS SIZE VERSIONS

echo "Generating required versions at different sizes"
# <!-- iPhone -->
generate_png 320 460
# <!-- iPhone (Retina) -->
generate_png 640 920
# <!-- iPhone 5 -->
generate_png 640 1096
# <!-- iPad -->
generate_png 768 1004
generate_png 748 1024
# <!-- iPad (Retina) -->
generate_png 1536 2008
generate_png 1496 2048

cat << EOF > splashscreens.txt
/**
 * A list of splashscreens generated by the script websplash.sh.
 *
 * @return array
 *   Renderable array of meta tags.
 */
function _cofinogafr_get_splashscreens() {
  return array(
    'ios-320x460' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-320x460.png',
        'media' => '(device-width: 320px) and (device-height: 480px) and (-webkit-device-pixel-ratio: 1)',
      ),
    ),
    'ios-640x920' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-640x920.png',
        'media' => '(device-width: 320px) and (device-height: 480px) and (-webkit-device-pixel-ratio: 2)',
      ),
    ),
    'ios-640x1096' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-640x1096.png',
        'media' => '(device-width: 320px) and (device-height: 568px) and (-webkit-device-pixel-ratio: 2)',
      ),
    ),
    'ios-768x1004' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-768x1004.png',
        'media' => '(device-width: 768px) and (device-height: 1024px) and (orientation: portrait) and (-webkit-device-pixel-ratio: 1)',
      ),
    ),
    'ios-748x1024' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-748x1024.png',
        'media' => '(device-width: 768px) and (device-height: 1024px) and (orientation: landscape) and (-webkit-device-pixel-ratio: 1)',
      ),
    ),
    'ios-1536x2008' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-1536x2008.png',
        'media' => '(device-width: 768px) and (device-height: 1024px) and (orientation: portrait) and (-webkit-device-pixel-ratio: 2)',
      ),
    ),
    'ios-1496x2048' => array(
      '#type' => 'html_tag',
      '#tag'  => 'link',
      '#attributes' => array(
        'rel'   => 'apple-touch-startup-image',
        'href'  => '${SPLASH_DIR}/${IMAGE_NAME}-1496x2048.png',
        'media' => '(device-width: 768px) and (device-height: 1024px) and (orientation: landscape) and (-webkit-device-pixel-ratio: 2)',
      ),
    ),
  );
}
EOF

cat splashscreens.txt
