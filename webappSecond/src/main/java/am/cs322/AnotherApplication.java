package am.cs322;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"am.cs322"})
public class AnotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherApplication.class, args);
    }
}
