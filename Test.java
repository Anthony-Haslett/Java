
/**
 * A class to test project objects
 * 
 * @author (Anthony Haslett) 
 * @version (Part 3)
 */
public class Test
{
    public Test()
    {
        /** Shop test*/
        Shop shop = new Shop();
        //         shop.readData();
        //         shop.printAllDetailsMap();
        /** Customer test*/   
        Customer customer = new Customer("","Roberts","John","T","Mr");
        shop.addCustomerMap(customer);

        shop.printAllCustomers();
        System.out.println("--- Customer Added to Array \n");
        shop.readCustomerData();
        shop.printAllCustomers();
        shop.writeCustomerData();
    }  
}