package demo.spring.beancyclelife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

    @Bean(initMethod = "init", destroyMethod = "detroy")
    public People peopleBean(){
        People p = new People();
        p.setId(1);
        p.setName("Quach Hong Thu");
        p.setAge(22);
        return p;
    }
}
