package springCloud.service.impl;

import org.springframework.stereotype.Component;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.service.PaymentService;

/**
 * @Author Administrator
 * @Create 2024-01-08 14:03
 * @Version 1.0
 * ClassName PaymentFallbackService
 * Package springCloud.service
 * Description
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL (Long id){
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
