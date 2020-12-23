public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder()
                .addMeat()
                .addCheese()
                .Build();

        System.out.println(pizza1.toString()+"\n");

        Pizza pizza2 = new Pizza.PizzaBuilder()
                .addChicken()
                .addCheese()
                .Build();

        System.out.println(pizza2.toString()+"\n");

        Pizza pizza3 = new Pizza.PizzaBuilder()
                .Build();

        System.out.println(pizza3.toString()+"\n");
    }
}
