package day38_Inheritance_MethodOverriding.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {
        /*Square square=new Square(-10);
        System.out.println(square);//Invalid Side: -10.0*/
        Circle circle = new Circle(2);
        circle.setRadius(8);
        System.out.println(circle.getRadius());//8
        System.out.println(circle);//Circle{radius=8.0, pi=3.14', area='200.96', perimeter='50.24'}
        System.out.println(circle.getName());//Circle


        Square square=new Square(15);
        System.out.println(square);//Square{side=15.0, area='225.0', perimeter='60.0'}

        Rectangle rectangle=new Rectangle(6.0,5.0);

        System.out.println(rectangle);//Rectangle{length=6.0', width=5.0', area='30.0', perimeter='22.0'}

        rectangle.setWidth(3);

        System.out.println(rectangle.getWidth());//3.0
        System.out.println(rectangle.getName());//Rectangle


    }
}
