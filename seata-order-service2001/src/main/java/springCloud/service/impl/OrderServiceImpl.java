package springCloud.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springCloud.dao.OrderDao;
import springCloud.domain.Order;
import springCloud.service.AccountService;
import springCloud.service.OrderService;
import springCloud.service.StorageService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-11 19:28
 * @Version 1.0
 * ClassName OrderServiceImpl
 * Package springCloud.service.impl
 * Description
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;
    @Override
    @GlobalTransactional(name = "seata-create-order",rollbackFor = Exception.class)
    public void createOrder (Order order){
        /**
         * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
         * 简单说：
         * 下订单->减库存->减余额->改状态
         */
        log.info("开始创建订单...");
        orderDao.createOrder(order);
        //远程调用库存服务扣减库存
        log.info("------->正在扣减库存...");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------->扣减库存结束√");

        //远程调用账户服务扣减余额
        log.info("------->正在扣减余额...");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------->扣减余额结束√");

        //修改订单状态为已完成
        log.info("------->正在修改订单状态...");
        orderDao.updateOrder(order.getUserId(),0);
        log.info("------->修改订单状态结束√");

        log.info("------->下单结束√");







    }
}
