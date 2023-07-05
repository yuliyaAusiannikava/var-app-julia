package by.itstep.oop;

import java.util.Scanner;

// Class <=> Model <=> Type <=> Template (шаблон)
// Класс, он же тип определяет, будущие характеристики и фукнционал конкретного объекта
public class Person {
    //field - характеристики будущего объекта
    int age;
    String name;
    String lastName;
    char gender; //can be 'f', 'm'
    boolean isSingle;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //method <=> поведение будущих объектов
    void sayMyName() {
        System.out.println("Hello, my name is " + name);
    }

    void dance() {
        System.out.println(name + " is dancing");
    }

    void drink() {
        if (age >= 18) {
            System.out.println("You can drink vine or/and beer");
        } else {
            System.out.println("You have to drink only water");
        }
    }


    void dancingAfterDrink() {
        if (age >= 18) {
            System.out.println(name + ", you can drink vine or/and beer");
            for (int i = 1; i <= 3; i++) {
                System.out.println("You drunk " + i + " shot");
                if (i == 3) {
                    System.out.println(name + ", you can dancing just amazing !");
                }
            }
        } else {
            System.out.println("You have to drink only water");
        }
    }

    void dating(){
        if (isSingle == false){
            if (age >= 18){
                System.out.println(name + ", you can drink alcohol and have new date");
            } else {
                System.out.println("GO HOME KITTEN! YOU TOO LITTLE TO OUR BAR!");
            }

        }
    }


}

class Tester {
    public static void main(String[] args) {
        //создание переменной типа Person
        Person person;

        // instance creation <=> object creation с помощью оператора new создаем объект в памяти
        person = new Person();

        //instance fields initialisation <=> object population
        person.name = "John";
        person.age = 37;
        person.gender = 'm';
        person.isSingle = false;
        person.lastName = "Johnson";

        // object behavior   <=> method invocation
        person.sayMyName();
        person.drink();
        person.dance();

        System.out.println("************\n");

        Person personTwo = new Person();
        personTwo.name = "Anna";
        personTwo.age = 33;

        personTwo.dancingAfterDrink();

        System.out.println("************\n");

        Person personThree = new Person();
        personThree.name = "Sam";
        personThree.age = 17;

        personThree.dating();


    }

}
