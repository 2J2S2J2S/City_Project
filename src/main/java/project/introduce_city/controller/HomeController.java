package project.introduce_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.introduce_city.domain.City;
import project.introduce_city.service.CityService;

import java.util.List;

@Controller
public class HomeController {
    private final CityService cityService;

    public HomeController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/")
    public ModelAndView getHome(){
        List<City> cities =  cityService.getCityList();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        mav.addObject("cities", cities);
        return mav;
    }

    /*@GetMapping("go")
    public String dd(){
        return "pra";*/

}
