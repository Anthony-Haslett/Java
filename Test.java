
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
    public void Test1()
    {
        /** 1)Shop test*/

        //Shop shop = new Shop();

        //         shop.readData();

        //         shop.printAllDetailsMap();
    }

    public void Test2()
    {
        /** 2) Customer test (single customer)*/ 

        //         Shop shop = new Shop();

        //         Customer customer = new Customer("","Roberts","John","T","Mr");

        //         shop.addCustomerMap(customer);
        //         shop.printAllCustomers();

        //         JOptionPane.showMessageDialog(null, "Customer Added to Array");
    }

    public void Test3()
    {
        /** 3) Customer test (All customers)*/ 

        Shop shop = new Shop("1");

        Customer customer = new Customer();

        shop.readCustomerData();

        shop.printAllCustomers();

        shop.writeCustomerData();
    }

    public void Test4()
    {
        /**4)*/
        DateUtil date = new DateUtil();
        Date today = DateUtil.convertStringToDate("25-03-2017");
        Date tomorrow = DateUtil.convertStringToDate("28-03-2017");
        System.out.println(DateUtil.daysBetween(today, tomorrow));
    }
}  
