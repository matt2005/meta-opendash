SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "OpenDsh" 
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://../git/README.md;md5=0090cf601ee0c561e539b55422b61b88 "
SRC_URI = "git://github.com/opendsh/dash.git;protocol=https;branch=develop \
           file://0001-yocto-fix.patch \
           "
SRCREV = "develop"
DEPENDS += " libpthread-stubs cmake protobuf protobuf-native aasdk pulseaudio taglib librtaudio qtmultimedia qtconnectivity gcc-runtime gstreamer1.0 gstreamer1.0-plugins-base qt-gstreamer boost aasdk openauto bluez-qt"
inherit cmake
EXTRA_OECONF += " \
    --enable-pthreads \
    --extra-cflags="${CFLAGS} ${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}" \
    --extra-ldflags="${LDFLAGS}" \
"
EXTRA_OECMAKE += " -DGST_BUILD=true -DRPI_BUILD=true -DCMAKE_BUILD_TYPE=Release"
# this is a revision number that should be updated every time you alter this recipe
PR = "r5" 

# this indicates the folder to run do_compile from.
S="${WORKDIR}/git"