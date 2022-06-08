package com.will.springrabbittutorial;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    // specifies which queue we're listening to
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message){
        // just printing the message in the queue
        System.out.println(message);
    }
}
