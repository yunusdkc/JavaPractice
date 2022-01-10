package Inheritance.job;

public class employee {
    public String name;
    public char gender;
    public String jobTitle;
    public int age,salary,ID;
    public static String companyName;
    public static boolean fullTime;


    public employee(String name, char gender, String jobTitle, int age, int salary, int ID) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.ID = ID;
    }
    static {
        companyName= "Google";
        fullTime =true;

    }

    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary= $" + salary +
                ", ID=" + ID +
                ", companyName =" + companyName +
                ", fullTime=" + fullTime +
                '}';
    }

    public void work(){

        System.out.println(name + " is working as a "+ jobTitle +" id is " + ID );
    }

}
