package app.utils;

import app.controller.Controller;
import app.model.CoffeeModel;
import app.view.View;

import java.io.IOException;

public class AppStarter {
    public static void startApp() throws IOException {
        View view = new View();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeModel coffeeModel = new CoffeeModel(coffeeMachine);
        Controller controller = new Controller(coffeeModel);
        controller.filterChoice(view.chooseOption());

    }
}
