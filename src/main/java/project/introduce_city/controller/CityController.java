package project.introduce_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
