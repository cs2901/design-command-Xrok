package command;

public class CeilingFanHigh implements Command {
    CeilingFan ceilingfan;

    public CeilingFanHigh(CeilingFan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }

    @Override
    public void execute() {
        ceilingfan.on();
    }
}
