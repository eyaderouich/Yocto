SUMMARY = "Ajout modeles"
LICENSE = "CLOSED"

S = "${WORKDIR}"

SRC_URI = "https://github.com/yassinthabet/projet_PFE/raw/main/main.py \ 
          https://github.com/yassinthabet/projet_PFE/raw/main/marque.json \
          https://github.com/yassinthabet/projet_PFE/raw/main/config.py \
          https://github.com/yassinthabet/projet_PFE/raw/main/utils.py \
          https://github.com/yassinthabet/projet_PFE/raw/main/classes.names \
          https://github.com/yassinthabet/projet_PFE/raw/main/coco.names\
          file://darknet-yolov3.cfg \
          file://demo.mp4 \
          file://model.weights \
          file://Nationality.pth \
          file://yolov4.cfg \
          file://yolov4.weights \
          file://brand.pth \
          file://video1.mp4 \
          file://47.mp4"
          

FILES:${PN} += "${datadir}/application/*"

do_install() {
    install -d ${D}${datadir}/application/ 
    install -m 0644 ${WORKDIR}/classes.names ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/coco.names ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/config.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/darknet-yolov3.cfg ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/demo.mp4 ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/main.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/model.weights ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/Nationality.pth ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/utils.py ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/yolov4.cfg ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/yolov4.weights ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/brand.pth ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/marque.json ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/video1.mp4 ${D}${datadir}/application/
    install -m 0644 ${WORKDIR}/47.mp4 ${D}${datadir}/application/
}



