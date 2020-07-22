package progexer2;
import java.io.*; 
import java.util.*; 
/**
 *
 * @author Bryce Philbert M. Salvador
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
                    x.newGradeList[x.numGrades].grades();
                    //x.newGradeList[x.numGrades].id = 0;
                    //x.newGradeList[x.numGrades].subjectCode = "0";
                    //x.newGradeList[x.numGrades].prelim = 0;
                    //x.newGradeList[x.numGrades].midterm = 0;
                    //x.newGradeList[x.numGrades].prefinal = 0;
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
                case 7:
                    int o = 0;
                    int y = 0;
                    int z = 0;
                    int i = 0;
                    System.out.println("STUDENT ARRAY");
                    while(o != x.numStud){
                        System.out.println(x.newStudList[o].id + x.newStudList[o].Name +x.newStudList[o].Course +x.newStudList[o].Gender +x.newStudList[o].YearLevel);
                        o++;
                    }
                    System.out.println("---END STUDENT ARRAY---");
                    System.out.println("SUBJECT ARRAY");
                    while(y != x.numSubs){
                        System.out.println(x.newSubList[y].Code + x.newSubList[y].Description);
                        y++;
                    }
                     System.out.println("---END SUBJECT ARRAY---");
                    System.out.println("ENROL ARRAY");
                    while(z != x.numEnrol){
                        System.out.println(x.newEnrolList[z].id + x.newEnrolList[z].subjectCode);
                        z++;
                    }
                     System.out.println("---END ENROL ARRAY---");
                    System.out.println("GRADES ARRAY");
                    while(i != x.numGrades){
                        System.out.println(x.newGradeList[i].id + x.newGradeList[i].subjectCode);
                        i++;
                    }
                     System.out.println("---END GRADES ARRAY---");
                    break;
                case 8:
                    System.out.println("stud"+x.numStud);
                    System.out.println("subs"+x.numSubs);
                    System.out.println("Enrol"+x.numEnrol);
                    System.out.println("Grades"+x.numGrades);
                    System.out.println("input grades"+x.numInputGrades);
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
                    for(int x = 0; x < numSubs; x++){
                        if(newEnrolList[i].subjectCode.equals(newSubList[x].Code)){
                            System.out.printf("%-10s",newSubList[x].Code);
                            System.out.printf("%-25s %-10s %-10s",newSubList[x].Description , newSubList[x].Units , newSubList[x].Schedule);
                        }
                    }
                    for(int y = 0; y < numGrades; y++){
                        if(newEnrolList[i].subjectCode.equals(newGradeList[y].subjectCode) && newEnrolList[i].id == newGradeList[y].id){
                            System.out.printf("%-10s",newGradeList[y].finalgrade);
                            System.out.println(" ");
                            break;
                        }else if(newGradeList[y].subjectCode.equals("-empty-")){
                            System.out.printf("%-10s","---");
                            System.out.println(" ");
                            break;
                        }
                    }
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
