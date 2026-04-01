package scenariobased.oops.employee_leave_management_system;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int totalLeave;
    private int totalRemaningLeave;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.totalLeave = 40;
        this.totalRemaningLeave = 40;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getTotalLeave() {
        return totalLeave;
    }

    public void setTotalLeave(int totalLeave) {
        this.totalLeave = totalLeave;
    }

    public int getTotalRemaningLeave() {
        return totalRemaningLeave;
    }

    public void setTotalRemaningLeave(int totalRemaningLeave) {
        this.totalRemaningLeave = totalRemaningLeave;
    }
}
