package day3Assignment;

public class EmpWageBuilderUC4 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
// Variables
        int empHrs = 0;
        int empWage = 0;
// Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: "  + empWage);
    }
}

/*
o.p 1
Emp Wage: 160

Process finished with exit code 0
o.p 2
Emp Wage: 0

Process finished with exit code 0
 o.p 3
Emp Wage: 80

Process finished with exit code 0

 */