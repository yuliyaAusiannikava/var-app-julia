package by.itstep.oop.patterns.factorymethod;

public abstract class Pizza {

    public abstract void printInfo();

}

class Pepperoni extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("We made for you Pepperoni");

    }
}

class Margarita extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("We made for you Margarita");

    }
}

class QuatroStagioni extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("We made for you QuatroStagioni");

    }
}

class QuatroFormagio extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("We made for you QuatroFormagio");
    }
}

class Pizzeria {
    public static Pizza makePizza(int key){
        switch (key) {
            case 1:
                return new Pepperoni();
            case 2:
                return new Margarita();
            case 3:
                return new QuatroFormagio();
            default:
                return new QuatroStagioni();
        }
    }
}

class ClientOfPizzeria {
    public static void main(String[] args) {
        Pizza p1 = Pizzeria.makePizza(1);
        p1.printInfo();
        Pizza p2 = Pizzeria.makePizza(2);
        p2.printInfo();
        Pizza p3 = Pizzeria.makePizza(3);
        p3.printInfo();
        Pizza p4 = Pizzeria.makePizza(5);
        p4.printInfo();


        Pizza [] pizzaArray = {p1, p2, p3, p4};

    }



}