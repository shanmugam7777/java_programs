import java.util.*;
abstract class Vaccine{
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();
    String nationality =s.next();
    public void vaccine(){
        this.age=age;
        this.nationality=nationality;
    }
    void firstDose(){
        if(age>=18 && nationality.equals("india")){
            System.out.println("first dose completed successfully");
            System.out.println("Now,you have to pay 250Rs");
        }
        else{
            System.out.println("Take a first dose");
        }

    }
    void secondDose(){
        if (age>=18){
            System.out.println("Second dose completed successfully");
        }
        else{

            System.out.println("pls complete first dose");
        }
    }
    abstract void boosterDose();
}
class VaccineSucc extends Vaccine{
    public void boosterDose(){
        System.out.println("successfully vaccination Done!");
    }
    
}
class Example1{
    public static void main(String args[]){
        VaccineSucc vs=new VaccineSucc();
        vs.firstDose();
        vs.secondDose();
        vs.boosterDose();
    }
}