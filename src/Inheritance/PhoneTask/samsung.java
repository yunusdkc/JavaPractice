package Inheritance.PhoneTask;

public class samsung extends Phone {

    public samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
    public void call (long phoneNumber){

        System.out.println( phoneNumber +" is calling you " );

    }
    public void text (long phoneNumber){

        System.out.println( phoneNumber +" texted to you " );

    }

    public void freeze(){
        System.out.println(brand +" " + model + "is freezing");

    }


}
