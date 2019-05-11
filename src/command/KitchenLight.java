package command;

public class KitchenLight {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("KitchenLight is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("KitchenLight is "+isOn);
    }

}
