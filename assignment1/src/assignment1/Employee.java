
package assignment1;

public class Employee {
    private String name;
    private int IdNumber;
    private String Department;
    private String JobTitle;
    
        public void setName (String Name){
            name = Name;
        }
        public void setIdNumber (int idNumber){
            IdNumber = idNumber;
        }
         public void setDepartment (String department){
            Department = department;
        }
         public void setJobTitle (String JobTitle){
            this.JobTitle = JobTitle;
        }
         
         public String getName (){
         return name;
         }
          public int getIdNumber (){
         return IdNumber;
         }
          public String getDepartment (){
         return Department;
         }
          public String getJobTitle (){
         return JobTitle;
         }
         
   public  Employee(String EmployeeName, int EmployeeIdNumber, String EmployeeDepartment, String EmployeeJobTitle){
        name = EmployeeName;
        IdNumber = EmployeeIdNumber;
        Department = EmployeeDepartment;
        JobTitle = EmployeeJobTitle;
    }  
   
   public  Employee(String EmployeeName, String EmployeeJobTitle){
        name = EmployeeName;
        IdNumber = 0;
        Department = "";
        JobTitle = EmployeeJobTitle;
    }     
    public  Employee(String EmployeeDepartment){
        name = "";
        IdNumber = 0;
        Department = EmployeeDepartment;
        JobTitle = "";
    }      
    
    
    
}
