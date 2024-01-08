package springCloud.controller;

import com.netflix.ribbon.proxy.annotation.Var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;

import java.util.HashMap;

/**
 * @Author Administrator
 * @Create 2024-01-07 23:01
 * @Version 1.0
 * ClassName PaymentController
 * Package springCloud.controller
 * Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    private static HashMap<Long,Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"28a8c1e3bc2742d8848569891fb42181"));
        hashMap.put(2L,new Payment(2L,"bba8c1e3bc2742d8848569891ac32181"));
        hashMap.put(3L,new Payment(3L,"cca8c1e3bc2742d8848569891fb42181"));
    }
    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        return new CommonResult<>(200,"from mysql,serverPort:  "+serverPort,hashMap.get(id));
    }

}
