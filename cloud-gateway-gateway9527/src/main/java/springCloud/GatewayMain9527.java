package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Administrator
 * @Create 2023-12-24 20:55
 * @Version 1.0
 * ClassName GatewayMain9527
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
    public static void main (String[] args){
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
