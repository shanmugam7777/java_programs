import java.util.*;

class LinkedList1 {
    public static void main(String[] args) {

        List l = new LinkedList<>();
        l.add("Java");
        l.add(10);
        l.add(35.5);
        l.add(23);
        l.add(null);

        System.out.println("The list : " + l);

        for (Object i: l) {
            System.out.println(i);
        }

        System.out.println(l.get(0));
        System.out.println(l.isEmpty());

        System.out.println("--------------------");

        LinkedList<Object> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add("python");
        l1.add("Red");

        System.out.println("The LinkedList : " + l1);

        for (Object i : l1) {
            System.out.println(i);
        }

        System.out.println("^^^^^^^^^^^^^^^^^^");
        //Auto boxing 
        int a=10;
        Integer i=new Integer(a);
        //Auto unboxing
        Integer i1=new Integer(10);
        System.out.println(i1);
    }
}
