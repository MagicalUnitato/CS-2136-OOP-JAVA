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
public class MyCompany implements Company{
    static String Cname;
    static String Caddress;
    static String Ccontact;
    static String Cemail;

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        MyCompany.Cname = Cname;
    }

    public String getCaddress() {
        return Caddress;
    }

    public void setCaddress(String Caddress) {
        MyCompany.Caddress = Caddress;
    }

    public String getCcontact() {
        return Ccontact;
    }

    public void setCcontact(String Ccontact) {
        MyCompany.Ccontact = Ccontact;
    }

    public String getCemail() {
        return Cemail;
    }

    public void setCemail(String Cemail) {
        MyCompany.Cemail = Cemail;
    }
    

}
