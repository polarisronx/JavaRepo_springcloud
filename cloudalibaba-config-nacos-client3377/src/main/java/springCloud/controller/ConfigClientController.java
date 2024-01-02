package springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Create 2024-01-02 14:30
 * @Version 1.0
 * ClassName ConfigClientController
 * Package controller
 * Description
 */
@RestController
@RefreshScope // controller类上加上@RefreshScope注解表示当前类下的配置支持nacos的动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
