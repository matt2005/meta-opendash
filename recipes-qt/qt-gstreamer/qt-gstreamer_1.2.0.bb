include qt-gstreamer.inc

# this is a revision number that should be updated every time you alter this recipe
PR = "r5" 

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/${BPN}/${BPN}-${PV}.tar.xz \
    file://0001-Fix-compilation-with-GStreamer-1-5-1.patch \
    file://0002-FindQt4or5.cmake-Optionally-create-qt5_use_modules-t.patch \
"

SRC_URI[md5sum] = "fd794045a828c184acc1794b08a463fd"
SRC_URI[sha256sum] = "9f3b492b74cad9be918e4c4db96df48dab9c012f2ae5667f438b64a4d92e8fd4"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_VERSION=5 \
    -DUSE_QT_PLUGIN_DIR=OFF \
	-DCMAKE_CXX_FLAGS=-std=c++11 \
"

FILES_${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_IMPORTS} \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"
