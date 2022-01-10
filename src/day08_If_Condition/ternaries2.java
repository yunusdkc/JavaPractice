package day08_If_Condition;

public class ternaries2 {
    public static void main(String[] args) {

        double x = 5.01;

        if (x>5){

           x= (x>4)? ++x : --x;

            System.out.println(x);
        }
        else{

            System.out.println("try agin");
        }



    }

















}
