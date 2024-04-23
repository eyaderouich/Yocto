SUMMARY = "Script to fetch files from Google Drive"
LICENSE = "CLOSED"


SRC_URI = "file://drive_fetcher.sh"

FILES:${PN} += "${datadir}/application/*"

do_install() {
    install -d ${D}${datadir}/application/ 
    install -m 0644 ${WORKDIR}/drive_fetcher.sh ${D}${datadir}/application/
}
