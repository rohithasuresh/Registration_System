package StudentApp;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;



public class FXMLDocumentController implements Initializable {
   
    @FXML private TextField attendenceInStudent; 
    @FXML private ChoiceBox selectCourse;
    @FXML private TextField studentName;
    @FXML private TableView<Student> tableView;
    @FXML private TableColumn<Student, String> StudentID;
    @FXML private TableColumn<Student, String> SubjectName;
    @FXML private TableColumn<Student, String> Attendence;

    ObservableList<Student> student = FXCollections.observableArrayList();

    @FXML
    private void buttonAction(ActionEvent event) {
        
     
        String SAtendence = attendenceInStudent.getText().toString();
        String SName = studentName.getText().toString();
        String SCourse = selectCourse.getValue().toString();
        
        Student students = new Student();
        DbOperations db = new DbOperations();
        
        Student studentcon =   new Student(SName,SAtendence, SCourse);
      
        String StudentID = studentcon.getStudentName();
        String Subjectname = studentcon.getCourse();
        String Attendense = studentcon.getAttendence(); 
}
    
    
     @FXML
    private void ClearTableView() 
        {
            
        student.removeAll(student);

        }
     
    @FXML
    private void ListStudent(ActionEvent event) 
        {
            ArrayList <String> listArray = new ArrayList<String>();
            DbOperations df = new DbOperations();
            listArray =   df.ViewStudents();
            tableView.setItems(getStudent(listArray));
        }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    selectCourse.getItems().addAll("java", "Database", "Research Methods" );
       
    StudentID.setCellValueFactory(new PropertyValueFactory<Student, String>("studentID"));
    SubjectName.setCellValueFactory(new PropertyValueFactory<Student, String>("subName"));
    Attendence.setCellValueFactory(new PropertyValueFactory<Student, String>("atendance"));
    }  
 
    public ObservableList<Student> getStudent(ArrayList <String> dbdata)
    {

       student = FXCollections.observableArrayList(); 
       int RowCount = dbdata.size()/3;
        
       
           for(int j = 0; j < dbdata.size(); j = j + 3)
           {
               int a, b, c, d;
               a = j;
               b = j+1;
               c = j+2;    
               
               student.add(new Student(dbdata.get(a),dbdata.get(b),dbdata.get(c)));
               
           } 
    
        return student;
    }
}
