package scenariobased.oops.employee_wage_computation_problem.service;

import scenariobased.oops.employee_wage_computation_problem.model.CompanyEmpWage;
import scenariobased.oops.employee_wage_computation_problem.repository.CompanyRepository;

public class EmpWageServiceImpl implements IEmpWageService {

    private CompanyRepository repository = new CompanyRepository();

    @Override
    public void addCompany(String company,int wagePerHour,int maxDays,int maxHours){
        repository.addCompany(new CompanyEmpWage(company,wagePerHour,maxDays,maxHours));
    }

    private void computeWage(CompanyEmpWage company){

        int totalHours = 0;
        int totalDays = 0;

        while(totalHours < company.getMaxHours() && totalDays < company.getMaxDays()){

            totalDays++;

            int empCheck = (int)(Math.random()*3);

            int empHour = 0;

            switch(empCheck){
                case 1: empHour = 8; break;
                case 2: empHour = 4; break;
                default: empHour = 0;
            }

            if(totalHours + empHour > company.getMaxHours()){
                empHour = company.getMaxHours() - totalHours;
            }

            totalHours += empHour;

            int dailyWage = empHour * company.getWagePerHour();
            company.getDailyWageList().add(dailyWage);
        }

        int totalWage = 0;
        for(int wage : company.getDailyWageList()){
            totalWage += wage;
        }

        company.setTotalWage(totalWage);
    }

    @Override
    public void computeEmployeeWage(){
        for(CompanyEmpWage company : repository.getAllCompanies()){
            computeWage(company);
        }
    }

    @Override
    public int getTotalWage(String company){
        CompanyEmpWage obj = repository.getCompany(company);
        if(obj == null) return 0;
        return obj.getTotalWage();
    }
}
