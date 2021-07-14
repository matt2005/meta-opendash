require recipes-qt/qt5/qt5.inc

SUMMARY = "QtGStreamer is a set of libraries providing C++ bindings for GStreamer"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1"

SECTION = "multimedia"
DEPENDS += " \
    glib-2.0 \
    boost \
    qtbase \
    qtquickcontrols2 \
    qtdeclarative \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
"
inherit cmake_qt5

PACKAGECONFIG ??= "examples"
PACKAGECONFIG[examples] = "-DQTGSTREAMER_EXAMPLES=ON, -DQTGSTREAMER_EXAMPLES=OFF"
