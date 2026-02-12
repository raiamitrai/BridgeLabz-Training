package scenariobased.oops.employee_leave_management_system;

import java.time.LocalDate;

public class LeaveRequest {
    private Employee employee;
    private LocalDate leaveFrom;
    private LocalDate leaveTo;
    private String leaveStatus;


    public LeaveRequest(Employee employee, LocalDate leaveFrom, LocalDate leaveTo, String leaveStatus) {
        this.employee = employee;
        this.leaveFrom = leaveFrom;
        this.leaveTo = leaveTo;
        this.leaveStatus = leaveStatus;

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getLeaveFrom() {
        return leaveFrom;
    }

    public void setLeaveFrom(LocalDate leaveFrom) {
        this.leaveFrom = leaveFrom;
    }

    public LocalDate getLeaveTo() {
        return leaveTo;
    }

    public void setLeaveTo(LocalDate leaveTo) {
        this.leaveTo = leaveTo;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

}
