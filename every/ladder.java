/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class ladder extends platform {
    
    protected ImageIcon ladder;
    
    public ladder( int x, int ybase, int wide, int tall, Color col, boolean step, ArrayList<weapon> weapons, room r )
    {
        super( x, ybase, wide, tall, col, step, weapons );
        
        this.setWarppoint(r);
        this.setWarps(true);
        this.setWarpx(x);
        this.setWarpy(ybase - constants.taldoheight());
    }
    
    
    
    
}

