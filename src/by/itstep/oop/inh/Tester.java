package by.itstep.oop.inh;

import by.itstep.oop.Cat;

public class Tester {

    public static void main(String[] args) {
        //'USE' relationship
        Third th = new Third();
        th.setId(100);
        th.setName("John");
        th.setAge(45);
        th.setIq(75);


        //'USE' relationship
        Cat cat = new Cat();
        System.out.println(cat.toString());
        th.setCat(cat);

        th.sayMyName();
        th.run();
        th.jump();

        System.out.println(th.toString());

    }
}
