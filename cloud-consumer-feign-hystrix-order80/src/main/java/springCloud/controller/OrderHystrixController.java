package springCloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springCloud.service.PaymentHystrixService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2023-12-19 22:36
 * @Version 1.0
 * ClassName OrderHystrixController
 * Package springCloud.controller
 * Description
 */
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK (@PathVariable("id") Integer id){
        return  paymentHystrixService.paymentInfo_OK(id);
    }
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties ={
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut (@PathVariable("id") Integer id){
        return  paymentHystrixService.paymentInfo_TimeOut(id);
    }
    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id){
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试,o(╥﹏╥)o";
    }
}
