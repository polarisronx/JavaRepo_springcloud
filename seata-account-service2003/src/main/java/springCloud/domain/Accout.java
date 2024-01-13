package springCloud.domain;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 20:00
 * @Version 1.0
 * ClassName Accout
 * Package springCloud.domain
 * Description
 */
public class Accout {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;


}
