/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erickson
 */
public class RankControlTest {
    
    public RankControlTest() {
    }

    /**
     * Test of salvationEligible method, of class RankControl.
     */
    @Test
    public void testSalvationEligible() {
        System.out.println("salvationEligible");
        
        System.out.println("\tTest case #1");
        double value = 7.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = true;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
       
    }
    {
      System.out.println("\tTest case #2");
        
        double value = 1.0;
        double thresholdValue = 7.0;
        RankControl instance = new RankControl();
        boolean expResult = false;
        boolean result = instance.salvationEligible(value, thresholdValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    
}
}
