package testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class NormalController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String hello(){
        return "111";
    }
}
