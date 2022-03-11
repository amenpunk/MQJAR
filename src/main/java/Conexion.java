import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion{

    public static void Connect(){

        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {

            conn =
            DriverManager.getConnection("");


            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT nombrecomercial FROM cliente order by idcliente DESC limit 20");

            while(rs.next()){
                String name = rs.getString(1);
                System.out.println(name);
            }

            // or alternatively, if you don't know ahead of time that

            // Now do something with the ResultSet ....
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
    }
}
