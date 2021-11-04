package com.company;

public class Main {

    public static void main(String[] args) {


        Car newCar = new Car();
        newCar.engineCapacity = "3244234cc";
        newCar.name = "Bob";
        newCar.model = "metro";
        newCar.doors = 9;

        System.out.println(newCar.color);
    }
}
