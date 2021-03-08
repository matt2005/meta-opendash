SUMMARY = "OpenDsh production image"

include ivi-base-image.bb

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

IMAGE_BASENAME = "${MACHINE}_OpenDsh-Image-Yocto"

IMAGE_INSTALL_append = " aadsk openauto opendsh"
