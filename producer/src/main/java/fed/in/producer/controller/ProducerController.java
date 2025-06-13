package fed.in.producer.controller;


import fed.in.producer.dto.UserDTO;
import fed.in.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/send-user")
    public ResponseEntity<String> sendUser(@RequestBody UserDTO user) {
        try {
            producerService.sendUser(user);
            return ResponseEntity.ok("User sent to Kafka: " + user.getName());
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(" Failed to send user: " + e.getMessage());
        }
    }
}
