abstract class ToppingDecorator implements Pizza{
    protected Pizza basicPizza;

    public ToppingDecorator(Pizza basicPizza){
        this.basicPizza = basicPizza;
    }

    @Override
    public String getDescription() {
        return basicPizza.getDescription();
    }

    @Override
    public int getCost() {
        return basicPizza.getCost();
    }
}
