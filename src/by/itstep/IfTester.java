package by.itstep;

public class IfTester {
    public static void main(String[] args) {
        System.out.println("Begin");

        int t = -30;
        //if(<condition>) {<body>}, where can be TRUE or FALSE!
        //if condition is true -> body
        if (t > 20) {
            System.out.println("T-shirt");
        }

        if (t < -15) {
            System.out.println("Fur");
        }

        int m1 = 7, m2 = 8, m3 = 9, m4 = 7, m5 = 10;
        double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
        System.out.println("AVG =  " + avg);

        if (avg >= 9) {
            System.out.println("Amazing!");
        } else if (avg >= 6) {
            System.out.println("Not bad!");
        } else {
            System.out.println("You will be producer in the future!");
        }

        int a = 5, b = 2, c = 3;
        if (((a + b) > c) && ((c + b) > a) && ((c + a) > b)) {
            System.out.println("Triangle exist!");
        } else {
            System.out.println("Sorry! It's impossible!");
        }
        /*if ((c+b) > a) {
            System.out.println("Triangle exist!");
        } else {
            System.out.println("Sorry! It's impossible!");
        }
        if ((c+b) > a) {
            System.out.println("Triangle exist!");
        } else {
            System.out.println("Sorry! It's impossible!");
        }*/

        int num1 = 10, num2 = 10, num3 = 20;
        if (num1 > num2 && num1 > num3) {
            System.out.println("First number more than all numbers");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number more than all numbers");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Third number more than all numbers");
        } else {
            System.out.println("Numbers are similar");
        }




    }
}





