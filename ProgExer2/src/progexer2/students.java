package progexer2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryce Philbert M. Salvador
 */
public class students {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    int id;
    String Name;
    String Course;
    String Gender;
    String YearLevel;

    public void addStudents(int id, String Name, String Course, String Gender, String YearLevel) {
        this.id = id;
        this.Name = Name;
        this.Course = Course;
        this.Gender = Gender;
        this.YearLevel = YearLevel;
    }
    
    public void studentInput(){
        try{
            System.out.println("Enter Student ID : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Student Name : ");
            String Name = br.readLine();
            System.out.println("Enter Student Course : ");
            String Course = br.readLine();
            System.out.println("Enter Student Gender : ");
            String Gender = br.readLine();
            System.out.println("Enter Student Year Level : ");
            String YearLevel = br.readLine();
            addStudents(id,Name,Course,Gender,YearLevel);
        }catch(Exception e){
            System.out.println("Exception :" + e);
        }
    }
}

