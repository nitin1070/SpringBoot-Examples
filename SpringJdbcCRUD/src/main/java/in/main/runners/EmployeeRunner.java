package in.main.runners;

import java.awt.Choice;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.joran.conditional.IfAction;
import in.main.model.Employee;
import in.main.services.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	private EmployeeService empService;
	@Autowired
	public EmployeeRunner(EmployeeService empService) {
		
		this.empService = empService;
	}


	@Override
	public void run(String... args) throws Exception {
	
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.println("Select an operation ");
			System.out.println("1. Create an employee");
			System.out.println("2. View all employee");
			System.out.println("3. Find employee by id");
			System.out.println("4. Update an employee");
			System.out.println("5. Delete an employee");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice ");
			int choice = kb.nextInt();
			
			switch (choice){
			case 1: 
				System.out.println("Enter Employee Id");
				int id = kb.nextInt();
			     kb.nextLine();
				System.out.println("Enter Employee Name");
			     String name = kb.nextLine();
			
			   System.out.println("Enter Employee Dept");
			   String dept = kb.nextLine();
			
			   System.out.println("Enter Employee Sal");
			   int sal = kb.nextInt();
				Employee employee = new Employee(id,name,dept,sal);
				empService.saveEmployee(employee);
				System.out.println("Employee Created Successfully");
				break;
				
				
				
			case 2: 
				 List<Employee>empList= empService.findAll();
				 
				 if(empList.isEmpty()) {
					 
					 System.out.println("No Record found");
				 }
				 else {
					 
					 System.out.println("List of Employees");
					 for(Employee e:empList) {
						 System.out.println(e);
					 }
				 }
				 
				 
				break;
				
				
			case 3: 
				System.out.println("Enter Employee id");
				int empId= kb.nextInt();
				Employee emp= empService.findById(empId);
				 if(emp!=null) {
					 System.out.println(emp);
					
					 
				 }
				 else {
					 System.out.println("No Record found of emp id-"+empId);
				 
				 }
				 
				break;
			
				
			case 4: 
				System.out.println("Enter Employee id to update");
				int upId= kb.nextInt();
				  kb.nextLine();
			   Employee empToUpdate = empService.findById(upId);
			   if(empToUpdate!=null) {
				   
				   System.out.println("Enter Name");
				   String newName= kb.nextLine();
				   System.out.println("Enter dept");
				   String dName = kb.nextLine();
				   System.out.println("Enter sal");
				   int newSal = kb.nextInt();
				   empToUpdate.setName(newName);
				   empToUpdate.setDept(dName);
				   empToUpdate.setSal(newSal);
				   
				   empService.updateEmployee(empToUpdate);
				   System.out.println("Record updated");
			   }
			   else {
				   
				   System.out.println("Record not found");
			   }
				 
				break;
				
				
			case 5: 
				System.out.println("Enter Employee id to delete");
				int deleteEmpId= kb.nextInt();
				 int count = empService.deleteEmployee(deleteEmpId);
				 if(count==0) {
					 
					 System.out.println("Record not present");
				 }
				 else {
					 System.out.println("Record deleted");
				 }
			   
				 
				break;
				
			case 6: 
				System.out.println("Thankyou...");
				return;
	
		
		
			default:
				throw new IllegalArgumentException("Invalid choice, Please try again ");
			}
			
		}while(true);
		
		
		
	}
	
	

}
