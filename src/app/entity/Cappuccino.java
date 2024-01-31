package app.entity;

public class Cappuccino implements Coffee{
    @Override
    public void make() {
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
