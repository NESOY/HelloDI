package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NESOY on 2017-01-13.
 */
public class MainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("kr/ac/hansung/spring/di/beans/animal.xml");

        PetOwner person = (PetOwner) context.getBean("petOwner");
        person.play();

        context.close();
    }
}
