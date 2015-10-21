/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class ceiling extends hardblock {
    
    public ceiling( Color col, ArrayList<weapon> weaps ) {
        super( -5, -5, 2000, 50, col, col, false, weaps );
    }
    
}
