package company;

public class Main {
    public static void main(String[] args) {
        ITarget target = new Adopter(new Adaptee());
        target.request();
    }
}