package arrays;


import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {

        String str = "java";
        char [] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
for ( char each : str.toCharArray()){
    System.out.println(each);
}

    }


}
