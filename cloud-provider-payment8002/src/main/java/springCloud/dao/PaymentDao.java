package springCloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springCloud.entities.Payment;

/**
 * @Author Administrator
 * @Create 2023-12-12 18:39
 * @Version 1.0
 * ClassName PaymentDao
 * Package springCloud.entities.dao
 * Description
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
