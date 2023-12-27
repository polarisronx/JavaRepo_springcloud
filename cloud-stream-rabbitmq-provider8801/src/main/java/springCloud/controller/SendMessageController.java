package springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springCloud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @Author Administrator
 * @Create 2023-12-27 15:43
 * @Version 1.0
 * ClassName SendMessageController
 * Package springCloud.controller
 * Description
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider sendMessageService;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return sendMessageService.send();
    }
}
