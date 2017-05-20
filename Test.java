
/**
 * A class to test project objects
 * 
 * @author (Anthony Haslett) 
 * @version (Part 3)
 */
import javax.swing.JOptionPane;
import java.util.*;
public class Test
{
    public Test()
    {
        /** 1)Shop test*/
       
        //Shop shop = new Shop();
        
        //         shop.readData();
        
        //         shop.printAllDetailsMap();
        /** 2) Customer test (single customer)*/ 
     
//         Shop shop = new Shop();
        
//         Customer customer = new Customer("","Roberts","John","T","Mr");
        
//         shop.addCustomerMap(customer);
//         shop.printAllCustomers();
       
//         JOptionPane.showMessageDialog(null, "Customer Added to Array");
        /** 3) Customer test (All customers)*/ 
     
        Shop shop = new Shop();
     
        Customer customer = new Customer();
     
        shop.readCustomerData();
        
        shop.printAllCustomers();
       
        shop.writeCustomerData();
        
        /**4)*/
//         DateUtil date = new DateUtil();
//       Date date1;
//       Date date2;
// date1.date.convertStringToDate("19/03/2017");
//         date.convertStringToDate("19/03/2017");
    }  
}
