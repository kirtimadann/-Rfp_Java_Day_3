package com.bl.employeewage;


class EmployeeAttendance{

    int random = (int)(Math.random() * 10 %2);
    int is_preset = 1;
}

class DealyWage{

    int empperhrsrate = 20;
    int is_fulldayhrs = 8;

    int totalwage;

}

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Displaying Welcome to Employee Wage Computation Program");

        EmployeeAttendance obj = new EmployeeAttendance();
        System.out.println("random :" + obj.random);
        if (obj.is_preset == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is not present");
        }


        DealyWage dl = new DealyWage();

        dl.totalwage = dl.empperhrsrate * dl.is_fulldayhrs;
        System.out.println("Total wage is :" + dl.totalwage);


    }
}
