package Staff;

public class Employee {

    private String name;
    private String ni;
    private double salary;


    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }


    public String getName() {
        String copyName = this.name;
        return copyName;
    }

    public String getNi() {
        String copyNi = this.ni;
        return copyNi;
    }

    public double getSalary() {
        Double copySalary = this.salary;
        return copySalary;
    }
}
