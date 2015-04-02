/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Erickson
 */
public class RankReportView extends View {
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
  
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RankReportView.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RankReportView.inFile = inFile;
    }

    public RankReportView(String promptMessage) {
        super(promptMessage);
    }

   

   
    
    
    

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
