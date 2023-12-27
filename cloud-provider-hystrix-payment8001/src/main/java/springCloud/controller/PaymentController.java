package springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springCloud.service.PaymentService;
import springCloud.service.impl.PaymentServiceImpl;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2023-12-19 13:40
 * @Version 1.0
 * ClassName PaymentController
 * Package springCloud.controller
 * Description
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK (@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*****result:" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut (@PathVariable("id") Integer id) throws InterruptedException{
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*****result:" + result);
        return result;
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker (@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*****result:" + result);
        return result;
    }
}