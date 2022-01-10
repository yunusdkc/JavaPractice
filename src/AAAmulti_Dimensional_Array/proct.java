package AAAmulti_Dimensional_Array;

public class proct {
    public static void main(String[] args) {
        /*   9 10 11 12 13
                4 5 6 7 8
                1 2 3 */

        int[][] ytd = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = ytd.length - 1; i >= 0; i--) {


            for (int i1 = ytd[i].length-1; i1 >= 0; i1--) {

                System.out.print(ytd[i][i1] + " ");

            }
            System.out.println();
        }


    }













    }
