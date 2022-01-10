package Inheritance.srumTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public void eat(String food){
        System.out.println(name + " is eating");
    }

    public void drink(String drink){
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
