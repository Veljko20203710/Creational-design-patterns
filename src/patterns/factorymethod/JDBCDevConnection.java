/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.factorymethod;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Veljko
 */
public class JDBCDevConnection extends JDBCConnection {
    
     public JDBCDevConnection() throws SQLException {
        url = "jdbc:mysql://localhost:3306/devDB";
        connection = DriverManager.getConnection(url, username, password);
    }
}
