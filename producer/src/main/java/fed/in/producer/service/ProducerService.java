package fed.in.producer.service;


import fed.in.producer.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private static final String TOPIC = "user-topic";

    @Autowired
    private KafkaTemplate<String, UserDTO> kafkaTemplate;

    public void sendUser(UserDTO user) {
        kafkaTemplate.send(TOPIC, user);
        System.out.println("User sent: " + user);
    }
}
