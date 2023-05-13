package cola.springboot.hellospringbootjinzhong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Slf4j
public class HelloSpringBootJinzhongApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootJinzhongApplication.class, args);
        log.info("HelloSpringBootJinzhong Application run success");
    }

}
