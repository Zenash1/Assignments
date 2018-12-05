/********************************************************************
 * Programmer:	Zenash Woldeyes
 * 
 * Class:  CS20S
 *
 * Assignment: Array Exercise Questions 1 - 5
 *
 * Description: Question 1- a program that will prompt the person to enter 5
 *              numbers and print the number and reverse the number after 
 *              original is printed
 *              Question 2- modify question 1 so that the user is asked to 
 *              to enter the amount of numbers they want
 *              Question 3- In addition to question 2 the user will be asked
 *              what number to print and that number will be printed until
 *              -1 is entered
 *              Question 4- Modify the above so that the user can change 
 *              individual numbers in the list separately
 *              Question 5- in addition to the top, the program should find the
 *              largest and smallest number in the list of numbers
 * 
 * Input: a list of numbers entered by the user
 * 
 * Output: the list of numbers printed and in reverse, print a number chosen by 
 *         the user, the smallest and largest numbers from the list of numbers
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
 

public class Question1to5 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin = "";		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerForWindow;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs
        String nl = System.lineSeparator();

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;        // string array for gathering input
        
        int actualLength = 0;       // actual length of array
        int[] list = new int[100];    // pointer of array
        int index = 0;                // the number shown when entered by the user
        int newNumber = 0;
        
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
        // todo: add a try catch to the creation of the buffered reader
        //BufferedReader fin = new BufferedReader(new FileReader("arrayData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        printBanner();      // call printBanner method
        fileBanner(fout);       // call fileBanner method
        bannerForWindow = windowBanner();
	    	
    // ************************ get input **********************

        actualLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of numbers you want"));
        loadList(list, actualLength);
        //System.out.println(actualLength);
    // ************************ processing ***************************
        
        


    // ************************ print output ****************************
//        System.out.printf("%15s %20s" , "Original:" , "Reverse:" + "\n");
//        System.out.printf("%15s", strin + "\n\n");
       
        System.out.println("Original:");
        printList(actualLength, list) ;
        System.out.println("");
        
        
        System.out.println("Reverse:");
        printReverse(actualLength, list);
        System.out.println("");
        
        System.out.println("The Number you Chose:");
        //index = Integer.parseInt(JOptionPane.showInputDialog("Enter the Position You Want From the List of Numbers You Have Chosen"));
        printIndex(list, index);   
        System.out.println("");
        
        System.out.println("Modified List:");
        changeIndex(list, newNumber);   
        printList(actualLength, list) ;
        System.out.println("");
        
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************
    
    /***********************************************************
    *   Purpose: print the amount of numbers the user has chosen
    *   Interface:  int len --> len: the number entered by the user
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    * **************************************************************/
    public static void loadList(int[] list, int len){
        
        
        for(int i = 0; i < len; i++){
            //System.out.println(list[i]);
            list[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter One Number At A Time"));
        }
        
    } // end printList
    
    /***********************************************************
    *   Purpose: print array of numbers
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    the length of the numbers
    * **************************************************************/
    public static int printList(int len, int[] list){
        for(int i = 0; i < len; i++)
            System.out.print(list[i]);
        
        return len;
    } // end printList
    
    
     /***********************************************************
    *   Purpose: load an array of integers
    *   Interface:  int[] list -->  is the pointer to the array base address
    *               String delim --> delimiter characters
    *   Returns:    int len --> is the actual length of the array
    * **************************************************************/
    public static int loadList(int[] list, String delim){
        int len = 0;
        String strin = "";
        
        strin = JOptionPane.showInputDialog("Enter 5 Numbers");
        
        String[] tokens = strin.split(delim);
        
        len = tokens.length;        // get number of vlaues to be added to array
        System.out.println(len);
        for(int i = 0; i < len; i++){
            list[i] = Integer.parseInt(tokens[i]);
        } // end for int i = 0
            
        return len;
    } // end loadList
    
     /***********************************************************
    *   Purpose: print array in reverse
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    * **************************************************************/
    public static int printReverse(int len, int[] list){
        for(int i = len - 1; i >= 0; i--){
            System.out.print(list[i]);

        }
       
        return len;
    } // end print reverse
    
    /***********************************************************
    *   Purpose: print the number the user has chosen
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    * **************************************************************/
    
    public static int printIndex(int[] list, int index){
       int i = index;
            
  index = Integer.parseInt(JOptionPane.showInputDialog("Enter the Position You Want From the List of Numbers You Have Chosen"));
            while (index != -1){
                
                System.out.print(list[index]);
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter another Position You Want From the List of Numbers You Have Chosen; enter -1 to quit"));
        }//end while index != -1
        
        return index;
     
    } // end print index
    
    
    /***********************************************************
    *   Purpose: print the number the user has chosen
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    * **************************************************************/
    
    public static void changeIndex(int[] list, int newNumber){
       //int i = index;
       int index = 0;
            
  index = Integer.parseInt(JOptionPane.showInputDialog("Enter the Position of the Number You Want to Change, -1 to quit"));
  
            while (index != -1){
                    newNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your new Number")); 
                    list[index] = newNumber;
                    
                    //System.out.println(newNumber);
                index = Integer.parseInt(JOptionPane.showInputDialog("Do You Want to Change a New Number, -1 to quit"));
                
        }//end while index != -1
        
     
    } // end print index
    
    
 /***********************************************************
    *   Purpose: Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:Zenash Woldeyes\n";
    	bannerOut += "Class:CS20S\n";
    	bannerOut += "Assignment: Array 1to5\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(){
    	System.out.println("*******************************************");
    	System.out.println("Name:Zenash Woldeyes");
    	System.out.println("Class:CS20S");
    	System.out.println("Assignment:Array 1to5");
    	System.out.println("*******************************************");        
    } // end print banner
    
 //yes,
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout){
     	fout.println("*******************************************");
    	fout.println("Name:Zenash Woldeyes");
    	fout.println("Class:CS20S");
    	fout.println("Assignment:Array 1to5");
    	fout.println("*******************************************");       
    } // end bannerOut


}  // end class
