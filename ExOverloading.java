
class Overloading
{
    double pi = 3.14;

    int area(int a,int b)
    {
        return a*b;
    }

    double area(int r){
        return pi*r*r;
    }
}
class ExOverloading{
    public static void main(String argns[]){
        Overloading ob =new Overloading();
        System.out.println("Area of circle:"+ob.area(5));
    }
}