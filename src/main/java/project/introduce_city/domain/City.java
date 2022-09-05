package project.introduce_city.domain;

import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity(name = "city")
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "cityname")
    private String cityName;

    @Column(name = "korname")
    private String korName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getKorName() {return korName;}

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    @Override
    public String toString() {
        return "City{" +
                "Id=" + Id +
                ", cityName='" + cityName + '\'' +
                '}'+"korName= "+korName;
    }
}
