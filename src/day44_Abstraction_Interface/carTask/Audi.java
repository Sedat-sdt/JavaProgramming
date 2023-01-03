package day44_Abstraction_Interface.carTask;

public final class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autopark() {
        System.out.println(getMake()+" can autopark");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" starts with button");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is being driven");
    }
}
