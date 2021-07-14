include qt-gstreamer.inc

# this is a revision number that should be updated every time you alter this recipe
PR = "r17" 

SRC_URI = " \
    git://github.com/GStreamer/qt-gstreamer.git;branch=master;protocol=http \
    file://0002-FindQt4or5.cmake-Optionally-create-qt5_use_modules-t.patch \
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
    ${libdir}/gstreamer-1.0/* \
    ${libdir}/qt5/qml \
"

FILES_${PN}-dbg += "\
    ${libdir}/gstreamer-1.0/.debug/* \
"

FILES_${PN}-dev += "${libdir}/cmake/* \
                    ${libdir}/cmake/QtGStreamer/* \
                   "

FILES_${PN}-examples += " \
    /usr/share/qt5/examples \
"

do_install_append() {
    mkdir -p ${D}/usr/share/qt5/examples/qt-gstreamer/
    install ${B}/examples/qmlplayer2/qmlplayer2 ${D}/usr/share/qt5/examples/qt-gstreamer/
    install -d ${D}${datadir}/qt5/examples/${P}
    install -m 0755 ${B}/examples/qmlplayer2/qmlplayer2 ${D}${datadir}/qt5/examples/${P}
}