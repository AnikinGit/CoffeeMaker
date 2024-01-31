package app.view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int chooseOption() throws IOException {
        boolean validInput = false;
        int choice = 0;
        coffeeMenu();

       do{
           try {
               choice = Integer.parseInt(bufferedReader.readLine());
               if ((choice == 1) || (choice == 2) || (choice == 3)){
                   validInput = true;
               } else { System.out.println("Please enter a valid number (1, 2, or 3).");}
           } catch (NumberFormatException e) {
               System.out.println("Please enter a valid number.");
           } 
       } while (!validInput);

        return choice;
       }

    public void coffeeMenu() {
        System.out.println("Choose a drink:\n" +
                "      1 - Espresso\n" +
                "      2 - Cappuccino\n" +
                "      3 - Latte");
    }

}
