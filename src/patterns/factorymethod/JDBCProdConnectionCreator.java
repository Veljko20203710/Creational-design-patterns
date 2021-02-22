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
public class JDBCProdConnectionCreator extends JDBCConnectionCreator {

    @Override
    protected JDBCConnection getConcreteConnection() throws SQLException {
       return new JDBCProdConnection();
    }

    
    
}
