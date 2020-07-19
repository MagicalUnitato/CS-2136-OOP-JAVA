package progexer2;
import java.io.*; 
import java.util.*; 
/**
 *
 * @author skull
 */
public class ProgExer2 {
    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader br = new BufferedReader(isr);
    int numStud = 0;
    int numSubs = 0;
    int numEnrol = 0;
    int numGrades = 0;
    int numInputGrades = 0;
    students[] newStudList = new students[10];
    subjects[] newSubList = new subjects[10];
    enroll[] newEnrolList = new enroll[10];
    grades[] newGradeList = new grades[10];
    public static void main(String[] args) {
        ProgExer2 x = new ProgExer2();

        int value = 0;
        boolean selection = true;
        while(selection){
            value = x.menu();
            switch(value){
                case 1:
                    x.newStudList[x.numStud] = new students();
                    x.newStudList[x.numStud].studentInput();
                    x.numStud++;
                    break;
                case 2:
                    x.newSubList[x.numSubs] = new subjects();
                    x.newSubList[x.numSubs].enterSubjects();
                    x.numSubs++;
                    break;
                case 3:
                    x.newGradeList[x.numGrades] = new grades();
                    x.newGradeList[x.numGrades].id = 0;
                    x.newGradeList[x.numGrades].subjectCode = "0";
                    x.newGradeList[x.numGrades].prelim = 0;
                    x.newGradeList[x.numGrades].midterm = 0;
                    x.newGradeList[x.numGrades].prefinal = 0;
                    x.newEnrolList[x.numEnrol] = new enroll();
                    x.newEnrolList[x.numEnrol].enterEnroll();
                    x.numEnrol++;
                    x.numGrades++;
                    break;
                case 4:
                    x.newGradeList[x.numInputGrades].enterGrades();
                    x.numInputGrades++;
                    break;
                case 5:
                    x.summary();
                    break;
                case 6:
                    selection = false;
                    System.out.println("Thank you for your input");
                    break;
                default:
                    System.out.println("Please Enter A Valid Number");
            }
        }
    }
    public int menu() {
        int num = 0;
        System.out.println(" ");
        System.out.println("Menu");
        System.out.println("[1] New student");
        System.out.println("[2] New subject");
        System.out.println("[3] Enroll a student");
        System.out.println("[4] Encode grades");
        System.out.println("[5] Summary");
        System.out.println("[6] Exit");
        System.out.println("Select: ");
        try{
            num = Integer.parseInt(br.readLine());
        } catch(Exception e){
            System.out.println("Exception: " + e);
        }
        return num;
    }
    public void summary(){
        try{
            System.out.println("Enter Student ID : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("---Summary---");
            for(int i = 0; i < numStud;i++){
                if(id == newStudList[i].id){
                    System.out.println("Student ID: " + newStudList[i].id);
                    System.out.println("Student Name: " + newStudList[i].Name);
                    System.out.println("Student Course: " + newStudList[i].Course);
                    System.out.println("Student Gender: " + newStudList[i].Gender);
                    System.out.println("Student Year Level: " + newStudList[i].YearLevel);
                    break;
                }
            }
            System.out.println("---Enrolled Subjects---");
            System.out.printf("%-10s %-25s %-10s %-10s %-10s\n", "Code", "Desc", "Units", "Sched", "Final Grade");
            //System.out.printf("%-10s %-25s %-10s %-10s\n",b[x].Code, b[x].Description, b[x].Units, b[x].Schedule);
            for(int i = 0; i < numEnrol; i++){ 
                if(id == newEnrolList[i].id){
                    System.out.printf("%-10s",newSubList[i].Code);
                    //for(int x = 0; x < numEnrol; x++){
                    System.out.printf("%-25s %-10s %-10s",newSubList[i].Description , newSubList[i].Units , newSubList[i].Schedule);
                    //}
                    for(int y = 0; y < numGrades; y++){
                        if(newEnrolList[i].subjectCode.equals(newGradeList[y].subjectCode)){
                            System.out.printf("%-10s",newGradeList[y].finalgrade);
                            System.out.println(" ");
                            break;
                        }else if(newGradeList[y].subjectCode.equals("0")){
                            System.out.printf("%-10s","---");
                            System.out.println(" ");
                        }
                    }
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
