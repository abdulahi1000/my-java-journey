
package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        
        Employee Employee1 = new Employee("Susan Mayers", 47899, "Department", "Vice President");
        Employee Employee2 = new Employee("Mark Jones", "Programmer");
        Employee Employee3 = new Employee( "Manufacturing");
        
        Employee2.setIdNumber(39119);
        Employee2.setDepartment("IT");
        
        Employee3.setName("Joy Rogers");
        Employee3.setIdNumber(817774);
        Employee3.setJobTitle("Engineer");
        
        System.out.println("Name\t\t\tID Number\t\tDpartment\t\tJob Title");
        System.out.println(Employee1.getName()+"\t\t"+ Employee1.getIdNumber() +"\t\t\t"+ Employee1.getDepartment() +"\t\t"+ Employee1.getJobTitle() );
        System.out.println(Employee2.getName()+"\t\t"+ Employee2.getIdNumber() +"\t\t\t"+ Employee2.getDepartment() +"\t\t\t"+ Employee2.getJobTitle() );
        System.out.println(Employee3.getName()+"\t\t"+ Employee3.getIdNumber() +"\t\t\t"+ Employee3.getDepartment() +"\t\t"+ Employee3.getJobTitle() );
        
        
        
    
    }
}
