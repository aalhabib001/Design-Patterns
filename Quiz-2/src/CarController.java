public class CarController {
    public static void main(String[] args) {
        CarEngineControlFacade carEngineControlFacade = new CarEngineControlFacade();

        carEngineControlFacade.startEngine();

        carEngineControlFacade.stopEngine();
    }
}
