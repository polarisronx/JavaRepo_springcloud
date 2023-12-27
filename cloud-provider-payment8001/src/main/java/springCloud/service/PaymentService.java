package springCloud.service;

import springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Administrator
 * @Create 2023-12-12 20:13
 * @Version 1.0
 * ClassName PaymentService
 * Package springCloud.service
 * Description
 */
public interface PaymentService {
    int create (Payment payment);

    Payment getPaymentById (@Param("id") Long id);
}
