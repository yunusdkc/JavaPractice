package Inheritance.job;

public class employeeObject {

    public static void main(String[] args) {

        developer developer = new developer("john",'m',"webDeveloper",25,15000,659896);
        tester tester = new tester("ytd",'m',"SDET", 23,12000,25635,true);
        driver driver = new driver("max",'m',25,60000,65691);
        System.out.println(driver);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(employee.companyName);
       developer.work();

    }

}
