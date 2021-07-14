include qt-gstreamer.inc

# this is a revision number that should be updated every time you alter this recipe
PR = "r12" 

SRC_URI = " \
    git://github.com/GStreamer/qt-gstreamer.git;branch=master;protocol=http \
"
SRCREV = "6e4fb2f3fcfb453c5522c66457ac5ed8c3b1b05c"

S="${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_VERSION=5 \
    -DUSE_QT_PLUGIN_DIR=OFF \
"

FILES_${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_IMPORTS} \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"
