package app.model;

import app.entity.Cappuccino;
import app.entity.Espresso;
import app.entity.Latte;
import app.utils.CoffeeMachine;

public class CoffeeModel {
    private final CoffeeMachine coffeeMachine;

    public CoffeeModel(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCappuccino() {
        coffeeMachine.setTypeOfCoffee(new Cappuccino());
        coffeeMachine.makeCoffee();
    }

    public void makeEspresso() {
        coffeeMachine.setTypeOfCoffee(new Espresso());
        coffeeMachine.makeCoffee();
    }

    public void makeLatte() {
        coffeeMachine.setTypeOfCoffee(new Latte());
        coffeeMachine.makeCoffee();
    }
}