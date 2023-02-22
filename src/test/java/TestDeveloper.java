import Management.Manager;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer(456, 100000);

    }
    @Test
    public void hasNI(){
        assertEquals(456, developer1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, developer1.getSalary());
    }
}
