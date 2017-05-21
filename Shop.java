import java.util.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * A shop class to read all objects and print all, write 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public class Shop
{
    /** Original fields*/

    private String fileName;    
    private String filePath;  
    public Random randomGenerator;
    private Diary diary;
    private String dumpCustomerDataFileName, dumpItemReservationDataFileName;

    private String name;
    private Map <String, ShopItem> itemsMap;
    private Map <String, Customer> customerMap;
    private Map <String, ShopItemReservation> itemReservationMap ;
    private HashSet<String> numbers;
    // instance variables - replace the example below with your own
    /**
     * Shop Constructor
     *
     */
    public Shop(String name)
    {
        //         itemsList = new ArrayList<ShopItem>(); //Create the arrayList
        //         customerList = new ArrayList<Customer>();
        name = ""; 

        itemsMap = new HashMap<String, ShopItem>();
        customerMap = new HashMap<String, Customer>();
        itemReservationMap = new HashMap<String, ShopItemReservation>();

        numbers = new HashSet<String>();

        fileName = "items_all.txt";
        filePath = "items_all.txt";

        readItemData("items_all.txt");

        dumpCustomerDataFileName = name + "customer_dump.txt";
        dumpItemReservationDataFileName = name + "shop_item_reservation_dump.txt";

    }  

    public void addItemsMap(ShopItem shopItem )
    {
        //add customer to map
        itemsMap.put(shopItem.getItemCode(), shopItem);
    }

    public String generateReservationNo(String prefix, int num)
    {
        //make a new random instance
        Random rand = new Random();
        //new customer instance
        ShopItemReservation res;
        //give n1 & n2 the type cast of int then times the number by the power of 10, minus 1.
        int n1 = (int)(Math.pow(10,num)-1.0);
        int n2 = (int)Math.pow(10,(num-1));
        //give value the "value" of n2 plus a random number. take n1 away from n2
        int value = n2 + rand.nextInt(n1-n2);   
        //give customerId the value of the parametres - prefix and value
        prefix = "";
        String reservationNo  = prefix + value;

        return reservationNo;
    }
    //return String.format("%05d", reservationNo);
    public ShopItemReservation  getReservation(ShopItemReservation res)
    {       
        return res;
    }

    public void makeItemReservation(String customerID, String itemID, 
    String startDate, int noOfDays) 
    {
        ShopItemReservation item = new ShopItemReservation();
        item.getReservationNo();
        
        if (itemReservationMap.containsKey(itemID))
        {            
            ShopItemReservation itemRes = new ShopItemReservation(generateReservationNo("" , 6),
                    itemID,  customerID, startDate ,  noOfDays);
            storeItemReservation(itemRes);
            
            //return true;
        }
        else
        {
            System.out.println("false") ;
            //return false;
        }
    }

    public void storeItemReservation(ShopItemReservation itemRes)
    {
        //add customer to map
        //itemsMap.put(itemRes.getStartDate(), itemRes);
        Diary diary = new Diary();
        itemReservationMap.put(itemRes.getReservationNo(), itemRes);
        diary.addItemReservation(itemRes) 
        
;    }   

    public void addCustomerMap(Customer customer)
    {
        //customer.generateCustomerID("",6);
        String prefix = "AB-";
        int number = 6;

        String customerId = generateCustomerID(prefix,number);
        if (customer.getCustomerId().equals("unknown"))
        {
            while(numbers.contains(customerId))
            {
                customerId = generateCustomerID(prefix,number);
            }
            numbers.add(customerId);
            customer.setCustomerId(generateCustomerID(prefix,number));

        }
        else{ 
            if (customerMap.containsKey(customer.getCustomerId()))
            {
                System.out.println("Id exists");
            }
        }
        customerMap.put(customer.getCustomerId(),customer);
    }

    public String generateCustomerID(String prefix, int num)
    {
        //make a new random instance
        Random rand = new Random();
        //new customer instance
        Customer customer;
        //give n1 & n2 the type cast of int then times the number by the power of 10, minus 1.
        int n1 = (int)(Math.pow(10,num)-1.0);
        int n2 = (int)Math.pow(10,(num-1));
        //give value the "value" of n2 plus a random number. take n1 away from n2
        int value = n2 + rand.nextInt(n1-n2);   
        //give customerId the value of the parametres - prefix and value
        String customerId = prefix + value;
        //checkId(customer);
        return customerId;

        //setCustomerId(customerId);
        //System.out.println(customerId);
    }

    public void getCustomerValue(String id)
    {
        //returns the 
        customerMap.get(id);   
    }

    public void getShopItemValue(String id)
    {
        itemsMap.get(id);   
    }

    public void getItemReservationMap(String reservationNo)
    {
        itemReservationMap.get(reservationNo);   
    }

    public void checkId(Customer customer)
    {
        //get id        
        if (customerMap.containsKey(customer.getCustomerId())) {
            System.out.println("Id exists");
        } else {
            System.out.println("Id doesn't exist");
        }
    }

    /**Print all shop details in a map*/
    public void printItemDetails()
    {
        // display all items
        if(itemsMap != null)
        {
            for(ShopItem item : itemsMap.values()) {      
                item.printDetails();  
                System.out.println();   // empty line between items

            }
        }      
        else
        {
            System.out.println("Nothing to display!");
        }

    }

    /**Print all customers in a map*/
    public void printAllCustomers()
    {
        // display all items
        if(customerMap != null)
        {
            for(Customer customer : customerMap.values()) {      
                customer.printDetails();  
                System.out.println();   // empty line between items
            }
        }      
        else
        {
            System.out.println("No customers to display!");
        }

    }

    public void readItemData()
    {
        Frame myFrame = null; //Set myFrame to null
        FileDialog fileBox = new FileDialog(myFrame, "Open", FileDialog.LOAD);
        fileBox.setVisible(true); //Show dialog box
        String fileName = fileBox.getFile(); //Get the file name
        String directoryPath = fileBox.getDirectory(); //get directory
        if (fileName != null) //Check if file name is null
        {
            System.out.println("You successfully selected "+ fileName); //Print out file name
            System.out.println("File path "+ directoryPath + "\n"); //Print out directory path  
        }
        else
        {
            System.out.println("You cancelled your selection");   
        }
    }

    public void readItemData(String filePath)
    {       
        File inFile = new File(filePath, fileName);

        Scanner scanner = null;
        try{
            scanner = new Scanner(inFile);
        }

        catch(FileNotFoundException ex)//Catches file exceptions
        {
            System.err.println("File not found"); 
        }

        if(scanner==null) //check if scanner is null
        {
            //
        }
        else
        {
            String typeOfData = ""; //set type of data to empty
            while(scanner.hasNext()) //While there is more data to read
            {
                String lineOfText = scanner.nextLine();
                lineOfText = lineOfText.trim();
                Scanner scanner2 = new Scanner(lineOfText); //Makes a new scanner
                scanner2.useDelimiter(",");//Takes away commas in the text file

                if(lineOfText.isEmpty() || lineOfText.startsWith("//"))//Gets rid of spaces and "//"
                {
                    //now there is real data
                    /**check for a flag before continuing*/

                }
                else if(lineOfText.startsWith("[")) //If the line contains "[" DO:
                {
                    //
                    if(lineOfText.equalsIgnoreCase("[electrictool data]"))
                    {
                        typeOfData = "electrictool data";
                    }
                    else if(lineOfText.equalsIgnoreCase("[handtool data]"))
                    {
                        typeOfData = "handtool data";
                    }

                    else if(lineOfText.equalsIgnoreCase("[perishable data]"))
                    {
                        typeOfData = "perishable data";
                    }
                    else if(lineOfText.equalsIgnoreCase("[workwear data]"))
                    {
                        typeOfData = "workwear data";
                    }
                    else
                    {
                        System.out.println("Unexpected flag");
                    }
                }
                else{
                    ShopItem shopItem = null;
                    switch(typeOfData)
                    {
                        /**Tool classes */
                        case "electrictool data": 
                        shopItem = new ElectricTool();
                        break;

                        case "handtool data":
                        shopItem = new HandTool();
                        break;

                        /**Accessory classes */
                        case "perishable data":
                        shopItem = new Perishable();
                        break;

                        case "workwear data":
                        shopItem = new Workwear();
                        break;

                        /**Default value */
                        default:
                        System.out.println("Unexpected data!");
                        break;

                    }
                    shopItem.extractData(scanner2);  
                    //                     addShopItem(shopItem);
                    addItemsMap(shopItem);
                }
                scanner2.close();//Close the second scanner  
            }
            scanner.close(); //Close the first scanner

        }      
    }

    /**Read data from a customer data file*/
    public void readCustomerData()
    {
        Frame myFrame = null; //Set myFrame to null
        FileDialog fileBox = new FileDialog(myFrame, "Open", FileDialog.LOAD);
        fileBox.setVisible(true); //Show dialog box
        String fileName = fileBox.getFile(); //Get the file name
        String directoryPath = fileBox.getDirectory(); //get directory
        if (fileName == null) //Check if file name is null
        {
            System.out.println("You cancelled your selection");
        }
        else
        {
            System.out.println("You successfully selected "+ fileName+"\n"); //Print out file name
            System.out.println("File path "+ directoryPath); //Print out directory path           

        }
    }

    public void readCustomerData(String filePath)
    {      
        File file = new File(filePath, fileName);

        Scanner scanner = null;
        try
        {
            scanner = new Scanner(file);
        }

        catch(FileNotFoundException ex)//Catches file exceptions
        {
            System.err.println("File not found"); 
        }

        if(scanner==null) //check if scanner is null
        {
            //
        }
        else
        {
            while(scanner.hasNext()) //While there is more data to read
            {
                String lineOfText = scanner.nextLine();
                lineOfText = lineOfText.trim();
                Scanner scanner2 = new Scanner(lineOfText); //Makes a new scanner
                scanner2.useDelimiter(",");//Takes away commas in the text file
                if(lineOfText.isEmpty() || lineOfText.startsWith("//"))//Gets rid of spaces and "//"
                {
                    //
                }
                else
                {
                    Customer customer = null;
                    customer = new Customer();
                    customer.extractData(scanner2);                    
                    addCustomerMap(customer);
                }
                scanner2.close();

            }
            scanner.close(); //Close the scanner
            JOptionPane.showMessageDialog(null, "Read successful!\n"+filePath);
        }
    }     

    /**Write data to a new_customer_data*/
    public void writeCustomerData()
    {
        Frame myFrame = null; //Set myFrame to null
        FileDialog fileBox = new FileDialog(myFrame, "Save File", FileDialog.SAVE);
        fileBox.setVisible(true); //Show dialog box
        String fileName = fileBox.getFile(); //Get the file name
        String directoryPath = fileBox.getDirectory(); //get directory
        File file = new File (fileName+directoryPath); 
    }

    public void writeCustomerData(String filePath)
    {

        try
        {
            PrintWriter printWriter = new PrintWriter (filePath);
            printWriter.println("// this is a comment, any lines that start with //");
            printWriter.println("// (and blank lines) should be ignored");
            printWriter.println("");
            printWriter.println("// New customer data");
            printWriter.println("// data is customerID, surname, firstName, otherInitials, title");

            for(Customer customer: customerMap.values()) 
            {
                customer.writeData(printWriter);
            }

            printWriter.close (); 
            JOptionPane.showMessageDialog(null, "You successfully wrote to "+ fileName+"\n"+"File path "+ filePath);
        }

        catch(IOException ex)
        {
            System.out.println("Print writer error!");
        }

    }

    /**Read data from a Item Reservation Data data file*/
    public void readItemReservationData()
    {
        Frame myFrame = null; //Set myFrame to null
        FileDialog fileBox = new FileDialog(myFrame, "Open", FileDialog.LOAD);
        fileBox.setVisible(true); //Show dialog box
        String fileName = fileBox.getFile(); //Get the file name
        String directoryPath = fileBox.getDirectory(); //get directory
        if (fileName == null) //Check if file name is null
        {
            System.out.println("You cancelled your selection");
        }
        else
        {
            System.out.println("You successfully selected "+ fileName+"\n"); //Print out file name
            System.out.println("File path "+ directoryPath); //Print out directory path           

        }
    }

    public void readItemReservationData(String filePath)
    {           
        File file = new File(filePath, fileName);

        Scanner scanner = null;
        try
        {
            scanner = new Scanner(file);
        }

        catch(FileNotFoundException ex)//Catches file exceptions
        {
            System.err.println("File not found"); 
        }

        if(scanner==null) //check if scanner is null
        {
            //
        }
        else
        {
            while(scanner.hasNext()) //While there is more data to read
            {
                String lineOfText = scanner.nextLine();
                lineOfText = lineOfText.trim();
                Scanner scanner2 = new Scanner(lineOfText); //Makes a new scanner
                scanner2.useDelimiter(",");//Takes away commas in the text file
                if(lineOfText.isEmpty() || lineOfText.startsWith("//"))//Gets rid of spaces and "//"
                {
                    //
                }
                else
                {
                    ShopItemReservation itemRes = null;
                    itemRes = new ShopItemReservation();

                    itemRes.extractData(scanner2);                    
                    storeItemReservation(itemRes);
                }
                scanner2.close();

            }
            scanner.close(); //Close the scanner
            JOptionPane.showMessageDialog(null, "Read successful!\n"+filePath);
        }
    }     

    /**Write data to an item reservation file*/
    public void writeItemReservationData()
    {
        Frame myFrame = null; //Set myFrame to null
        FileDialog fileBox = new FileDialog(myFrame, "Save File", FileDialog.SAVE);
        fileBox.setVisible(true); //Show dialog box
        String fileName = fileBox.getFile(); //Get the file name
        String directoryPath = fileBox.getDirectory(); //get directory
        File file = new File (fileName+directoryPath); 
    }

    public void writeItemReservationData(String filePath)
    {        
        try
        {
            PrintWriter printWriter = new PrintWriter (filePath);
            printWriter.println("// this is a comment, any lines that start with //");
            printWriter.println("// (and blank lines) should be ignored");
            printWriter.println("");
            printWriter.println("// New customer data");
            printWriter.println("// data is customerID, surname, firstName, otherInitials, title");

            for(ShopItemReservation itemRes: itemReservationMap.values()) 
            {
                itemRes.writeData(printWriter);
            }

            printWriter.close (); 
            JOptionPane.showMessageDialog(null, "You successfully wrote to "+ fileName+"\n"+"File path "+ filePath);
        }

        catch(IOException ex)
        {
            System.out.println("Print writer error!");
        }

    }

    public void closeDownSystem()
    {
        writeCustomerData();
        writeItemReservationData();
    }

    public void reloadSystem() 
    {
        readCustomerData();
        readItemReservationData();
    }
    
    public void reloadShop() 
    {
        readCustomerData();
        readItemReservationData();
    }

    public void arrayLengths(String typeOfData)
    {
        typeOfData = "";         
        if (typeOfData == "itemsMap")
        {
            itemsMap.size();
        }
        else if (typeOfData == "customerMap")
        {
            customerMap.size();
        }
        else if (typeOfData == "itemReservationMap")
        {
            itemReservationMap.size();
        }        
        else
        {
            System.out.println("Array not found!");
        }
    }

    public void getNumberOfItems()
    {        
//         int hasShopItems = itemsMap.size();
//         if (itemsMap.size() > 0)
//         {
//             itemsMap.size();
//         }
//         else
//         {
//          return false;
//         }
//         return System.out.println(hasShopItems);
// return true;
itemsMap.size();
    }
    
    public boolean getNumberOfCustomers()
    {       
        if (customerMap.size() > 0)
        {
            customerMap.size();
        }
        else
        {
         return false;
        }
        return false;
    }
}


