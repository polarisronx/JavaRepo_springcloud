package springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;

/**
 * @Author Administrator
 * @Create 2023-12-18 14:21
 * @Version 1.0
 * ClassName PaymentFeignService
 * Package springCloud.Service
 * Description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")//服务提供端的路径
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout ();

    @GetMapping("/payment/zipkin")
    String paymentZipkin ();


}
