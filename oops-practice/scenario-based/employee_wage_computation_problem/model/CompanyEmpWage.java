package scenariobased.oops.employee_wage_computation_problem.model;

import java.util.ArrayList;

public class CompanyEmpWage {

    private String company;
    private int wagePerHour;
    private int maxDays;
    private int maxHours;
    private int totalWage;
    private ArrayList<Integer> dailyWageList;

    public CompanyEmpWage(String company,int wagePerHour,int maxDays,int maxHours){
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
        this.dailyWageList = new ArrayList<>();
    }

    public String getCompany() { return company; }
    public int getWagePerHour() { return wagePerHour; }
    public int getMaxDays() { return maxDays; }
    public int getMaxHours() { return maxHours; }
    public int getTotalWage() { return totalWage; }
    public ArrayList<Integer> getDailyWageList() { return dailyWageList; }

    public void setTotalWage(int totalWage){
        this.totalWage = totalWage;
    }
}
