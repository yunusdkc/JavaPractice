package wrapper;


import java.util.Arrays;

public class task2 {
    /*specialChars = " !";
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true*/

    public static void main(String[] args) {
        String str = "JAVA java";

        char[] chr = str.toCharArray();
        System.out.println(Arrays.toString(chr));

        int upperCount = 0;
        int lowerCount = 0;
        for (char each : chr) {
            if (Character.isUpperCase(each)) {
                upperCount++;
            }
            if (Character.isLowerCase(each)) {
        lowerCount++;

            }
        }

        System.out.println("lowerCount = " + lowerCount);
        System.out.println("upperCount = " + upperCount);
        boolean result = lowerCount == upperCount;

        System.out.println("result = " + result);

    }


}
