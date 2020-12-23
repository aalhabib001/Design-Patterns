public class PizzaPlaza {
    public static void main(String[] args) {
        Pizza pizza1 = new BeefToppings(new PlainPizza());
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        Pizza pizza2 = new VegetableToppings(new PlainPizza());

        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());


        Pizza pizza3 = new BeefToppings(new VegetableToppings(new PlainPizza()));
        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());
    }
}
