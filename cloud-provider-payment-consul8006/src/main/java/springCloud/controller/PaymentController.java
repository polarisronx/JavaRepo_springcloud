package springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author Administrator
 * @Create 2023-12-15 15:31
 * @Version 1.0
 * ClassName PaymentController
 * Package springCloud.controller
 * Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/payment/consul")
    public String PaymentInfo(){
        return "springCloud with Consul:"+serverPort +"\t\t"+ UUID.randomUUID();
    }
}
