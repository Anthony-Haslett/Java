import java.util.*;
import java.awt.*;
import java.io.*;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DraftCode
{
    // instance variables - replace the example below with your own
    private String one;
    private String two;

    /**
     * Constructor for objects of class Test
     */
    public DraftCode()
    {
        one = "one";
        two = "two";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod()
    {
        System.out.printf("%s, %s", "one", "two");
    }

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
            System.out.println("You successfully selected "+ fileName); //Print out file name
            System.out.println("File path "+ directoryPath); //Print out directory path           

        }

        File file = new File(directoryPath, fileName);

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

            }

        }
        scanner.close(); //Close thr scanner
    }      
}

