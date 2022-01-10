package arrays_foreach;

public class uniqe {
    public static void main(String[] args) {

        int []cemal = {5,44,44,22,11,00,21,00};

        for (int each : cemal){
           int count = 0;
            for (int i : cemal) {
                if(each==i){
                    count++;
                }

            }
           if (count==1){
               System.out.println(each);
           }
        }









    }
}
