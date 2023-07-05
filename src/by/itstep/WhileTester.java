package by.itstep;

import java.util.Scanner;

public class WhileTester {

    public static void main(String[] args) throws InterruptedException {
        int t = 23;
        final int max = 100; // константа
        System.out.println("Input water volume (ml) MAX is 5000");
        Scanner sc = new Scanner(System.in);
        int ml = sc.nextInt();
        if (ml >= 200 && ml <= 5000) {
            while (t <= max) {
                System.out.println("working");
                Thread.sleep(500 * (ml/1000));
                int x = (int) (Math.random() * 6) + 5; //from 5 to 10
                t += x; // t = t + x
                System.out.println("Current water tmp is " + t);
            }
        } else {
            System.out.println("Incorrect volume. MIN is 0.2L, MAX is 5l");
        }





    }
    public static void task8() {
        int num = 0;
        while (num < 10) {
            int studentNumber = (int) (Math.random() * 13) + 1;
            System.out.println(studentNumber);
            num++;
        }


    }
}
