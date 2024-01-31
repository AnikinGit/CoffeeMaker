package app.controller;

import app.model.CoffeeModel;

public class Controller {

    CoffeeModel coffeeModel;

    public Controller(CoffeeModel coffeeModel) {
        this.coffeeModel = coffeeModel;
    }

    public void filterChoice(int choice) {
        switch (choice) {
            case 1 -> coffeeModel.makeEspresso();
            case 2 -> coffeeModel.makeCappuccino();
            case 3 -> coffeeModel.makeLatte();
        }
    }

}
