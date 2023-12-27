package springCloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Administrator
 * @Create 2023-12-15 15:29
 * @Version 1.0
 * ClassName springCloud.PaymentMain8006
 * Package PACKAGE_NAME
 * Description
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class PaymentMain8006 {
        public static void main(String[] args){
            SpringApplication.run(PaymentMain8006.class, args);
        }
}
