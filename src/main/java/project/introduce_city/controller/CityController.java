package project.introduce_city.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.introduce_city.service.Korea_CIty_List;

@Controller
public class CityController {
    @Autowired
    private Korea_CIty_List korea_cIty_list;


    @GetMapping("/citys/list")
    public String cityList() {

        return "City_List/Seoul";
    }

    @GetMapping("/citys/Seoul")
    public String seoul_List(Model model) {
        model.addAttribute("korea", korea_cIty_list.list1());
        return "City_List/Seoul_LandMark";
    }

    // ++ test controller
    @GetMapping("/test")
    public void testMethod(Model model){
        String test = "model test";
        model.addAttribute("seoul", test);
    }

}
