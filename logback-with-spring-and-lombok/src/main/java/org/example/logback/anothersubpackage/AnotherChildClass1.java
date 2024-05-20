package org.example.logback.anothersubpackage;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AnotherChildClass1 {

    public void createRandomLogs() {
        Random random = new Random();
            var number = random.nextInt(4);

            switch (number) {
                case 0:
                    log.debug("Number is {}. Printing DEBUG log", number);
                    break;
                case 1:
                    log.info("Number is {}. Printing INFO log", number);
                    break;
                case 2:
                    log.warn("Number is {}. Printing WARN log", number);
                    break;
                case 3:
                    log.error("Number is {}. Printing ERROR log", number);
                    break;
                default:
                    log.info("Was ist losss?? Number is {}", number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}
