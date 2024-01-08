package springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.service.impl.PaymentFallbackService;

/**
 * @Author Administrator
 * @Create 2024-01-08 13:59
 * @Version 1.0
 * ClassName PaymentService
 * Package springCloud
 * Description
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping("paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
