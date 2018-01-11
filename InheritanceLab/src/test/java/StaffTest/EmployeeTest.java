package staffTest;

import staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("Jenny", "TG457394Z", 12000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenny", employee.getName());
    }

    @Test
    public void canGetNi(){
        assertEquals("TG457394Z", employee.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(12000.00, employee.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(500.50);
        assertEquals(12500.50, employee.getSalary(), 0.0001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(120.00, employee.payBonus(), 0.0001);
    }

}
