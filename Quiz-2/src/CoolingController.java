public class CoolingController {
    Radiator radiator = new Radiator();
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    int highTemp;
    int currentTemp = 65;

    public void setTemperatureUpperLimit(int temp){
        highTemp = temp;
        System.out.println("Temperature is set to upper limit with value "+temp);
    }

    public void run(){
        System.out.println("Turning on Cooler");
        System.out.println("Cooling Controller is Running");
    }

    public void cool(int temp){
        currentTemp = temp;
        System.out.println("Cooling down to Temperature "+temp);
    }

    public void stop(){
        System.out.println("Turning off Cooler");
    }
}
