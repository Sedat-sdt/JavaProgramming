package day44_Abstraction_Interface.carTask;

public final class BMW extends Car {

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" starts with button ");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is being driven");

    }
}
