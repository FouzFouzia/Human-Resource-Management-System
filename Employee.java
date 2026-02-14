package HRMS;

import java.io.Serializable;

public class Employee implements Serializable  {
	
	private int empId;
    private String name;
    private String department;
    private String designation;
    private String contact;
    
    Employee(){
    	
    }
    
    Employee(int empId , String name , String department ,String designation ,String contact ){
    	
    	this.empId=empId;
    	this.name =name;
    	this.department=department;
    	this.designation=designation;
    	this.contact=contact;
	    	
	   
    }
    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "ID: " + empId +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nDesignation: " + designation +
                "\nContact: " + contact;
    
   
    
    }
    

}
