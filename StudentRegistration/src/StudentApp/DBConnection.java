/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Suresh
 */
public class DBConnection {
   private Connection connection ;
   
   public DBConnection() {
    }
   public Connection con() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenceDetails","root", "Chathu@123");
        Statement query = con.createStatement();
        return connection ;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}
