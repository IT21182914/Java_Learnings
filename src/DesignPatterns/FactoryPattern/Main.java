package DesignPatterns.FactoryPattern;

public class Main {

    public static void main(String[] args) {

        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

    }
}
