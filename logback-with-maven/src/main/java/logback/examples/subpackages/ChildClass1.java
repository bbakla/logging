package logback.examples.subpackages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ChildClass1 {

    Logger logger = LoggerFactory.getLogger(ChildClass1.class);

    public void logFromChild1() {

        logger.info("INFO - Logging the number {} in {}", 5, ChildClass1.class);
        logger.debug("DEBUG- Logging the number {} in {}", 5, ChildClass1.class);
    }

    public void createRandomLogs() {
        Random random = new Random();
        for (int i = 0; i< 100; i++) {
            var number = random.nextInt(4);

            switch (number) {
                case 0:
                    logger.debug("Number is {}. Printing DEBUG log", number);
                    break;
                case 1:
                    logger.info("Number is {}. Printing INFO log", number);
                    break;
                case 2:
                    logger.warn("Number is {}. Printing WARN log", number);
                    break;
                case 3:
                    logger.error("Number is {}. Printing ERROR log", number);
                    break;
                default:
                    logger.info("Was ist losss?? Number is {}", number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
