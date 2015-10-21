/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artintell;

import every.*;
import java.util.ArrayList;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class nearbyattack extends AI{
    
    
    public nearbyattack()
    {
        super( 30 );
        
    }
    
    @Override
    public boolean canattack()
    {
        
        
        if ( counter == attspeed ) {
            counter = 0;
            return true;
            
        }
        
        
        
        
        return false;
    }
    
    @Override
    public void step( Graphics g )
    {
        if ( target.getdead() ) {
            person.stopleft();
            person.stopright();
            return;
        }
        
        
        boolean act = true;
        
        if ( counter < attspeed ) {
            act = false;
            counter++;
        }
        
        
        
//        counter++;
//        if ( counter >= attspeed ) {
//            counter = 0;
//            act = true;
//        }
        
        
        
        if ( constants.distance(target.getcenterx(), 0, person.getcenterx(), 0) < 70 && act ) {
            person.attack();
        }
        
        super.step(g);
        
    }
    
}

