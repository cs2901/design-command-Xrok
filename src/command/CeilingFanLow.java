package command;

public class CeilingFanLow implements Command {
    CeilingFan ceilingfan;

    public CeilingFanLow(CeilingFan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }

    @Override
    public void execute() {
        ceilingfan.off();
    }
}
