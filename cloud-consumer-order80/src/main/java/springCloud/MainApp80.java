package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import ribbon.LoadBalanceRule;

/**
 * @Author Administrator
 * @Create 2023-12-13 22:34
 * @Version 1.0
 * ClassName MainApp80
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= LoadBalanceRule.class)//要访问的服务
public class MainApp80 {
    public static void main (String[] args){
        SpringApplication.run(MainApp80.class, args);
    }

}
