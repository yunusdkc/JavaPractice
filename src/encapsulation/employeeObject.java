package encapsulation;

public class employeeObject {
    public static void main(String[] args) {

        employee employee1 = new employee();
        employee1.setName("ytd");
        employee1.setSalary(-2000);
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getName());

    }
}
