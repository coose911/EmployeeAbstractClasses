import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director;


    @Before
    public void before(){
        director = new Director("hr", 123, 1000000, 2.9 );

    }
    @Test
    public void hasDeptName(){
        assertEquals("hr", director.getDeptName());
    }

    @Test
    public void hasNI(){
        assertEquals(123, director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000000, director.getSalary());
    }

    @Test
    public void canGetRaise(){
        assertEquals(1000002, director.raiseSalary(2), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1001000, director.payBonus(0.001), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(2.9, director.getBudget(), 0.0);
    }
}
