SUMMARY = "OpenDsh production image"

include recipes-sato/images/core-image-sato.bb

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

IMAGE_BASENAME = "${MACHINE}_OpenDsh-Image-Yocto"

IMAGE_INSTALL_append = " aasdk-2.1.0 openauto opendsh"
