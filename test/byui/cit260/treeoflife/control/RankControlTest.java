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
        System.out.println("salvationEligible");
        double value = 6.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of faithEligible method, of class RankControl.
     */
    @Test
    public void testFaithEligible() {
        System.out.println("faithEligible");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of spiritEligible method, of class RankControl.
     */
    @Test
    public void testSpiritEligible() {
        System.out.println("spiritEligible");
        double value = 8.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.spiritEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
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
        boolean expResult = false;
        boolean result = instance.rightEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
