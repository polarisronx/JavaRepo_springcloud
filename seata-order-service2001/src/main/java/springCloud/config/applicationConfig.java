package springCloud.config;

import com.alibaba.cloud.seata.SeataProperties;
import io.seata.common.util.StringUtils;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Author Administrator
 * @Create 2024-01-13 11:40
 * @Version 1.0
 * ClassName applicationConfig
 * Package springCloud.config
 * Description
 */
@Configuration
public class applicationConfig {
//    @Autowired
//    private ConfigurableApplicationContext context;
//    @Autowired
//    private SeataProperties seataProperties;
//    @Bean
//    public GlobalTransactionScanner globalTransactionScanner() {
//        String applicationName = this.context.getEnvironment().getProperty("spring.application.name");
//        String txServiceGroup = this.seataProperties.getTxServiceGroup();;
//        if (StringUtils.isEmpty(txServiceGroup)) {
//            txServiceGroup = applicationName + "-fescar-service-group";
//            this.seataProperties.setTxServiceGroup(txServiceGroup);
//        }
//        return new GlobalTransactionScanner(applicationName, txServiceGroup);
//    }
}
