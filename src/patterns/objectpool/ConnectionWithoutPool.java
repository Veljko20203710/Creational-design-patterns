/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Veljko
 */
public class ConnectionWithoutPool {
     private static Connection connection;
    
    
    public void uspostaviKonekciju() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/devDB", "root", "");
    }
   
    
    public void raskiniKonekciju() throws SQLException {
        connection.close();
    }
}
