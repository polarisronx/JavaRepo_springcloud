package springCloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:27
 * @Version 1.0
 * ClassName AccountDao
 * Package springCloud.dao
 * Description
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
