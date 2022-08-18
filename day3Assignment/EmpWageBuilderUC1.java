package day3Assignment;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        // Constants
        int IS_FULL_TIME = 1;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Abscent");
    }
}


/*
o.p 1

1.0
Employee is Present

Process finished with exit code 0

o.p 2

0.0
Employee is Abscent

Process finished with exit code 0

 */