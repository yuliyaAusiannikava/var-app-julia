package by.itstep.oop.casting;

import by.itstep.oop.inh.Tester;

public class ShapeTester {

    public static void shapeTest(Shape shape){
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();

    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(11, 9, 6);
        t1.setColor("Blue");
        t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();


        Circle c1 = new Circle(22);
        c1.setColor("Red");
        c1.calculateP();
        c1.calculateS();
        c1.print();
        c1.showInfo();

        Rectangle r1 = new Rectangle(4, 8);
        r1.setColor("White");
        r1.calculateP();
        r1.calculateS();
        r1.print();
        r1.showInfo();

        Rectangle r2 = new Rectangle(8);
        r2.setColor("White");
        r2.calculateP();
        r2.calculateS();
        r2.print();
        r2.showInfo();

        //casting - приведение типов
        //приведение типов не меняет поля, функционал - ничего не делает с объектом

        //Upcasting - это когда конкретный объект рассматриваем обобщенной ссылкой родительского класса, тем самым
        //функционал более конкретного (наследника) класса становится недоступен
        Shape sh1 = new Triangle(3, 7, 6);
        //(<Super Type>) instance - это объект

        Shape sh2 = (Shape) new Rectangle(54);



        Shape sh3 = new Triangle(5,7,11);
        //DownCasting - это процесс создания из общего экземплярая более конретного
        Triangle tr2 = (Triangle) sh3; //всегда в явной форме доункастинг
        tr2.setC(9);


        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(4,5,8);
        shapeTest((Shape) rectangle);//явный апкастинг
        shapeTest(triangle);//неявный апкастинг

    }



}
