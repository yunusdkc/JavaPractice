package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
double[] agam=new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("enter 5 numbers");
          agam[i]= input.nextDouble();

        }
        input.close();
        System.out.println(Arrays.toString(agam));
        Arrays.sort(agam);
        System.out.println(Arrays.toString(agam));
        int[] ytd = {1, 5, 6, 8, 7, 3, 6, 5};
        char[] a = {'a', 'f', 'e', 't', 'y', 't', 'd'};

        System.out.println(Arrays.toString(ytd));
        System.out.println(Arrays.toString(a));

        Arrays.sort(ytd);
        Arrays.sort(a);

        System.out.println(Arrays.toString(ytd));

        System.out.println(Arrays.toString(a));


    }
}
