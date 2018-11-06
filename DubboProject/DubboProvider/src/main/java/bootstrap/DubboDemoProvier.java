package bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"service"})
public class DubboDemoProvier {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboDemoProvier.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
