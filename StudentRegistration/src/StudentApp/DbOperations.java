
package StudentApp;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;


public class DbOperations {
    
    DBConnection con=new DBConnection();


public String InsertData(String studentN, String subjectN, String attendence ) 
{
    
try { 
  
    con.con();
    Statement query = con.createStatement();
    query.executeUpdate("INSERT INTO `Student` (studentName,subjectName,attendence) VALUE ('"+studentN+"','"+subjectN+"','"+attendence+"')");
  
    
    }
 
catch(Exception exc)
    {
    return "invalid";
    } 
    
    return "valid";
    }


public ArrayList<String> ViewStudents()

{
    ArrayList<String> student = new ArrayList<String>();       

try { 
  
   
    Statement query = con.createStatement();
    ResultSet result = query.executeQuery("SELECT studentName, subjectName, attendence FROM Student");
    
  while(result.next())
    {
student.add(result.getString("studentName"));
student.add(result.getString("subjectName"));
student.add(result.getString("attendence"));
    }

}
 catch(Exception exc)
    {
    return student;
    } 
    return student;
}

}








