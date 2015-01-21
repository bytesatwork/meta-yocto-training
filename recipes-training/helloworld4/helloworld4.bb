SUMMARY = "Simple helloworld application with a service"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c \
	   file://Makefile \
	   file://init \
	   "

inherit update-rc.d

S = "${WORKDIR}"

INITSCRIPT_NAME = "helloworld"
INITSCRIPT_PARAMS = "defaults"

do_install() {
	oe_runmake install DESTDIR=${D}
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${S}/init ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
}
