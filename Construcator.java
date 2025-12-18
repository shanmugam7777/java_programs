class A{
    int a,b;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    a(){
        a=100;
        b=200;
    }  
}
class B{
    int x,y;
    B(int x,int b){
        super()
        this.x=x;
        this.y=y
    }
    B(){

    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
class ConInheritance{
    public static void main(String[] args) {
        A a=new A();
        a.display();
    }
}