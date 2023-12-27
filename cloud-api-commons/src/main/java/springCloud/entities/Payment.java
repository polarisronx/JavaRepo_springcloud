package springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Administrator
 * @Create 2023-12-12 17:21
 * @Version 1.0
 * ClassName payment
 * Package springCloud.entities
 * Description
 */
@Data
@AllArgsConstructor //lombok
@NoArgsConstructor

public class Payment implements Serializable {
    private Long id;
    private String serial;
}

