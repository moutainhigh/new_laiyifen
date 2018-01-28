// This file was generated by PermissionsDispatcher. Do not modify!
package com.netease.nim.demo.nearpeople;

import android.support.v4.app.ActivityCompat;
import java.lang.String;
import permissions.dispatcher.PermissionUtils;

final class NearPeopleActivityPermissionsDispatcher {
    private static final int REQUEST_DOACACHENEEDSPERMISSION = 2;

    private static final String[] PERMISSION_DOACACHENEEDSPERMISSION = new String[] {"android.permission.ACCESS_FINE_LOCATION"};

    private NearPeopleActivityPermissionsDispatcher() {
    }

    static void doACacheNeedsPermissionWithPermissionCheck(NearPeopleActivity target) {
        if (PermissionUtils.hasSelfPermissions(target, PERMISSION_DOACACHENEEDSPERMISSION)) {
            target.doACacheNeedsPermission();
        } else {
            ActivityCompat.requestPermissions(target, PERMISSION_DOACACHENEEDSPERMISSION, REQUEST_DOACACHENEEDSPERMISSION);
        }
    }

    static void onRequestPermissionsResult(NearPeopleActivity target, int requestCode,
                                           int[] grantResults) {
        switch (requestCode) {
            case REQUEST_DOACACHENEEDSPERMISSION:
                if (PermissionUtils.verifyPermissions(grantResults)) {
                    target.doACacheNeedsPermission();
                } else {
                    target.ACacheOnPermissionDenied();
                }
                break;
            default:
                break;
        }
    }
}
