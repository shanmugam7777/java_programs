class A{
    int a,b;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    A(){
        a=100;
        b=200;
    }  
}
class B extends A {
    int x,y;
    B(int x,int y){
        super();
        this.x=x;
        this.y=y;
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
        B a=new B(300,400);
        a.display();
    }
}