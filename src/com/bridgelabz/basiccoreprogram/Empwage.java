package com.bridgelabz.basiccoreprogram;

public class Empwage {
    public static void main(String[] args) {
        //Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int NUMBER_OF_DAYS = 20;
        final int MAX_HRS_IN_MONTH = 100;
        //Computation
        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME -> {
                    System.out.println("Employee is Full Time");
                    empHrs = 8;
                }
                case IS_PART_TIME -> {
                    System.out.println("Employee is Part Time");
                    empHrs = 4;
                }
                default -> {
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                }
            }
            totalEmpHrs += empHrs;
            System.out.println(" Days: " + totalWorkingDays + " Emp Hrs: " +  empHrs);
        }

        int totalWage = totalEmpHrs * WAGE_PER_HR;
        System.out.println("Total Wage: " + totalWage);
    }
}
