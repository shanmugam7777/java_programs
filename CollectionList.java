import java.util.*;
class CollectionList{
    public static void main(String args[]){
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);

        for (Object i:l){
            System.out.println(i);
        }
        ArrayList al=new ArrayList();
        al.add("s");
        System.out.println(al);



        System.out.println(l.getLast());
        System.out.println(l.contains(10));

        System.out.println(l.get(1));
    }        
        
}