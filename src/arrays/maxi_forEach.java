package arrays;

public class maxi_forEach {
    public static void main(String[] args) {
        int [] numbers = {10,5,4,20,1,0};
        int max = numbers[0];
int sum = 0;
        for (int number : numbers) {
            if(number>max){
                max=number;
            }

            sum+=number;

        }
double avarage = sum/ numbers.length;
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("avarage = " + avarage);







    }


}
