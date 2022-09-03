package com.example.rabbitmqconsumer.rabbitmq;

import com.example.rabbitmqconsumer.configuration.RabbitConfiguration;
import com.example.rabbitmqconsumer.model.RabbitMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @Autowired
    MessageQueue messageQueue;

    @RabbitListener(queues = RabbitConfiguration.QUEUE)
    public void listener(RabbitMessage message) {
        messageQueue.addMessage(message);
    }
}
