package Transports;
import Interficies.Vehicle;

public class Car implements Vehicle {
    public void start() { System.out.println("Interficies.Vehicle.Car started!"); }
    public void accelerate() { System.out.println("Interficies.Vehicle.Car accelerating!"); }
    public void brake() { System.out.println("Interficies.Vehicle.Car braking!"); }
}