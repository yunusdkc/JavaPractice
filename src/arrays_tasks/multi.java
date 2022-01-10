package arrays_tasks;

import java.util.Arrays;

public class multi {
    public static void main(String[] args) {
        /*Write a program that can reverse a two dimensional array (return new array)
			array = { {1,2,3}, {4,5,6}};
		output: 	reverse = { {6,5,4}, {3,2,1},};
*/

        int[][] ytd= { {1,2,3}, {4,5,6,}};

        int[][] reverse = new int[ytd.length][ytd[0].length];

        for (int i = 0, j= ytd.length-1; i < ytd.length; i++,j--) {


            for (int i1 = 0, j1=ytd[i].length-1  ; i1 < ytd[i].length; i1++,j1--) {
                reverse[j][i1]=ytd[i][j1];
            }

        }
        System.out.println(Arrays.deepToString(reverse));

    }
}
