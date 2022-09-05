package project.introduce_city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.introduce_city.domain.City;
@Repository
public interface Seoul extends JpaRepository<City,String> {

}
