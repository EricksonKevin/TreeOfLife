/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nexeus
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }
/**
     * Test of startProgram method, of class StartProgramView.
     */
    @Test
    public void testStartProgram() {
        System.out.println("startProgram");
        StartProgramView instance = new StartProgramView();
        instance.startProgram();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPlayerName method, of class StartProgramView.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        StartProgramView instance = new StartProgramView();
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
}
