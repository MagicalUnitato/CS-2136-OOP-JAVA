package main;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import abstractcompany.*;
/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 * notes: Netpay = gethourlybenefits() + (basicpay - deductions)
 * benefits for part time and full time
 */
public class ProgExer5 {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);  
    int numEmployee = 0;
    int numOJT = 0;
    MyEmployee[] newEmployee = new MyEmployee[10];
    MyOJT[] newOJT = new MyOJT[10];
    public static void main(String[] args) {
        ProgExer5 x = new ProgExer5();
        MyCompany newCompany = new MyCompany();
        boolean exit = true;
        int value = 0;
        int xValue = 0;
        try{
            System.out.println("Enter Company Name: ");
            String input = x.br.readLine();
            newCompany.setCname(input);
            System.out.println("Enter Company Address: ");
            input = x.br.readLine();
            newCompany.setCaddress(input);
            System.out.println("Enter Company Contact #: ");
            input = x.br.readLine();
            newCompany.setCcontact(input);
            System.out.println("Enter Company Email: ");
            input = x.br.readLine();
            newCompany.setCemail(input);
            //x.newStudList[x.numStud] = new students();
            //x.newStudList[x.numStud].studentInput();
            //x.numStud++;
            while(exit){
                value = x.menu();
                switch(value){
                    case 1: 
                        xValue = x.empMenu();
                        switch(xValue){
                            case 1: 
                                x.newEmployee[x.numEmployee] = new MyManager();
                                System.out.println("New Employee (Manager)");
                                System.out.print("ID#: ");
                                x.newEmployee[x.numEmployee].setEid(x.employeeInputInt());
                                System.out.print("Name: ");
                                x.newEmployee[x.numEmployee].setEname(x.employeeInputString());
                                System.out.print("Address: ");
                                x.newEmployee[x.numEmployee].setEaddress(x.employeeInputString());
                                System.out.print("Contact: ");
                                x.newEmployee[x.numEmployee].setEcontact(x.employeeInputString());
                                System.out.print("Email: ");
                                x.newEmployee[x.numEmployee].setEEmail(x.employeeInputString()); 
                                x.numEmployee++;
                                break;
                            case 2: //staff
                                x.newEmployee[x.numEmployee] = new MyStaff();
                                System.out.println("New Employee (Staff)");
                                System.out.print("ID#: ");
                                x.newEmployee[x.numEmployee].setEid(x.employeeInputInt());
                                System.out.print("Name: ");
                                x.newEmployee[x.numEmployee].setEname(x.employeeInputString());
                                System.out.print("Address: ");
                                x.newEmployee[x.numEmployee].setEaddress(x.employeeInputString());
                                System.out.print("Contact: ");
                                x.newEmployee[x.numEmployee].setEcontact(x.employeeInputString());
                                System.out.print("Email: ");
                                x.newEmployee[x.numEmployee].setEEmail(x.employeeInputString()); 
                                x.numEmployee++;
                                break;
                            case 3: //hourly fulltime
                                x.newEmployee[x.numEmployee] = new MyFullTime();
                                System.out.println("New Employee (Hourly Full Time)");
                                System.out.print("ID#: ");
                                x.newEmployee[x.numEmployee].setEid(x.employeeInputInt());
                                System.out.print("Name: ");
                                x.newEmployee[x.numEmployee].setEname(x.employeeInputString());
                                System.out.print("Address: ");
                                x.newEmployee[x.numEmployee].setEaddress(x.employeeInputString());
                                System.out.print("Contact: ");
                                x.newEmployee[x.numEmployee].setEcontact(x.employeeInputString());
                                System.out.print("Email: ");
                                x.newEmployee[x.numEmployee].setEEmail(x.employeeInputString()); 
                                x.numEmployee++;
                                break;
                            case 4: //hourly part time
                                x.newEmployee[x.numEmployee] = new MyPartTime();
                                System.out.println("New Employee (Hourly Part Time)");
                                System.out.print("ID#: ");
                                x.newEmployee[x.numEmployee].setEid(x.employeeInputInt());
                                System.out.print("Name: ");
                                x.newEmployee[x.numEmployee].setEname(x.employeeInputString());
                                System.out.print("Address: ");
                                x.newEmployee[x.numEmployee].setEaddress(x.employeeInputString());
                                System.out.print("Contact: ");
                                x.newEmployee[x.numEmployee].setEcontact(x.employeeInputString());
                                System.out.print("Email: ");
                                x.newEmployee[x.numEmployee].setEEmail(x.employeeInputString()); 
                                x.numEmployee++;
                                break;
                            default:
                                System.out.println("Please Enter A Valid Number");
                        }
                        break;
                    case 2: //new OJT
                        x.newOJT[x.numOJT] = new MyOJT();
                        System.out.println("New OJT");
                        System.out.print("ID#: ");
                        x.newOJT[x.numOJT].setOJTid(x.employeeInputInt());
                        System.out.print("Name: ");
                        x.newOJT[x.numOJT].setOJTname(x.employeeInputString());
                        System.out.print("Address: ");
                        x.newOJT[x.numOJT].setOJTaddress(x.employeeInputString());
                        System.out.print("Contact: ");
                        x.newOJT[x.numOJT].setOJTcontact(x.employeeInputString());
                        System.out.print("Email: ");
                        x.newOJT[x.numOJT].setOJTEmail(x.employeeInputString()); 
                        x.numOJT++;
                        break;
                    case 3:
                        x.payslip();
                        break;
                    case 4:
                        exit = false;
                        break;
                    default:
                        System.out.println("Please Enter A Valid Number");
                }
            }
            
        }catch(Exception e){
        
        }
    }
    public String employeeInputString(){
        String input = "";
        try{
            input = br.readLine();
        }
        catch(Exception e){}
        return input;
    }
    public int employeeInputInt(){
        int input = 0;
        try{
            input = Integer.parseInt(br.readLine());
        }
        catch(Exception e){}
        return input;
    }
    public int menu(){
        int num = 0;
        System.out.println(" ");
        System.out.println("Select Option");
        System.out.println("[1] New employee");
        System.out.println("[2] New OJT");
        System.out.println("[3] Payslip");
        System.out.println("[4] Exit");
        System.out.println("Select: ");
        try{
            num = Integer.parseInt(br.readLine());
        } catch(Exception e){
            System.out.println("Exception: " + e);
        }
        return num;
    }
    public int empMenu(){
        int num = 0;
        System.out.println(" ");
        System.out.println("New Employee Option");
        System.out.println("[1] Manager");
        System.out.println("[2] Staff");
        System.out.println("[3] Hourly Fulltime");
        System.out.println("[4] Hourly PartTime");
        System.out.println("Select: ");
        try{
            num = Integer.parseInt(br.readLine());
        } catch(Exception e){
            System.out.println("Exception: " + e);
        }
        return num;
    }
    public void payslip(){
        try{
            int id = 0;
            System.out.println("Payslip (only for employees)");
            System.out.print("Enter ID: ");
            id = Integer.parseInt(br.readLine());
            for(int i = 0; i < numEmployee; i++){
                if(id == newEmployee[i].Eid){
                    if(newEmployee[i] instanceof MyRegularSalary){
                        MyRegularSalary regular = (MyRegularSalary)newEmployee[i];
                        if(newEmployee[i] instanceof MyManager){
                            MyManager manager = (MyManager)newEmployee[i];
                            System.out.println("Netpay:" + ((manager.getbasicpay() - newEmployee[i].getDeductions()) + regular.getregularbenefits()));
                        }else if(newEmployee[i] instanceof MyStaff){
                            newEmployee[i].getDeductions();
                            MyStaff staff = (MyStaff)newEmployee[i];
                            System.out.println("Netpay:" + ((staff.getbasicpay() - newEmployee[i].getDeductions()) + regular.getregularbenefits()));
                        }
                    }else if(newEmployee[i] instanceof MyHourlySalary){
                        MyHourlySalary hourly = (MyHourlySalary)newEmployee[i];
                        if(newEmployee[i] instanceof MyFullTime){
                            MyFullTime full = (MyFullTime)newEmployee[i];
                            int hours = 0;
                            System.out.print("Total Hours Rendered: ");
                            hours = Integer.parseInt(br.readLine());
                            System.out.println("Netpay:" + ((full.getbasicpay(hours) - newEmployee[i].getDeductions()) + hourly.gethourlybenefits()));
                        }else if(newEmployee[i] instanceof MyPartTime){
                            MyPartTime part = (MyPartTime)newEmployee[i];
                            int hours = 0;
                            System.out.print("Total Hours Rendered: ");
                            hours = Integer.parseInt(br.readLine());
                            System.out.println("Netpay:" + ((part.getbasicpay(hours) - newEmployee[i].getDeductions()) + hourly.gethourlybenefits()));     
                        }
                    }
                }
            }
        }catch(Exception e){
        
        }
    }
}
