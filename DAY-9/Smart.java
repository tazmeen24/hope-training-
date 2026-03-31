abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void DeviceInfo(){
        System.out.println("This is a device");
    }
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    @Override
    void turnOff(){
        System.out.println("Light Off");
    }
}
interface Remote{
    void Change();
}
interface wifiControl{
    void connect();
}
class TV implements Remote,wifiControl{
    @Override
    public void Change(){
        System.out.println("Change channel");
    }
    @Override
    public void connect(){
        System.out.println("Wifi connected");
    }
}
public class Smart {
    public static void main(String[] args) {
        SmartDevice device=new Light();
        device.turnOn();
        device.turnOff();
        device.DeviceInfo();
    }
}