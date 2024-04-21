SUMMARY = "Script to fetch files from Google Drive"
LICENSE = "CLOSED"


SRC_URI = "file://drive_fetcher.sh"

FILES:${PN} += "${datadir}/fetcher/*"

do_install() {
    install -d ${D}${datadir}/fetcher/ 
    install -m 0644 ${WORKDIR}/drive_fetcher.sh ${D}${datadir}/fetcher/
}
