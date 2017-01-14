package kr.ac.hansung.spring.di;

/**
 * Created by NESOY on 2017-01-13.
 */
public class Cat implements AnimalType {

    private  String  myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public void sound() {
        System.out.println("Cat name="+ myName + ": Meow");
    }

}
