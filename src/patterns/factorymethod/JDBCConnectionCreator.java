/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.factorymethod;

import java.sql.SQLException;

/**
 *
 * @author Veljko
 */
public abstract class JDBCConnectionCreator {
    
    public JDBCConnection getConnection() throws SQLException {
        JDBCConnection connection = getConcreteConnection();
        return connection;
    }

    protected abstract JDBCConnection getConcreteConnection() throws SQLException;
}
