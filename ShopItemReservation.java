import java.util.*;
/**
 * Write a description of class ShopItemReservation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopItemReservation
{
    private String reservationNo, itemID, CustomerID;
    private Date startDate;
    private int noOfDays;
    public ShopItemReservation(String reservationNo, String itemID, String customerID, String startDate , int noOfDays)
    {
      startDate = "00-00-0000";
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
