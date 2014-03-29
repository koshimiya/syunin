package in.plam.ajm.syunin.test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import in.plam.ajm.syunin.FizzBuzz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author udumbara
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class FizzBuzz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FizzBuzz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void test3Times(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("Fizz",fz.fizzBuzz(3));
    }

    @Test
    public void test5Times(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("Buzz",fz.fizzBuzz(5));
    }

    @Test
    public void test15Times(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("FizzBuzz",fz.fizzBuzz(15));
    }

    @Test
    public void test3Times_9(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("Fizz",fz.fizzBuzz(9));
    }

    @Test
    public void test5Times_10(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("Buzz",fz.fizzBuzz(10));
    }
    
    @Test
    public void test15Times_30(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("FizzBuzz",fz.fizzBuzz(30));
    }

    @Test
    public void test2Times(){
        FizzBuzz fz = new FizzBuzz();
        assertEquals("2",fz.fizzBuzz(2));
    }
}
