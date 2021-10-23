package SalaryInheritance;

public class Manager extends Employee{
    @Override
    public double getSalary() {
        return 50000;
    }

    @Override
    public double getSupportMoney() {
        return 100;
    }
}

