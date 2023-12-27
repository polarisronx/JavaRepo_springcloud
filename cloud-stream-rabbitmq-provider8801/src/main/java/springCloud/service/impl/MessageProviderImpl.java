package springCloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import springCloud.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author Administrator
 * @Create 2023-12-27 15:28
 * @Version 1.0
 * ClassName MessageProviderImpl
 * Package springCloud.service.impl
 * Description
 */
@Slf4j
@EnableBinding(Source.class) // 定义消息的推送管道，可以认为是消息收发的service,source表示是源,即消息生产者
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息发送管道,对标dao

    @Override
    public String send (){
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("****serial: " + serial);
        return serial;
    }
}
