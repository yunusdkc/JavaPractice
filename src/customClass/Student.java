package customClass;

public class Student {
    
    public String name;
    public char gender;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }    // generate>>>  toSting >>> to print without hashcode

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;          //  generate >> con.. ctrl + click to select all of them
    }
}
