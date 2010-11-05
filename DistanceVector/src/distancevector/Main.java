/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package distancevector;

/**
 *
 * @author Klem
 */
import ihm.Menu;
import java.io.FileNotFoundException;

/**
 *
 * @author Klem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      new Menu();
   
    Parser test =new Parser("C:/Users/Klem/Documents/test.txt");
  /*
    test.initialRound();
  
    int[][] matrice = new int[test.getTaille_Matrice()][test.getTaille_Matrice()];
    test.processLineByLine();
    matrice = test.getMatrice();
  

   
   */
   /* test.instantiateMatrice();
    int[][] matrice = test.getMatrice();
     for (int i=0;i<test.getTaille_Matrice();i++){
        for (int j=0;j<test.getTaille_Matrice();j++){
            System.out.print(matrice[i][j]+" ");
        }
        System.out.println("\n");
    }

    */
   }
    

}

