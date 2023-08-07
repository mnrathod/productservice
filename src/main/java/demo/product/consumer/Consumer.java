package demo.product.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer{
	
	@KafkaListener(topics = "${spring.kafka.ordertopic}", groupId = "${spring.kafka.notificationgroup}")
	public void listenGroupFoo(String message) {
		log.info("Received Message in group {spring.kafka.groupId}" + message);
	    log.debug("Received Message in group {spring.kafka.groupId}" + message);
	}
}

