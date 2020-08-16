package main;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 * notes: Netpay = gethourlybenefits() + (basicpay - deductions)
 * benefits for part time and full time
 */
public class ProgExer4 {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);    
    public static void main(String[] args) {
        ProgExer4 x = new ProgExer4();
        Company newCompany = new Company();
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
            while(true){
                value = x.menu();
                switch(value){
                    case 1:
                        xValue = empMenu();
                        switch(xValue){
                        
                        }
                    case 2:
                        
                    case 3:
                }
            }
            
        }catch(Exception e){
        
        }
    }
    public int menu(){
        int num = 0;
        System.out.println(" ");
        System.out.println("Select Option");
        System.out.println("[1] New employee");
        System.out.println("[2] New OJT");
        System.out.println("[3] Payslip");
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
}
