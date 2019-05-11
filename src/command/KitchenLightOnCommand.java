package command;

public class KitchenLightOnCommand implements Command {
    KitchenLight kitchenlight;

    public KitchenLightOnCommand(KitchenLight kitchenlight) {
        this.kitchenlight = kitchenlight;
    }

    @Override
    public void execute() {
        kitchenlight.on();
    }
}
