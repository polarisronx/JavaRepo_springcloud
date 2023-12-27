package springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springCloud.service.impl.PaymentFallbackService;

/**
 * @Author Administrator
 * @Create 2023-12-19 22:33
 * @Version 1.0
 * ClassName PaymentHystrixService
 * Package springCloud.service
 * Description
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK (@PathVariable("id") Integer id);
    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut (@PathVariable("id") Integer id);
}
