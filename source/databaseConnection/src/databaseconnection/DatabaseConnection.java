/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnection;
import java.sql.*;

/**
 *
 * @author TECH-U LIB 014
 */
public class DatabaseConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:33306/students","root", "password");
            
            Statement myStmt = myConn.createStatement();
            
            ResultSet myRs = myStmt.executeQuery("select * from stud_info");
            
            while (myRs.next()){
                System.out.println(myRs.getString("first_name")+", "+ myRs.getString("last_name"));
            }
              
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
    }
    
}
