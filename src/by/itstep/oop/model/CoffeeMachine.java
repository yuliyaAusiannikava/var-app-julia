package by.itstep.oop.model;

public class CoffeeMachine {

    private final double maxWaterTank = 2000; //ml
    private final double maxMilkTank = 1000; //ml
    private final double maxCoffeeTank = 1000; //g
    private final double maxGarbageTank = 1500; //g


    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;

    private double waterTank;
    public void addWater (int extraWater){
       if ((extraWater + waterTank) >= maxWaterTank) {
           System.out.println("Can't add water");
        } else {
           waterTank += extraWater;
           System.out.println("Current water: " + waterTank + " ml");
       }
    }

    private double coffeeTank;
    public void addCoffee (int extraCoffee){
        if ((extraCoffee + coffeeTank) >= maxCoffeeTank) {
            System.out.println("Can't add water");
        } else {
            coffeeTank += extraCoffee;
            System.out.println("Current coffee: " + coffeeTank + " g");
        }
    }

    private double milkTank;
    public void addMilk (int extraMilk){
        if ((extraMilk + milkTank) >= maxMilkTank) {
            System.out.println("Can't add milk");
        } else {
            milkTank += extraMilk;
            System.out.println("Current milk: " + milkTank + " ml");
        }
    }

    private double garbageTank;
    public void cleanGarbage (int garbageLevel){
        if (garbageLevel == maxGarbageTank) {
            System.out.println("Clean garbage tank!!!");
        } else {
            System.out.println("You can make excellent coffee!");
        }
    }

    private int currentWaterTemp;

    private boolean isActive = false;
    private boolean isOn = false;


    public CoffeeMachine(String model) {
        salesCounter++;
        this.model = model;
        this.numberOfCups = 0;
    }

    public void switchOn() throws InterruptedException {
        if (!isOn) {
            System.out.println("CoffeeMachine " + model + " is starting..");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine " + model + " is started!");
        } else {
            System.out.println("Already started!");
        }
    }

    public void switchOff() throws InterruptedException {
        if (isOn) {
            System.out.println("CoffeeMachine " + model + " is stopping..");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine " + model + " is stopped!");
        } else {
            System.out.println("Already stopped!");
        }
    }



}



