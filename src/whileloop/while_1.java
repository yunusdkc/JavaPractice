package whileloop;

public class while_1 {
    public static void main(String[] args) {
        String ytd = "java java java ytjava";
        ytd.toLowerCase();

        int count =0;
        while (ytd.contains("java")){

           ytd = ytd.replaceFirst("java","");
            count++;
        }
        System.out.println("count = " + count);




















    }
}
