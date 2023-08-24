/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 


/**
 *
 * @author TECH-U LIB 014
 */
public class DbConnection {

    /**
     * @param args the command line arguments
     */
    String createTableQuery = "create table test.student_details (st_namevarchar(50), st_mobile numeric(10), st_id numeric(10))";
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;

        try{

            conn = ConnectionUtil.getConnection();
            DbConnection dbInstance = new DbConnection();
            System.out.println("Student_details  table data before inserting:");

            dbInstance.retrieveData(conn);
            

            StudentDetails st2 = new StudentDetails(2, "Gbeme Man", 24242424); 
            StudentDetails st3 = new StudentDetails(4, "Daniel Doe", 25252525); 

            dbInstance.insertData(conn, st2);
            dbInstance.insertData(conn, st3);

            System.out.println("Student_details  table data after inserting:");

            dbInstance.retrieveData(conn); 
            dbInstance.deleteARow(conn,2); 
            System.out.println("Student_details  table data after deleting:"); 
            dbInstance.retrieveData(conn);
            dbInstance.modifyData(conn, 26262626, 2); 
            System.out.println("Student_details  table data after modifying:"); 
            dbInstance.retrieveData(conn);
        } catch (SQLException e){
            e.printStackTrace();

        } finally{

            try {

                conn.close();

            } catch (SQLException e){

                e.printStackTrace();

            }

        }

        }
    
        private void modifyData(Connection conn, long st_mobile, long st_id){

            String query = "update test.student_details set st_mobile=? where st_id=?";

            try {

                PreparedStatement pstmt = conn.prepareStatement(query);

                pstmt.setLong(1, st_mobile);

                pstmt.setLong(2, st_id);

                int row = pstmt.executeUpdate();

                //System.out.println(row);

            } catch (SQLException e){   
                
                e.printStackTrace();

            }

        }
        private void deleteARow(Connection conn, long st_id){

            String query = "delete from test.student_details where st_id=?" ;

            try{
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setLong(1, st_id);
                int row = pstmt.executeUpdate();
                //System.out.println(row);
            }
            catch (SQLException e){
                
                e.printStackTrace();
            }
        }

        private void insertData(Connection conn, StudentDetails details){

            String query = "insert into test.student_details (`st_id`, `st_name`, `st_mobile`) values (?,?,?)";
            try{
                PreparedStatement pstmt = conn.prepareStatement(query);

                pstmt.setLong(1,details.getSt_id());                 
                pstmt.setString(2,details.getSt_name()); 
                pstmt.setLong(3, details.getSt_mobile()); 
                int row = pstmt.executeUpdate();

                //System.out.println(row);

            }catch (SQLException e){

                  e.printStackTrace();
            }

        }
        
        private void retrieveData(Connection conn){

            try {
                String query = "select * from test.student_details"; 
                PreparedStatement pstmt = conn.prepareStatement(query); 
                ResultSet rs = pstmt.executeQuery(); 
                System.out.println("ST_ID\tST_NAME\t\tST_MOBILE"); 
                while(rs.next()){
                System.out.println(rs.getString("st_id")+"\t"+rs.getString("st_name")+"\t\t"+rs.getString( "st_mobile"));
                }
            }
            catch (SQLException e){
                
            e.printStackTrace();
            }
        }




    }
    

