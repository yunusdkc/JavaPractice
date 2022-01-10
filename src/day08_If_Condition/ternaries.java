package day08_If_Condition;

public class ternaries {


    public static void main(String[] args) {


        int a = 4;
        int b = 3;
        int c;


     a=  (a>b) ? b = a : ++b;

       // System.out.println(c);
        System.out.println("--------------------------------------------------");

        int grade = 85;
        char latter = (grade > 0 && grade < 100) ? (grade >= 85) ? 'A' : (grade < 50) ? 'F' :  'p' : 'i';
        //char latter = (grade > 0 && grade < 100) ? (grade >= 85) ? 'A'  : (grade > 50 && grade < 85) ? 'P' : 'F' : 'I';
       // char latter = (grade > 0 && grade < 100) ? (grade >= 85) ? 'A' : (grade < 50) ? 'F' : 'p'   : 'i';
        System.out.println(latter);

    }

}
