package APP;

import Actions.AccelerateCommand;
import Actions.BrakeCommand;
import Actions.StartCommand;
import Interficies.Command;
import Interficies.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();


        Command carStart = new StartCommand(car);
        Command carAccelerate = new AccelerateCommand(car);
        Command carBrake = new BrakeCommand(car);

        Command bicycleStart = new StartCommand(bicycle);
        Command bicycleAccelerate = new AccelerateCommand(bicycle);
        Command bicycleBrake = new BrakeCommand(bicycle);

        Command planeStart = new StartCommand(plane);
        Command planeAccelerate = new AccelerateCommand(plane);
        Command planeBrake = new BrakeCommand(plane);

        Command boatStart = new StartCommand(boat);
        Command boatAccelerate = new AccelerateCommand(boat);
        Command boatBrake = new BrakeCommand(boat);


        ParkingRemoteControl control = new ParkingRemoteControl();


        control.setCommand(carStart); control.executeCommand();
        control.setCommand(carAccelerate); control.executeCommand();
        control.setCommand(carBrake); control.executeCommand();


        control.setCommand(bicycleStart); control.executeCommand();
        control.setCommand(bicycleAccelerate); control.executeCommand();
        control.setCommand(bicycleBrake); control.executeCommand();


        control.setCommand(planeStart); control.executeCommand();
        control.setCommand(planeAccelerate); control.executeCommand();
        control.setCommand(planeBrake); control.executeCommand();


        control.setCommand(boatStart); control.executeCommand();
        control.setCommand(boatAccelerate); control.executeCommand();
        control.setCommand(boatBrake); control.executeCommand();
    }
}