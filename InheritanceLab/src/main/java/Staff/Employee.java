package staff;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static jdk.nashorn.internal.objects.NativeMath.round;

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

        String salaryConvertedToStringFromDouble = String.valueOf(salary/ 100); // this convert double into a string
        BigDecimal bonusRoundedAsString = new BigDecimal(salaryConvertedToStringFromDouble);
        bonusRoundedAsString = bonusRoundedAsString.setScale(2, RoundingMode.HALF_UP);
        return bonusRoundedAsString.doubleValue();
    }
}
