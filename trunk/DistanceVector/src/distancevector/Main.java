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
      //new Menu();
    Parser test =new Parser("C:/Users/Klem/Documents/test.txt");
    test.initialRound();

    }

}
