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
public class MyHourlySalary extends MyEmployee implements HourlySalary{
    double clothingallowance = 1000.00;
    double vehicleallowance = 1000.00;
    double foodallowance = 500.00;
    
    public double gethourlybenefits(){
        double hourlybenefits;
        hourlybenefits = clothingallowance + vehicleallowance + foodallowance;
        return hourlybenefits;
    }
}
