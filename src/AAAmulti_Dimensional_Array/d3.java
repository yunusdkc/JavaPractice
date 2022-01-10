package AAAmulti_Dimensional_Array;

import java.util.Arrays;

public class d3 {
    public static void main(String[] args) {
        int[][][] numbs = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };

        System.out.println(Arrays.deepToString(numbs));

        System.out.println(Arrays.deepToString(numbs[0]));
        System.out.println(Arrays.toString(numbs[1][2]));
        System.out.println(numbs[0][1][0]);
        for (int[][] nums : numbs) {
            for (int[] num : nums) {
                for (int i : num) {
                    System.out.print(i+" ");
                }
            }
        }

    }
}
