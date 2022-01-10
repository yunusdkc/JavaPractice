package void_method;

public class eligible {
    /*4. create a method that can check if a person is eligible to vote
			Ex:	eligibleToVote(19, "USA");
			output: 	You are not eligible to vote! */

    public static void eligible(int number, String citizen) {
        if (number>=21 && citizen.equalsIgnoreCase("usa") ){
            System.out.println("You are eligible to vote!");
        }
        else{
            System.out.println("You are not eligible to vote!");
        }

    }

    public static void main(String[] args) {

        eligible(21,"UsA");

    }






}
