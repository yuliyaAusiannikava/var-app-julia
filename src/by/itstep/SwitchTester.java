package by.itstep;

import java.util.Scanner;

public class SwitchTester {
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of day and number of month");
        int dayNum = sc.nextInt();
        int monthNum = sc.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Are you crazy? Such day not exist!");
        }
        switch (monthNum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Are you crazy? Such month not exist!");
        }
        switch (monthNum) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Are you crazy? Such season not exist!");
        }

    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input letter (single):");
        char ch = sc.next().charAt(0);
        int code = (int)ch; //получаем код символа
        System.out.println("Code is " + code);
        if (Character.isLetter(ch)){              //(code >= 65 && code <= 90) || (code >= 97 && code <= 122)
            System.out.println("Letter");
            switch (Character.toLowerCase(ch)){
                case 'a', 'e', 'y', 'o', 'u':
                    System.out.println("Vowels");
                    break;
                default:
                    System.out.println("Consonants");
                    break;
            }

        } else {
            System.out.println("It's not a letter!");
        }

    }
    public static void main(String[] args) {
        task2();

        /* int num = 1;
        // switch (var) {body with cases}

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not one and not two!");
        }*/


    }
}

