package springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-01 20:47
 * @Version 1.0
 * ClassName OrderNacosController
 * Package springCloud.controller
 * Description
 */
@RestController
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String  getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
