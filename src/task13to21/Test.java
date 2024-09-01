package task13to21;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static java.util.Arrays.stream;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[9];
        employees[0] = new Employee(1, "Samikshya", "Bhaktapur", "sam@gmail.com", "9849898410", 22, "Intern", 20000, 1);
        employees[1] = new Employee(2, "Merina", "Sankhamool", "mer@gmail.com", "984989841", 23, "CTO", 10000, 2);
        employees[2] = new Employee(3, "Utsav", "Bhaktapur", "uts@yahoo.com", "984989841", 24, "CEO", 500000, 6);
        employees[3] = new Employee(4, "Pratik", "Koteshwor", "ptk@gmail.com", "9849898411", 20, "CMO", 10000, 2);
        employees[4] = new Employee(5, "Suyog", "Buddhanagar", "sug@hotmail.com", "9849898413", 26, "DCTO", 50000, 3);
        employees[5] = new Employee(6, "Niran", "Imadol", "nir@gmail.com", "984989845", 27, "Intern", 10000, 1);
        employees[6] = new Employee(7, "Sameer", "Bhaktapur", "sameer@gmail.com", "9849898499", 28, "Intern", 30000, 1);
        employees[7] = new Employee(8, "Sushani", "satdobato", "sushi@hcoe.com", "9849898423", 30, "Intern", 60000, 0);
        employees[8] = new Employee(9, "Monika", "Koteshwor", "moni@gmail.com", "9849898465", 32, "Intern", 10000, 3);
        List<Employee> employee = asList(employees);
        display_all(employees);
        filtersalary(employees);
        designation(employees);
        ageSalaryFilter(employees);
        filterGmailUser(employees);
        mobileFilter(employees);
        filterNameAge(employees);

    }

    static void display_all(Employee[] emps) {
        System.out.println("The employees are: ");
        for (Employee emp : emps) {
            System.out.println(emp);
        }
        System.out.println("\n");
    }

    //    Filter the employees whose salary is greater than 20000.
    static void filtersalary(Employee[] emps) {
        System.out.println("The emnployees whose salary is greater than 20000:");
        stream(emps).filter(x -> x.getSalary() > 20000).forEach(y -> System.out.println(y));
        System.out.println("\n");
    }

    //    Filter the employees whose designation is CTO or DCTO.
    static void designation(Employee[] emps) {
        System.out.println("The emnployees whose designation is CtO or DCTO:");
        stream(emps).filter(employee -> employee.getDesignation().equals("CTO") || employee.getDesignation().equals("DCTO")).forEach(y -> System.out.println(y));
    }

    //    Filter the employee whose age is between 20 and 25 and salary is less than 15000.
    static void ageSalaryFilter(Employee[] emps) {
        System.out.println("\nThe employee whose age is between 20 and 25 and salary is less than 15000: ");
        stream(emps).filter(y -> y.getAge() >= 20 && y.getAge() < 25 && y.getSalary() < 15000).forEach(y -> System.out.println(y));
    }

    //    Filter the employees who are using gmail.
    static void filterGmailUser(Employee[] emps) {
        System.out.println("\n The employees who are using gmail: ");
        stream(emps).filter(s -> s.getEmail().contains("gmail")).forEach(y -> System.out.println(y));
    }

//    Filter the employee whose mobile number length is not equal to 10.
    static void mobileFilter(Employee[] emps){
        System.out.println("\nThe employee whose mobile number length is not equal to 10.");
        stream(emps).filter(e -> e.getMobile_number().length()!=10).forEach(y -> System.out.println(y));
    }

//    Filter the employees whose name starts from “s” and age is greater than 25.
    static void filterNameAge(Employee[] emps){
        System.out.println("\nThe employees whose name starts from “s” and age is greater than 25.");
        stream(emps).filter(y -> y.getName().toLowerCase().startsWith("s") && y.getAge()>25).forEach(y -> System.out.println(y));
    }

}
