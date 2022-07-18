package project.introduce_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 홈 컨트롤러
@Controller
public class Homecontroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
