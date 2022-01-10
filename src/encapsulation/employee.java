package encapsulation;

public class employee {
    private String name;
    private int salary;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        if (salary <0){
            System.out.println("invalid salary "+salary);
          return;
            // System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
