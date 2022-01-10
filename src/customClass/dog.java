package customClass;

public class dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName,String dogBreed, int dogAge, char dogGender, String dogSize , String dogColor){
        name = dogName;
        breed = dogBreed;
        age =  dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;


    }

    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }


}
