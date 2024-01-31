package app.utils;

import app.entity.Coffee;

public class CoffeeMachine {
    Coffee coffee;

    public void setTypeOfCoffee (Coffee coffee){this.coffee = coffee;}

    public void makeCoffee(){coffee.make();}
}
