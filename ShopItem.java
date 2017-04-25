import java.util.*;
/**
 * Abstract class ShopItem - a super, super class used to represent ALL items
 * 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public abstract class ShopItem
{
    private String itemName;
    private String itemCode;   
    private int cost;
    public ShopItem()
    {

    }

    public void printDetails()
    {
        System.out.println(""); //Must be blank
        System.out.printf("%-25s %-15s \n","Tool name: ",itemName);
        System.out.printf("%-25s %-15s \n","Item code: ",itemCode);
        System.out.printf("%-25s %-15s \n","Cost: ",cost,"p");
    }

    public void extractData(Scanner scanner2)
    {
        itemName = scanner2.next();
        itemCode = scanner2.next();
        cost= scanner2.nextInt();
    }

    public String getItemName ()
    {
        return itemName;
    }

    public String getItemCode()
    {
        return itemCode;
    }

    public int getCost()
    {
        return cost;
    }

}
