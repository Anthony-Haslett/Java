import java.util.*;
/**
 * Write a description of class ShopItemReservation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopItemReservation
{
    private String reservationNo, itemID, customerID;
    private Date startDate;
    private int noOfDays;

    public ShopItemReservation(String reservationNo, String itemID, String customerID, String startDate , int noOfDays)
    {
        this.reservationNo = reservationNo;
        this.itemID = itemID;
        this.customerID = customerID;
        startDate = "00-00-0000";
        this.noOfDays = noOfDays;
    }

    public void printDetails()
    {
        System.out.println( reservationNo +  itemID +  customerID +  startDate +  noOfDays);
    }

    public void printItemReservations() 
    {
        // display all items
//         ShopItemReservation itemReservationMap;
//         if(itemReservationMap != null)
//         {
//             for(ShopItemReservation itemReservationMap : itemReservationMap.values()) {      
//                 itemReservationMap.printDetails();  
//                 System.out.println();   // empty line between items
// 
//             }
//         }      
//         else
//         {
//             System.out.println("Nothing to display!");
//         } 
    }
    
    public String  getReservationNo()
    {
        return reservationNo;
    }

    public Date getStartDate()
    {
        return startDate;
    }

}
