HOMEPAGE = "http://github.com/openbmc/dbus-top"
PR = "r1"
PV = "1.0+git${SRCPV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI += "git://github.com/openbmc/dbus-top;protocol=https;branch=main"
SRCREV = "f5c0b9d9a5860273c8f79b81971777ca84cb9180"

S = "${WORKDIR}/git"
inherit meson pkgconfig

SUMMARY = "DBus-Top"
DESCRIPTION = "A top-like tool for DBus."

DEPENDS += "systemd"
DEPENDS += "sdbusplus"
DEPENDS += "ncurses"
DEPENDS += "fmt"
