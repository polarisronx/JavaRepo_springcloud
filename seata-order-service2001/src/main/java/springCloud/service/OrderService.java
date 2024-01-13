package springCloud.service;

import springCloud.domain.Order;

/**
 * @Author Administrator
 * @Create 2024-01-11 19:27
 * @Version 1.0
 * ClassName OrderService
 * Package springCloud.service
 * Description
 */
public interface OrderService {
    void createOrder(Order order);
}
