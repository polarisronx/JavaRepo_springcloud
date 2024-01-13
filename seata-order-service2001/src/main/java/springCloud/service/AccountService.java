package springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springCloud.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 19:33
 * @Version 1.0
 * ClassName accountService
 * Package springCloud.service
 * Description
 */
@FeignClient("seata-account-service")
public interface AccountService {

    /**
     * 扣减账户余额
     */
    @GetMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
