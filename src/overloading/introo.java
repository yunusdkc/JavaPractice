package overloading;

import java.util.Arrays;

public class introo {
   public static double [] adddoubleeger(double[] array, double element){

       double result [] = new double [array.length+1];
// highlighted then ctrl +r after then replace the function
      int i =0;
       for (double each : array) {

           result[i++] = each;
       }
       result[i]=element;
 return result;
   }


    public static void main(String[] args) {

       double [] arr = {1,2,3,4};
       arr = adddoubleeger(arr,5);
        System.out.println(Arrays.toString(arr));
    }

}
