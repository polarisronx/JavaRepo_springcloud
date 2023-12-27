package springCloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;



/**
 * @Author Administrator
 * @Create 2023-12-24 21:27
 * @Version 1.0
 * ClassName MyGatewayFilter
 * Package springCloud.filter
 * Description
 */
@Component
public class MyGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter (ServerWebExchange exchange, GatewayFilterChain chain){
        String name = exchange.getRequest()
                .getQueryParams()
                .getFirst("name");
        if (name == null){
            System.out.println("登录失败，用户名为空");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override // 设置过滤器优先级
    public int getOrder (){
        return 0;
    }
}
