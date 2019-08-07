package StudentApp;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javafx.scene.control.Alert;


public class Student {
   
   private String studentID;
   private String subName;
   private String atendance;
 

  public String getCourse() {
    //  System.out.println("22222222222222");
        return subName;
    }
    public String getAttendence() {
        //System.out.println(this.subName);
        return atendance;
    }
//    public String getEmpNum() {
//        //System.out.println(this.subName);
//        return atendance;
//    }

    public String getStudentName() {//getEmpNum()
        System.out.println(this.studentID);
        return studentID;
    }


   
    
   public Student(){}
   



    public Student(String studentID,String subName,String atendance) {
        //System.out.println(subName);
        this.studentID = studentID;
      //  this.Department = Department;
        this.subName = subName;
        this.atendance = atendance;
    }

}
