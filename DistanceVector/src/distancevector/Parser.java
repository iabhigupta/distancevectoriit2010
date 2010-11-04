/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package distancevector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Klem
 */
public class Parser {
  /**
   Constructor.
   @param aFileName full name of an existing, readable file.
  */

  private int taille_Matrice;

  private final File fFile;

  public Parser(String aFileName){
    fFile = new File(aFileName);
  }

  /** Template method that calls {@link #processLine(String)}.  */
  public final void processLineByLine() throws FileNotFoundException {
    //Note that FileReader is used, not File, since File is not Closeable
    Scanner scanner = new Scanner(new FileReader(fFile));
    try {
      //first use a Scanner to get each line
      while ( scanner.hasNextLine() ){
        processLine( scanner.nextLine() );
      }
    }
    finally {
      //ensure the underlying stream is always closed
      //this only has any effect if the item passed to the Scanner
      //constructor implements Closeable (which it does in this case).
      scanner.close();
    }
  }

public final void initialRound() throws FileNotFoundException{
     Scanner scanner = new Scanner(new FileReader(fFile));
     int k=0;
     try {
      //first use a Scanner to get each line
      while ( scanner.hasNextInt() ){
      k++;
       System.out.println("Number found:"+scanner.nextInt()+ "Number of ints"+ k);
      }}

     finally {
      //ensure the underlying stream is always closed
      //this only has any effect if the item passed to the Scanner
      //constructor implements Closeable (which it does in this case).
      scanner.close();
    }
   if (Math.floor(java.lang.Math.sqrt(k))==java.lang.Math.sqrt(k))
   {this.taille_Matrice= (int) java.lang.Math.sqrt(k);}
   else
   {
   //Some message in the ihm.
         ;
   }
}
  /**
   Overridable method for processing lines in different ways.

   <P>This simple default implementation expects simple name-value pairs, separated by an
   '=' sign. Examples of valid input :
   <tt>height = 167cm</tt>
   <tt>mass =  65kg</tt>
   <tt>disposition =  "grumpy"</tt>
   <tt>this is the name = this is the value</tt>
  */
  protected void processLine(String aLine){
    //use a second Scanner to parse the content of each line
    Scanner scanner = new Scanner(aLine);
    int k=0;
    if ( scanner.hasNext() ){
    k++;

      
    
      
      
      /*  log("Name is : " + quote(name.trim()) + ", and Value is : " + quote(value.trim()) );
    }
    else {
      log("Empty or invalid line. Unable to process.");
    }
    //no need to call scanner.close(), since the source is a String
 */
    }}

 

  private static void log(Object aObject){
    System.out.println(String.valueOf(aObject));
  }

  private String quote(String aText){
    String QUOTE = "'";
    return QUOTE + aText + QUOTE;
  }
}

