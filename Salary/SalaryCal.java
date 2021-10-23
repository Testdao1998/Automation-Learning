package Salary;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryCal {
    public static void main(String[] args) {
        //Create 1 CEO, 1 Manager, 2 Employee
        Scanner scanner = new Scanner(System.in);

        CEO ceo = new CEO();
        Manager manager = new Manager();
        NormalEmployee employee1 = new NormalEmployee();
        NormalEmployee employee2 = new NormalEmployee();

        // Set salary
        System.out.println("Input CEO Salary");
        double ceoSalary = scanner.nextDouble();
        System.out.println("Input Manager Salary");
        double managerSalary = scanner.nextDouble();
        System.out.println("Input employee1 Salary");
        double employee1Salary = scanner.nextDouble();
        System.out.println("Input employee2 Salary");
        double employee2Salary = scanner.nextDouble();
        ceo.setSalary(ceoSalary);
        manager.setSalary(managerSalary);
        employee1.setSalary(employee1Salary);
        employee2.setSalary(employee2Salary);
        List<NormalEmployee> normalEmployees = new ArrayList<>();
        normalEmployees.add(employee1);
        normalEmployees.add(employee2);


        // Get monthly Salary
        double totalSalary = ceo.getSalary() + managerSalary;
        for (NormalEmployee emp : normalEmployees){
           totalSalary += emp.getSalary();
        }
        System.out.println("summery monthly salary: " + totalSalary);
    }
}
