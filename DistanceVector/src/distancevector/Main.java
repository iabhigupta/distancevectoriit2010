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
     // new Menu("CS 542 Project: DV algorithm     ");
        int [][] matrix = {
			{0, 2, 5, 1, -1, -1},
			{2, 0, 3, 2, -1, -1},
			{5, 3, 0, 3, 1, 5},
			{1, 2, 3, 0, 1, -1},
			{-1, -1, 1, 1, 0, 2},
			{-1, -1, 5, -1, 2, 0},
			};
DistanceVector test= new DistanceVector(matrix);
PrintShortestPath test2 = new PrintShortestPath(matrix, test);
int [] test3= test2.getPath();

String path = "";
System.out.println("Impression Path");
int k=0;
   while (test3[k]!=0){
    path = path+ " - " + String.valueOf(test3[k]);
    k++;
    // System.out.println(test3[k]);

}
System.out.println(path);

//int [][] matrix2 = test2.fillMatrix(test.getNode(), matrix);
//matrix=test.matrixForIhm(matrix, test.getNode());
/*

System.out.println("Taille de la matrice: " +matrix2.length );
for (int i=0;i<matrix2.length;i++){
  for (int j=0;j<matrix2.length;j++){
      System.out.print(matrix2[i][j]);
  }
  System.out.println("Fin de ligne");
}
*/
      /* Code pour récupérer la matrice générée par le parser
    Parser test =new Parser("C:/Users/Klem/Documents/test.txt");
    test.instantiateMatrice();
    int[][] matrice = test.getMatrice();
    */
    
   }
    

}

