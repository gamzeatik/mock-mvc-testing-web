package testing_web.mock_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @PostMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World!";
    }
}
