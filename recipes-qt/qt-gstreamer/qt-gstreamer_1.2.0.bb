include qt-gstreamer.inc

# this is a revision number that should be updated every time you alter this recipe
PR = "r13" 

SRC_URI = " \
    git://github.com/GStreamer/qt-gstreamer.git;branch=master;protocol=http \
    file://0002-FindQt4or5.cmake-Optionally-create-qt5_use_modules-t.patch \
    file://gstreamer-1.16.patch \
    file://gstreamer-1.6.patch \
    file://qt-gstreamer-1.18.patch \
    file://qt-gstreamer-gcc11.patch \
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
