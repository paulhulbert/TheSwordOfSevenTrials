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
public class wall_left extends hardblock {
    
    public wall_left( Color col, ArrayList<weapon> weaps ) {
        super( -5, -5, 30, 1505, col, col, false, weaps );
    }
    
}
