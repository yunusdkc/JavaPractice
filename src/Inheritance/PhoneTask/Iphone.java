package Inheritance.PhoneTask;

public class Iphone extends Phone {
    public Iphone(String model, String size, double price, String color) {
        super("apple" , model , size , price, color);

    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email " + email);
    }



}
