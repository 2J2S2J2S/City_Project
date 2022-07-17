package project.introduce_city.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String cityname;
    private String citylocal;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCitylocal() {
        return citylocal;
    }

    public void setCitylocal(String citylocal) {
        this.citylocal = citylocal;
    }
}
