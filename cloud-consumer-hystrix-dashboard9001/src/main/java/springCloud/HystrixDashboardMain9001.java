package springCloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @Author Administrator
 * @Create 2023-12-20 20:51
 * @Version 1.0
 * ClassName HystrixDashboardMain9001
 * Package springCloud
 * Description
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main (String[] args){
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}

