package ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Administrator
 * @Create 2023-12-17 22:43
 * @Version 1.0
 * ClassName LoadBalanceRule
 * Package ribbon
 * Description
 */
@Configuration
public class LoadBalanceRule {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
