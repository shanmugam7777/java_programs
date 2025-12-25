import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class ExResultSet{
    public static void main(String[] args){
        String jdbcurl="jdbc:mysql://localhost:3306/aits";
        String username="root";   
        String password="Shannu@23";
        try(
            Connection con=DriverManager.getConnection(jdbcurl,username,password);
             Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);)
        {
            String retrieve="select id, name from user10";
            ResultSet result=s.executeQuery(retrieve);
            result.last();
            String lastId=result.getString("id");
            String fname=result.getString("name");
            String lname=result.getString("name");
            System.out.println("id:"+lastId+",First Name:"+fname+",Last Name: "+lname);
            /*result.first();
            String firstid=result.getString("id");
            String ffname=result.getString("firstname");
            String flname=result.getString("lastname");
            System.out.println("id:"+firstid+",First Name:"+ffname+",Last Name: "+flname);
            result.absolute(3);
            String absoluteId=result.getString("id");
            String afname=result.getString("firstname");
            String alname=result.getString("lastname");
            System.out.println("id:"+absoluteId+",First Name:"+afname+",Last Name: "+alname);*/

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}