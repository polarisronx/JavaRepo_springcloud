package springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springCloud.entities.CommonResult;
import springCloud.entities.Payment;
import springCloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Administrator
 * @Create 2023-12-13 19:06
 * @Version 1.0
 * ClassName paymentController
 * Package springCloud.controller
 * Description
 */
@RestController
@Slf4j
public class paymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****result:{}",result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,返回结果"+result+"\t 服务端口："+serverPort,payment);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = (Payment)paymentService.getPaymentById(id);
        log.info("*****result:{}", payment);
        if (payment != null){
            return new CommonResult(200,"查询成功，"+"\t 服务端口："+serverPort,payment);
        }else {
            return new CommonResult(444,"没有ID："+id+" 对应记录",null);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discovery (){
        List<String> services = discoveryClient.getServices();
        for(String element : services){
            log.info(element + "\t");
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance : instances){
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB (){
        return serverPort;
    }
}
