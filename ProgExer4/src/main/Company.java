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

    public static String getCname() {
        return Cname;
    }

    public static void setCname(String Cname) {
        Company.Cname = Cname;
    }

    public static String getCaddress() {
        return Caddress;
    }

    public static void setCaddress(String Caddress) {
        Company.Caddress = Caddress;
    }

    public static String getCcontact() {
        return Ccontact;
    }

    public static void setCcontact(String Ccontact) {
        Company.Ccontact = Ccontact;
    }

    public static String getCemail() {
        return Cemail;
    }

    public static void setCemail(String Cemail) {
        Company.Cemail = Cemail;
    }
    

}
