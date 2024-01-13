package springCloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Administrator
 * @Create 2024-01-11 19:59
 * @Version 1.0
 * ClassName Storage
 * Package springCloud.domain
 * Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;


}
