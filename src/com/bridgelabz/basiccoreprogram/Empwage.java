package com.bridgelabz.basiccoreprogram;

public class Empwage {
    public static void main(String[] args) {
        //Constants
        final int IS_FULL_TIME = 1;
        final int WAGE_PER_HR =20;
        //Computation
        int empHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHrs = 8;

        } else
            System.out.println("Employee is Absent");

        int totalWage = empHrs * WAGE_PER_HR;
        System.out.println(totalWage);
    }
}
