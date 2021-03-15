SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "OpenDsh" 
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://../git/README.md;md5=0090cf601ee0c561e539b55422b61b88 "
SRC_URI = "git://github.com/opendsh/dash.git;protocol=https;branch=develop"
SRCREV = "develop"
DEPENDS += " aasdk openauto"
inherit cmake
EXTRA_OECMAKE += "-DCMAKE_INSTALL_INCLUDEDIR=include -DQT_VERSION=5 -DCMAKE_BUILD_TYPE=Release -DCMAKE_CXX_FLAGS=-std=c++11"
EXTRA_OECMAKE += "-DCMAKE_CXX_FLAGS=-pthread"
EXTRA_OECMAKE += "-DCMAKE_CXX_FLAGS=-rdynamic"
# this is a revision number that should be updated every time you alter this recipe
PR = "r2" 

# this indicates the folder to run do_compile from.
S="${WORKDIR}/git"
