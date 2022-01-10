package day08_If_Condition;

public class taskPro {
    /*  2. Write a program that can calculate the salary after tax based on the following requirements
       the tax rates are:
       35% for salary of 130K or more
        30% for salary of 100K to 129k
        25% for salary of 80K to 99K
        20% for salary of 79K or less
        in addition, if the person is married, he/she will pay 5% less tax            */

    public static void main(String[] args) {

        int salary = 1800000;
        String status = "MARRIED";
        double tax;
        double marryRate = 0.05;
        //0.20-(0.20*0.05)
        //0.35-(0.35*marryRate)

        if (status == "MARRIED") {  
        } else {

            tax = (salary <= 79000) ? 20 : (99000 >= salary && salary > 79000) ? 25 : (salary > 99000 && salary < 130000) ? 30
                    : 35;

            System.out.println(tax);
        }
    }
}

