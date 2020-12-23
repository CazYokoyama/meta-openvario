SUMMARY = "NetCDF (network Common Data Form)"
DESCRIPTION = "creation, access, and sharing of array-oriented scientific data."
HOMEPAGE = "https://github.com/Unidata/netcdf-c"
LICENSE = "UCAR"
LIC_FILES_CHKSUM = "file://COPYRIGHT;endline=29;md5=17c864f08a4445fe9c41226785e9ed10"
SECTION = "x11"
PR = "0"

DEPENDS = " \
    curl \
    zlib \
"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/Unidata/netcdf-c.git;protocol=git;branch=v${PV}.1-prep.wif;rev=v${PV}.1-prep.wif \
"

SRC_URI[md5sum] = "5599a0e0a97335e10239d9165aced60d"
SRC_URI[sha256sum] = "f6f484cfcd51e489afe88031afdea1e173aa652697e4c19ddbcb8260579a10f7"

EXTRA_OECONF = " \
    --disable-netcdf-4 \
    --disable-dap \
    --disable-largefile \
    --disable-testsets \
    --disable-utilities \
    --disable-examples \
    --disable-doxygen \
    --disable-maintainer-mode \
    --disable-examples \
"

FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/*.so \
    ${libdir}/*.la \
"

FILES_${PN} = " \
    ${bindir} \
    ${libdir}/*.so.* \
    ${libdir}/*.settings \
    ${libdir}/pkgconfig/ \
    ${libdir}/share/ \
"
