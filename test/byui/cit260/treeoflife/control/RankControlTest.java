/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erickson
 */
public class RankControlTest {
    
    public RankControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvationEligible method, of class RankControl.
     */
    @Test
    public void testSalvationEligible() {
        System.out.println("salvationEligible_test1");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }
{
        System.out.println("salvationEligible_test2");
        double value = 9.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }

{
        System.out.println("salvationEligible_test3");
        double value = 1.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }

{
        System.out.println("salvationEligible_test4");
        double value = 6.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }

{
        System.out.println("salvationEligible_test5");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }

{
        System.out.println("salvationEligible_test6");
        double value = 10.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }
    /**
     * Test of faithEligible method, of class RankControl.
     */
    @Test
    public void testFaithEligible() {
        System.out.println("faithEligible_test1");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }
    
    {
        System.out.println("faithEligible_test2");
        double value = 9.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }
    
    {
        System.out.println("faithEligible_test3");
        double value = 1.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }
    
    {
        System.out.println("faithEligible_test4");
        double value = 6.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }
    
    {
        System.out.println("faithEligible_test5");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }
    
    {
        System.out.println("faithEligible_test6");
        double value = 10.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of spiritEligible method, of class RankControl.
     */
    @Test
    public void testSpiritEligible() {
        System.out.println("spiritEligible");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.spiritEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of rightEligible method, of class RankControl.
     */
    @Test
    public void testRightEligible() {
        System.out.println("rightEligible");
        double value = 9.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.rightEligible(value, thresholdValue);
        assertEquals(expResult, result);
        
        
    }
    
}
