/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progexer3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryce Philbert M. Salvador
 */
public class grades {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    int id;
    String subjectCode;
    int prelim;
    int midterm;
    int prefinal;
    int finalgrade = 0;

    public void grades() {
        this.id = 0;
        this.subjectCode = "-empty-";
        this.prelim = 0;
        this.midterm = 0;
        this.prefinal = 0;
    }

    public void grades(int id,String subjectCode,int prelim, int midterm, int prefinal) {
        this.id = id;
        this.subjectCode = subjectCode;
        this.prelim = prelim;
        this.midterm = midterm;
        this.prefinal = prefinal;
    }
    public void enterGrades(){
        try{
            System.out.println("Enter Student ID: ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Subject Code: ");
            String subjectCode = br.readLine();
            System.out.println("Enter Prelim: ");
            int prelim = Integer.parseInt(br.readLine());
            System.out.println("Enter Midterm: ");
            int midterm = Integer.parseInt(br.readLine());
            System.out.println("Enter Pre Final: ");
            int prefinal = Integer.parseInt(br.readLine());
            grades(id,subjectCode,prelim,midterm,prefinal);
            this.finalgrade = (prelim + midterm + prefinal) / 3;
        }catch(Exception e){
            System.out.println("Exception : " + e );
        }
    }
}
