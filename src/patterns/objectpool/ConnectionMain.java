/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.objectpool;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Veljko
 */
public class ConnectionMain {

    public static void main(String[] args) {
        try {
            calculateTimeWithPool();
            calculateTimeWithoutPool();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void calculateTimeWithPool() throws SQLException {
        ConnectionPool connectionPool = new ConnectionPool();
        Date date = new Date();

        for (int i = 0; i < 1000; i++) {
            connectionPool.uspostaviKonekciju();
            connectionPool.raskiniKonekciju();
        }
        System.out.println("Vreme potrebno sa izvlacenjem konekcije iz pool-a:" + (new Date().getTime() - date.getTime()));
    }

    private static void calculateTimeWithoutPool() throws SQLException {
        ConnectionWithoutPool connectionWithoutPool = new ConnectionWithoutPool();
        Date date = new Date();

        for (int i = 0; i < 1000; i++) {
            connectionWithoutPool.uspostaviKonekciju();
            connectionWithoutPool.raskiniKonekciju();
        }
        System.out.println("Vreme potrebno sa kreiranjem nove veze svaki put:" + (new Date().getTime() - date.getTime()));
    }
}
