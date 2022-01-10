package wrapper;

public class task {
    public static void main(String[] args) {

        String word = "a3b5C*2";
        char [] arr=  word.toCharArray();

        int sum = 0;
        for (char each : arr) {

         if(Character.isDigit(each)){

          sum+= Integer.parseInt(each+"");
         }

        }



        System.out.println("sum = " + sum);







    }
}
