package kr.ac.hansung.spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by NESOY on 2017-01-13.
 */
public class PetOwner {

    //@Autowired //wiring by type
    //@Qualifier("qf_cat")
    @Resource(name = "dog")
    private  AnimalType animal;


    public void play(){
        animal.sound();
    }
}
