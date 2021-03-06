package com.enigma.nohp;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * This class echoes a string called from JavaScript.
 */
public class GetPhoneNumber extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("get")) {
            TelephonyManager telephonyManager = (TelephonyManager)this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
            String result = telephonyManager.getLine1Number();
            if (result != null) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
               return true;
            }
        }
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
        return false;
    }
}
