package void_method;


import java.util.Arrays;

public class anagram {
    /*
    17. create a method that can check if two strings are anagram
    		ex:  anagram("silent", "listen")
           output:	silent and listen are anagram
*/

    /*for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				return true;
			} else
			{
				return false;
			}*/

    public static void anagram(String word, String word2) {

        char[] wrd1 = word.toCharArray();
        char[] wrd2 = word2.toCharArray();
        Arrays.sort(wrd1);
        Arrays.sort(wrd2);

        if (Arrays.equals(wrd1,wrd2)) {
            System.out.println(word + " and " + word2 + " are anagram");
        } else {
            System.out.println(word + " and " + word2 + " are  not anagram");

        }
    }

    public static void main(String[] args) {
        anagram("silent","listen");

    }

}
