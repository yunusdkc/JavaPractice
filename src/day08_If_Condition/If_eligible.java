package day08_If_Condition;

public class If_eligible {
    public static void main(String[] args) {

        String name = "josef";
        int age = 38;
        String citizen = "USA";


        Boolean isEligible = age >=21 && citizen == "USA";

        if (isEligible) {

            System.out.println("eligible");

        }

    if (!isEligible) {


        System.out.println("not eligible");

    }



    }




}
