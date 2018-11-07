import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void triangle_type() {
        Triangle triangle = new Triangle();
        assertEquals("Invalid triangle",triangle.triangle_type(0,2,4));
        assertEquals("Isosceles triangle",triangle.triangle_type(4,2,4));
        assertEquals("Scalene triangle",triangle.triangle_type(6,2,4));
        assertEquals("Equilateral triangle",triangle.triangle_type(6,6,6));
    }
}