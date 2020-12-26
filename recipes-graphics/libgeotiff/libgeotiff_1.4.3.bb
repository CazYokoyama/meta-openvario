SUMMARY = "extraction and parsing of the "GeoTIFF" Key directories"
DESCRIPTION = "extraction and parsing of the "GeoTIFF" Key directories."
HOMEPAGE = "https://github.com/OSGeo/libgeotiff"
LICENSE = "Warmerdam"
LIC_FILES_CHKSUM = "file://COPYING;endline=29;md5=e99dbe0cce55f0471235200ae75c772e"
SECTION = "x11"
PR = "0"

DEPENDS = " \
    zlib \
    jpeg \
    tiff \
"

inherit autotools pkgconfig

S = "${WORKDIR}/git/libgeotiff"

SRC_URI = " \
    git://github.com/OSGeo/libgeotiff.git;protocol=git;tag=${PV} \
"

EXTRA_OECONF = " \
    --disable-doxygen-doc \
    --disable-doxygen-dot \
    --disable-doxygen-man \
    --without-proj \
"
do_configure() {
    cd ${S}
    ./autogen.sh
    oe_runconf
}

do_compile_prepend() {
    cd ${S}
}

do_install_prepend() {
    cd ${S}
}

FILES_${PN} = " \
    ${bindir} \
    ${includedir} \
    ${libdir} \
    /usr/share \
"
