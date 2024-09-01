class Employee {
    String name, empID;
    double basicSalary, grossSalary;

    public Employee(String name, String empID, double basicSalary) {
        this.name = name;
        this.empID = empID;
        this.basicSalary = basicSalary;
        find_GrossSalary();
    }

    public void find_GrossSalary() {
        grossSalary = basicSalary;
    }
}

class TechEmp extends Employee {
    double HRA, DA;

    public TechEmp(String name, String empID, double basicSalary, double HRA, double DA) {
        super(name, empID, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
        find_GrossSalary();
    }

    public void find_GrossSalary() {
        grossSalary = basicSalary + (DA * 1.2) + (HRA * 0.15);
    }
}
class NonTechEmp extends Employee {
    int yearsOfExp;

    public NonTechEmp(String name, String empID, double basicSalary, int yearsOfExp) {
        super(name, empID, basicSalary);
        this.yearsOfExp = yearsOfExp;
        find_GrossSalary();
    }

    public void find_GrossSalary() {
        grossSalary = basicSalary * yearsOfExp;
    }
}

public class lab10 {
    public static void main(String[] args) {
        TechEmp techEmp = new TechEmp("John Doe", "T001", 50000, 10000, 20000);
        NonTechEmp nonTechEmp = new NonTechEmp("Jane Doe", "NT001", 40000, 5);

        System.out.println("Tech Employee Details:");
        System.out.println("Name: " + techEmp.name);
        System.out.println("Emp ID: " + techEmp.empID);
        System.out.println("Basic Salary: " + techEmp.basicSalary);
        System.out.println("Gross Salary: " + techEmp.grossSalary);

        System.out.println("\nNon-Tech Employee Details:");
        System.out.println("Name: " + nonTechEmp.name);
        System.out.println("Emp ID: " + nonTechEmp.empID);
        System.out.println("Basic Salary: " + nonTechEmp.basicSalary);
        System.out.println("Gross Salary: " + nonTechEmp.grossSalary);
}
}