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
public class RegularSalary extends Employee{
    double clothingallowance = 2000.00;
    double vehicleallowance = 5000.00;
    double foodallowance = 1000.00;
    
    public double getregularbenefits(){
        double regularbenefits;
        regularbenefits = clothingallowance + vehicleallowance + foodallowance;
        return regularbenefits;
        
    }
}
