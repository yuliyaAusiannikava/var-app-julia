package by.itstep.oop.casting;

import by.itstep.oop.Cat;
import by.itstep.oop.inh.animal.Tiger;

public class Driver {

    private char[] types; //'A', 'B'....

    public void drive() {
        System.out.println("Driving...");
    }

    public void shareDocs() {
        System.out.println("Sharing documents... Types:");
        for (char type : types) {
            System.out.println(type);
        }
    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }

    public Driver(char[] types) {
        this.types = types;
    }
}

class Programmer extends Driver {

    public Programmer(char[] types) {
        super(types);
    }

    public void writeCode() {
        System.out.println("main(){}//....");
    }

}

class Student extends Driver {

    public Student(char[] types) {
        super(types);
    }

    public void studySmth() {
        System.out.println("Study....");
    }
}

class Test {

    public static void testDriver (Driver driver){
        driver.shareDocs();
        driver.drive();

        if(driver instanceof Programmer){
            Programmer p = (Programmer) driver;
            p.writeCode();
        } else if (driver instanceof Student){
            Student s = (Student) driver;
            s.studySmth();
        }

    }

    public static void main(String[] args) {
        char[] types = {'A', 'B'};
        Driver d = new Driver(types);

        d.drive();
        d.shareDocs();

        char[] types2 = {'B'};
        Programmer p1 = new Programmer(types2);
        p1.drive();
        p1.writeCode();
        p1.drive();
        p1.shareDocs();


        // when exist IS-A relationship
        Driver d1 = p1;

        Object o1 = p1;
        //o1.

        Object o2 = new int[5];
        Object o3 = new Cat();

        Programmer p10 = (Programmer) d1;
        p10.writeCode();

        Driver d10 = new Programmer(types);

        //оператор который проверит ссылку (объект) на принадлженость иерархии объектов указанного типа
        if (d10 instanceof Student) {
            Student st10 = (Student) d10;
            st10.studySmth();
        } else {
            System.out.println("D10 is not a student");
        }

        //проверка на совпадение класса с указанным. Проверка на вложенность отсутствует
        if (d10.getClass() == Student.class) {
            Student st10 = (Student) d10;
            st10.studySmth();
        } else System.out.println("d10 class is not a Student.class");

        Triangle o100 = new Triangle(2, 5, 7); //неявный апкастинг

        Shape sh100 = (Shape) o100; //явный апкастинг

        Object o200 = sh100; //неявный апкастинг

        System.out.println(((Triangle) o200).getC());

        char[] t = {'D'};
        Object o1000 = new Student(t);
        testDriver((Driver) o1000);



        testDriver(p1);


    }
}
