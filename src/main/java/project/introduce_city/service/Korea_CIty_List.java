package project.introduce_city.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.introduce_city.domain.City;
import project.introduce_city.repository.CityRepository;
import project.introduce_city.repository.Seoul;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class Korea_CIty_List {
    private final CityRepository cityRepository;

    public Korea_CIty_List(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    /*@Autowired
    private Seoul seoul;*/

    public List<City> Seoul_list(){
        return cityRepository.findBySeoul();
    }

    public List<City> Gyeonggido_List(){
        return cityRepository.findByGyeonggido();
    }
}
