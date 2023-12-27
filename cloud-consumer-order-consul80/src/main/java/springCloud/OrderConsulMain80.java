package springCloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Administrator
 * @Create 2023-12-15 15:40
 * @Version 1.0
 * ClassName OrderConsulMain80
 * Package springCloud
 * Description
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
