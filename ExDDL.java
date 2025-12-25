import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class ExDDL{
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";   
        String password="Shannu@23";
        try(
            Connection con=DriverManager.getConnection(jdbcurl,username,password);
             Statement s=con.createStatement();)
        {
            /*String createTable="create table employee1(StudentId int primary key, name varchar (50), email varchar(50))";
            s.executeUpdate(createTable);
            System.out.println("Table created successfully");
            String alterTable="ALTER TABLE employee1 ADD COLUMN address VARCHAR(100)";
            s.executeUpdate(alterTable);
            System.out.println("Column added successfully");
            String insertData="INSERT INTO employee1(StudentId ,name,email,address) Values(1,'shannu','shannu@gmail.com','hyderabad'),(2,'varsha','varsha@gmail.com','bangalore'),(3,'reddy','reddy@gmail.com','chennai')";
            int rowsAffected=s.executeUpdate(insertData); 
            System.out.println(rowsAffected+" successsfully inserted");*/
            String dropTable="DROP TABLE employee";
            s.executeUpdate(dropTable);
            System.out.println("Table dropped successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}