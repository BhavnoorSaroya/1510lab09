package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import ca.bcit.comp1510.lab09.Complex;

/**
 * JUnit test for Complex class.
 * @author bhavnoor Saroya
 * @version 0.0.1
 */
class ComplexTest {

    @Test
    public void testCopmlex() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
    }
    
    @Test
    public void testreciprocal() throws IllegalArgumentException {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(0, 0);
        assertEquals(new Complex(0.12, -0.16), complex.reciprocal());
        assertThrows(IllegalArgumentException.class, () -> complex2.reciprocal(), "treid to take reciprocal of 0");
    }
    
    @Test
    public void testadd() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        assertEquals(new Complex(4, 5), complex.add(complex2));
    }
    
    @Test
    public void testsubtract() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        assertEquals(new Complex(2, 3), complex.subtract(complex2));
    }
    
    @Test
    public void testmultiply() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        assertEquals(new Complex(-1, 7), complex.multiply(complex2));
    }
     
    @Test
    public void testdivide() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        Complex complex3 = new Complex(0.0, 0.0);
        assertEquals(complex.multiply(complex2.reciprocal()), complex.divide(complex2));
        assertThrows(IllegalArgumentException.class, () -> complex.divide(complex3), "Tried to divide by zero");
    }
    
    @Test
    public void testpolarComplex() {
        assertEquals(new Complex(2, 0), Complex.polarComplex(2, 0));
    }
    
    @Test
    public void testabs() {
        Complex complex = new Complex(3, 4);
        assertEquals(5, complex.abs());
    }
    
    @Test
    public void testarg() {
        Complex complex2 = new Complex(1, 1);
        assertEquals(0.7853981633974483, complex2.arg());
    }
    
    @Test
    public void testconjugate() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(3, -4), complex.conjugate());
    }
    
    @Test
    public void testadd2() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(6, 4), complex.add(3));
    }
    
    @Test
    public void testsubtract2() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(-2, 4), complex.subtract(5));
    }
    
    @Test
    public void testmultiply2() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(12, 16), complex.multiply(4));
    }
    
    @Test
    public void testdivide2() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(3, 4), complex.divide(1));
        assertThrows(IllegalArgumentException.class, () -> complex.divide(0), "Tried to divide by 0.0");
    }
    
    @Test
    public void testsqrt() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(2, 1), complex.sqrt());
    }
    
    @Test
    public void testexp() {
        Complex complex = new Complex(1, 1);
        Complex complex2 = new Complex(2, 3);
        

        assertEquals(new Complex(1.4686939399158851, 2.2873552871788423), complex.exp());
        
        assertEquals(new Complex(-7.315110094901103, 1.0427436562359045), complex2.exp());
    }
    
    @Test
    public void testlog() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(1.6094379124341003, 0.9272952180016122), complex.log());
        
    }
    
    @Test
    public void testequals() {
        Object obj = new Object();
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        Complex complex3 = new Complex(1, 1);
        assertEquals(false, obj instanceof Complex);
        assertEquals(false, complex.equals(complex2));
        assertEquals(true, complex2.equals(complex3));
    }
    
    @Test
    public void testhashCode() {
        Complex complex = new Complex(3, 4);
        assertEquals(1572864, complex.hashCode());
    }
    
    @Test
    public void testtoString() {
        Complex complex = new Complex(3, 0);
        Complex complex2 = new Complex(0, 3);
        Complex complex3 = new Complex(3, 4);
        Complex complex4 = new Complex(8, -9);
        assertEquals("3.0", complex.toString());
        assertEquals("3.0i", complex2.toString());
        assertEquals("3.0 + 4.0i", complex3.toString());
        assertEquals("8.0 - 9.0i", complex4.toString());
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
