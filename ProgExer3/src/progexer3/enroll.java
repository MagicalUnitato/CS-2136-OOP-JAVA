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
public class enroll {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    int id;
    String subjectCode;

    public void enroll(int id, String subjectCode) {
        this.id = id;
        this.subjectCode = subjectCode;
    }
    public void enterEnroll(){
        try{
            System.out.println("Enter Student ID: ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Subject Code: ");
            String subjectCode = br.readLine();
            enroll(id,subjectCode);
        }catch(Exception e){
            System.out.println("Exception : " + e );
        }
    }
}
