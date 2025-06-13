package fed.in.consumer.service;

import fed.in.consumer.dto.UserDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    // Listener for plain string messages
    @KafkaListener(topics = "user-topic", groupId = "user-consumer-group",
            containerFactory = "userKafkaListenerContainerFactory")
    public void consumeUser(UserDTO user) {
        System.out.println(" Consumed user: Name = " + user.getName() + ", Email = " + user.getEmail());
    }
}
