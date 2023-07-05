package by.itstep.oop.inh.animal;



public class Tiger extends Cat {
    void attack(){
        System.out.println(getName() + " attacks");
    }

    @Override
    void voice(){
        System.out.println(getName() + " doing RRRRR");
    }

    @Override
    void eat(){
        System.out.println(getName() + " eats only freshest meat");
    }

    @Override
    void play(){
        System.out.println(getName() + " playing with legs");
    }
}
