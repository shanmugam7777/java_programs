import java.util.*;

class NameComparaator implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
class RollNoComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2) {
        return s1.rollno - s2.rollno;
    }
}
class ExComparator{
    public static void main(String args[]){
        Student s1=new Student(101,"shannu");
        Student s2=new Student(102,"ammu");
        ArrayList al=new ArrayList();
        al.add(s1);
        al.add(s2);
        Collections.sort(al,new NameComparaator());
        Collections.sort(al,new RollNoComparator());
        




        System.out.println("Student Details :\n"+s1.getrollno()+"\n"+s1.getname());
        System.out.println("Student Details :\n"+s2.getrollno()+"\n"+s2.getname());
    }
}