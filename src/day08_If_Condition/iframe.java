package day08_If_Condition;

public class iframe {
    public static void main(String[] args) {


        int x = 3;


        if (x==3){
            System.out.println("hello");

        }
       else if(++x==3){
            System.out.println("ok");
       x++;
       }

        else
        {
            System.out.println("ooo");

        }
        System.out.println("x = " + x);

        System.out.println("-----------");
        int a=5;
        int y =a++;

        System.out.println(y);
        System.out.println(a++ +" " + y + " "+ a);



    }




}
