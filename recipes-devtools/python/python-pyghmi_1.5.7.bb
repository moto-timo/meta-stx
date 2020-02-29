DESCRIPTION = "HPE 3PAR HTTP REST Client"
HOMEPAGE = "https://pythonhosted.org/python-3parclient/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=d3dfac7b0d23cb44b097e35518879438"

SRC_URI[md5sum] = "b49dd03782fd5eda09cd9210ae979f6a"
SRC_URI[sha256sum] = "4c2b0be4e3b8a517c1718e39e1eeb3e62f73810bb9910278000716f6074e5a69"

PYPI_PACKAGE = "pyghmi"
inherit setuptools pypi

DEPENDS += " \
	python-pbr-native \
	"

RDEPENDS_${PN}_append = " \
	python-dateutil \
	"
