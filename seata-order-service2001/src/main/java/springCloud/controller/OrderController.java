package springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springCloud.domain.CommonResult;
import springCloud.domain.Order;
import springCloud.service.OrderService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:53
 * @Version 1.0
 * ClassName OrderController
 * Package springCloud.controller
 * Description
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.createOrder(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
