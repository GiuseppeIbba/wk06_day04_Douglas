package ManagementTest;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Wilma", "AB123456F", 21500.99, "R&D");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("R&D", manager.getDeptName());
    }
}
