import java.util.*;
class Map{  //Map is not a collection but it is part of it
    public static void main(String args[]){
        System.out.println("<<<.....HashMap.....>>>");
        HashMap m=new HashMap<String,String>();    //HashMap
        m.put("Name","Shannu");
        m.put("Place","College");
        System.out.println(m);
        for(Object i:m.keySet()){
            System.out.println(i);
            
        }
        for(Object i:m.entrySet()){
            System.out.println(i);
            
        }
        System.out.println("<<<.....LinkedHashMap.....>>>>");
        LinkedHashMap lhm=new LinkedHashMap();           
        lhm.put("Name","Shannu");
        lhm.put("Place","tpt");
        System.out.println(lhm);
        System.out.println( lhm.get(0));
        for(Object i:lhm.keySet()){
            System.out.println(i);
            
        }
        for(Object i:lhm.entrySet()){
            System.out.println(i);
            
        }
        System.out.println("<<<.....TreeMap.....>>>");
        TreeMap tm=new TreeMap();
        tm.put("Name","Shannu");
        tm.put("Place","Home");
        System.out.println(tm);
        
        for(Object i:tm.keySet()){
            System.out.println(i);
            
        }
        for(Object i:tm.entrySet()){
            System.out.println(i);
            
        }
        System.out.println("<<<.......HashTable......>>>");
        Hashtable ht=new Hashtable<>();
        ht.put("Name","Shannu");
        ht.put("Place","Groung");
        System.out.println(ht);
        
        for(Object i:ht.keySet()){
            System.out.println(i);
            
        }
        for(Object i:ht.entrySet()){
            System.out.println(i);
            
        }

        
    }

}