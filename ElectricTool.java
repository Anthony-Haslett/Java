import java.util.*;
import java.io.*;
/**
 * A sub class that inherits from Tool. Used to read data from the super class and extend the super class. Adding it's own values.
 * @author (Anthony Haslett Group 1) 
 *  @version (Part 3)
 */
public class ElectricTool extends Tool
{
    private boolean rechargeable;
    private String power;

    //     public ElectricTool() //Default constructor - saves time
    //     {
    //         super(0,false,0,"","",0);
    //         rechargeable = false;
    //         power = "";
    //     }
    public ElectricTool() //Default constructor - saves time
    {
        super();
    }

    //Prints the details of the super class and the extended fields from ElectricTool
    public void printDetails()
    {
        /**Get super details*/        
        super.printDetails();

        /**Electric tool fields*/
        if(rechargeable == true)
        {
            System.out.printf("%-25s %-15s \n","Is it rechargeable?:","It is");
            
        }
        else
        {
            System.out.printf("%-25s %-15s \n","Is it rechargeable?:","It isn't");
        }        
        System.out.printf("%-25s %-15s \n","Power:",power,"of power");
    }

    public void extractData(Scanner scanner2)
    {
        rechargeable = scanner2.nextBoolean(); //Read data for their respective data types
        power = scanner2.next(); 
        super.extractData(scanner2);
    }

    //Returns the value of rechargeable
    public boolean getRechargeable()
    {
        return rechargeable;
    }
    //Returns the value of power
    public String getPower()
    {
        return power;
    }
}
