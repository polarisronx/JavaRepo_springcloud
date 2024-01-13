package springCloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:10
 * @Version 1.0
 * ClassName StorageService
 * Package springCloud.service
 * Description
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
