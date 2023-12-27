package springCloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;

/**
 * @Author Administrator
 * @Create 2023-12-18 17:03
 * @Version 1.0
 * ClassName FeignConfig
 * Package springCloud.FeignConfig
 * Description
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
