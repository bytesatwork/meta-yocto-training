SUMMARY = "Simple helloworld application using a Makefile and a dependency"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c \
	   file://Makefile"

S = "${WORKDIR}"

do_install() {
	oe_runmake install DESTDIR=${D}
}

DEPENDS += "libgpg-error"
