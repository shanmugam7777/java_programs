import java.util.*;

class Employee
{
    private String empName;
    private String empDesignation;
    private String empEmail;

    public Employee(String empName, String empDesignation, String empEmail)
    {
        super();
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empEmail = empEmail;
    }

    public String getEmpName()
    {
        return empName;
    }

    public String getEmpDesignation()
    {
        return empDesignation;
    }

    public String getEmpEmail()
    {
        return empEmail;
    }

    public String toString()
    {
        return "Employee [empName = " + empName + ", empDesignation = " + empDesignation + ", empEmail = " + empEmail + "]";
    }

}

public class ExLinledList 
{
    public static void main(String a[])
    {
        Employee e1 = new Employee("Tharun", "Software Developer", "tharunchoudary99@gmail.com");
        Employee e2 = new Employee("Sai", "Trainer", "sai99@gmail.com");
        Employee e3 = new Employee("Tarak", "Web Developer", "tharunchoudary99@gmail.com");

        LinkedList<Employee> ll = new LinkedList<Employee>();
        ll.add(e1);
        ll.add(e2);
        ll.add(e3);

        for(Object i : ll)
        {
            System.out.println(i);
        }
    }       
}