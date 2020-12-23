public class Pizza {
    private final String plainPizza;
    private final String fish;
    private final String meat;
    private final String chicken;
    private final String cheese;
    private final String vegetable;
    private final int price;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.plainPizza = pizzaBuilder.plainPizza;
        this.fish = pizzaBuilder.fish;
        this.meat = pizzaBuilder.meat;
        this.chicken = pizzaBuilder.chicken;
        this.cheese = pizzaBuilder.cheese;
        this.vegetable = pizzaBuilder.vegetable;
        this.price = pizzaBuilder.price;
    }

    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();
        newString.append(plainPizza).append("\n");

        if(fish!=null) newString.append(fish).append('\n');
        if(meat!=null) newString.append(meat).append('\n');
        if(chicken!=null) newString.append(chicken).append('\n');
        if(cheese!=null) newString.append(cheese).append('\n');
        if(vegetable!=null) newString.append(vegetable).append('\n');

        newString.append("The total price is: ").append(price);

        return newString.toString();

    }

    public static class PizzaBuilder {
        private final String plainPizza;
        private String fish;
        private String meat;
        private String chicken;
        private String cheese;
        private String vegetable;
        private int price;

        public PizzaBuilder() {
            this.plainPizza = "Plain Pizza";
            this.price+=100;
        }

        public PizzaBuilder addMeat(){
            this.meat = "Added Meat";
            this.price+=80;
            return this;
        }

        public PizzaBuilder addFish(){
            this.fish = "Added Fish";
            this.price+=60;
            return this;
        }

        public PizzaBuilder addChicken() {
            this.chicken = "Added Chicken";
            this.price+=50;
            return this;
        }

        public PizzaBuilder addCheese() {
            this.cheese = "Added Cheese";
            this.price+=20;
            return this;
        }

        public PizzaBuilder addVegetable() {
            this.vegetable = "Added Vegetable";
            this.price+=30;
            return this;
        }

        public Pizza Build(){
            Pizza pizza = new Pizza(this);

            return pizza;
        }
    }
}
