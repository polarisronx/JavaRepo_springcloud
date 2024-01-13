package springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springCloud.domain.CommonResult;
import springCloud.service.StorageService;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:13
 * @Version 1.0
 * ClassName StorageController
 * Package controller
 * Description
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;
    @GetMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
