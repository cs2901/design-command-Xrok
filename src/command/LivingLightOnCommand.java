package command;

public class LivingLightOnCommand implements Command {
    LivingLight livinglight;

    public LivingLightOnCommand(LivingLight livinglight) {
        this.livinglight = livinglight;
    }

    @Override
    public void execute() {
        livinglight.on();
    }
}
