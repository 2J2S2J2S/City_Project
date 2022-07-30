package project.introduce_city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.introduce_city.repository.CityRepository;
import project.introduce_city.repository.Seoul;
import project.introduce_city.service.Korea_CIty_List;

@Configuration
public class SpringConfig {
    private final Seoul seoul;
    @Autowired
    public SpringConfig(Seoul seoul) {
        this.seoul = seoul;
    }

    @Bean
    public Korea_CIty_List korea_cIty_list(){
        return new Korea_CIty_List((CityRepository) seoul);
    }
}
