SUMMARY = "L'intégration de modéle dans l'image yocto"
LICENSE = "CLOSED"

SRC_URI = "https://github.com/eyaderouich/pfe/raw/main/src/main.py;name=main \ 
          https://github.com/eyaderouich/pfe/raw/main/src/marque.json;name=json \
          https://github.com/eyaderouich/pfe/raw/main/src/config.py;name=config \
          https://github.com/eyaderouich/pfe/raw/main/src/utils.py;name=utils \
          https://github.com/eyaderouich/pfe/raw/main/src/classes.names;name=classes \
          https://github.com/eyaderouich/pfe/raw/main/src/coco.names;name=coco \
          https://github.com/eyaderouich/pfe/raw/main/src/darknet-yolov3.cfg;name=darknet \
          https://github.com/eyaderouich/pfe/raw/main/src/yolov4.cfg;name=yolov4 \
          https://github.com/eyaderouich/pfe/raw/main/src/broker.cfg;name=configbroker"
          
SRC_URI[main.sha256sum] = "d26a4314a4aa6b3961a173fd81213794b75996f1cd55abecaa3e3a69836320cf"
SRC_URI[json.sha256sum] = "a0df51b79b30173515ddd01f700121906d225eeb69d67e45119d3935c15e5e40"
SRC_URI[config.sha256sum] = "67821a3be502fd88ddbe48e30670bad810652e4f96ad262ea79588f60cae9682"
SRC_URI[utils.sha256sum] = "985466292d10e620ccf36a977f1327c5d844691e99dd745945b93c812733f8d6"
SRC_URI[classes.sha256sum] = "327d67f372f345b3cc84d142a70a06173a1cd0cb0208a2a3bf9eccec89886032"
SRC_URI[coco.sha256sum] = "33c77761e124cc74911346865e3bc1219b87c2db7d0f106e3376bf5ef3785933"
SRC_URI[darknet.sha256sum] = "3466e673486fd9f4e1e54860a94c09fdeda9bc7240b3e9bb2391bc7d3df5c673"
SRC_URI[yolov4.sha256sum] = "a6d0f8e5c62cc8378384f75a8159b95fa2964d4162e33351b00ac82e0fc46a34"
SRC_URI[configbroker.sha256sum] = "bdc47bacaf9bd7a412b41c1c0987075dee7296efcb21e8516832c78af95fc7d4"

FILES:${PN} += "${datadir}/application/*"

do_install() {
    install -d ${D}${datadir}/application/ 
    install -m 0644 ${WORKDIR}/classes.names ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/broker.cfg ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/coco.names ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/config.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/darknet-yolov3.cfg ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/main.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/utils.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/yolov4.cfg ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/marque.json ${D}${datadir}/application/
}
