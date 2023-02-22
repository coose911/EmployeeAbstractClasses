import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("hr", 123, 50000);

    }

    @Test
    public void hasDeptName(){
        assertEquals("hr", manager1.getDeptName());
    }

    @Test
    public void hasNI(){
        assertEquals(123, manager1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager1.getSalary());
    }

    @Test
    public void canGetRaise(){
        assertEquals(50002, manager1.raiseSalary(2), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(50050, manager1.payBonus(0.001), 0.0);
    }

}
