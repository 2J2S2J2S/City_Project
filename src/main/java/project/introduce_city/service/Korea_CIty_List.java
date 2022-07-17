package project.introduce_city.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.introduce_city.domain.City;
import project.introduce_city.repository.Seoul;

import java.util.List;

@Service
public class Korea_CIty_List {
    @Autowired
    private Seoul seoul;

    public List<City> list1(){
        return seoul.findAll();
    }
}
