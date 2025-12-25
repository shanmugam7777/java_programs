import java.util.LinkedHashSet;/*class Car{
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
}*/

class ExLinkedHashSet 
{
    public static void main(String a[])
    {
        Car c1 = new Car("Thar", "Green");
        Car c2 = new Car("BMW", "Black");
        
        LinkedHashSet<Car> v=new LinkedHashSet<Car>();
        v.add(c1);
        v.add(c2);
        for(Object i : v)
        {
            System.out.println(i);
        }
    }       
}