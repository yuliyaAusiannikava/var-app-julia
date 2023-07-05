package by.itstep.oop.inh.animal;

import by.itstep.oop.Person;

public class DAnimal extends Animal {
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    void sleep(){
        System.out.println(getName() + " is sleeping .....ZzZzZzZz");
    }

    void eat(){
        System.out.println(getName() + " is eating");
    }

    void play(){
        System.out.println(getName() + "is playing");
    }

    void voice(){
        System.out.println("Some voice...");
    }

}
