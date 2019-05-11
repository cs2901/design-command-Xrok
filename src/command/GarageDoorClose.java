package command;

public class GarageDoorClose implements Command {
    Garage garage;

    public GarageDoorClose(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.off();
    }
}
