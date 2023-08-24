/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException; 
/**
 *
 * @author TECH-U LIB 014
 */
class ConnectionUtil {
    
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        try { 
            
//            Class.forName("com.mysql.jdbc.Connection");    
            connection = DriverManager.getConnection("jdbc:mysql://localhost:33306/students","root", "password");

        
//                connection = DriverManager.getConnection("jdbc:mysql://192.168.216.250:3306/vijju","root", "root");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:127.0.0.1/studentsinfo","root", " ");
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("message for connection open "+ connection);
        return connection;
    }

}
