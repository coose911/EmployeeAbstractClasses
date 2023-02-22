import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    DatabaseAdmin databaseAdmin1;

    @Before
    public void before(){
        databaseAdmin1 = new DatabaseAdmin(789, 30000);

    }
    @Test
    public void hasNI(){
        assertEquals(789, databaseAdmin1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin1.getSalary());
    }
}
