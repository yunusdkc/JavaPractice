package void_method;

public class print100 {
    /*1. create a method that can print odd numbers between 1~100 in a same line saperated by space*/
    public static void odd100(){
        for (int i = 0; i <=100 ; i++) {

            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        odd100();


    }







}
