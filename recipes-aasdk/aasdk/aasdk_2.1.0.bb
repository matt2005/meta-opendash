SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "AndroidAuto SDK" 
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://../git/CMakeLists.txt;md5=2a71911262da0e390c161bb44d29f979"
SRC_URI = "git://github.com/Opendsh/aasdk.git;protocol=https;branch=develop"
SRCREV = "develop"
DEPENDS += " protobuf protobuf-native boost libusb"
inherit cmake
EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release ../git"
# this is a revision number that should be updated every time you alter this recipe
PR = "r1" 

# this indicates the folder to run do_compile from.
S="${WORKDIR}/aasdk"
