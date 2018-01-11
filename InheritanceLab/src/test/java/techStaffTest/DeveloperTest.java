package techStaffTest;

import org.junit.Before;
import techStaff.Developer;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before() {
        developer = new Developer("Jack", "RT746384Y", 18950.60);
    }


}
