/*
 * Copyright (C) 2019-2022 Federico Dossena
 *               2023 someone5678
 * SPDX-License-Identifier: GPL-3.0-or-later
 * License-Filename: LICENSE
 */

package com.android.bluetooth.bthelper.pods.models;

import com.android.bluetooth.bthelper.pods.Pod;
import com.android.bluetooth.bthelper.R;

public class AirPodsPro2UsbC extends RegularPods {

    public AirPodsPro2UsbC (String color, Pod leftPod, Pod rightPod, Pod casePod) {
        super(color, leftPod, rightPod, casePod);
    }

    @Override
    public int getDrawable () {
        return R.drawable.AirPods_Pro;
    };

    @Override
    public int getLeftDrawable () {
        return R.drawable.AirPods_Pro_Left;
    }

    @Override
    public int getRightDrawable () {
        return R.drawable.AirPods_Pro_Right;
    }

    @Override
    public int getCaseDrawable () {
        return R.drawable.AirPods_Pro_Case;
    }

    @Override
    public String getModel () {
        return Constants.MODEL_AIRPODS_PRO_2_USB_C;
    }

    @Override
    public String getMenufacturer () {
        return Constants.MANUFACTURER_APPLE;
    }

}