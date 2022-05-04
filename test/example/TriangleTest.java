package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    } 
    
    @Test 
    public void scaleneTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 4, 5); 
 
        assertEquals(TriangleKind.SCALENE, triangle.getKind()); 
    } 
    
    @Test 
    public void isoscelesTriangleHaveTwoEqualSides1() throws Exception { 
        Triangle triangle = new Triangle(9, 4, 9); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
    
    @Test 
    public void isoscelesTriangleHaveTwoEqualSides2() throws Exception { 
        Triangle triangle = new Triangle(5, 5, 9); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
    
    @Test 
    public void isoscelesTriangleHaveTwoEqualSides3() throws Exception { 
        Triangle triangle = new Triangle(9, 5, 5); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenAllSidesAreZero() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(0, 0, 0); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsZero1() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(0, 4, 5); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsZero2() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(3, 0, 5); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsZero3() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(3, 4, 0); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsNegative1() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(-1, 4, 8); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsNegative2() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(2, -1, 8); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenOneSideIsNegative3() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(2, 5, -1); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsEqualToTheOtherSide1() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(1, 2, 3); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsEqualToTheOtherSide2() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(3, 2, 1); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsEqualToTheOtherSide3() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(1, 3, 2); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsLessThanTheOtherSide1() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(2, 4, 10); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsLessThanTheOtherSide2() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(2, 10, 4); 
        }); 
    } 
    
    @Test 
    public void shouldThrowExceptionWhenSumOfTwoSidesIsLessThanTheOtherSide3() throws Exception { 
       
         Assertions.assertThrows(TriangleException.class, () -> {
        	 Triangle triangle = new Triangle(10, 2, 3); 
        }); 
    } 

    
}