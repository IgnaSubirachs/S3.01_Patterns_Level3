package APP;

import Interficies.Command;

public class ParkingRemoteControl {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute(); }
}

