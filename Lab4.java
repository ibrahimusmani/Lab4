
package lab4;
import java.sql.*;


public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{

        pLayer pl = new pLayer();
        String un = "Ibrahim";
        String pw = "abcd";
//        System.out.println(pl.authcust(un,pw));
//        Restaurant res = new Restaurant();
//        res.Main();
//        res.Main();
        pl.entercust(un, pw);

        
    }    

    
}
