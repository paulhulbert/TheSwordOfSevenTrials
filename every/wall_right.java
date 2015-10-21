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
public class wall_right extends hardblock {
    
    public wall_right( Color col, ArrayList<weapon> weaps ) {
        super( constants.right_of_screen - 25, -5, 100, 1505, col, col, false, weaps );
    }
    
}
