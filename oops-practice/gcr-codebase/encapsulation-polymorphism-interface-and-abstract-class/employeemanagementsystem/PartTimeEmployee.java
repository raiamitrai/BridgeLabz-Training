package OOPs.encapsulation.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {

    private int workHours;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int workHours) {
        super(id, name, hourlyRate);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * workHours;
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

