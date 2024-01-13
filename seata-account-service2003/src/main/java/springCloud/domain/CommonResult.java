package springCloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Administrator
 * @Create 2024-01-11 15:45
 * @Version 1.0
 * ClassName CommonResult
 * Package springCloud.domain
 * Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult (Integer code, String message) {
        this(code,message,null);
    }
}
