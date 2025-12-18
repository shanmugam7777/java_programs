class Demo
{
    int a,b,c;
    int sum;
    void add(){
        a=10;
        b=10;
        c=a+b;
        System.out.println(c);
    }
    void sum(int a,int b){
        
        sum=a+b;
        System.out.println(sum);
    }
}
class Addition{
    public static void main(String args[])
    {
        Demo ob=new Demo();
        ob.add();
        ob.sum(10, 20);
    }

}