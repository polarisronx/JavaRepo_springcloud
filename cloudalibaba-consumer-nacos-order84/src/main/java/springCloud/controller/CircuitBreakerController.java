package springCloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-07 23:33
 * @Version 1.0
 * ClassName CircuitBreakerController
 * Package springCloud.controller
 * Description
 */
@RestController
@Slf4j
public class CircuitBreakerController {
    @Value(("${service-url.nacos-user-service}"))
    private String service_url;

    @Resource
    private PaymentService paymentService;
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/fallback/{id}")
    @SentinelResource(value = "fallback",fallback = "handlerFallback",blockHandler = "blockHandler")
    public CommonResult<Payment> fallback(@PathVariable("id") Long id){
        CommonResult<Payment> result = restTemplate.getForObject(service_url + "/paymentSQL/" + id, CommonResult.class, id);
        if (id == 4){
            throw new IllegalArgumentException("IllegalArgument,非法参数异常....");
        }else if (result.getData()==null){
            throw new NullPointerException("NullPointerException,该ID没有对应记录,空指针异常");
        }
        return result;
    }
    public CommonResult handlerFallback(@PathVariable  Long id,Throwable e) {// 负责运行时异常发生的回调
        Payment payment = new Payment(id,"null");
        return new CommonResult<>(444,"兜底异常handlerFallback,exception内容  "+e.getMessage(),payment);
    }
    public CommonResult blockHandler(@PathVariable  Long id, BlockException blockException) {// 负责业务限流发生的回调
        Payment payment = new Payment(id,"null");
        return new CommonResult<>(445,"blockHandler-sentinel限流,无此流水: blockException  "+blockException.getMessage(),payment);
    }

    // ===========openfeign
    @GetMapping("/consumer/openfeign/{id}")
    public CommonResult<Payment> openfeignPayment(@PathVariable("id") Long id) {
        if (id == 4){
            throw new IllegalArgumentException("IllegalArgument,非法参数异常....");
        }
        return paymentService.paymentSQL(id);
    }
}
