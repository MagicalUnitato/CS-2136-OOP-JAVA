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
public interface Employee extends Company{
    public double getDeductions();
    public int getEid();
    public void setEid(int Eid);
    public String getEname();
    public void setEname(String Ename);
    public String getEaddress();
    public void setEaddress(String Eaddress);
    public String getEcontact();
    public void setEcontact(String Econtact);
    public String getEEmail();
    public void setEEmail(String EEmail);
    
}
