package com.levelasquez.androidopensettings;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class AndroidOpenSettings extends ReactContextBaseJavaModule {

    private ReactContext reactContext;

    public AndroidOpenSettings(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidOpenSettings";
    }

    @ReactMethod
    public void tflCastSettings() {
      Intent intenta = new Intent(Settings.ACTION_CAST_SETTINGS);
      intenta.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intenta.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      if (intenta.resolveActivity(reactContext.getPackageManager()) != null) {
          reactContext.startActivity(intenta);
      } else {
        Intent intentb = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        intentb.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentb.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intentb.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intentb);
        } else {
          Intent intentc = new Intent(Settings.ACTION_SETTINGS);
          intentc.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          intentc.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
          if (intentc.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intentc);
          }
        }
      }
    }

    @ReactMethod
    public void generalSettings() {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void appDetailsSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        intent.setData(Uri.parse("package:" + reactContext.getPackageName()));
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void wifiSettings() {
        Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void locationSourceSettings() {
        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void wirelessSettings() {
        Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void airplaneModeSettings() {
        Intent intent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void apnSettings() {
        Intent intent = new Intent(Settings.ACTION_APN_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void bluetoothSettings() {
        Intent intent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void castSettings() {
        Intent intent = new Intent(Settings.ACTION_CAST_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void dateSettings() {
        Intent intent = new Intent(Settings.ACTION_DATE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void localeSettings() {
        Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void inputMethodSettings() {
        Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void displaySettings() {
        Intent intent = new Intent(Settings.ACTION_DISPLAY_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void securitySettings() {
        Intent intent = new Intent(Settings.ACTION_SECURITY_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void internalStorageSettings() {
        Intent intent = new Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void memoryCardSettings() {
        Intent intent = new Intent(Settings.ACTION_MEMORY_CARD_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void accessibilitySettings() {
        Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void applicationSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void deviceInfoSettings() {
        Intent intent = new Intent(Settings.ACTION_DEVICE_INFO_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }
}
