LIC_FILES_CHKSUM = "file://../git/CMakeLists.txt;md5=8a99c155d021c9bd1fc088fdd7340b98"
SRC_URI = "git://github.com/opendsh/openauto.git;protocol=https;branch=develop"
SRCREV = "develop"
DEPENDS += " cmake protobuf protobuf-native aasdk pulseaudio taglib librtaudio qtmultimedia qtconnectivity gcc-runtime gstreamer1.0 gstreamer1.0-plugins-base qt-gstreamer"
inherit cmake_qt5
EXTRA_OECMAKE += '-DCMAKE_BUILD_TYPE=Release -DRPI_BUILD=TRUE -DGST_BUILD=TRUE ../git'
