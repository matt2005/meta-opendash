SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "OpenDsh" 
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://../git/README.md;md5=0090cf601ee0c561e539b55422b61b88 "
SRC_URI = "git://github.com/opendsh/dash.git;protocol=https;branch=develop"
SRCREV = "develop"
DEPENDS += " aasdk-2.1.0 openauto"
inherit cmake
EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DGST_BUILD=true ../git"
# this is a revision number that should be updated every time you alter this recipe
PR = "r1" 

# this indicates the folder to run do_compile from.
S="${WORKDIR}/dash"
