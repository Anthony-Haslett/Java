 import java.util.*;
import java.awt.*;
import java.io.*;

/**
 * Write a description of class Customer here.
 * 
 * @author (Anthony Haslett) 
 * @version (Part 3)
 */
public class Customer
{
    private String customerId;
    private String surname;
    private String firstName;
    private String otherInitials;
    private String titles;

    public Customer(String customerId, String surname, String firstName, String otherInitials, String titles)
    {
        this.customerId = "unknown";
        this.surname = surname;
        this.firstName = firstName;
        this.otherInitials = otherInitials;
        this.titles = titles;
    }

    public Customer()
    {

    }

    public void printDetails()
    {
        /**Get super details*/        
        //super.printDetails();

        System.out.printf("%-25s %-15s \n","Customer ID: ",customerId);
        System.out.printf("%-25s %-15s \n","Surname: ",surname);
        System.out.printf("%-25s %-15s \n","First Name: ",firstName);
        System.out.printf("%-25s %-15s \n","Other Initials: ",otherInitials);
        System.out.printf("%-25s %-15s \n","Titles: ",titles);
    }

    public void extractData(Scanner scanner2)
    {
        customerId = scanner2.next(); 
        surname = scanner2.next(); 
        firstName = scanner2.next(); 
        otherInitials = scanner2.next(); 
        titles = scanner2.next(); 
        //super.extractData(scanner2);
    }

    public void writeData(PrintWriter printWriter)
    {              
        printWriter.println(getCustomerId()+","+getSurname()+","+getFirstName()+","+getOtherInitials()+","+getTitles());
    }

    
    
    /**Get methods*/
    public String getCustomerId()
    {
        return customerId;   
    }

    public String getSurname()
    {
        return surname;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getOtherInitials()
    {
        return otherInitials;
    }

    public String getTitles()
    {
        return titles;
    }

    /**Set methods*/
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;   
    }

    public void setSurname()
    {
        surname=surname;
    }

    public void setFirstName()
    {
        firstName=firstName;
    }

    public void setOtherInitials()
    {
        otherInitials=otherInitials;
    }

    public void setTitles()
    {
        titles=titles;
    }

}
