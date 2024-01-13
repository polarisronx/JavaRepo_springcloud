package springCloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:40
 * @Version 1.0
 * ClassName SeataAccountMainApp2003
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SeataAccountMainApp2003 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SeataAccountMainApp2003.class, args);
    }
}
