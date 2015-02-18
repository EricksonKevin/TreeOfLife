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
        double value = 0.0;
        double thresholdValue = 0.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of faithEligible method, of class RankControl.
     */
    @Test
    public void testFaithEligible() {
        System.out.println("faithEligible");
        double value = 0.0;
        double thresholdValue = 0.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.faithEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spiritEligible method, of class RankControl.
     */
    @Test
    public void testSpiritEligible() {
        System.out.println("spiritEligible");
        double value = 0.0;
        double thresholdValue = 0.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.spiritEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightEligible method, of class RankControl.
     */
    @Test
    public void testRightEligible() {
        System.out.println("rightEligible");
        double value = 0.0;
        double thresholdValue = 0.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.rightEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
