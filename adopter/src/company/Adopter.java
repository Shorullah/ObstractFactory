package company;

public class Adopter implements ITarget{
    Adaptee adaptee;
    public Adopter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
