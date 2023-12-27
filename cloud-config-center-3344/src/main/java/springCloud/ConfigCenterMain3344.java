package springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author Administrator
 * @Create 2023-12-26 20:13
 * @Version 1.0
 * ClassName ConfigCenterMain3344
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

    public static void main (String[] args){
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
