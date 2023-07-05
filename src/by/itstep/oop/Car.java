package by.itstep.oop;

import by.itstep.MathUtil;
import lombok.Data;

@Data
public class Car {
    double vEngine;
    String model;
    String color;
    String vinCode;
    int hp;
    int numberOfSeats;
    int numberOfGears;
    int currentGear;
    int maxSpeed;
    int currentSpeed;

    public Car() {
    }

    void acceleration() throws InterruptedException {
        while(this.currentSpeed <= this.maxSpeed) {
            this.switchGearUp();
            Thread.sleep(500L);
            int temp = MathUtil.genRandom(10, 40);
            this.currentSpeed += temp;
            System.out.println("Current speed is " + this.currentSpeed);
        }

    }

    void switchGearUp() {
        if (this.numberOfGears > this.currentGear) {
            ++this.currentGear;
            System.out.println("Current gear UP: " + this.currentGear);
        } else {
            System.out.println("Max gear number is reached");
        }

    }

    void switchGearDown() {
        if (this.currentGear >= 1) {
            --this.currentGear;
            System.out.println("Current gear DOWN: " + this.currentGear);
        } else {
            System.out.println("Min gear number is reached");
        }

    }
}
