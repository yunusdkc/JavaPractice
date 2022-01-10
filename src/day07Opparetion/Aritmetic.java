package day07Opparetion;

public class Aritmetic {
    public static void main(String[] args) {

        int num1 =10;
        int num2 =3;

        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);

        num1++;

        System.out.println("num1 = " + num1);

        System.out.println(++num1);

        System.out.println("num1 = " + num1);

        System.out.println(num1 + 100);
        System.out.println(++num1);
        System.out.println("num1 = " + num1);

        num1+=52;
        System.out.println(num1);

        String word = "wooden";
        word+="spoon";

        System.out.println("word = " + word);

        boolean result1 = 300 != 300;

        System.out.println("result1 = " + result1);


        boolean resut2 = 300<322 || 300<=5;
        System.out.println("resut2 = " + resut2);





    }






}
