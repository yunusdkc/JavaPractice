package arrays_tasks;

public class palindromes {
    public static void main(String[] args) {
        /*4. write a program that can count how many palindromes in an array of
string Ex: {"anna", "level", "Java"};
output: 2*/
        String[] word = {"anna","ytd","level","java"};

        for (String each : word) {
            String reverse = "";
            for (int i= each.length()-1; i >=0; i--) {
               reverse+= each.charAt(i);



            }

            if(reverse.equals(each)){
                System.out.println("reverse = " + reverse);
            }
        }








    }
}
