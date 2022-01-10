package Inheritance.job;

public class tester extends employee {
public boolean automation;
    public tester(String name, char gender, String jobTitle, int age, int salary, int ID,  boolean automation) {
        super(name, gender, jobTitle, age, salary, ID);
       this.automation = automation;

    }

    public String toString() {
        return "tester{" +
                "automation=" + automation +
                '}';
    }
}
