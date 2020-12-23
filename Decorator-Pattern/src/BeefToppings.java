public class BeefToppings extends ToppingDecorator{
    public BeefToppings(Pizza basicPizza) {
        super(basicPizza);
        System.out.println("Adding Beef Toppings");
    }

    public String getDescription(){
        return basicPizza.getDescription() + " with Beef Toppings";
    }

    public int getCost(){
        return basicPizza.getCost()+100;
    }

}
