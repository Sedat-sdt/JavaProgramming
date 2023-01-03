package day44_Abstraction_Interface.carTask;

public final class Honda extends Car {


    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" starts with key ");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is being driven");

    }
}
