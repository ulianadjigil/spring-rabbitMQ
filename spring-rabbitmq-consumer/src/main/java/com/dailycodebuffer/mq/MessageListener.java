package com.dailycodebuffer.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    MessageQueue messageQueue;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        messageQueue.addMessage(message);
    }

}
