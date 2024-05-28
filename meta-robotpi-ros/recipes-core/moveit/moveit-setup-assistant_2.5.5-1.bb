# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt"
AUTHOR = "Henning Kayser <henningkayser@picknik.ai>"
ROS_AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_setup_assistant"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    moveit-setup-framework \
    moveit-setup-srdf-plugins \
    pluginlib \
    qtbase \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    moveit-setup-framework \
    moveit-setup-srdf-plugins \
    pluginlib \
    qtbase \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    moveit-setup-app-plugins \
    moveit-setup-controllers \
    moveit-setup-core-plugins \
    moveit-setup-framework \
    moveit-setup-srdf-plugins \
    pluginlib \
    qtbase \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-clang-format \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
    ament-lint-auto \
    moveit-resources-panda-moveit-config \
"

EXTRA_OECMAKE += "-DOE_QMAKE_PATH_EXTERNAL_HOST_BINS='${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}'"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/moveit2-release/archive/release/humble/moveit_setup_assistant/2.5.5-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/moveit_setup_assistant"
SRC_URI = "git://github.com/ros2-gbp/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca793eae0a0487577d3c3c4f73f8c8a0c127c108"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit qmake5
inherit ros_${ROS_BUILD_TYPE}
