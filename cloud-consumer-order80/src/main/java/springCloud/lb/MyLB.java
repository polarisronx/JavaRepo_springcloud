package springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Administrator
 * @Create 2023-12-18 10:36
 * @Version 1.0
 * ClassName MyLB
 * Package springCloud.lb
 * Description
 */
@Component
public class MyLB implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("******访问："+next);
        return next;
    }
    @Override
    public ServiceInstance instances (List<ServiceInstance> serviceInstances){
        int index = getAndIncrement() % serviceInstances.size();
        return  serviceInstances.get(index);
    }
}
