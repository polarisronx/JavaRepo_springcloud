package springCloud.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.WriteBuffer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Create 2023-12-27 18:51
 * @Version 1.0
 * ClassName ReceiverMessageListener
 * Package springCloud.controller
 * Description
 */
@Slf4j
@EnableBinding(Sink.class) // 定义消息的推送管道，可以认为是消息收发的service,sink表示是消息接收端
public class ReceiverMessageListener {

    @Value("${server.port}")
    private String serverPort;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        log.info("消费者1号，----->接收到的消息：{}",message.getPayload()+"  port: "+serverPort);
    }
}
