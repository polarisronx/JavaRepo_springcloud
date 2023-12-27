package springCloud.service;

/**
 * @Author Administrator
 * @Create 2023-12-19 20:20
 * @Version 1.0
 * ClassName PaymentService
 * Package springCloud.service.impl
 * Description
 */
public interface PaymentService {
    String paymentInfo_OK (Integer id);
    String paymentInfo_TimeOut (Integer id);
    String paymentCircuitBreaker (Integer id);
}
