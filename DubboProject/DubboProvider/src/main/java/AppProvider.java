import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableDubbo //   开启基于注解的dubbo模型
@EnableAutoConfiguration
@ComponentScan(basePackages = {"service"})
@DubboComponentScan(basePackages = {"service"})
public class AppProvider {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider.class, args);
    }
}
