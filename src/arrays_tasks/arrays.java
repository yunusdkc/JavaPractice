package arrays_tasks;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        String [] word1 = { "ali", "veli"};
        String [] word2 = {"ytd","yunus", "taha"};
       String [] result = new String[word1.length+ word2.length-1];

        for (int i = 0; i < word1.length; i++) {

            result[i] = word1[i];

        }
        for (int i = 0; i < word2.length; i++) {

            result[word1.length-1+i]=word2[i];

        }
        System.out.println(Arrays.toString(result));



    }
}
