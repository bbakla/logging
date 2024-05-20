This repository contains sample configurations for logback.

You can also change the color of the output specifying in the pattern. This pattern will print the 
`thread` in green and `level` in a color depending on the log level. You can also try different color combinations.
```xml
 <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>
                %d{dd-MM-yyyy HH:mm:ss.SSS} %green([%thread]) %highlight(%-5level) %logger{36}.%M - %msg%n
            </pattern>
        </encoder>
    </appender>
```


