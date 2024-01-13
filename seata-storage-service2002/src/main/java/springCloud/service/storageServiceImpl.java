package springCloud.service;

import org.springframework.stereotype.Service;
import springCloud.dao.StorageDao;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:11
 * @Version 1.0
 * ClassName storageServiceImpl
 * Package springCloud.service
 * Description
 */
@Service
public class storageServiceImpl implements StorageService{
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease (Long productId, Integer count){
        storageDao.decrease(productId,count);
    }
}
