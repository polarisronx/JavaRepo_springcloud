package springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2023-12-18 14:51
 * @Version 1.0
 * ClassName OrderFeignController
 * Package springCloud.controller
 * Description
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout (){
        // Feign不支持使用@RequestParam
        return paymentFeignService.paymentFeignTimeout();
    }
    // ====================> zipkin+sleuth 链路调用测试
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        return paymentFeignService.paymentZipkin();
    }

}

