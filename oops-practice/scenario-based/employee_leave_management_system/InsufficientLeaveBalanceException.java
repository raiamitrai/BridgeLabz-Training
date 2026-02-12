package scenariobased.oops.employee_leave_management_system;

public class InsufficientLeaveBalanceException extends Exception{
    InsufficientLeaveBalanceException(String message){
        super(message);
    }
}
