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
public class Company {
    static String Cname;
    static String Caddress;
    static String Ccontact;
    static String Cemail;
    
    public void updateName(String newn){
        Cname = newn;
    }
    public String showCname(){
        return this.Cname;
    }
    public void updateAddress(String newad){
        Caddress = newad;
    }
    public String showAddress(){
        return this.Caddress;
    }
    public void updateContact(String newcont){
        Ccontact = newcont;
    }
    public String showContact(){
        return this.Ccontact;
    }
    public void updateEmail(String newem){
        Cemail = newem;
    }
    public String showEmail(){
        return this.Cemail;
    }
}
