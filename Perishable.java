import java.util.*;
import java.io.*;
/**
 * A subclass used to represent perishable items
 * 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public class Perishable extends Accessory
{
    private boolean isIrritant;
    private String useByDate; 
    private int volume;

    //     public Perishable() 
    //     {
    //         super("");
    //         isIrritant = false;
    //         useByDate = "";
    //         volume = 0;
    // 
    //     }
    public Perishable() 
    {
        super();       
    }

    public void extractData(Scanner scanner2)
    {
        isIrritant = scanner2.nextBoolean();
        useByDate = scanner2.next(); 
        volume  = scanner2.nextInt(); 
        super.extractData(scanner2);
    }

    public void printDetails()
    {
        /**Get super details*/        
        super.printDetails();
        if(isIrritant == true)
        {
            System.out.printf("%-25s %-15s \n","Is it an irritant?:","It is");
        }
        else
        {
            System.out.printf("%-25s %-15s \n","Is it an irritant?:","It isn't");
        }
        System.out.printf("%-25s %-15s \n","Use by date: ", getUseByDate());
        System.out.printf("%-25s %-15s \n","Volume: ",getVolume());
    }

    /** Get methods*/

    public boolean getIsIrritant()
    {
        return isIrritant;
    }

    public String getUseByDate()
    {
        return useByDate;
    }

    public int getVolume()
    {
        return volume;
    }
}
