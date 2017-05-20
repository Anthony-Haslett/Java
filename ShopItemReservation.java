import java.util.*;
import java.io.*;
import java.awt.*;
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
    
    public ShopItemReservation()
    {

    }

    public void printDetails()
    {
        System.out.println( reservationNo +  itemID +  customerID +  startDate +  noOfDays);
    }

    public void printItemReservations(Shop shop) 
    {
        shop.printAllDetailsMap(); 
        shop.printAllCustomers();
        System.out.println(reservationNo +  itemID +  customerID +  startDate +  noOfDays);
    }
    
    public void writeData(PrintWriter printWriter)
    {              
        printWriter.println(reservationNo +  itemID +  customerID +  startDate +  noOfDays);
    }
    
     public void extractData(Scanner scanner2)
    {
        reservationNo = scanner2.next(); 
        itemID = scanner2.next(); 
        customerID = scanner2.next(); 
        //startDate = scanner2.next(); 
        noOfDays = scanner2.nextInt(); 
        //super.extractData(scanner2);
    }

//     public void printItemReservations() 
//     {
//         // display all items
//         ShopItemReservation itemReservationMap;
//         if(itemReservationMap != null)
//         {
//             Shop shop;
//            for(ShopItemReservation itemRes: itemReservationMap.values())  {      
//                 itemReservationMap.printDetails();  
//                 System.out.println();   // empty line between items
// 
//             }
//         }      
//         else
//         {
//             System.out.println("Nothing to display!");
//         } 
//     }
    


    public String  getReservationNo()
    {
        return reservationNo;
    }
    
    

    public Date getStartDate()
    {
        return startDate;
    }

}
