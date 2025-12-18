import java.util.*;
interface Calculator{
     void addition();
     void difference();
     void multiply();

}
class MyCalculator implements Calculator{
    int sum,sub ,mul;
    public void addition(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sum=a+b;
        System.out.println("SUM :"+sum);
    }
    public void multiply(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        mul=a*b;
        System.out.println("MUL :"+mul);

    }
    public void difference(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sub=a-b;
        System.out.println("SUB :"+sub);
    }
    public void division(){
        int x=25;
        int y=5;
        int z=x/y;
        System.out.println(z);
    }
}
class ExInterface{
    public static void main(String args[]){
        MyCalculator mc=new MyCalculator();
        mc.addition();
        mc.difference();
        mc.multiply();
        mc.division();

    }
}