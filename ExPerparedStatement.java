import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class ExPerparedStatement{
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";   
        String password="Shannu@23";
        int StudentId=4;
        String name="Tulasi";
        String email="tulasi9R@gmail.com";
        String address="tirupati";
        String insert="inser into employee1(StudentId,name,email,address) Values(?,?,?,?)";
        try(Connection con=DriverManager.getConnection(jdbcurl,username,password);
             PerparedStatement p=con.perpareStatement(insert);)
        {
            p.setInt(1,StudentId);
            p.setString(2,name);
            p.setString(3,email);
            p.setString(4,address);
            int rowsAffected=p.executeUpdate();
            if(rowsAffected>0){
                System.out.println("records inserted successfully");
            }
            else{
                System.out.println("failed to insssert")
            }
            con.close();


        }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }