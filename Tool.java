import java.util.*;
/**
 * Abstract class Tool - a super class to encompass HandTool and ElectricTool class objects
 * 
 *  @author (Anthony Haslett group 1)  
 *  @version (Part 3)
 * CLASS is abstract because you can't make instances of a super class
 */

public abstract class Tool extends ShopItem
{   
    private int timesBorrowed;
    private boolean onLoan;
    private int weight;    
   
    public Tool()
    {
        super();

    }

    public void printDetails()
    {
        super.printDetails();
        System.out.printf("%-25s %-15s \n","Times borrowed: ",timesBorrowed);
        //Check if a tool is on loan
        if(getOnLoan() == true)
        {
            System.out.printf("%-25s %-15s \n","Is it on loan?:" ,"is on loan");
        }
        else
        {
            System.out.printf("%-25s %-15s \n","Is it on loan?:" ,"no");
        }

        System.out.printf("%-25s %-15s \n","Weight of: ",weight," grammes");
    }

    public void extractData(Scanner scanner2)
    {     
        timesBorrowed = scanner2.nextInt();
        onLoan = scanner2.nextBoolean();
        super.extractData(scanner2);
        weight = scanner2.nextInt();
    }

    /**Get Methods*/

    public int getTimesBorrowed()
    {
        return timesBorrowed;
    }

    public boolean getOnLoan()
    {
        return onLoan;
    }

    public int getWeight()
    {
        return weight;
    }

    /**Set Methods*/  
    public void setOnLoan()
    {
        onLoan = onLoan;
    }

}
