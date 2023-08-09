package test.unit;

import static org.junit.Assert.*;
import org.junit.Test;
import app.Triangle;

public class TriangleTest {
	
	@Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(7.0,7.0,7.0);
        assertEquals("Equilateral", triangle.showType());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(6.0, 6.0, 8.0);
        assertEquals("Isosceles", triangle.showType());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        assertEquals("Scalene", triangle.showType());
    }

    @Test
    public void testInvalidTriangle() {
        // This is an invalid triangle where the sum of two sides is less than the third side.
        Triangle triangle = new Triangle(1.0, 2.0, 5.0);
        assertEquals("Scalene", triangle.showType()); // The method should still return Scalene, assuming the input is not validated in the method.
    }

}
