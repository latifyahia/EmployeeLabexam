package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee e1;

    @BeforeEach
    void init() {e1 = new Employee("Mr", "latif", "123456", "1234567", "full-time", 18);}

    @Test
    void nameTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "err", "123456", "1234567", "full-time", 18));
        assertEquals("Invalid Name", e.getMessage());
    }

    @Test
    void nameTestFail2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "123456", "1234567", "full-time", 18));
        assertEquals("Invalid Name", e.getMessage());
    }

    @Test
    void nameTest()
    {
        assertEquals("latif", e1.getName());
    }

    @Test
    void titleTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("mrrs", "latif", "123456", "1234567", "full-time", 18));
        assertEquals("Invalid Title", e.getMessage());
    }

    @Test
    void titleTest()
    {
        assertEquals("Mr", e1.getTitle());
    }

    @Test
    void titleTest2()
    {
        Employee employee = new Employee("Ms", "latif", "123456", "1234567", "full-time", 18);
        assertEquals("Ms", employee.getTitle());
    }

    @Test
    void titleTest3()
    {
        Employee employee = new Employee("Mrs", "latif", "123456", "1234567", "full-time", 18);
        assertEquals("Mrs", employee.getTitle());
    }

    @Test
    void ppsTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "latif", "1234567890", "1234567", "full-time", 18));
        assertEquals("Invalid PPS Number", e.getMessage());
    }

    @Test
    void ppsTest()
    {
        assertEquals("123456", e1.getPpsNumber());
    }

    @Test
    void phoneTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "latif", "123456", "1234567890", "full-time", 18));
        assertEquals("Invalid Phone Number", e.getMessage());
    }

    @Test
    void phoneTest()
    {
        assertEquals("1234567", e1.getPhone());
    }

    @Test
    void employmentTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "latif", "123456", "1234567", "half-time", 18));
        assertEquals("Invalid Employment Type", e.getMessage());
    }

    @Test
    void employmentTest()
    {
        assertEquals("full-time", e1.getEmploymentType());
    }

    @Test
    void employmentTest2()
    {
        Employee employee = new Employee("Mr", "latif", "123456", "1234567", "part-time", 18);
        assertEquals("part-time", employee.getEmploymentType());
    }

    @Test
    void ageTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "latif", "123456", "1234567", "full-time", 15));
        assertEquals("Invalid Age", e.getMessage());
    }

    @Test
    void ageTest()
    {
        assertEquals(18, e1.getAge());
    }
}
