package command;

public class LivingLightOffCommand implements Command {
    LivingLight livinglight;

    public LivingLightOffCommand(LivingLight livinglight) {
        this.livinglight = livinglight;
    }

    @Override
    public void execute() {
        livinglight.off();
    }
}
