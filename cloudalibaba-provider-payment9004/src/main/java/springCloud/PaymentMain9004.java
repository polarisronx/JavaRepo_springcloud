package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Administrator
 * @Create 2024-01-07 22:56
 * @Version 1.0
 * ClassName PaymentMain9004
 * Package springCloud
 * Description
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
    public static void main (String[] args){
        SpringApplication.run(PaymentMain9004.class,args);
    }
}

