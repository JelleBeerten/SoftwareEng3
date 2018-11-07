import java.util.Date;

import static org.junit.Assert.*;

public class DateClassTest {

    @org.junit.Test
    public void getDate() {
        Date date = new Date();
        DateClass dc = new DateClass(date);
        assertEquals("07/11/2018", dc.getDate());
        assertNotEquals("08/11/2018", dc.getDate());
    }

    @org.junit.Test
    public void Increment() {
        Date date = new Date();
        DateClass dc = new DateClass(date);
        dc.Increment(5);
        assertEquals("12/11/2018",dc.getDate());
        assertNotEquals("13/11/2018", dc.getDate());
    }
}