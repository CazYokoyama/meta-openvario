SUMMARY = "NetCDF (network Common Data Form)"
DESCRIPTION = "creation, access, and sharing of array-oriented scientific data."
HOMEPAGE = "https://github.com/Unidata/netcdf-cxx4"
LICENSE = "UCAR"
LIC_FILES_CHKSUM = "file://COPYRIGHT;endline=29;md5=cca64d344374f6c5b5b5a9b68c47c808"
SECTION = "x11"
PR = "0"

DEPENDS = " \
    netcdf-c \
"

inherit autotools pkgconfig

S = "${WORKDIR}/${P}"

SRC_URI = " \
    ftp://ftp.unidata.ucar.edu/pub/netcdf/netcdf-cxx-4.2.tar.gz \
"
SRC_URI[md5sum] = "d32b20c00f144ae6565d9e98d9f6204c"
SRC_URI[sha256sum] = "95ed6ab49a0ee001255eac4e44aacb5ca4ea96ba850c08337a3e4c9a0872ccd1"

EXTRA_OECONF = " \
    --disable-large-file-tests \
    --disable-extra-tests \
    --disable-valgrind-tests \
"

FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/*.so \
    ${libdir}/*.la \
"

FILES_${PN} = " \
    ${bindir} \
    ${libdir}/*.so.* \
    ${libdir}/pkgconfig/ \
    ${libdir}/share/ \
"
