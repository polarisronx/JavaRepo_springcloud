package springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Administrator
 * @Create 2023-12-13 22:44
 * @Version 1.0
 * ClassName ApplicationContextConfig
 * Package springCloud.config
 * Description
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced
    // 用自定义负载均衡器
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
