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
public class MyOJT extends MyCompany implements OJT{
    int OJTid;
    String OJTname;
    String OJTaddress;
    String OJTcontact;
    String OJTEmail;
    String Startdate;

    public int getOJTid() {
        return OJTid;
    }

    public void setOJTid(int OJTid) {
        this.OJTid = OJTid;
    }

    public String getOJTname() {
        return OJTname;
    }

    public void setOJTname(String OJTname) {
        this.OJTname = OJTname;
    }

    public String getOJTaddress() {
        return OJTaddress;
    }

    public void setOJTaddress(String OJTaddress) {
        this.OJTaddress = OJTaddress;
    }

    public String getOJTcontact() {
        return OJTcontact;
    }

    public void setOJTcontact(String OJTcontact) {
        this.OJTcontact = OJTcontact;
    }

    public String getOJTEmail() {
        return OJTEmail;
    }

    public void setOJTEmail(String OJTEmail) {
        this.OJTEmail = OJTEmail;
    }
    
}
