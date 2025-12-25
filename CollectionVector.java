import java.util.*;
class CollectionVector{
    public static void main(String args[]){
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add("java");

        for (Object i:v){
            System.out.println(i);
        }
        /*ArrayList al=new ArrayList();
        al.add("s");
        System.out.println(al);*/


        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        System.out.println(v.getLast());
        System.out.println(v.contains(10));

        System.out.println(v.get(1));
    }        
        
}