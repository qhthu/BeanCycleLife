package demo.spring.beancyclelife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Beancyclelife {

    public static void main(String[] args) throws Exception{
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationBeans.class);
        People people = applicationContext.getBean("peopleBean", People.class);
        System.out.println("ID: "+ people.getId());
        System.out.println("Name: "+ people.getName());
        System.out.println("Age: "+ people.getAge());
        ((ConfigurableApplicationContext) applicationContext).getBeanFactory().destroyBean(people);
    }

}
