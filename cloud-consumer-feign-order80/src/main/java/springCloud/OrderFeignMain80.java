package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Administrator
 * @Create 2023-12-18 14:19
 * @Version 1.0
 * ClassName springCloud.OrderFeignMain80
 * Package PACKAGE_NAME
 * Description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
