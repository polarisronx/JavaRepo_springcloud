package springCloud.service.impl;

import springCloud.service.PaymentHystrixService;

/**
 * @Author Administrator
 * @Create 2023-12-19 23:16
 * @Version 1.0
 * ClassName PaymentFallbackService
 * Package springCloud.service.impl
 * Description
 */
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK (Integer id){
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut (Integer id){
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
