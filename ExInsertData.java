import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class ExInsertData{
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";
        
        String password="Shannu@23";
        try{
            Connection c=DriverManager.getConnection(jdbcurl,username,password);
            Statement s=c.createStatement();
            /*String insertData="INSERT INTO user10(id ,name) Values(1,'shannu')";
            int rowsAffected=s.executeUpdate(insertData); 
            System.out.println(rowsAffected+" successsfully inserted");
            String retriveData="select * from user10";
            s.executeQuery(retriveData);
            System.out.println("successfully inserted data");*/
            String retrieve="select firstName ,Lastname,phone,email from student";
            ResultSet result=s.executeQuery(retrieve);

            while (result.next()) {
                String firstname=result.getString("firstname");
                
                String Lastname=result.getString("lastname");
                String phone=result.getString("phone");
                String email=result.getString("email");
                System.out.println("First Name:"+firstname+",Last Name: "+Lastname+",PhoneNumber: "+phone+", Email: "+email);
                
            }
            s.close();
            c.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}