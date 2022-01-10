package customClass;

import java.util.ArrayList;

public class dogs_object {
    public static void main(String[] args) {

       dog dog1 = new dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender ='F';
        dog1.size = "small";
        dog1.color = "White";



        dog dog2 = new dog();
dog2.setInfo("lisa","golden",5,'M',"large","gold");

   dog1.eat();
   dog2.bark();
        dog dog3 = new dog();
        dog3.setInfo("Sully","Pit-Bull",6,'F',"large","black");
        dog dog4 = new dog();
        dog3.setInfo("Lila","Pit-Bull",6,'F',"large","black");
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

     dog []  dogs = {dog1,dog2,dog3,dog4};
        ArrayList<String> femaleDogs = new ArrayList<>();
        ArrayList<dog>maleDogs = new ArrayList<>();

        for (dog each : dogs) {
           if( each.gender=='F'){

               femaleDogs.add(each.name);
           }


        }
        System.out.println("------------------------------");
        System.out.println("female dogs:"+femaleDogs);

    }







}
