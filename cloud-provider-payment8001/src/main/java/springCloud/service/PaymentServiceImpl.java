package springCloud.service;

import springCloud.entities.Payment;
import org.springframework.stereotype.Service;
import springCloud.dao.PaymentDao;
import springCloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2023-12-13 19:03
 * @Version 1.0
 * ClassName PaymentServiceImpl
 * Package springCloud.service.impl
 * Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create (Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById (Long id){
        return paymentDao.getPaymentById(id);
    }
}
