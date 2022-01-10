package void_method;

public class withParant {
    public static void oddEven(int number){
if(number%2==0){

    System.out.println(number+ "is even number");

}
else{
    System.out.println(number+" is odd number");

}
    }

    public static void main(String[] args) {
 oddEven(5);

 printNumbers(5,20);

    }

public static void printNumbers(int x,int y){

        for (int i = x; i<=y; i++ ){
            System.out.print(i + " ");

        }
}







}
