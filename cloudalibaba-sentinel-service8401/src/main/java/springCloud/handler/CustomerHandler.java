package springCloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;

/**
 * @Author Administrator
 * @Create 2024-01-07 22:22
 * @Version 1.0
 * ClassName CustomerHandler
 * Package springCloud.handler
 * Description
 */
public class CustomerHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(2024,"自定义的限流处理信息......CustomerBlockHandler");
    }
}
