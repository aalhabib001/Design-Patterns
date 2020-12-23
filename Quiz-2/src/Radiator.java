public class Radiator {
    int radiatorSpeed = 0;
    public void on(){
        System.out.println("Turning on Radiator");
    }

    public void off(){
        System.out.println("Turning off Radiator");
    }

    public void setSpeed(int speed){
        radiatorSpeed = speed;
        System.out.println("Setting up Radiator Speed to "+speed);
    }
}
