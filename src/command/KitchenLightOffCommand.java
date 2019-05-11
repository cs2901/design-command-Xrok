package command;

public class KitchenLightOffCommand implements Command {
    KitchenLight kitchenlight;

    public KitchenLightOffCommand(KitchenLight kitchenlight) {
        this.kitchenlight = kitchenlight;
    }

    @Override
    public void execute() {
        kitchenlight.off();
    }
}
