package Luong_trung_binh_cao_nhat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Map<String, List<Employee>> departmentEmplyee = new HashMap<>();
        while (N-- > 0) {
            String[] infoEmploee = sc.nextLine().split(" ");
            String name = infoEmploee[0];
            double salary = Double.parseDouble(infoEmploee[1]);
            String department = infoEmploee[2];
            String email = infoEmploee.length > 3 && !(isNumber(infoEmploee[3])) ? infoEmploee[3] : "n/a";
            int age = infoEmploee.length > 3 && isNumber(infoEmploee[infoEmploee.length - 1]) ? Integer.parseInt(infoEmploee[infoEmploee.length - 1]) : -1;

            Employee employee = new Employee(name, salary, department, email, age);

            departmentEmplyee.putIfAbsent(department, new ArrayList<>());
            departmentEmplyee.get(department).add(employee);
        }
        double highestAvg = 0.0;
        String highestAvgDep = null;
        for (String department: departmentEmplyee.keySet()){
            List<Employee> employees = departmentEmplyee.get(department);
            double totalSalary =0.0;
            for (Employee employee : employees){
                totalSalary += employee.getSalary();
            }
            double avgSalary = totalSalary / employees.size();
            if(avgSalary > highestAvg){
                highestAvg = avgSalary;
                highestAvgDep = department;
            }
        }
        System.out.println("Highest Average Salary: " + highestAvgDep);
        for (Employee employee:departmentEmplyee.get(highestAvgDep)){
            System.out.println(employee);
        }
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private String department, email;
    private int age;

    public Employee(String name, double salary, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email != null ? email : "n/a";
        this.age = age != -1 ? age : -1;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + String.format("%.2f", salary) + " " + email + " " + age;
    }
}
