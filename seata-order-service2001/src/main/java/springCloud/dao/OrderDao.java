package springCloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springCloud.domain.Order;

/**
 * @Author Administrator
 * @Create 2024-01-11 16:00
 * @Version 1.0
 * ClassName orderDao
 * Package springCloud.dao
 * Description
 */
@Mapper
public interface OrderDao {
    /*
     *
     * 创建订单
     * @author polaris
     * @create 2024/1/11
     **/
    void createOrder(Order order);
    /*
     *
     * 修改订单金额
     * @author polaris
     * @create 2024/1/11
     **/

    void updateOrder(@Param("userId") Long userId,@Param("status") Integer status);

}
