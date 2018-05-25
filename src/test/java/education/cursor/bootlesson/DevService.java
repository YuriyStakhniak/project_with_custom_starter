package education.cursor.bootlesson;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("DEV")
@Slf4j
public class DevService {
    public void printSomething(){
        for (int i = 0; i < 100; i++){
            log.info("Volodia I hate you!");
        }
    }
}
