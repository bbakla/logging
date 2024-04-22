package logback.examples;


import logback.examples.subpackages.ChildClass1;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class LogBackWithMaven {

    private static final Logger logger = LoggerFactory.getLogger(LogBackWithMaven.class);

    public static void main(String[] args){
        logger.info("test");

        var child1 = new ChildClass1();
        child1.logFromChild1();

        child1.createRandomLogs();
    }

}
