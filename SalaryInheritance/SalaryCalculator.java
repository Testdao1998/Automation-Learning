package SalaryInheritance;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        Standard Em1 = new Standard();
        Standard Em2 = new Standard();

        double totalSalaries;
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(manager);
        employees.add(Em1);
        employees.add(Em2);
        totalSalaries=salaryCalculator.calculateSalaries(employees);
        System.out.println("Total salary: " + totalSalaries);

    }
    public double calculateSalaries(List<Employee> employees){
        double totalSalaries = 0.0;

        for (Employee emp : employees) {
            totalSalaries = emp.getSalary() + emp.getSupportMoney();
        }
        return totalSalaries;



}}
