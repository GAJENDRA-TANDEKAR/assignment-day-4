package day3Assignment;

public class EmpWageBuilderUC2 {

    public static void main(String[] args) {
        // Constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        // Variables
        int empHrs = 0 ;
        int empWage = 0 ;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;

        System.out.println("Emp Wage:" + empWage);
    }
}

/*

o.p 1
Emp Wage:0

Process finished with exit code 0

o.p  2
Emp Wage:160

Process finished with exit code 0

 */