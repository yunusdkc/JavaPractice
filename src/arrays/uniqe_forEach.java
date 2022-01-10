package arrays;

public class uniqe_forEach {
    public static void main(String[] args) {
        String[] words ={"ytd", "yunus", "sss", "yunus"};



        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if (element.equals(each))
                    count++;
            }
            if(count==1){
                System.out.println(each);
            }
        }












    }
}
