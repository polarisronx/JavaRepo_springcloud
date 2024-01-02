package springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Create 2024-01-01 20:24
 * @Version 1.0
 * ClassName PaymentController
 * Package springCloud.controller
 * Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private  String serverPort;
    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")Integer id){
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }

}
