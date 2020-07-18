/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progexer2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author skull
 */
public class grades {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    int id;
    String subjectCode;
    int prelim;
    int midterm;
    int prefinal;

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
        }catch(Exception e){
            System.out.println("Exception : " + e );
        }
    }
}
