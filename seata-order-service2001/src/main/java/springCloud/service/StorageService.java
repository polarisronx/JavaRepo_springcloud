package springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springCloud.domain.CommonResult;

/**
 * @Author Administrator
 * @Create 2024-01-11 19:32
 * @Version 1.0
 * ClassName StorageService
 * Package springCloud.service
 * Description
 */
@FeignClient("seata-storage-service")
public interface StorageService {

    /**
     * 扣减库存
     */
    @GetMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
