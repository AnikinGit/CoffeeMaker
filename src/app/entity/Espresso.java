package app.entity;

public class Espresso implements Coffee{
    @Override
    public void make() {
        System.out.println("Your Espresso. Enjoy :)");
    }
}
