package HRMS;

import java.util.ArrayList;
import java.util.Scanner;

public class HRMS {
	

	    static Scanner sc = new Scanner(System.in);
	    static ArrayList<Employee> employees = new ArrayList<>();
	    static ArrayList<Leave> leaves = new ArrayList<>();

	    public static void main(String[] args) {

	        while (true) {
	            System.out.println("\n===== HRMS MENU =====");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Search Employee");
	            System.out.println("4. Apply Leave");
	            System.out.println("5. View Leave Requests");
	            System.out.println("6. Approve Leave");
	            System.out.println("7. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> addEmployee();
	                case 2 -> viewEmployees();
	                case 3 -> searchEmployee();
	                case 4 -> applyLeave();
	                case 5 -> viewLeaves();
	                case 6 -> approveLeave();
	                case 7 -> {
	                    System.out.println("Exiting HRMS...");
	                    return;
	                }
	                default -> System.out.println("Invalid choice!");
	            }
	        }
	    }

	    static void addEmployee() {
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Department: ");
	        String dept = sc.nextLine();
	        System.out.print("Enter Designation: ");
	        String desig = sc.nextLine();
	        System.out.print("Enter Contact: ");
	        String contact = sc.nextLine();

	        employees.add(new Employee(id, name, dept, desig, contact));
	        System.out.println("Employee Added Successfully!");
	    }

	    static void viewEmployees() {
	        if (employees.isEmpty()) {
	            System.out.println("No Employees Found!");
	            return;
	        }
	        for (Employee emp : employees) {
	            System.out.println("\n" + emp);
	        }
	    }

	    static void searchEmployee() {
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();

	        for (Employee emp : employees) {
	            if (emp.getEmpId() == id) {
	                System.out.println(emp);
	                return;
	            }
	        }
	        System.out.println("Employee Not Found!");
	    }

	    static void applyLeave() {
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Leave Type: ");
	        String type = sc.nextLine();
	        System.out.print("Enter Start Date: ");
	        String start = sc.nextLine();
	        System.out.print("Enter End Date: ");
	        String end = sc.nextLine();

	        leaves.add(new Leave(id, type, start, end));
	        System.out.println("Leave Applied Successfully!");
	    }

	    static void viewLeaves() {
	        if (leaves.isEmpty()) {
	            System.out.println("No Leave Requests!");
	            return;
	        }
	        for (Leave leave : leaves) {
	            System.out.println("\n" + leave);
	        }
	    }

	    static void approveLeave() {
	        System.out.print("Enter Employee ID to approve leave: ");
	        int id = sc.nextInt();

	        for (Leave leave : leaves) {
	            if (leave.getEmpId() == id) {
	                leave.approve();
	                System.out.println("Leave Approved!");
	                return;
	            }
	        }
	        System.out.println("Leave Request Not Found!");
	    }
	}



