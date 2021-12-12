package com.bridgelabz.basiccoreprogram;

public class Empwage {
    public static void main(String[] args) {
        //Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME =2;
        final int WAGE_PER_HR =20;
        //Computation
        int empHrs;
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

        int totalWage = empHrs * WAGE_PER_HR;
        System.out.println(totalWage);
    }
}
