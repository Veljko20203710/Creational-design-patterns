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
public class Main {

    public static void main(String[] args) {
       createProdConnection();
       createDevConnection();
    }
    
    private static void createProdConnection() {
     try {
            JDBCConnectionCreator connectionCreator = new JDBCProdConnectionCreator();
            JDBCConnection jdbcConnection = connectionCreator.getConnection();
            System.out.println(jdbcConnection);
        } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        }
    }
    
    
    
    private static void createDevConnection() {
     try {
            JDBCConnectionCreator connectionCreator = new JDBCDevConnectionCreator();
            JDBCConnection jdbcConnection = connectionCreator.getConnection();
            System.out.println(jdbcConnection);
        } catch (SQLException ex) {}
    }
}
