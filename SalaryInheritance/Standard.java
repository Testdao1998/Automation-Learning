package SalaryInheritance;

public class Standard extends Employee{
    @Override
    public double getSalary() {
        return 10000;
    }

    @Override
    public double getSupportMoney() {
        return 200;
    }
}
