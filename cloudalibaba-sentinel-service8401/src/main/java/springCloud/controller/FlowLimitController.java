package springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Create 2024-01-05 19:27
 * @Version 1.0
 * ClassName FlowLimitController
 * Package springCloud.controller
 * Description
 */
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }
}
