package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Administrator
 * @Create 2024-01-02 14:27
 * @Version 1.0
 * ClassName NacosConfigClientMain3377
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main (String[] args){
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
