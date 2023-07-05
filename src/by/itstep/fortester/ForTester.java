package by.itstep.fortester;

public class ForTester {

    public static void task1() {
        for (int i = 0; i < 2000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        for (int i = 1; i < 1000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        for (int i = 0, number = 10; i < 50; i++) {
            System.out.print(number + " ");
            number = number + 10;
        }
        System.out.println();
    }

    public static void task4() {
        for (int i = 0, number = -1; i < 100; i++) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();
    }

    public static void task5() {
        for (int i = 0, varF = -1, varS = 2; i <= 100; i++) {
            System.out.print(varF + " ");
            System.out.print(varS + " ");
            varF = varF - 2;
            varS = varS + 2;
        }
        System.out.println();
    }

    public static void task55() {
        for (int i = 0, number = -1; i < 100; i++) {
            if (number % 2 == 0) { //для всех четных чисел
                System.out.print(((-1) * number) + " ");
            } else {
                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
    }

    public static void task6() {
        for (int i = 0; i < 25; i++) {
            int varF = (int) (Math.random() * 11);
            System.out.print(varF + " ");
        }
        System.out.println();
    }

    public static void task7() {
        for(int a = 2; a <= 9; a++){
            for (int b = 2; b <= 10; b++) {
                int result = a * b;
                System.out.println(a + " x " + b + " = " + result);
            }
            System.out.println("*******");
        }


    }

    public static void task8() {
        for (int num = 1; num < 9; num++) {
            int studentNumber = (int) (Math.random() * 12) + 1;
            System.out.println(studentNumber);
        }
    }


    public static void main(String[] args) {
        /*      0           1           3           2
        for(<variable>;<condition>;<iteration>) {<body>}
        <variable> - do one time
        <condition> - true/false -> if true - run body of cycle
        <iteration> - run after body of cycle before each condition
        */
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (; true; ) {
//            System.out.println("Inside FOR");
//            int x = (int) (Math.random() * 10);
//            if (x == 5) {
//                break; //run out cycle
//            }
//        }

        // %
        int number = 3;
        int number2 = 2;
        int result = number % number2;
        System.out.println(result);

        task1();
        task2();
        task3();
        task4();
        task5();
        task55();
        task6();
        System.out.println();
        task7();
        task8();

    }
}
