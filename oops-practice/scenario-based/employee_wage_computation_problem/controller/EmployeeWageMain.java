package scenariobased.oops.employee_wage_computation_problem.controller;

import scenariobased.oops.employee_wage_computation_problem.service.EmpWageServiceImpl;
import scenariobased.oops.employee_wage_computation_problem.service.IEmpWageService;

public class EmployeeWageMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        IEmpWageService service = new EmpWageServiceImpl();

        service.addCompany("TCS",20,20,100);
        service.addCompany("Infosys",25,22,120);
        service.addCompany("Wipro",30,18,90);

        service.computeEmployeeWage();

        System.out.println("TCS Total Wage = " + service.getTotalWage("TCS"));
        System.out.println("Infosys Total Wage = " + service.getTotalWage("Infosys"));
        System.out.println("Wipro Total Wage = " + service.getTotalWage("Wipro"));
    }
}
