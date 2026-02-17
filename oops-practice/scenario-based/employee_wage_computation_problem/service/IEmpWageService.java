package scenariobased.oops.employee_wage_computation_problem.service;

public interface IEmpWageService {

    void addCompany(String company,int wagePerHour,int maxDays,int maxHours);

    void computeEmployeeWage();

    int getTotalWage(String company);
}
