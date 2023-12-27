package springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author Administrator
 * @Create 2023-12-18 10:29
 * @Version 1.0
 * ClassName LoadBalance
 * Package springCloud.lb
 * Description
 */
public interface LoadBalance {
    ServiceInstance instances (List<ServiceInstance> serviceInstances);
}
