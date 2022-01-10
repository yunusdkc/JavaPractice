package arrays;

import java.util.Arrays;

public class githup1 {
    public static void main(String[] args) {

        //String days [] = new String[5]; // if we dont know what we put inside the array, we can create like this

      String days []= {"monday","tuesday", "wednesday","thursday","friday","saturday","sunday"};
        System.out.println(Arrays.toString(days));

int num =3;

if(num<0  || num>7 ){
    System.err.println("invalid entry");
    System.exit(0);
}

     //   System.out.println(days[num]);

        for (int i = 0; i < days.length; i++) {

            System.out.println(days[i]);


        }








    }
}
