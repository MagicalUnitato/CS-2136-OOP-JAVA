package programmingexer1;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Bryce Philbert Murphy Salvador
 */
public class Programmingexer1 {
    public static void main(String[] args) {
       try{
        InputStreamReader isr = new InputStreamReader(System.in);  
        BufferedReader br = new BufferedReader(isr);
        
        Students[] a = new Students[5];
        Subjects[] b = new Subjects[10];
        ArrayList<String> c = new ArrayList<String>();
        System.out.println("How many students to enroll? ");
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            a[i] = new Students();
            System.out.println("Enter Student ID : ");
            a[i].id = Integer.parseInt(br.readLine());
            System.out.println("Enter Student Name : ");
            a[i].Name = br.readLine();
            System.out.println("Enter Student Course : ");
            a[i].Course = br.readLine();
            System.out.println("Enter Student Address : ");
            a[i].Address = br.readLine();
        }
        System.out.println("How many subjects offered? ");
        int numX = Integer.parseInt(br.readLine());
        for(int i = 0; i < numX; i++){
            b[i] = new Subjects();
            System.out.println("Enter Subject Code : ");
            b[i].Code = br.readLine();
            System.out.println("Enter Subject Description : ");
            b[i].Description = br.readLine();
            System.out.println("Enter Subject Units : ");
            b[i].Units = Integer.parseInt(br.readLine());
            System.out.println("Enter Subject Schedule : ");
            b[i].Schedule = br.readLine();
        }
        System.out.println("Enter Student ID to Enroll : ");
        int studID = Integer.parseInt(br.readLine());
        System.out.println("Enter # of Subject to Enroll : ");
        num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
           System.out.println("Enter subject code : ");
           String value = br.readLine();
           c.add(value);
        }
        System.out.println("---Summary---");
        for(int i = 0; i < a.length;i++){
            if(studID == a[i].id){
                System.out.println("Student ID: " + a[i].id);
                System.out.println("Student Name: " + a[i].Name);
                break;
            }
        }
        System.out.println("---Enrolled Subjects---");
        System.out.printf("%-10s %-25s %-10s %-10s\n", "Code", "Desc", "Units", "Sched");
        for(int i = 0; i < c.size();i++){
            for(int x = 0; x < numX;x++){
                if(c.get(i).equals(b[x].Code)){
                    System.out.printf("%-10s %-25s %-10s %-10s\n",b[x].Code, b[x].Description, b[x].Units, b[x].Schedule);
                }
            }
        }

       }catch(Exception e){
           System.out.println("Error" + e);
       }}
    
}
