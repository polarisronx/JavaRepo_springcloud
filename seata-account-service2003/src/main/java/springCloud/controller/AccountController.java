package springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springCloud.domain.CommonResult;
import springCloud.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:38
 * @Version 1.0
 * ClassName AccountController
 * Package springCloud.controller
 * Description
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;
    @GetMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
