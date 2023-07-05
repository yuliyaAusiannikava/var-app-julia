package by.itstep;

import java.util.Scanner;

public class Tasks {

    public static void task1(){
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End of method");
    }


    public static void main(String[] args) {
        System.out.println("Begin main");
        System.out.println("Main method logic");
        triangle();//run method task1
        System.out.println("Main end.");

    }

    public static void task2(){
        System.out.println("Task 2 begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        System.out.println("Input C:");
        int c = sc.nextInt();
        System.out.println("Result: " + (a + "*x^2 + " + b + "*x + "+ c) + " = 0");

        double D;
        D = Math.pow(b, 2) - 4*a*c;
        System.out.println(D);
        if (D > 0){
            System.out.println("Two results: ");
            double x1, x2;
            x1 = ((-b + Math.sqrt(D)/2*a));
            x2 = ((-b - Math.sqrt(D)/2*a));
            System.out.println(x1 + " and " + x2);
        } else if (D == 0){
            double x;
            System.out.println("One result");
            x = ((-b)/(2*a));
            System.out.println(x);
        } else {
            System.out.println("You do not have result!");
        }

    }

    public static void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        int square = a * b;
        System.out.println("Area is " + square);
        int perimeter = a + b;
        System.out.println("Perimeter is " + perimeter);
        if (a==b){
            System.out.println("Your object is square");
        }

    }
    public static void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        System.out.println("Input C:");
        int c = sc.nextInt();
        if (a + b >= c){
            if (b + c >= a){
                System.out.println("Triangle exists");
                int p = (a + b + c) / 2;
                double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("Area of your triangle is " + S);
                int perimeter = a + b + c;
                System.out.println("Perimeter is " + perimeter);
                if (a == b || a == c) {
                    System.out.println("Your triangle is isosceles");
                }
            } else {
                System.out.println("Triangle doesn't exist, input new parameters");

            }
        }

    }
    public static void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input r:");
        int r = sc.nextInt();
        double l = 2 * Math.PI * r;
        double S = (l * r)/2;
        System.out.println("Circumference length is " + l);
        System.out.println("Square of circle is " + S);
    }
    public static void runSomeTask(){
        System.out.println("1.circle()");
        System.out.println("2.rectangle()");
        System.out.println("3.task1()");
        System.out.println("4.task2()");
        System.out.println("5.triangle()");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Item number: ");
        int num = sc.nextInt();
        if (num == 1){
            circle();
        } else if (num == 2) {
            rectangle();
        } else if (num == 3) {
            task1();
        } else if (num == 4) {
            task2();
        } else if (num == 5) {
            triangle();
        } else {
            System.out.println("Not such method!");
        }
    }
    public static void metabolism(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height:");
        int height = sc.nextInt();
        System.out.println("Input weight:");
        int weight = sc.nextInt();
        System.out.println("Input age:");
        int age = sc.nextInt();
        double bmr = 447.6 + (9.2 * weight) + (4.8 * height) - (4.3 * age);
        System.out.println("Your basic metabolism is :" + bmr);
        System.out.println("Choose your activity:");
        System.out.println("1.Сидячий образ жизни без нагрузок");
        System.out.println("2.Тренировки  1-3 раза в неделю");
        System.out.println("3.Занятия 3-5 дней в неделю");
        System.out.println("4.Интенсивные тренировки 6-7 раз в неделю");
        System.out.println("5.портсмены, выполняющие упражнения чаще, чем раз в день");
        System.out.println("Choose your activity:");
        int activityNum = sc.nextInt();
        if (activityNum == 1){
            System.out.println("Your active metabolism is :" + bmr * 1.2);
        } else if (activityNum == 2) {
            System.out.println("Your active metabolism is :" + bmr * 1.375);
        } else if (activityNum == 3) {
            System.out.println("Your active metabolism is :" + bmr * 1.55);
        } else if (activityNum == 4) {
            System.out.println("Your active metabolism is :" + bmr * 1.725);

        }

    }
}
