/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.util.ArrayList;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class follower extends AI{
    
    
    public follower()
    {
        super( 7 );
        
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
        
        if ( person.getcenterx() > target.getcenterx() && !inrange() ) {
            person.goleft();
            person.stopright();
        }
        if ( person.getcenterx() < target.getcenterx() && !inrange() ) {
            person.goright();
            person.stopleft();
        }
        
        if ( inrange() ) {
//            person.attack();
            person.stopleft();
            person.stopright();
        }
        
        
        super.step(g);
    }
    
    
    public boolean inrange()
    {
        if ( constants.distance(person.getcenterx(), 0, target.getcenterx(), 0) < 30 ) {
            return true;
        }
        return false;
    }
    
}

