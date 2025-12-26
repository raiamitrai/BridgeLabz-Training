package OOPs.encapsulation.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

