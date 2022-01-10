package Inheritance.job;

public class driver extends employee {
    public driver(String name, char gender,  int age, int salary, int ID) {
        super(name, gender, "driver", age, salary, ID);
    }
}

