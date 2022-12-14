package day33_Statics;

public class Iphone {
  public static String brand="Apple";

  public String model;
  public double price;
  public static String operatingSystem="iOS";
  public String color;
  public String size;
  public static String madeIn="China";
  public static boolean hasBattery=true;
  public static boolean isTouchScreen=true;
  public static boolean hasCamera=true;

  public static void printModelAndPrice(){
    //System.out.println(model+" : "+price);//static methods does not accept instances
  }

  public  void method1(){
    System.out.println(model+" : "+price);
    System.out.println(operatingSystem);
  }

  public static void printOperatingSystem(){
    System.out.println(operatingSystem);
  }














}
