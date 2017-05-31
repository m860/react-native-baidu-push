
#import "BDPushManager.h"
#import "BDPush-SDK-IOS-1.4.9.2/BPush.h"

@implementation BDPushManager

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()
RCT_EXPORT_METHOD(startPushWork:(NSString *)apiKey){
    
    NSString *s = apiKey;
    
    NSLog([NSString stringWithFormat:@"%@",s]);
    
    [BPush bindChannelWithCompleteHandler:^(id result, NSError *error) {
        // 绑定返回值
        if (result[@"response_params"][@"channel_id"]) {
            
        }
        
        
    }];
    
}

@end
