import React, { PropTypes } from 'react';
import {
    View,
    requireNativeComponent,
    NativeModules

} from 'react-native';

var pushManager = NativeModules.BDPushManager;


const BDPushManager = React.createClass({
    render: function() {

    },
    //RN调用原生方法：
    startPushWork(apiKey)
    {
        pushManager.startPushWork(apiKey);
    },
    stopPushWork()
    {
        pushManager.stopPushWork();
    },
    resumePushWork()
    {
        pushManager.resumePushWork();
    },
    setPushTags(tags)
    {
        pushManager.setPushTags(tags);
    },
    removePushTags(tags){
        pushManager.removePushTags(tags);
    }

});


module.exports = BDPushManager;