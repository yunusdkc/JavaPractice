package wrapper;

public class password {

    public static void main(String[] args) {
        String password = "str12A555";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; //uppercase
        boolean r3 = false;//lowercase
        boolean r4 = false;
        boolean r5 = false;

        char[] chars = password.toCharArray();


        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else // special char {
          r4 = true;

            }



    }

    }



