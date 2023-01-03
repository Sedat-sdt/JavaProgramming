package day44_Abstraction_Interface.carTask;

public final class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autopark() {
        System.out.println(getMake()+" can autopark");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+"  drives itself with auto pilot");

    }

    @Override
    public void start() {
        System.out.println(getMake()+" starts with voice");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is being driven");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" can fly");

    }
}
