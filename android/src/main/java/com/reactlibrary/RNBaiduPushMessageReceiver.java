package com.reactlibrary;

import android.content.Context;
import android.content.Intent;

import com.baidu.android.pushservice.PushMessageReceiver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

import java.util.List;

/**
 * Created by jean.h.ma on 25/05/2017.
 */
public class RNBaiduPushMessageReceiver extends PushMessageReceiver {
    @Override
    public void onBind(Context context, int i, String s, String s1, String s2, String s3) {
        RNBaiduPushModule.onBind.invoke(i, s, s1, s2, s3);
    }

    @Override
    public void onUnbind(Context context, int i, String s) {
        RNBaiduPushModule.onUnbind.invoke(i, s);
    }

    @Override
    public void onSetTags(Context context, int i, List<String> list, List<String> list1, String s) {
        RNBaiduPushModule.onSetTags.invoke(i, list, list1, s);
    }

    @Override
    public void onDelTags(Context context, int i, List<String> list, List<String> list1, String s) {
        RNBaiduPushModule.onDelTags.invoke(i, list, list1, s);
    }

    @Override
    public void onListTags(Context context, int i, List<String> list, String s) {
        RNBaiduPushModule.onListTags.invoke(i, list, s);
    }

    @Override
    public void onMessage(Context context, String s, String s1) {
        RNBaiduPushModule.onMessage.invoke(s, s1);
    }

    @Override
    public void onNotificationClicked(Context context, String s, String s1, String s2) {
//        String packageName = context.getApplicationContext().getPackageName();
//        try {
//            String values = String.format("%s|%s|%s", s, s1, s2);
//            FileWriter file = new FileWriter("/data/data/" + packageName + "/__clicked_notification__");
//            file.write(values);
//            file.flush();
//            file.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageName);
//        context.startActivity(launchIntent);
        RNBaiduPushModule.onNotificationClicked.invoke(s, s1, s2);
    }

    @Override
    public void onNotificationArrived(Context context, String s, String s1, String s2) {
        RNBaiduPushModule.onNotificationArrived.invoke(s, s1, s2);
    }
}
