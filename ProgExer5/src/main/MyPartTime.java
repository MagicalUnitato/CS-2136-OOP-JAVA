/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import abstractcompany.*;
/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 */
public class MyPartTime extends MyHourlySalary implements PartTime{
    double hourlypay = 250.00;
    
    public double getbasicpay(int hours){
        double basicpay;
        basicpay = hours * hourlypay;
        return basicpay;
    }
}
