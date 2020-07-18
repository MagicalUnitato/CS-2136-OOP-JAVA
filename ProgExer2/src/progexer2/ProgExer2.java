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
                    x.newEnrolList[x.numEnrol] = new enroll();
                    x.newEnrolList[x.numEnrol].enterEnroll();
                    x.numEnrol++;
                    break;
                case 4:
                    x.newGradeList[x.numGrades] = new grades();
                    x.newGradeList[x.numGrades].enterGrades();
                    x.numGrades++;
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
        System.out.println("numStud, numSubs & numEnroll Values : "+ numStud + " " + numSubs + " "+ numEnrol);
        //System.out.println(Arrays.toString(newStudList));
        //System.out.println(Arrays.toString(newSubList));
        //System.out.println(Arrays.toString(newEnrolList));
        //System.out.println(Arrays.toString(newGradeList));
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
            
            String sGrade = "placeholder";
            System.out.println("Enter Student ID : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("---Summary---");
            for(int i = 0; i < numStud;i++){
                if(id == newStudList[i].id){
                    System.out.println("Student ID: " + newStudList[i].id);
                    System.out.println("Student Name: " + newStudList[i].Name);
                    break;
                }
            }
            System.out.println("---Enrolled Subjects---");
            System.out.printf("%-10s %-25s %-10s %-10s %-10s\n", "Code", "Desc", "Units", "Sched", "Final Grade");
            //System.out.printf("%-10s %-25s %-10s %-10s\n",b[x].Code, b[x].Description, b[x].Units, b[x].Schedule);
            for(int i = 0; i < numEnrol; i++){ 
                if(id == newEnrolList[i].id){
                    for(int x = 0; x < numSubs; x++){
                        int average = 0;
                        if(newEnrolList[i].subjectCode.equals(newSubList[x].Code) == true){
                            if(newEnrolList[i].subjectCode.equals(newGradeList[x].subjectCode) == true && id == newEnrolList[i].id){
                                average = (newGradeList[x].prelim + newGradeList[x].midterm + newGradeList[x].prefinal) / 3; 
                                sGrade = Integer.toString(average);
                            }else{
                                sGrade = "---";
                            }
                            System.out.printf("%-10s %-25s %-10s %-10s %-10s\n",newSubList[x].Code, newSubList[x].Description, newSubList[x].Units, newSubList[x].Schedule, sGrade);
                        }
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
