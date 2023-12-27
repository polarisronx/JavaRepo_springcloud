package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Administrator
 * @Create 2023-12-27 10:51
 * @Version 1.0
 * ClassName ConfigClientMain3355
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    public static void main (String[] args){
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}
