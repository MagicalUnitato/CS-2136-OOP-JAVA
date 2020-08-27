/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractcompany;

/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 */
public interface OJT extends Company{
    public int getOJTid();
    public void setOJTid(int OJTid);
    public String getOJTname();
    public void setOJTname(String OJTname);
    public String getOJTaddress();
    public void setOJTaddress(String OJTaddress);
    public String getOJTcontact();
    public void setOJTcontact(String OJTcontact);
    public String getOJTEmail();
    public void setOJTEmail(String OJTEmail);   
}
