/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.objectpool;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;


/**
 *
 * @author Veljko
 */
public class ConnectionPool {
    
    Connection connection;
    PoolDataSource ds;
    
    public ConnectionPool() throws SQLException {
     inicijalizacijaPoolDataSource();
    }
    
     private void inicijalizacijaPoolDataSource() throws SQLException {
        ds = PoolDataSourceFactory.getPoolDataSource();

        ds.setConnectionFactoryClassName("com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource");
        ds.setURL("jdbc:mysql://localhost:3306/devDB");
        ds.setUser("root");
        ds.setPassword("");

        ds.setInitialPoolSize(15);
        ds.setMinPoolSize(5);
        ds.setAbandonedConnectionTimeout(10);
        ds.setMaxPoolSize(20);

    }
     
     public void raskiniKonekciju() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void uspostaviKonekciju() throws SQLException {
        connection = ds.getConnection();
        connection.setAutoCommit(false);
    }
    
}
