package by.itstep;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {

    public static void printSumma(int a, int b) {
        System.out.println("S = " + summa(a, b));
        System.out.println("Inside method printSumma");
    }

    public static int varXTwo(int a) {
        int newVar = a * 2;
        System.out.println(newVar);
        return newVar;
    }

    public static int summa(int a, int b) {
        int result = a + b;
        return result;

    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by Zero");
        }
        return a / b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int squareRoot(double base) {
        int res = (int) Math.sqrt(base);
        return res;

    }

    public static int distance(int speed, int time) {
        return (speed * time);
    }

    public static int hypotenuse(int firstK, int secondK) {
        int hyp = squareRoot((Math.pow(firstK, 2)) + (Math.pow(secondK, 2)));
        return hyp;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose menu option from this list: ");
        System.out.println("1.Summa");
        System.out.println("2.varXTwo");
        System.out.println("3.Sub");
        System.out.println("4.Multiply");
        System.out.println("5.Div");
        System.out.println("6.SquareRoot");
        System.out.println("7.Hypotenuse");

        int methodNumber = sc.nextInt();
        switch (methodNumber) {
            case 1: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                System.out.println("Input B: ");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 2: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                int r = varXTwo(a);
                System.out.println("result is " + r);
                break;
            }
            case 3: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                System.out.println("Input B: ");
                int b = sc.nextInt();
                int r = sub(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 4: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                System.out.println("Input B: ");
                int b = sc.nextInt();
                int r = mult(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 5: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                System.out.println("Input B: ");
                int b = sc.nextInt();
                int r = (int) div(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 6: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                double r = squareRoot(a);
                System.out.println("result is " + r);
                break;
            }
            case 7: {
                System.out.println("Input A: ");
                int a = sc.nextInt();
                System.out.println("Input B: ");
                int b = sc.nextInt();
                int r = hypotenuse(a, b);
                System.out.println("result is " + r);
                break;
            }
            default: {
                System.out.println("Not such position in menu!");
                menu();
            }
        }
    }

    public static void randomMenu(int times) {
        if (times < 1) {
            System.out.println("Wrong times number");
        } else {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < times; i++) {
                int mNum = (int) (Math.random() * 7 + 1);
                switch (mNum) {
                    case 1: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        System.out.println("Input B: ");
                        int b = sc.nextInt();
                        int r = summa(a, b);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 2: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        int r = varXTwo(a);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 3: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        System.out.println("Input B: ");
                        int b = sc.nextInt();
                        int r = sub(a, b);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 4: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        System.out.println("Input B: ");
                        int b = sc.nextInt();
                        int r = mult(a, b);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 5: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        System.out.println("Input B: ");
                        int b = sc.nextInt();
                        int r = (int) div(a, b);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 6: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        double r = squareRoot(a);
                        System.out.println("result is " + r);
                        break;
                    }
                    case 7: {
                        System.out.println("Input A: ");
                        int a = sc.nextInt();
                        System.out.println("Input B: ");
                        int b = sc.nextInt();
                        int r = hypotenuse(a, b);
                        System.out.println("result is " + r);
                        break;
                    }
                    default: {
                        System.out.println("Not such position in menu!");
                        menu();
                    }

                }
            }


        }


    }


    //Client
    public static void main(String[] args) {
//        varXTwo(45);
//        int s = summa(10, 20);
//        System.out.println(s);
//        int r = sub(200, -200);
//        System.out.println(r);
//        double d = div(100, 40);
//        System.out.println(d);
//        int m = mult(20, 30);
//        System.out.println(m);
//
//        System.out.println(sub(sub(2, 2), summa(4, 4)));
//
//        System.out.println((squareRoot(9)));
//
//        System.out.println((distance(45, 10)));
//
//        System.out.println(hypotenuse(3, 4));
//
//        menu();


        randomMenu(5);



    }
}
