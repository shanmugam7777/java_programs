import java.util.Scanner;
class UserException extends Exception{
    public String getMessage(){
        return "INVALID USERNAME OR PASSWORD :Try again";
    }
}
class Login1{
    String username="Shannu";
    String password="shannu23";
    String UN,PWD;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username: ");
        UN=sc.next();
        System.out.println("Enter the password: "); 
        PWD=sc.next();

    }
    void verify() throws UserException
    {
        if(username.equals(UN) && password.equals(PWD)){
            System.out.println("Login successfully");
        }
        else{
            // System.out.println("");
            UserException i=new UserException();
            System.out.println(i.getMessage());
            throw i;
        }
    }
}
class LoginValid{
    void initiate(){
        Login1 l=new Login1();
        
        try{
            l.acceptInput();
            l.verify();
        }
        catch(Exception e){
            try{
                l.acceptInput();
                l.verify();
            }
            catch(Exception e1){
                try{
                    l.acceptInput();
                    l.verify();
                }
                catch(Exception e2){
                    System.out.println("access denied.............!");
                    System.exit(0);
                }
            }
          
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        LoginValid lv=new LoginValid();
        lv.initiate();
    }
    
}