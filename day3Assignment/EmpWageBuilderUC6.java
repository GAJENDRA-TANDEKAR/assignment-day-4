package day3Assignment;

public class EmpWageBuilderUC6 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;
    public static void main(String[] args) {
// Variables
        int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
// Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()  * 10) % 3;
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
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: "+totalEmpWage);
    }
}


/*

o.p 1

Day#: 1 Emp Hr: 4
Total Emp Wage: 240

Process finished with exit code 0


o.p 2

Day#: 1 Emp Hr: 8
Total Emp Wage: 320

Process finished with exit code 0


o.p  3

Day#: 1 Emp Hr: 0
Day#: 2 Emp Hr: 0
Total Emp Wage: 160

Process finished with exit code 0


 o.p 4

 Day#: 1 Emp Hr: 0
Day#: 2 Emp Hr: 8
Total Emp Wage: 320

Process finished with exit code 0


 */