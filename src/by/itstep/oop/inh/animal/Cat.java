package by.itstep.oop.inh.animal;

public class Cat extends DAnimal {
    @Override
    void sleep() {
        super.sleep();
        super.sleep();
        super.sleep();
    }

    @Override
    void eat() {
        System.out.println(getName() + " eat milk");
    }

    @Override
    void play() {
        System.out.println(getName() + "is playing");
    }

    @Override
    void voice(){
        System.out.println("meow - meow - meeeeeow");
    }

}
