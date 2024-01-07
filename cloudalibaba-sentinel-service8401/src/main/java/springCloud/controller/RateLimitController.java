package springCloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.handler.CustomerHandler;

/**
 * @Author Administrator
 * @Create 2024-01-07 22:10
 * @Version 1.0
 * ClassName RateLimitController
 * Package springCloud.controller
 * Description
 */
@RestController
@Slf4j
public class RateLimitController {
    @GetMapping("/rateLimit/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")//Sentinel中配置byResource
    public CommonResult<Payment> byResource() {
        return new CommonResult<>(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }
    public CommonResult<Payment> handleException(BlockException exception)
    {
        return new CommonResult<>(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")// Sentinel中配置/rateLimit/byUrl
    public CommonResult<Payment> byUrl()
    {
        return new CommonResult<>(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }


    /**
     * 自定义通用的限流处理逻辑，
     *      blockHandlerClass = CustomerBlockHandler.class
     *      blockHandler = handleException2
     *      上述配置：找CustomerBlockHandler类里的handleException2方法进行兜底处理
     * @create 2024/1/7
     **/
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = CustomerHandler.class,blockHandler = "customerHandler")
    public CommonResult customerBlockHandler(){
        return new CommonResult<>(200,"用户自定义通用的限流处理逻辑",new Payment(2024L,"serial0020240107"));
    }

}



