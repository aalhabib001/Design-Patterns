public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Pizza Dough";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
