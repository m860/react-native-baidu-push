
#import "BDPushManager.h"
#import "BDPush-SDK-IOS-1.4.9.2/BPush.h"

@implementation BDPushManager

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()
RCT_EXPORT_METHOD(startPushWork:(NSString *)apiKey){
    if(apiKey)
    {
        [BPush registerChannel:nil apiKey:apikey pushMode:BPushModeDevelopment withFirstAction:@"打开" withSecondAction:@"关闭" withCategory:@"test" useBehaviorTextInput:YES isDebug:YES];
        // 禁用地理位置推送 需要再绑定接口前调用。
        [BPush disableLbs];
    }
    
}

@end
