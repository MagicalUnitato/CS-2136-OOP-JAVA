/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 */
public class FullTime extends HourlySalary{
    double hourlypay = 500.00;
    
    public double getBasicpay(int hours){
        double basicpay;
        basicpay = hours * hourlypay;
        return basicpay;
    }
}
