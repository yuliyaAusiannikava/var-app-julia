package by.itstep.oop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Travel {
    private String city;
    private String transport;
    private double price;
    private int people;
    private boolean children;

    public String getCity() {
        return city;
    }
    public void setCity(String newCity){
        city = newCity;
    }

    public String getTransport(){
        return transport;
    }
    public void setTransport(String newTransport){
        transport = newTransport;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrise){
       price = newPrise;
    }

    public int getPeople(){
        return people;
    }
    public void setPeople(int newPeople){
        people = newPeople;
    }

    public boolean getChildren(){
        return children;
    }
    public void setChildren(boolean newChildren){
        children = newChildren;
    }

    void chooseCity(){
        System.out.println("Choose the city from the list: ");
        System.out.println("1. Rome");
        System.out.println("2. Paris");
        System.out.println("3. Riga");
        System.out.println("4. Sochy");
        System.out.println("5. Palm-Cost");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("You choose Rome. Distance to this place is 1740 km.");
                break;
            case 2:
                System.out.println("You choose Paris.Distance to this place is  1830 km.");
                break;
            case 3:
                System.out.println("You choose Riga. Distance to this place is 400 km.");
                break;
            case 4:
                System.out.println("You choose Sochy. Distance to this place is 1450 km.");
                break;
            case 5:
                System.out.println("You choose Cost. Distance to this place is 8500 km");
                break;
            default:
                System.out.println("Incorrect choice! Try again!");
                chooseCity();
        }
    }

    void chooseTransport(){
        System.out.println("Choose the city from the list: ");
        System.out.println("1. Rome");
        System.out.println("2. Paris");
        System.out.println("3. Riga");
        System.out.println("4. Sochy");
        System.out.println("5. Palm-Cost");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You choose Rome. Distance to this place is 1740 km.");
                break;
            case 2:
                System.out.println("You choose Paris.Distance to this place is  1830 km.");
                break;
            case 3:
                System.out.println("You choose Riga. Distance to this place is 400 km.");
                break;
            case 4:
                System.out.println("You choose Sochy. Distance to this place is 1450 km.");
                break;
            case 5:
                System.out.println("You choose Cost. Distance to this place is 8500 km");
                break;
            default:
                System.out.println("Incorrect choice! Try again!");
                chooseCity();
        }


    }

    void countPrice(){

    }




}
