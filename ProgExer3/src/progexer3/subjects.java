package progexer3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryce Philbert M. Salvador
 */
public class subjects {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    String Code;
    String Description;
    int Units;
    String Schedule;

    public void subjects(String Code, String Description, int Units, String Schedule) {
        this.Code = Code;
        this.Description = Description;
        this.Units = Units;
        this.Schedule = Schedule;
    }
    
    public void enterSubjects(){
        try{
            System.out.println("Enter Subject Code : ");
            String Code = br.readLine();
            System.out.println("Enter Subject Description : ");
            String Desc = br.readLine();
            System.out.println("Enter Subject Units : ");
            int Units = Integer.parseInt(br.readLine());
            System.out.println("Enter Subject Schedule : ");
            String Sched = br.readLine();
            subjects(Code, Desc, Units, Sched);
        }catch(Exception e){
            System.out.println("Exception :" + e);
        }
    }
}

