package whileloop;

public class spic {
    public static void main(String[] args) {

        String ytd = "aaabbbcddddcc";
        String result = "";
        int count=0;
        for (int i = 0; i < ytd.length(); i++) {

            String ch = "" + ytd.charAt(i); //i==0 >>>a i==1> ch=a

            if (result.contains(ch)) {
            continue;
            }

                result += ch;


        }
        System.out.println("result = " + result);


    }


}
