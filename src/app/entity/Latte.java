package app.entity;

public class Latte implements Coffee{
    @Override
    public void make() {
        System.out.println("Your Latte. Enjoy :)");
    }
}
