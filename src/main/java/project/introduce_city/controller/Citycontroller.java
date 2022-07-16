package project.introduce_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Citycontroller {
    @GetMapping("city")
    public String SeoulList(){
        return "/City_List/Seoul";
    }

    @PostMapping("/citys/Seoul")
    public String List(){
        return "/City_List/Seoul";
    }
}
