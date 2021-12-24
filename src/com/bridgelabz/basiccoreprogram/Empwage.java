package com.bridgelabz.basiccoreprogram;

public class Empwage {
     static final int IS_PART_TIME = 1;
     static final int IS_FULL_TIME = 2;
     static final int EMP_RATE_PER_HOUR = 20;
     static final int NUM_OF_WORKING_DAYS = 20;
     static final int MAX_HRS_IN_MONTH = 100;

    static int computeEmpWage(){

        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
        while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            empHrs = switch (empCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " +empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
