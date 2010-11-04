/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihm;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Noël ETOUNDI
 */
public class TxtFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        String s="";
        return f.getName().toLowerCase().endsWith(".txt")||f.isDirectory();
    }

    @Override
    public String getDescription() {
        return ".txt";
    }

}
