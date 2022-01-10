package day08_If_Condition;

public class switchDay {
    public static void main(String[] args) {
        int day = 4;
        String word = "";

        switch (day) {
            case 1:
                word = "monday";
                break;
            case 2:
                word = "tuesday";
                break;
            case 3:
                word = "wednesday";
                break;

            case 4:
                word = "thursday";
                break;

            case 5:
                word = "friday";
                break;
            default:
                System.out.println("weekend");


        }

        System.out.println("today is  = " + word);


    }


}
