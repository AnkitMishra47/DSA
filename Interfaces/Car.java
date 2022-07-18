package com.company.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Car implements Model , brake , Engine {
    @Override
    public void changeColor(String color){
        System.out.println("Starting the Car");
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }

    @Override
    public void takeBrake(int speed) {
        System.out.println("Taking Brake");
    }

    public static void main(String[] args) {
        System.out.println(color);

    }

}
