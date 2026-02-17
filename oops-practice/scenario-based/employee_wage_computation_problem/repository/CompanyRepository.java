package scenariobased.oops.employee_wage_computation_problem.repository;

import scenariobased.oops.employee_wage_computation_problem.model.CompanyEmpWage;
import java.util.ArrayList;
import java.util.HashMap;

public class CompanyRepository {

    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private HashMap<String,CompanyEmpWage> companyMap = new HashMap<>();

    public void addCompany(CompanyEmpWage company){
        companyList.add(company);
        companyMap.put(company.getCompany(),company);
    }

    public ArrayList<CompanyEmpWage> getAllCompanies(){
        return companyList;
    }

    public CompanyEmpWage getCompany(String name){
        return companyMap.get(name);
    }
}
