package whileloop;

public class freq {
    public static void main(String[] args) {
        String word ="aabbccddefawr";


        String result ="";
        for (int i = 0; i < word.length(); i++) {
            char each  = word.charAt(i);
            int count =0;
            for (int j = 0; j < word.length(); j++) {

               if( each == word.charAt(j))
               {     count++;                           }


            }
            if(result.contains(""+each)){
                continue;
            }

         result+=each;
          result+=count;
        }

        System.out.println("result = " + result);








    }



}
