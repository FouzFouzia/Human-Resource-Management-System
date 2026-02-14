package HRMS;

import java.io.Serializable;

public class Leave implements Serializable{
	
	
	    private int empId;
	    private String leaveType;
	    private String startDate;
	    private String endDate;
	    private String status;

	    public Leave(int empId, String leaveType, String startDate, String endDate) {
	        this.empId = empId;
	        this.leaveType = leaveType;
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.status = "Pending";
	    }

	    public int getEmpId() { return empId; }

	    public void approve() { status = "Approved"; }
	    public void reject() { status = "Rejected"; }

	    @Override
	    public String toString() {
	        return "EmpID: " + empId +
	                "\nLeave Type: " + leaveType +
	                "\nStart: " + startDate +
	                "\nEnd: " + endDate +
	                "\nStatus: " + status;
	    }
	}



