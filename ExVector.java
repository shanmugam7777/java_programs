import java.util.*;
class Car{
    String name;
    String color;
    Car(String name,String color){
        this.name=name;
        this.color=color;
    }
    public String getname()
    {
        return name;
    }

    public String getcolor()
    {
        return color;
    }

    public String toString()
    {
        return "Name of the car = " + name + "Colour of the car= " + color ;
    }
}
class ExVector 
{
    public static void main(String a[])
    {
        Car c1 = new Car("Thar", "Soft");
        Car c2 = new Car("BMW", "Black");
        
        Vector v=new Vector();
        v.add(c1);
        v.add(c2);
        for(Object i : v)
        {
            System.out.println(i);
        }
    }       
}