/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class noai extends AI {
    
    public noai()
    {
        super( 7 );
    }
    
    @Override
    public boolean canattack()
    {
        
        
        if ( counter >= attspeed ) {
            counter = 0;
            return true;
            
        }
        
        
        
        
        return false;
    }
    
    
    @Override
    public void step( Graphics g )
    {
        if ( counter < attspeed ) {
            counter++;
            
        }
        
        super.step(g);
        
    }
}
