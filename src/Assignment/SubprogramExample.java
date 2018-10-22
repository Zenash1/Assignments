/********************************************************************
 * Programmer:Zenash Woldeyes
 * 
 * Class:  CS20S
 *
 * Assignment: Method Intro
 * 
 * Description: an introduction to sub programs using static methods 
 *              to encapsulate some simple process.
 *
 **************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class SubprogramExample {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerForWindow = "";			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
        int operand1 = 0;
        int operand2 = 0;
        
        double floatOp1 = 2.25;
        double floatOp2 = 1.75;
        
        int sumInteger = 0;
        double sumDouble = 0;
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

    	prompt = "Enter an Integer\n\n";	
    	
    	//strin = JOptionPane.showInputDialog(bannerForWindow + prompt);
        
        
        operand1 = getInteger(bannerForWindow, prompt);
        operand2 = getInteger(bannerForWindow, prompt);
        
       
    // ************************ processing ***************************
    
        sumInteger = add(operand1, operand2);
        sumDouble = add(floatOp1, floatOp2);
    
    // ************************ print output ****************************

    System.out.println(operand1 + " + " + operand2 + " = " + sumInteger);
    System.out.println(floatOp1 + " + " + floatOp2 + " = " + sumDouble);
    
    strout = operand1 + " + " + operand2 + " = " + sumInteger + "\n";
    strout += floatOp1 + " + " + floatOp2 + " = " + sumDouble + "\n";
    
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
    *   Purpose:get add 2 floating point values passed
    *               through the arg param interface
    *   Interface: operand1 ---> op1 firt double operand
    *              operand2 ---> op2 second double operand
    *   Returns: sum of op1 + op2 : double
    *  ***************************************************************/
    public static double add(double op1, double op2){
        double sum = 0;
        
        sum = op1 + op2;
        
        return sum; 
        }//end add
    /*********************************************************
    *   Purpose:get add 2 integer values passed through the arg param interface
    *   Interface: operand1 ---> op1 firt integer operand
    *              operand2 ---> op2 second integer operand
    *   Returns: sum of op1 + op2 : int
    *  ***************************************************************/
    public static int add(int op1, int op2){
        int sum = 0;
        
        sum = op1 + op2;
        
        return sum;        
    } // end add
    
    
    
     /*********************************************************
    *   Purpose:get an integer from the keyboard buffer
    *   Interface: bannerForWindow ---> ban output banner
    *              prompt ---> prmt input prompt
    *   Returns: an integer value
    *  ***************************************************************/
    
    public static double getDouble(String ban, String prmt){
        int n = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(ban + prmt));
        
        return n;    
    }//end get integer
    /*********************************************************
    *   Purpose:get an integer from the keyboard buffer
    *   Interface: bannerForWindow ---> ban output banner
    *              prompt ---> prmt input prompt
    *   Returns: an integer value
    *  ***************************************************************/
    
    public static int getInteger(String ban, String prmt){
        int n = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(ban + prmt));
        
        return n;    
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
    	bannerOut += "Assignment:Method Intro\n";
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
    	System.out.println("Assignment:	Method Intro");
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
    	fout.println("Assignment:Method Intro");
    	fout.println("*******************************************");
    }// end banner out
    
}  // end class
