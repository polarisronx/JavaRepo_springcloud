package springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Administrator
 * @Create 2023-12-12 17:24
 * @Version 1.0
 * ClassName CommonResult
 * Package springCloud.entities
 * Description
 */
@Data
@AllArgsConstructor //lombok
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
