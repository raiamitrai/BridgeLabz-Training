package scenariobased.oops.employee_leave_management_system;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        EmployeeLeaveService service = new EmployeeLeaveService();

        try {
            //  Add employee
            Employee emp = new Employee("E101", "Amit");
            service.addEmployee(emp);

            //  Apply leave
            LeaveRequest request = new LeaveRequest(
                    emp,
                    LocalDate.of(2004, 12, 23),
                    LocalDate.of(2005, 1, 1),
                    "PENDING");

            service.applyLeave(request);

            //  Approve leave
            service.approvedLeave(request);

            System.out.println("Leave Status: " + request.getLeaveStatus());
            System.out.println("Remaining Leave: " + emp.getTotalRemaningLeave());

        } catch (InsufficientLeaveBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
