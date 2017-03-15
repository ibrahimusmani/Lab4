/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.sql.*;

/**
 *
 * @author Arshad
 */
public class pLayer {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "";
    public String authcust(String un, String pw) throws SQLException{
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab4?useSSL=false", user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select exists(select * from staff where username= \'"+un+"\' and pass= \'"+pw+"\' )");
            
            if (myRs.next()==true)
                return "exists";
            else
                return "Not exists";
//            while (myRs.next()) {
//                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
//            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
//        } finally {
//            if (myRs != null) {
//                myRs.close();
//            }
//
//            if (myStmt != null) {
//                myStmt.close();
//            }
//
//            if (myConn != null) {
//                myConn.close();
//            }
//          return "catch";  
//        } 
        return "catch";
    }
    
    public void entercust(String un,String pw) throws SQLException{
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab4?useSSL=false", user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myStmt.executeUpdate("insert into customer (username, pass) values (\'"+un+"\', \'"+pw+"\')");

            // 4. Process the result set
//            while (myRs.next()) {
//                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
//            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }
    
}
