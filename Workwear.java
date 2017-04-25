import java.util.*;
import java.io.*;
/**
 * A subclass used to represent workwear items
 * 
 *  @author (Anthony Haslett group 1) 
 *  @version (Part 3)
 */
public class Workwear extends Accessory

{
    private String manufactureStandard; 
    private String colour; 
    private char size;
    //     public Workwear() 
    //     {
    //         super("");
    //         manufactureStandard = "";
    //         colour = "";
    //         size = '\u0000';
    //     }
    public Workwear() 
    {
        super();
    }

    public void extractData(Scanner scanner2)
    {
        manufactureStandard= scanner2.next(); 
        colour = scanner2.next(); 
        size= scanner2.next().charAt(0); 
        super.extractData(scanner2);
    }

    public void printDetails()
    {
        super.printDetails();
        System.out.printf("%-25s %-15s \n","Manufacturing standard: ",manufactureStandard);
        System.out.printf("%-25s %-15s \n","Colour: ",colour);
        System.out.printf("%-25s %-15s \n","Size: ",size);
    }

    /** Get methods*/
    public String getManufactureStandard()
    {
        return manufactureStandard;
    }

    public String getColour()
    {
        return colour;
    }

    public char getSize()
    {
        return size;
    }

}
