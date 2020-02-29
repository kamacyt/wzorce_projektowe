package builder;

public class App {
    public static void main(String[] args) {
        Pizza margherita = new Pizza.PizzaBuilder("cienkie", "pomidorowy", "ser")
                .setCzyOstraEnabled(true)
                .build();
        System.out.println(margherita.toString());


    }
}
