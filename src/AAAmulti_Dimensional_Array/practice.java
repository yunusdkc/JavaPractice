package AAAmulti_Dimensional_Array;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

int [][] ytd = {{1,5,3,4},{2,3,4},{6,9,8,7,5},{4,5,6,2}};

        System.out.println(Arrays.deepToString(ytd));
        System.out.println("------------------d--------------------"); //?

        for (int i = 0; i < ytd.length; i++) {

            System.out.println(Arrays.toString(ytd[i])+" array");

            for (int j = 0; j < ytd[i].length; j++) {

                System.out.print(ytd[i][j]+" ");


            }
            System.out.println();



        }

        System.out.println(ytd[2][3]);








    }
}
