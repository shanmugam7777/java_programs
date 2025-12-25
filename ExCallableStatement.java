import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
class ExCallableStatement {
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";   
        String password="Shannu@23";
        String StudentId="S101";
        String callProcedure="{call GetCreditObtained(?)}";
        try(Connection con=DriverManager.getConnection(jdbcurl,username,password);
             CallableStatement p=con.prepareCall(callProcedure);)
        {
            p.setString(1,StudentId);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                String StudentId=rs.getString(2);
                String email=rs.getString(3);
                System.out.println("StudentId: "+StudentId+" Email: "+email);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}