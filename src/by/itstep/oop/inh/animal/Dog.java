package by.itstep.oop.inh.animal;

public class Dog extends DAnimal {
    @Override
    void voice(){
        System.out.println(getName() + " bark - bark - barrrrrk");
    }

    void herd(){
        System.out.println(getName() + " can herd");
    }

    @Override
    void eat(){
        System.out.println(getName() + " eats bones");
    }



}
