package project.introduce_city.repository;

import org.springframework.stereotype.Repository;
import project.introduce_city.domain.City;

import java.util.List;
import java.util.Optional;

@Repository
public interface Seoul {
    List<City> findAll();

    List<City> findBySeoul();

    List<City> findByGyeonggido();
}
