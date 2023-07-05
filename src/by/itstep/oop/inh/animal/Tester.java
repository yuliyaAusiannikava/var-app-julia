package by.itstep.oop.inh.animal;

import by.itstep.oop.Person;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Teo");
        dog.eat();
        dog.herd();
        dog.voice();
        Person person = new Person();
        person.setName("Julia");
        dog.setOwner(person);



        Tiger tiger = new Tiger();
        tiger.setName("Tigra");
        tiger.sleep();
        tiger.eat();
        tiger.play();
        tiger.voice();
    }
}
