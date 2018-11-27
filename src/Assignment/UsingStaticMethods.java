/********************************************************************
 * Programmer:Zenash Woldeyes
 * 
 * Class:  CS20S
 *
 * Assignment: Static Method 
 * 
 * Description: This program will be given a year and should compute the next 
 *              year with distinct digits, until zero is entered
 * Input: A year should be entered as a string from the keyboard buffer
 * 
 * Output: The next year with distinct digits from the entered number
 **************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.io.*; 					// import file io libraries
 

public class UsingStaticMethods {  // begin class
    
public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin = "";				// string data input from keyboard
    	String strout = "";			// processed info string to be output
    	String bannerForWindow = "";	       // string to print banner to message dialogs
        String value = "";
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
        int startYear = 0;
        int distinctYear = 0;
        
        int duplicates = 0;
        
        
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
        printBanner();           // call printBanner method
        fileBanner(fout);        // call fileBanner method
        bannerForWindow = windowBanner();          // call windowBanner method
        

    // ************************ get input **********************
       
    	prompt = "Enter a Year\n\n";
        
        
        strin = getYear(bannerForWindow, prompt);
        value = (Integer.parseInt(strin) + 1) + "";
        
       
    // ************************ processing ***************************
    
    
    while (getduplicates (value)) {
        value = (Integer.parseInt(value)) + 1 + "";
        }// end while strin no null
    
    //System.out.println(value);
    
    // ************************ print output ****************************
    
    System.out.printf("%15s %20s" , "Start Year:" , "Distinct Year:" + "\n");
    System.out.printf("%15s %21s", strin, value + "\n\n");
    
    JOptionPane.showMessageDialog(null, bannerForWindow + strout);
    
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main

//************************ Static Methods************************
    
    
    /*********************************************************
    *   Purpose: to check if the number has a duplicate
    *   Interface: bannerForWindow ---> ban output banner
    *              prompt ---> prmt input prompt
    *   Returns: an integer value 
    *  ***************************************************************/

    public static boolean getduplicates(String value){
        for(int i = 0 ; i < value.length(); i++)
          for(int j = i + 1; j < value.length(); j++)
              if (value.charAt (i) == value.charAt(j))
            
              return true;
        return false;
              
}
        /*********************************************************
    *   Purpose:get an integer from the keyboard buffer
    *   Interface: bannerForWindow ---> ban output banner
    *              prompt ---> prmt input prompt
    *   Returns: an integer value
    *  ***************************************************************/
    public static String getYear(String ban, String prmt){
        String year;
        
        year = (JOptionPane.showInputDialog(ban + prmt));
        
        return year;    
    }//end get integer
    /*********************************************************
    *   Purpose:Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   Interface: no parameters
    *   Returns: no return
    *  ***************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
        bannerOut = "*******************************************\n";
    	bannerOut += "Name:Zenash.W\n";
    	bannerOut += "Class:CS20S\n";
    	bannerOut += "Assignment:Using Static Methods\n";
    	bannerOut += "*******************************************\n\n";
        
        return bannerOut;
    }//end windowBanner
    
    /*********************************************************
    *   Purpose:print a banner to the output file
    *   Interface: no parameters
    *   Returns: no return
    *  ***************************************************************/
    
    public static void printBanner(){
        System.out.println("*******************************************");
    	System.out.println("Name:Zenash.W");
    	System.out.println("Class:CS20S");
    	System.out.println("Assignment:Using Static Methods");
    	System.out.println("*******************************************");
    } // end print banner
 
    
    
    /*********************************************************
    *   Purpose:print banner to the output file 
    *   Interface: printer writer fout
    *   Returns: no return
    *  ***************************************************************/
    public static void fileBanner(PrintWriter fout){
        fout.println("*******************************************");
    	fout.println("Name:Zenash.W");
    	fout.println("Class:CS20S");
    	fout.println("Assignment: Using Static Methods");
    	fout.println("*******************************************");
    }// end banner out
     static NumberFormatException forInputString(String s) {
        return new NumberFormatException("For input string: \"" + s + "\"");
    }
}  // end class
