package command;

public class Garage {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("Garage is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Garage is "+isOn);
    }

}
