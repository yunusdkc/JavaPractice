package customClass;

public class regtangleObject {
    public static void main(String[] args) {

       rectangle rectangle1 =  new rectangle(5.5,2.5);
       rectangle rectangle2 = new rectangle(4.0,2);

     double x=   rectangle1.calcPerimeter();

        System.out.println("x = " + x);
        double y = rectangle1.calcArea();
        System.out.println("y = " + y);

        System.out.println("rectangle1 = " + rectangle1);
    }



}
