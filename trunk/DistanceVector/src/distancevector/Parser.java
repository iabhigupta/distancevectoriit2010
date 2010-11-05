/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package distancevector;

import ihm.Menu;
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
  private Menu menu;
  private final File fFile;
  private int[][] matrice;

  public Parser(String aFileName){
    fFile = new File(aFileName);
  }



    public int[][] getMatrice() {
        return matrice;
    }

    public int getTaille_Matrice() {
        return taille_Matrice;
    }

public final void initialRound() throws FileNotFoundException{
     Scanner scanner = new Scanner(new FileReader(fFile));
     int k=0;
     try {
      //first use a Scanner to get each line
      while ( scanner.hasNextInt() ){
      k++;
       System.out.println("Number found:"+scanner.nextInt()+ "Number of ints"+ k);
      }
     


   if (Math.floor(java.lang.Math.sqrt(k))==java.lang.Math.sqrt(k))
   {
       System.out.println("Ok taille matrice");
       this.taille_Matrice= (int) java.lang.Math.sqrt(k);
   matrice = new int[this.taille_Matrice][this.taille_Matrice];
   }
   else
   {
          System.out.println(" PAs Ok taille matrice");
   menu.invalidFile();         
   } 
     }
      finally {
      //ensure the underlying stream is always closed
      //this only has any effect if the item passed to the Scanner
      //constructor implements Closeable (which it does in this case).
      scanner.close();
    }



}



  /** Template method that calls {@link #processLine(String)}.  */
  public final void processLineByLine() throws FileNotFoundException {
    //Note that FileReader is used, not File, since File is not Closeable
    Scanner scanner = new Scanner(new FileReader(fFile));
    int lineNumber=0;
    try {
      //first use a Scanner to get each line
      while ( scanner.hasNextLine() ){
          System.out.println("Ligne number" + lineNumber);
        processLine( scanner.nextLine(), lineNumber);
        lineNumber++;
      }
    }
    finally {
      //ensure the underlying stream is always closed
      //this only has any effect if the item passed to the Scanner
      //constructor implements Closeable (which it does in this case).
      scanner.close();
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
  protected void processLine(String aLine, int lineNumber){
    //use a second Scanner to parse the content of each line
    Scanner scanner = new Scanner(aLine);
    int columnNumber=0;
    while ( scanner.hasNextInt() ){
    matrice[lineNumber][columnNumber]=scanner.nextInt();
    System.out.println("element " + lineNumber +", " + columnNumber +": "+ matrice[lineNumber][columnNumber]);
    columnNumber++;
   
    }}


}

