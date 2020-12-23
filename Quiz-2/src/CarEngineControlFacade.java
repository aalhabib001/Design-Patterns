public class CarEngineControlFacade {
    private static final int DEFAULT_COOLING_TEMP = 55;
    private static final int MAX_ALLOWED_TEMP = 100;
    AirFlowController airFlowController = new AirFlowController();
    FuelInjector fuelInjector = new FuelInjector();
    Starter starter = new Starter();
    CoolingController coolingController = new CoolingController();
    CatalyticConverter catalyticConverter = new CatalyticConverter();

    public void startEngine(){
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(MAX_ALLOWED_TEMP);
        coolingController.run();
        catalyticConverter.on();
        System.out.println("The Engine is Running\n");
    }

    public void stopEngine(){
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(DEFAULT_COOLING_TEMP);
        coolingController.stop();
        airFlowController.off();
        System.out.println("The Engine is Stopped");
    }

}
