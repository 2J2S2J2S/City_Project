package project.introduce_city.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.introduce_city.domain.City;
import project.introduce_city.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /**
     * TODO : bz loggic 이 들어가는게 service 레이어
     */
    public Optional<City> getCityByName(String name){
        return cityRepository.findCityByCityName(name);
    }

    public List<City> getCityList(){
        return cityRepository.findAll();
    }

    public Optional<City> getCityOByKorName(String name){ return cityRepository.findCityByKorName(name);}
}
