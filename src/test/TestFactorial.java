package test;
import org.junit.*;
import org.junit.function.ThrowingRunnable;

import static com.company.Main.factorial;
import static com.company.Main.factorialOldSchool;
import static com.company.fibonacciClass.*;
import static com.company.ArraysAndStrings.*;
import static com.company.MutualDivider.*;
import static org.junit.Assert.*;

public class TestFactorial {
    @Test
    public void testFactorial1 () {
boolean exceptionCaught=false;
        try{
            factorial(0);
        }
        catch (IllegalArgumentException ex){
            exceptionCaught=true;
            //ex.getMessage();
        }
        assertTrue(exceptionCaught);
        assertEquals(120, factorial(5));
        assertEquals(1,factorial(1));

    }
    @Test
    public void testFactorial2 () {
        assertEquals(factorialOldSchool(5),factorial(5));
    }
    @Test
    public void testFibonacci () {
        assertTrue(fibonacci(7)==13);
        assertTrue(fibonacci(1)==1);
        assertEquals(1,fibonacci(2));
    }
    @Test
    public void testFibonacciOldSchool (){
        assertTrue(fibonacci(13)==fibonacciOldSchool(13));
    }

    @Test
    public void  testFindSymbols(){
        assertEquals(2,FindSymbols('а',"Мама"));
    }

    @Test
    public void testFundNumOfSymbols(){
        assertTrue(FindNumOfSymbols("Мама")==4);
    }

    @Test
    public void testMutualDivider() {
        assertTrue(mutualDivider(36,36)==36);
        assertTrue(mutualDivider(7,13)==1);
        assertEquals(12,mutualDivider(36,24));
        assertEquals(12,mutualDivider(24,36));
    }
    @Test
    public void testFindAnagramm(){
        assertTrue(defineAnagramm("нитка","ткани")==true);
        assertTrue(defineAnagramm("сон","носик")==true);
        boolean exceptionCaught=false;
        try{
            defineAnagramm("","");
        }
        catch (IllegalArgumentException ex){
            exceptionCaught=true;
            ex.getMessage();
        }
        assertTrue(exceptionCaught=true);
    }

    }

