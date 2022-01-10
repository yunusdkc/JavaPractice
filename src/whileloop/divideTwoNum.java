package whileloop;


public class divideTwoNum {
    public static void main(String[] args) {

int a = 25;
int  b = 3;
int count =0;
while(a >= b){
    a-=b;
    count++;

   }

System.out.println("a/b = "+ count +" and reminder is " + a );




    }
}
