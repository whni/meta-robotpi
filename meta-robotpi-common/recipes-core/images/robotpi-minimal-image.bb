SUMMARY = "Robot Pi minimal image"

IMAGE_FEATURES += "splash enable-adbd"

LICENSE = "MIT"

inherit core-image features_check extrausers image-adbd

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = "pam systemd"

CORE_IMAGE_BASE_INSTALL += " \
    kernel-modules \
"

EXTRA_USERS_PARAMS = "\
useradd -p '' robotpi; \
"
