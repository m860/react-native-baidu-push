
#import "BDPushManager.h"

@implementation BDPushManager

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()
RCT_EXPORT_METHOD(startPushWork:(NSString *)apiKey){
    
    NSString *s = apiKey;
    
    NSLog([NSString stringWithFormat:@"%@",s]);
    
}

@end
