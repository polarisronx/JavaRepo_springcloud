package springCloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:18
 * @Version 1.0
 * ClassName SeataStorageServiceApplication2002
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SeataStorageServiceApplication2002 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SeataStorageServiceApplication2002.class, args);
    }
}
