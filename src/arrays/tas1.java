package arrays;

import java.util.Arrays;

public class tas1 {
    public static void main(String[] args) {
        int [] num = new int[100];
        for (int i = 0,j=100; i < num.length; i++,j--) {

            // num[i]=i+1;  1 to 100
        num[i] =j;  // 100 to 1

        }
        System.out.println(Arrays.toString(num)+" ");









    }
}
