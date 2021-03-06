
package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

public class RNBaiduPushModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    public static Callback onBind;
    public static Callback onMessage;
    public static Callback onNotificationClicked;
    public static Callback onNotificationArrived;
    public static Callback onSetTags;
    public static Callback onDelTags;
    public static Callback onListTags;
    public static Callback onUnbind;

    public RNBaiduPushModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNBaiduPush";
    }

    @ReactMethod
    public void startPushWork(String apiKey) {
        PushManager.startWork(this.reactContext.getApplicationContext(), PushConstants.LOGIN_TYPE_API_KEY, apiKey);
    }

    @ReactMethod
    public void stopPushWork() {
        PushManager.stopWork(this.reactContext.getApplicationContext());
    }

    @ReactMethod
    public void resumePushWork() {
        PushManager.resumeWork(this.reactContext.getApplicationContext());
    }

    @ReactMethod
    public void setPushTags(List<String> tags) {
        PushManager.setTags(this.reactContext.getApplicationContext(), tags);
    }

    @ReactMethod
    public void removePushTags(List<String> tags) {
        PushManager.delTags(this.reactContext.getApplicationContext(), tags);
    }

    @ReactMethod
    public void listen(String eventName, Callback callback)
            throws NoSuchFieldException, IllegalAccessException {
        Class module = RNBaiduPushModule.class;
        Field event = module.getField(eventName);
        event.set(null, callback);
    }

    @ReactMethod
    public void fetchLastClickedNotification(Callback callback) {
//        String packageName = this.reactContext.getPackageName();
//        String filePath = "/data/data/" + packageName + "/__clicked_notification__";
//        File file = new File(filePath);
//        if (file.exists()) {
//            FileInputStream is = new FileInputStream(file);
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            String mResponse = new String(buffer);
//            String[] values = mResponse.split("\\|");
//            WritableMap map = Arguments.createMap();
//            if (values.length > 0) {
//                map.putString("title", values[0]);
//            }
//            if (values.length > 1) {
//                map.putString("description", values[1]);
//            }
//            if (values.length > 2) {
//                map.putString("customContentString", values[2]);
//            }
//            file.delete();
//            callback.invoke(map);
//        } else {
//            callback.invoke();
//        }
        Activity activity = this.getCurrentActivity();
        Intent intent = activity.getIntent();
        String title = intent.getStringExtra("title");
        if (title != null) {
            String description = intent.getStringExtra("description");
            String customContentString = intent.getStringExtra("customContentString");
            WritableMap map = Arguments.createMap();
            map.putString("title", title);
            map.putString("description", description);
            map.putString("customContentString", customContentString);
            callback.invoke(map);
        } else {
            callback.invoke();
        }
    }
}