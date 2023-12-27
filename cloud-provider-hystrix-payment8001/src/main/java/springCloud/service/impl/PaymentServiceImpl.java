package springCloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import springCloud.service.PaymentService;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Create 2023-12-19 13:33
 * @Version 1.0
 * ClassName PaymentServiceImpl
 * Package springCloud.service.impl
 * Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    /*
     * 正常访问的情况
     * @param null
     * @return
     * @author polaris
     * @create 2023/12/19
     **/
    @Override
    public String paymentInfo_OK (Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_OK,id:"+id+"\t“+O(∩_∩)O哈哈~";
    }

    /*
     * 超时访问，需要服务降级
     * @param null
     * @return
     * @author polaris
     * @create 2023/12/19
     **/
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties ={
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")})
    public String paymentInfo_TimeOut (Integer id){
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOut,id:"+id+"\t“+O(∩_∩)O，等了3秒钟不好意思~";
    }
    public String paymentInfoTimeOutHandler(@PathVariable("id") Integer id)
    {
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOut,id:"+id+"\t“+o(╥﹏╥)o，调用支付接口超时或异常，不好意思~,请稍后再试";
    }



    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerHandler",commandProperties ={
            @HystrixProperty(name ="circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value ="10"),
            @HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds",value ="10000"),
            @HystrixProperty(name ="circuitBreaker.errorThresholdPercentage",value ="60")
    })
    public String paymentCircuitBreaker (Integer id){
        if (id<0){
            throw new RuntimeException("*****id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号："+serialNumber;
    }
    public String paymentCircuitBreakerHandler(Integer id){
        return "id不能为负数，请稍后再试，/(ㄒoㄒ)/~~   id:"+id;
    }
}
