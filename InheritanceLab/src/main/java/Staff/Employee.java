package Staff;

public class Employee {

    protected String name;
    protected String ni;
    protected double salary;


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

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
