import java.sql.Connection;
import java.sql.DriverManager;


public class JDBC {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Shannu@23";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connected!");

        con.close();
    }
}
