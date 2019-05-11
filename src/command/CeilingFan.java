package command;

public class CeilingFan {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("CeilingFan is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("CeilingFan is "+isOn);
    }

}
