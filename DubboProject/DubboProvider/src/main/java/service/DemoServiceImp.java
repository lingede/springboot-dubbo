package service;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.service.DemoService;
import org.springframework.stereotype.Component;


@Service
public class DemoServiceImp implements DemoService {

    @Override
    public String sayGood(String name) {
        return "impl by dubbo";
    }
}
