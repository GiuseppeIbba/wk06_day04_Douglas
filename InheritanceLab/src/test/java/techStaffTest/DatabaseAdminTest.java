package techStaffTest;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin = new DatabaseAdmin("Carol", "LK553220P", 20200.98);


    @Test
    public void canPayBonus() {
        assertEquals(202.01, databaseAdmin.payBonus(), 0.0001);
    }
}
