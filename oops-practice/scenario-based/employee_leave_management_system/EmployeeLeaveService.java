package scenariobased.oops.employee_leave_management_system;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeLeaveService {
   private Map<String, Employee> EmployeeMap;
   private List<LeaveRequest> leaveRequestList;

    public EmployeeLeaveService() {
        EmployeeMap = new HashMap<>();
        leaveRequestList = new ArrayList<>();
    }

    void addEmployee(Employee employee)throws InsufficientLeaveBalanceException{
        if(EmployeeMap.containsKey(employee.getEmployeeId())){
            throw new InsufficientLeaveBalanceException("Employee already exist");
        }
        EmployeeMap.put(employee.getEmployeeId(),employee);
    }

    void applyLeave(LeaveRequest leaveRequest) throws InsufficientLeaveBalanceException{
        for(LeaveRequest lr : leaveRequestList){
            if (lr.getEmployee().getEmployeeId().equals(leaveRequest.getEmployee().getEmployeeId())){
                throw new InsufficientLeaveBalanceException("Leave request already there");
            }
        }
        leaveRequestList.add(leaveRequest);
    }

    void approvedLeave(LeaveRequest request) throws InsufficientLeaveBalanceException{
        int countLeaveBetweenDays =(int) ChronoUnit.DAYS.between(request.getLeaveFrom(), request.getLeaveTo()) + 1;
        if(countLeaveBetweenDays > request.getEmployee().getTotalRemaningLeave()){
            throw new InsufficientLeaveBalanceException("Insufficient leave balance");
        }
        request.setLeaveStatus("APPROVED");
        int totalLeaveIHave = request.getEmployee().getTotalRemaningLeave() - countLeaveBetweenDays;
        request.getEmployee().setTotalRemaningLeave(totalLeaveIHave);
    }

    void rejectLeave(LeaveRequest request) {
        request.setLeaveStatus("REJECTED");
    }


}
