/********************************************************************
 * Programmer:Zenash Woldeyes
 * 
 * Class:  CS20S
 *
 * Assignment: Static Method Exercise
 * 
 * Description: Print output banner to the output and file window
 *              Get 2 numbers either integer or floating, and divide,
 *              multiply, add and, subtract the 2 numbers
 * Input: 2 numbers either a floating point or an integer from the keyboard
 *        buffer
 * Output:The 2 numbers should be added,subtracted,multiplied and divided
 *
 **************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class SimpleStaticMethods1 {  // begin class
    
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
        
        double floatOp1 = 0.0;
        double floatOp2 = 0.0;
        
        int sumInteger = 0;
        double sumDouble = 0.0;
        
        int differenceInteger = 0;
        double differenceDouble = 0.0;
        
        int productInteger = 0;
        double productDouble = 0.0;
        
        int quotientInteger = 0;
        double quotientDouble = 0.0;
        
        
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
        printBanner();           // call printBanner method
        fileBanner(fout);        // call fileBanner method
        bannerForWindow = windowBanner(); // call windowBanner method
        

    // ************************ get input **********************

    	prompt = "Enter a number\n\n";	
    	//strin = JOptionPane.showInputDialog(bannerForWindow + prompt);
        
        
        operand1 = getInteger(bannerForWindow, prompt);
        operand2 = getInteger(bannerForWindow, prompt);
        
        floatOp1 = getDouble(bannerForWindow, prompt);
        floatOp2 = getDouble(bannerForWindow, prompt);
        
       
    // ************************ processing ***************************
    
        sumInteger = add(operand1, operand2); // add two integer numbers
        sumDouble += add(floatOp1, floatOp2);  // add two floating point numbers
        
        differenceInteger = subtract(operand1, operand2); // subtarct two integer numbers
        differenceDouble += subtract(floatOp1, floatOp2); // subtract two floating point numbers
        
        productInteger = multiply(operand1, operand2); // multiply two integer numbers
        productDouble += multiply(floatOp1, floatOp2); // multiply floating point numbers
        
        quotientInteger = divide(operand1, operand2); // divide two integer numbers
        quotientDouble += divide(floatOp1, floatOp2); // divide two floating point numbers
     
    // ************************ print output ****************************

    System.out.println(operand1 + " + " + operand2 + " = " + sumInteger);
    System.out.println(floatOp1 + " + " + floatOp2 + " = " + sumDouble);
    
    strout = operand1 + " + " + operand2 + " = " + sumInteger + "\n";
    strout += floatOp1 + " + " + floatOp2 + " = " + sumDouble + "\n";
    
    
    System.out.println(operand1 + " - " + operand2 + " = " + differenceInteger);
    System.out.println(floatOp1 + " - " + floatOp2 + " = " + differenceDouble);
    
    strout += operand1 + " - " + operand2 + " = " + differenceInteger + "\n";
    strout += floatOp1 + " - " + floatOp2 + " = " + differenceDouble + "\n";
    
    
    System.out.println(operand1 + " * " + operand2 + " = " + productInteger);
    System.out.println(floatOp1 + " * " + floatOp2 + " = " + productDouble);
    
    strout += operand1 + " * " + operand2 + " = " + productInteger + "\n";
    strout += floatOp1 + " * " + floatOp2 + " = " + productDouble + "\n";
    
    
    System.out.println(operand1 + " / " + operand2 + " = " + quotientInteger);
    System.out.println(floatOp1 + " / " + floatOp2 + " = " + quotientDouble);
    
    strout += operand1 + " / " + operand2 + " = " + quotientInteger + "\n";
    strout += floatOp1 + " / " + floatOp2 + " = " + quotientDouble + "\n";
    
    
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
    *   Purpose:get add 2 integer values passed through the arg param interface
    *   Interface: operand1 ---> op1 first integer operand
    *              operand2 ---> op2 second integer operand
    *   Returns: sum of op1 + op2 : int
    *  ***************************************************************/
    public static int add(int op1, int op2){
        int sum = 0;
        
        sum = op1 + op2;
        
        return sum;        
    } // end add
    
     /*********************************************************
    *   Purpose:get add 2 floating point values passed
    *               through the arg param interface
    *   Interface: operand1 ---> op1 first double operand
    *              operand2 ---> op2 second double operand
    *   Returns: sum of op1 + op2 : double
    *  ***************************************************************/
    public static double add(double op1, double op2){
        double sum = 0;
        
        sum = op1 + op2;
        
        return sum; 
        }//end add
    
     /*********************************************************
    *   Purpose:get subtract 2 integer values passed through the arg param interface
    *   Interface: operand1 ---> op1 first integer operand
    *              operand2 ---> op2 second integer operand
    *   Returns: sum of op1 - op2 : int
    *  ***************************************************************/
    public static int subtract(int op1, int op2){
        int difference = 0;
        
        difference = op1 - op2;
        
        return difference;        
    } // end difference
    
     /*********************************************************
    *   Purpose:get add 2 floating point values passed through the arg param interface
    *   Interface: operand1 ---> op1 first double operand
    *              operand2 ---> op2 second double operand
    *   Returns: subtract of op1 - op2 : double
    *  ***************************************************************/
    public static double subtract(double op1, double op2){
        double difference = 0;
        
        difference = op1 - op2;
        
        return difference;        
    } // end difference
    
     /*********************************************************
    *   Purpose:get add 2 integer values passed through the arg param interface
    *   Interface: operand1 ---> op1 first integer operand
    *              operand2 ---> op2 second integer operand
    *   Returns: multiply of op1 * op2 : int
    *  ***************************************************************/
    public static int multiply(int op1, int op2){
        int product = 0;
        
        product = op1 * op2;
        
        return product;        
    } // end product
    
    /*********************************************************
    *   Purpose:get multiply 2 floating point values passed through the arg param interface
    *   Interface: operand1 ---> op1 first double operand
    *              operand2 ---> op2 second double operand
    *   Returns: multiply of op1 * op2 : double
    *  ***************************************************************/
    public static double multiply(double op1, double op2){
        double product = 0;
        
        product = op1 * op2;
        
        return product;        
    } // end product
    
    /*********************************************************
    *   Purpose:get divide 2 integer values passed through the arg param interface
    *   Interface: operand1 ---> op1 first integer operand
    *              operand2 ---> op2 second integer operand
    *   Returns: divide of op1 / op2 : int
    *  ***************************************************************/
    public static int divide(int op1, int op2){
        int quotient = 0;
        
        quotient = op1 / op2;
        
        return quotient;        
    } // end quotient
    
    /*********************************************************
    *   Purpose:get divide 2 floating point values passed through the arg param interface
    *   Interface: operand1 ---> op1 first double operand
    *              operand2 ---> op2 second double operand
    *   Returns: divide of op1 / op2 : double
    *  ***************************************************************/
    public static double divide(double op1, double op2){
        double quotient = 0;
        
        quotient = op1 / op2;
        
        return quotient;        
    } // end quotient
    
    //end Static Method
    
     /*********************************************************
    *   Purpose:get an integer from the keyboard buffer
    *   Interface: bannerForWindow ---> ban output banner
    *              prompt ---> prmt input prompt
    *   Returns: an double value
    *  ***************************************************************/
    
    public static double getDouble(String ban, String prmt){
        double n = 0;
        
        n = Double.parseDouble(JOptionPane.showInputDialog(ban + prmt));
        
        return n;    
    }//end get Double
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
    	bannerOut += "Assignment: Static Method\n";
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
    	System.out.println("Assignment:	Static Method");
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
    	fout.println("Assignment: Static Method");
    	fout.println("*******************************************");
    }// end banner out
    
}  // end class
