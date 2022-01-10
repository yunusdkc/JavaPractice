package forTtask;

public class digit_number {
    public static void main(String[] args) {
  /* 5. write a program that can retive the digits, letters and special characters from a string
input: mn@#123Ab!   output:  letters: mnAb   digits: 123    special chars: @#! */


        String ytd = "cdhjjk3543*/-";

        char ch;
        int num = ytd.length();
        String digit = "";
        String letter = "";
        String special ="";
        for (int i = 0; num > i; i++) {
            ch = ytd.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letter += ch;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                letter += ch;
            }
           else {
               special+= ch;
            }
        }
        System.out.println("special = " + special);
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);

    }


}
