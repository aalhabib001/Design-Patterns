public class VegetableToppings extends ToppingDecorator{

    public VegetableToppings(Pizza basicPizza) {
        super(basicPizza);
        System.out.println("Adding Vegetable Toppings");
    }

    public String getDescription(){
        return basicPizza.getDescription() + " with Vegetable Toppings";
    }

    public int getCost(){
        return basicPizza.getCost() + 60;
    }
}
