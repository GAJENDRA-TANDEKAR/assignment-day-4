package day3Assignment;

public class EmpWageBuilderUC5 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
// Variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;
// Computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS ; day++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 4;
                    break;
                case IS_PART_TIME:
                    empHrs = 8;
                    break;
                default:
                empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage:" + empWage);

        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}

/*

o.p 1
Emp Wage:160
Emp Wage:160
Total Emp Wage: 320

Process finished with exit code 0

o.p 2

Emp Wage:0
Emp Wage:0
Total Emp Wage: 0

Process finished with exit code 0

o.p 3

Emp Wage:0
Emp Wage:80
Total Emp Wage: 80

Process finished with exit code 0

o.p 4

Emp Wage:80
Emp Wage:80
Total Emp Wage: 160

Process finished with exit code 0

o.p 5

Emp Wage:80
Emp Wage:0
Total Emp Wage: 80

Process finished with exit code 0

 */