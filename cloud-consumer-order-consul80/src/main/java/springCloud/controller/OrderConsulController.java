package springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Source;

/**
 * @Author Administrator
 * @Create 2023-12-15 15:46
 * @Version 1.0
 * ClassName OrderConsulController
 * Package springCloud.controller
 * Description
 */
@RestController
public class OrderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment";//consul-provider-payment
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        System.out.println("消费者调用支付服务（consul）成功---->result:"+ result);
        return result;
    }
}
