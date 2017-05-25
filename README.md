
# react-native-baidu-push

## Getting started

`$ npm install react-native-baidu-push --save`

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

## API

## startPushWork

## stopPushWork

## resumePushWork

## setPushTags

## removePushTags

### onPushStateChange

## onMessage
  