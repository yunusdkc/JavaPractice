package learning_stuff;

public class stuff1 {
    public static void main(String[] args) {

        String lesson = "math";

        boolean high_lessons = lesson == "physic" || lesson == "chemistry" || lesson == "biology" || lesson == "math";

          /*NOTE: boolean kullanmazsan burada else if lerle tek tek dersleri belirtmen
           burdan geliyorgerekirdi boolean kullanmanin faysasi */
        if (high_lessons) {

            System.out.println("lesson = " + lesson +" choice" );


        } else {
            lesson = "invalid";

            System.err.println(lesson+ " lesson");
        }




    }

}











