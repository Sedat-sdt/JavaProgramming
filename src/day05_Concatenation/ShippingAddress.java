package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "123456",
                streetName = "Jones Branch Dr",
                city = "Mclean",
                state = "VA",
                zipCode = "23228A";

        //System.out.println(name + "\n" + buildingNumber+ " "+streetName + "\n" + city + ", " + state +" " + zipCode );
        String address = name + "\n" + buildingNumber+ " "+streetName + "\n" + city + ", " + state +" " + zipCode;
        System.out.println(address);

    }
}
