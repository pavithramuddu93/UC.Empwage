package com.uc.empwage;

public class UC_5_Empwage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args) {
        int workingDays = 1;
        int totalWage = 0;
        while (workingDays <= WORKING_DAY_PER_MONTH){

            int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
            int empWage = 0;

            switch (empPresent) {
                case IS_PART_TIME:               ;
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                case IS_FULL_TIME:               ;
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                    default:
                    empWage = 0;
            }

            totalWage +=empWage;
            System.out.println("Employee Present Hours:"+empWage);
            workingDays++;
        }
        System.out.println("Employee Wage :" + totalWage);
    }
}


