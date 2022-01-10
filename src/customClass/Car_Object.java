package customClass;

import java.util.ArrayList;

public class Car_Object {

    public static void main(String[] args) {

        car car1 = new car();
        car car2 = new car();
        car car3 = new car();
        car car4 = new car();


        car1.setInfo("Audi","A4","grey",2019,30000);

        System.out.println("car1 = " + car1);

        car1.drive();




    }


}
