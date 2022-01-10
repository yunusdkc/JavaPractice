package Inheritance.PhoneTask;

public class phoneObject {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12", "5inches", 1000, "blue");
        System.out.println(iphone);
        iphone.call(2066025785);
        iphone.faceTime("yunusdkc@gmail.com");

        samsung samsung1 = new samsung("ice2", "6inches", 500, "white");
        System.out.println(samsung1);
        samsung1.text(2065056986);


    }

}
