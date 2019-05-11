package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        KitchenLight kitchenlight = new KitchenLight();
        LivingLight livinglight = new LivingLight();
        Garage garage = new Garage();
        Stereo stereo = new Stereo();
        CeilingFan ceilingfan = new CeilingFan();

        KitchenLightOnCommand kitchenlightOn = new KitchenLightOnCommand(kitchenlight);
        KitchenLightOffCommand kitchenlightOff = new KitchenLightOffCommand(kitchenlight);

        LivingLightOnCommand livinglightOn = new LivingLightOnCommand(livinglight);
        LivingLightOffCommand livinglightOff = new LivingLightOffCommand(livinglight);

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen(garage);
        GarageDoorClose garageDoorClose = new GarageDoorClose(garage);

        CeilingFanHigh ceilingfanHigh = new CeilingFanHigh(ceilingfan);
        CeilingFanLow ceilingfanLow = new CeilingFanLow(ceilingfan);

        StereoOn stereoOn = new StereoOn(stereo);
        StereoOff stereoOff = new StereoOff(stereo);


        remote.setCommand(kitchenlightOn);
        remote.buttonWasPressed();
        remote.setCommand(kitchenlightOff);
        remote.buttonWasPressed();

        remote.setCommand(livinglightOn);
        remote.buttonWasPressed();
        remote.setCommand(livinglightOff);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorClose);
        remote.buttonWasPressed();

        remote.setCommand(ceilingfanHigh);
        remote.buttonWasPressed();
        remote.setCommand(ceilingfanLow);
        remote.buttonWasPressed();

        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
        remote.setCommand(stereoOff);
        remote.buttonWasPressed();
    }
}
