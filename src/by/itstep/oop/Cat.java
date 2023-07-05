package by.itstep.oop;

public class Cat {
    private long id;
    private String name;
    private String type;
    private boolean fur;
    private String eyaColor;
    private char gender;
    private int age;
    private double w;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Incorrect age: " + newAge);
        } else {
            age = newAge;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public boolean getFur() {
        return fur;
    }

    public void setFur(boolean newFur) {
        fur = newFur;
    }

    void play(boolean dayTime){
        if (dayTime == false){
            System.out.println(name + " is playing now!");
        } else {
            System.out.println(name + " is sleeping now!");
        }
    }

    void grooming(){
        if (fur == true){
            System.out.println(name + " have to go groomer!");
        } else {
            System.out.println(name + " doesn't need a grooming!");
        }
    }
}

class CatTester{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Barsik");
        System.out.println("Name is " + c1.getName());
        c1.play(true);
        c1.setFur(false);
        c1.grooming();
    }




}
