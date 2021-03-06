
# react-native-baidu-push

react-native : 0.44.0

[Android] BaiduPush : 5.7.0.95

## Getting started

`$ npm install https://github.com/m860/react-native-baidu-push.git --save`

### Mostly automatic installation

`$ react-native link react-native-baidu-push`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-baidu-push` and add `RNBaiduPush.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBaiduPush.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNBaiduPushPackage;` to the imports at the top of the file
  - Add `new RNBaiduPushPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-baidu-push'
  	project(':react-native-baidu-push').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-baidu-push/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-baidu-push')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNBaiduPush.sln` in `node_modules/react-native-baidu-push/windows/RNBaiduPush.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNBaiduPush;` to the usings at the top of the file
  - Add `new RNBaiduPushPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNBaiduPush from 'react-native-baidu-push';

// TODO: What to do with the module?
RNBaiduPush;
```

## Android推送消息需要使用自定义行为

Intent Uri

    #Intent;component=com.baidupushdemo/.MainActivity;S.description=DESCRIPTION;S.title=TILE;S.customContentString=CUSTOMCONTENTSTRING;end

所有的消息内容需要按照Intent uri的方式传递给Activity,这样才能正确的接收到推送的消息

## API

### startPushWork(api_key:String)

### stopPushWork()

### resumePushWork()

### setPushTags(tags:String[])

### removePushTags(tags:String[])

### fetchLastClickedNotification(callback:Function)

    获取点击的消息数据

### listen(eventName:String,callback:Callback)

    eventName为对应平台的异步消处理接口
    callback是消息回调函数,参数和对应接口中的参数保持一致
    [Android] eventName可能的值包括:onBind, onMessage, onNotificationClicked, onNotificationArrived, onSetTags, onDelTags,onListTags, onUnbind