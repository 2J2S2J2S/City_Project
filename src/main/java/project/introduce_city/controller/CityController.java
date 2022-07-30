package project.introduce_city.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import project.introduce_city.service.Korea_CIty_List;

@Controller
public class CityController {
    @Autowired
    private Korea_CIty_List korea_cIty_list;

    @GetMapping("/citys/Seoul")
    public String Seoul(Model model) {
        model.addAttribute("korea",  korea_cIty_list.Seoul_list());
        return "City_List/Seoul_LandMark";
    }

    @GetMapping("/citys/Gyeonggido")
    public String Gyeonggido(Model model){
        model.addAttribute("korea",korea_cIty_list.Gyeonggido_List());
        return "City_List/Seoul_LandMark";
    }

    // ++ test controller
    @GetMapping("/test")
    public void testMethod(Model model){
        String test = "model test";
        model.addAttribute("seoul", test);
    }

}
