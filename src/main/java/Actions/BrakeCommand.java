package Actions;
import Interficies.Command;
import Interficies.Vehicle;

public class BrakeCommand implements Command {
    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.brake();
    }
}

