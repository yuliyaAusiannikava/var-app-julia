package by.itstep.oop.inh.animal;




public class Horse extends DAnimal {
    void Ride(){
        System.out.println(getName() + "can ride by gallop");
    }

    @Override
    void eat(){
        System.out.println(getName() + " eats grass");
    }
}
