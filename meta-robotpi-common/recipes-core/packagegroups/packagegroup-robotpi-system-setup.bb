# Copyright (c) 2024 Robot Pi Inc.

SUMMARY = "System setup packages for Robot Pi OS"

# Need this because the recipe uses MACHINE overrides.
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup
inherit ros_distro_${ROS_DISTRO}

SYSTEM_SETUP_PKGS ??= " \
    robot-setup-scripts \
    connman-autoconfig \
"

RDEPENDS:${PN} = " \
    ${SYSTEM_SETUP_PKGS} \
    tzdata \
"