package com.example.rabbitmqconsumer.rabbitmq;

import com.example.rabbitmqconsumer.bot.ConsumerBot;
import com.example.rabbitmqconsumer.model.RabbitMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
@Component
public class MessageQueue {
    @Autowired
    ConsumerBot bot;

    private Queue<RabbitMessage> messageQueue = new LinkedList();
    private Timer timer = new Timer();
    private Boolean firstUse = true;
    private Integer time = 30000;

    public Queue getMessageQueue() {
        return messageQueue;
    }

    public void setMessageQueue(Queue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void addMessage(RabbitMessage message) {
        if(firstUse){
            messageQueue.add(message);
            bot.writeMessage(messageQueue.poll());
            setTimer();
            firstUse = false;
        }else{
            messageQueue.add(message);
        }
    }

    public void setTimer() {

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(messageQueue.isEmpty()){
                    timer.cancel();
                    timer = new Timer();
                    firstUse = true;
                }else {
                    RabbitMessage message = messageQueue.poll();
                    bot.writeMessage(message);
                }
            }
        }, time, time);
    }
}
