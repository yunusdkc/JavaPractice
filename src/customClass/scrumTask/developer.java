package customClass.scrumTask;

public class developer {
    public String name;
    public  int employeeID;
    public String JobTitle;
    public double salary;

    public developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
       this. JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }
    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

}
