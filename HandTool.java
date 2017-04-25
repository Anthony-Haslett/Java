import java.util.*;
/**
 * A class to create Hand tool objects, inherts from Tool.
 * 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public class HandTool extends Tool 
{
    private boolean sharpenable;

    //Default constructor - saves time
    //     public HandTool()
    //     {
    //         super(0,false,0,"","",0);
    //         this.sharpenable = true;
    //     }
    public HandTool()
    {
        super();

    }
    //Prints the details of the super class and the extended fields from ElectricTool
    public void printDetails()
    {
        /**Get super details*/        
        super.printDetails();

        if(sharpenable == true)
        {
            System.out.printf("%-25s %-15s \n","Is item sharpenable?:", "Item is sharpenable");
        }
        else
        {
            System.out.printf("%-25s %-15s \n","Is item sharpenable?:", "Item is not sharpenable");
        }        
    }

    public void extractData(Scanner scanner2)
    {
        sharpenable = scanner2.nextBoolean();
        super.extractData(scanner2);
    }

    public boolean getSharpenable()
    {
        return sharpenable;
    }
}

