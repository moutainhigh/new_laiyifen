// This file was generated by PermissionsDispatcher. Do not modify!
package com.netease.nim.demo.chatroom.activity;

import android.support.v4.app.ActivityCompat;
import java.lang.String;
import permissions.dispatcher.PermissionUtils;

final class CreateChatRoomActivityPermissionsDispatcher {
    private static final int REQUEST_DOACACHENEEDSPERMISSION = 1;

    private static final String[] PERMISSION_DOACACHENEEDSPERMISSION = new String[] {"android.permission.ACCESS_FINE_LOCATION"};

    private CreateChatRoomActivityPermissionsDispatcher() {
    }

    static void doACacheNeedsPermissionWithPermissionCheck(CreateChatRoomActivity target) {
        if (PermissionUtils.hasSelfPermissions(target, PERMISSION_DOACACHENEEDSPERMISSION)) {
            target.doACacheNeedsPermission();
        } else {
            ActivityCompat.requestPermissions(target, PERMISSION_DOACACHENEEDSPERMISSION, REQUEST_DOACACHENEEDSPERMISSION);
        }
    }

    static void onRequestPermissionsResult(CreateChatRoomActivity target, int requestCode,
                                           int[] grantResults) {
        switch (requestCode) {
            case REQUEST_DOACACHENEEDSPERMISSION:
                if (PermissionUtils.verifyPermissions(grantResults)) {
                    target.doACacheNeedsPermission();
                }
                break;
            default:
                break;
        }
    }
}
