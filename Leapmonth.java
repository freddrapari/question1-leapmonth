/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.leapmonth;

/**
 *
 * @author hp
 */
public class Leapmonth {

   public static void main(String[] args) {
        int year = 2023;
        
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth &&(year % 100 !=0);
        isLeapMonth = isLeapMonth ||(year % 400 ==0);
        if (isLeapMonth){
            System.out.println("The given year has a leap month");
        } else {
        System.out.println("The given year does not have a leap month");
    }
 }
}
    

