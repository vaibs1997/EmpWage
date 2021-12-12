package com.bridgelabz.basiccoreprogram;

public class Empwage {
    public static void main(String[] args) {
        //Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int NUMBER_OF_DAYS = 20;
        //Computation
        int empHrs, totalWage=0, empWage;
        for (int day=0; day < NUMBER_OF_DAYS; day++) {
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
            empWage = empHrs * WAGE_PER_HR;
            totalWage += empWage;
            System.out.println(" EMP Wage: " + empWage);
        }



        System.out.println("Total Wage: " + totalWage);
    }
}
