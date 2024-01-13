package springCloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:31
 * @Version 1.0
 * ClassName AccountService
 * Package springCloud.service
 * Description
 */

public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
