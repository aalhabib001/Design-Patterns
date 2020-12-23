public class TemperatureSensor {
    public void getTemperature(){
        CoolingController coolingController = new CoolingController();
        System.out.println("Current Temperature is "+coolingController.currentTemp);
    }
}
