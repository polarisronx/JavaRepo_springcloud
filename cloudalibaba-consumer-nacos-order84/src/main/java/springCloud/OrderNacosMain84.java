package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Administrator
 * @Create 2024-01-07 23:22
 * @Version 1.0
 * ClassName OrderNacosMain
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain84 {
    public static void main (String[] args){
        SpringApplication.run(OrderNacosMain84.class,args);
    }
}
