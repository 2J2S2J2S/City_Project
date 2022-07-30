package project.introduce_city.repository;

import org.springframework.stereotype.Repository;
import project.introduce_city.domain.City;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CityRepository implements Seoul{
    private final EntityManager em;

    public CityRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<City> findAll() {
        return em.createQuery("select m from City m",City.class).getResultList();
    }

    @Override
    public List<City> findBySeoul() {
       return em.createQuery("select m from City m where m.city_name=:name",City.class).setParameter("name","서울")
               .getResultList();
    }

    @Override
    public List<City> findByGyeonggido(){
        return em.createQuery("select m from City m where m.city_name=:name",City.class).setParameter("name","경기도")
                .getResultList();
    }
    }

