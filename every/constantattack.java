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
public class constantattack extends AI{
    
    
    public constantattack()
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
        
        
        
        
        
        if ( act ) {
            person.attack();
            counter = 0;
        }
        
        super.step(g);
        
    }
    
}
