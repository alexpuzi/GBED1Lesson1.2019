package puzikov.gb.se.ru;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Newdbonmysql {
    private static final String url = "jdbc:mysql://localhost:3306/rapid";
    private static final String user = "root";
    private static final String password = "sas19866891";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {
        String query = "select count(*) from books";

        try {
           con = DriverManager.getConnection(url, user, password);
           stmt = con.createStatement();
           rs = stmt.executeQuery(query);

           while (rs.next()) {
               int count = rs.getInt(1);
               System.out.println(count);
           }
        } catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } finally {
            try { con.close(); } catch(SQLException se) { /*can't do anything*/ }
            try { stmt.close(); } catch(SQLException se) { /*xxx*/ }
            try { rs.close(); } catch(SQLException se) { /*xxx*/ }



        }

    }
}
