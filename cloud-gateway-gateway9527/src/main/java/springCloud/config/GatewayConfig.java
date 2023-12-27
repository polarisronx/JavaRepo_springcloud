package springCloud.config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @Author Administrator
 * @Create 2023-12-24 21:03
 * @Version 1.0
 * ClassName GatewayConfig
 * Package springCloud.config
 * Description
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        return routes.route("path_route01", predicateSpec -> predicateSpec.path("/guonei").uri("http://news.baidu.com/guonei")).build();
    }
}
