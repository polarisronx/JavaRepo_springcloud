package springCloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:02
 * @Version 1.0
 * ClassName StorageDao
 * Package springCloud.domain.dao
 * Description
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
