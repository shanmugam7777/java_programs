class Student 
{
    //attributes
    private int rollno;
    private String name;
    //construcator
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    //setter method
    public void setData(int r,String n){
        rollno=r;
        name=n;
    }
    //Getter methods
    public int getrollno()
    {
        return rollno;
    }
    public String getname(){
        return name;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Student s=new Student(101,"shannu");
        System.out.println("Student Details :\n"+s.getrollno()+"\n"+s.getname());
    }
}