/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

/**
 *
 * @author Erickson
 */
public class RankStatusView extends View {
    
    public RankStatusView(){
        super("\n"
            + "\n---------------------------------------"
            + "\n| Status Menu                          |"
            + "\n---------------------------------------"
            + "\nH - What is my highest ranking?        "
            + "\nL - What is my lowest ranking?         "
            + "\nQ - Quit"           
            + "\n---------------------------------------");
        
        }
    @Override
    public void doAction(Object obj) {
        
            String value  = (String)obj;
        
        String choice = value;       
        switch (choice){
            case "H": // Highest Ranking function
                this.maxRank();
               
                break;
                
            case "L": //Lowest Ranking function
                System.out.println("\n***Invalid selection *** Try again");
                break;
              
            case "Q": //Quit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    

    public void maxRank() {
       class maxRank{
           
               public void main(String args[]){
           int array[] = new int[]{1, 3, 5, 7};
                   
                   int max = getMax(array);
                   System.out.println("Maximum Value is: "+max);
           }
                  
                   public int getMax(int[] inputArray){
                       int maxValue = inputArray[0];
                       for (int i=1; i < inputArray.length;i++){
                           if(inputArray[i] > maxValue){
                               maxValue = inputArray[i];
                               
                           }
                   }
                       return maxValue;
                   }
               }
    
}
    
}

