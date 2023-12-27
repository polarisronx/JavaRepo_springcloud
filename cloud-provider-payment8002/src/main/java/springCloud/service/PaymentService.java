package springCloud.service;

import org.apache.ibatis.annotations.Param;
import springCloud.entities.Payment;

/**
 * @Author Administrator
 * @Create 2023-12-12 20:13
 * @Version 1.0
 * ClassName PaymentService
 * Package springCloud.service
 * Description
 */
public interface PaymentService {
    public int create(Payment payment);

    public Object getPaymentById(@Param("id")Long id);
}
