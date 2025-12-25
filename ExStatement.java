import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class ExStatement{
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";
        
        String password="Shannu@23";
        try{
            Connection c=DriverManager.getConnection(jdbcurl,username,password);
            Statement s=c.createStatement();
            String createTable="CREATE TABLE user10(id INT primary key,name VARCHAR(50) not NULL)";
            s.execute(createTable);
            System.out.println("successfully created table");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}