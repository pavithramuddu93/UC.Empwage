package com.uc.empwage;

public class UC_6_Empwage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args) {
        int workingDays = 1;
        int totalWage = 0;
        int totalWorkinghours =0;
        while (workingDays <= WORKING_DAY_PER_MONTH && totalWorkinghours < WORKING_DAY_PER_MONTH){

            int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
            int empWage = 0;

            switch (empPresent) {
                case IS_PART_TIME:               ;
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkinghours = totalWorkinghours + PART_TIME_HOUR;
                    break;
                case IS_FULL_TIME:               ;
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkinghours = totalWorkinghours +FULL_DAY_HOUR;
                    break;
                default:
                    empWage = 0;
            }
            totalWage += empWage;
            int temp = workingDays+1;
            System.out.println("total Wage for Day "+temp+ " = "+totalWage);
            workingDays++;
        }
        System.out.println("total Working Days :" +workingDays);
        System.out.println("total Working Hours :" +totalWorkinghours);
        System.out.println("Employee Wage :" + totalWage);
    }
}


