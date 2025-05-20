public class StartCommand implements Command {
    private final Vehicle vehicle;
    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.start();
    }
}

