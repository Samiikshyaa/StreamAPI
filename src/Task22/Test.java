package Task22;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee(1, "Samikshya", "Bhaktapur", "sam@gmail.com", "9849898410", 22, "Intern", 20000, 1),
                new Employee(2, "Serina", "Sankhamool", "mer@gmail.com", "984989841", 23, "CTO", 10000, 2),
                new Employee(3, "Utsav", "Bhaktapur", "uts@yahoo.com", "984989841", 24, "CEO", 500000, 6),
                new Employee(4, "Pratik", "Koteshwor", "ptk@gmail.com", "9849898411", 20, "CMO", 10000, 2),
                new Employee(5, "Suyog", "Buddhanagar", "sug@hotmail.com", "9849898413", 26, "DCTO", 50000, 3),
                new Employee(6, "Niran", "Imadol", "nir@gmail.com", "984989845", 27, "Intern", 10000, 1),
                new Employee(7, "Sameer", "Bhaktapur", "sameer@gmail.com", "984989849", 28, "CTO", 30000, 1),
                new Employee(8, "Sushani", "satdobato", "sushi@hcoe.com", "9849898423", 30, "Intern", 60000, 0),
                new Employee(9, "Monika", "Koteshwor", "moni@gmail.com", "9849898465", 32, "Intern", 10000, 3)
        );

//        Map a list of employees to List of minimal Dto class along with above filters from point number 15 to 21.
        List minimaldto = emps.stream().filter(e -> e.getSalary()>20000)
                .filter(e -> e.getDesignation().equals("CTO")||e.getDesignation().equals("DCTO"))
                .filter(e -> e.getAge()>=20 && e.getAge()<=25 && e.getSalary()<15000)
                .filter(e -> e.getEmail().contains("gmail"))
                .filter(e -> e.getMobile_number().length()!=10)
                .filter(e -> e.getName().toLowerCase().startsWith("s") && e.getAge()>25)
                .map(e -> new MinimalDto(e.getId(),e.getName(),e.getAddress(),e.getEmail())).collect(Collectors.toList());

        System.out.println(minimaldto);

//        Find the sum of salary of the employees along with the above filters from point number 15 to 21
        int addition = emps.stream().filter(e -> e.getSalary()>20000)
                .filter(e -> e.getDesignation().equals("CTO")||e.getDesignation().equals("DCTO"))
                .filter(e -> e.getAge()>=20 && e.getAge()<=25 && e.getSalary()<15000)
                .filter(e -> e.getEmail().contains("gmail"))
                .filter(e -> e.getMobile_number().length()!=10)
                .filter(e -> e.getName().toLowerCase().startsWith("s") && e.getAge()>25)
                .mapToInt(Employee::getSalary).sum();

        System.out.println(addition);


    }

}
