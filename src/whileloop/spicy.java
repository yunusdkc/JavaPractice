package whileloop;

public class spicy {
    public static void main(String[] args) {
        /*2. write a program that can return the frequency of the a word Java
from the sentence
Ex:
sentence = "JavaJavaJava";
output: 3    */
String sentence = "java javajha=javajava java ";
String ch="";
int count =0;
   /*     for (int i = 0; i <sentence.length()-3 ; i++) {

          ch =  sentence.substring(i,i+4);
            if(ch.equalsIgnoreCase("java")){
          count++;

            }


        }
        System.out.println("count = " + count);

*/

        while(sentence.contains("java")){

            sentence= sentence.replaceFirst("java","");
            count++;
        }

        System.out.println(count);



    }



}
