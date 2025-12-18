import java.util.*;
abstract class Calculator{
    abstract void addition();
    abstract void difference();
    abstract void multiply();

}
class MyCalculator extends Calculator{
    int sum,sub ,mul;
    void addition(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sum=a+b;
        System.out.println("SUM :"+sum);
    }
    void multiply(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        mul=a*b;
        System.out.println("MUL :"+mul);

    }
    void difference(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sub=a-b;
        System.out.println("SUB :"+sub);
    }
}
class ExAbstraction2{
    public static void main(String args[]){
        MyCalculator mc=new MyCalculator();
        mc.addition();
        mc.difference();
        mc.multiply();

    }
}