package project.introduce_city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.introduce_city.domain.City;

import java.util.Optional;

/**
 * DB 에 쿼리를 날릴 수 있도록 도와준다.
 * JpaRepository <- SQL Mapper 임
 *
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    // select * from city c where c.name = 'cityName'
    Optional<City> findCityByCityName(String cityName);
    Optional<City> findCityByKorName(String KorName);
}

