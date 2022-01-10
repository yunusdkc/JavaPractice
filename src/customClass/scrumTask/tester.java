package customClass.scrumTask;

public class tester {
   public String name;
   public  int employeeID;
   public String JobTitle;
   public double salary;

    public tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary$ =" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }



}
