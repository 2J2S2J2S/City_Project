package project.introduce_city.domain;

import jdk.jfr.DataAmount;

import javax.persistence.*;
@Entity
@Table(name = "city")
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private String Id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "city_name_kor")
    private String cityNameKor;

    public String getCityNameKor() {
        return cityNameKor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
