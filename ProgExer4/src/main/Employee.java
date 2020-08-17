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
public class Employee extends Company{
    int Eid;
    String Ename;
    String Eaddress;
    String Econtact;
    String EEmail;
    String hiredate;
    static Double SSS = 100.00;
    static Double Philhealth = 100.00;
    static Double PagIbig = 100.00;
    static Double Tax = 100.00;
    
    public double getDeductions(){
        double deductions;
        System.out.println("Total Deductions");
        System.out.println("SSS: " + SSS);
        System.out.println("PhilHealth: " + Philhealth);
        System.out.println("PagIbig: " + PagIbig);
        System.out.println("Tax: " + Tax);
        deductions = SSS + Philhealth + PagIbig + Tax;
        System.out.println("Deductions: " + deductions);
        return deductions;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }

    public String getEaddress() {
        return Eaddress;
    }

    public void setEaddress(String Eaddress) {
        this.Eaddress = Eaddress;
    }

    public String getEcontact() {
        return Econtact;
    }

    public void setEcontact(String Econtact) {
        this.Econtact = Econtact;
    }

    public String getEEmail() {
        return EEmail;
    }

    public void setEEmail(String EEmail) {
        this.EEmail = EEmail;
    }
    
    
}
