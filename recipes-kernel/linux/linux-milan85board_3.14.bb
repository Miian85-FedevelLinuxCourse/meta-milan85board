# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel with support for milan85board"
DESCRIPTION = "Linux Kernel with support for milan85board."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

#Always update SRCREV based on your last commit
SRCREV = "116ac95ac154bf7d4769531df16c58fcd8104958"

SRC_URI = "git://github.com/Miian85-FedevelLinuxCourse/Milan85board-Linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

# PV .= "+git${SRCPV}"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-milan85board)"
