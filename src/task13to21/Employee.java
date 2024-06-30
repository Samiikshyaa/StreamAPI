package task13to21;

public class Employee {
    private int id;
    private String name;
    private String address;
    private String email;
    private String mobile_number;
    private int age;
    private String designation;
    private int salary;
    private int experience;

    public Employee(int id, String name, String address, String email, String mobile_number, int age, String designation, int salary, int experience) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobile_number = mobile_number;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
