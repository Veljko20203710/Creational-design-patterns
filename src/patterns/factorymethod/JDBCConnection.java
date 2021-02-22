/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.factorymethod;

import java.sql.Connection;

/**
 *
 * @author Veljko
 */
public abstract class JDBCConnection {
    
    protected String username;
    protected String password;
    protected String url;
    protected Connection connection;

    public JDBCConnection() {
        this.username = "root";
        this.password = "";
    }

    public Connection getConnection() {
        return connection;
    }
    
}
