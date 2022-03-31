package hw33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"hw26.service", "hw33"})
public class ValuteConverterWebRunner {
    public static void main(String[] args) {
        SpringApplication.run(ValuteConverterWebRunner.class, args);
    }
}
