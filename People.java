package demo.spring.beancyclelife;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class People {
    private Integer id;
    private String name;
    private Integer age;

    public People(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @PostConstruct
    public void init() throws Exception{
        System.out.println("this is init method");
    }

    public void Util(){
        System.out.println("this is sth");
    }

    @PreDestroy
    public void detroy() throws Exception{
        System.out.println("this is predetroy method");
    }
}
