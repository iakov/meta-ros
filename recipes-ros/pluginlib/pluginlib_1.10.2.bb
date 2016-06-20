DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins \
using the ROS build infrastructure."
SECTION = "devel"
LICENSE = "BSD & BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=10;md5=e97956c107f28cc579092e85d3b5fb8f"

DEPENDS = "boost class-loader rosconsole roslib libtinyxml"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f839e0d81741d0f2f6aca175e28ba1c5"
SRC_URI[sha256sum] = "2ff0ec664c8b3c3d8a5c8f14e654a19dcfb4c06d7e2bb3756c4ea23691e5a9ee"

inherit catkin
