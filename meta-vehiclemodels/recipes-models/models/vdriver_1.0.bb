SUMMARY = "Script to fetch folder from Google Drive"
LICENSE = "CLOSED"


SRC_URI = "file://vd_fetcher.sh"

FILES:${PN} += "${datadir}/vd/*"

do_install() {
    install -d ${D}${datadir}/vd/ 
    install -m 0644 ${WORKDIR}/vd_fetcher.sh ${D}${datadir}/vd/
}
