package springCloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Create 2024-01-11 15:55
 * @Version 1.0
 * ClassName order
 * Package springCloud.domain
 * Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long Id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
