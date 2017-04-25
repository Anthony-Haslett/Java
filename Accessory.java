import java.util.*;
/**
 * An abstract super class to represent Accessories
 * 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public abstract class Accessory extends ShopItem
{

    private String position;
   
    public Accessory()
    {
        super();

    }

    public void extractData(Scanner scanner2)
    {       
        position = scanner2.next();
        super.extractData(scanner2);
    }

    public void printDetails()
    {

        super.printDetails();
        System.out.printf("%-25s %-15s \n", "Position: ",position);    
    }    

    public String getPosition()
    {        
        return position;
    }

}
