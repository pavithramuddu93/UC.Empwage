package com.uc.empwage;

public class UC_3_Empwage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;


    public static void main(String[] args) {
        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int empWage = 0;
        if (empPresent == 1) {
            if (IS_PART_TIME == 1) {
                empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            }
                else
            {
                empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            }
        } else {
            empWage = 0;
        }
        System.out.println("Employee Wage :" + empWage);
    }
}


