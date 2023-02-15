package project.introduce_city.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project.introduce_city.domain.City;
import project.introduce_city.service.CityService;

@Controller
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city/{cityName}")
    public String getCityByName(@PathVariable String cityName){
        City city = cityService.getCityByName(cityName)
                .orElseThrow(IllegalAccessError::new);
        return city.toString();
    }

    @GetMapping("page1")

    public String GET1(){
        return "p1";
    }

    @PostMapping("page2")

    public String POST2(){
        return "p2";
    }

}