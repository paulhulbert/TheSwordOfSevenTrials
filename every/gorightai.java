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
public class gorightai extends AI{
    
    
    public gorightai()
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
        if ( person.getcenterx() > 3000 ) {
            person.stopright();
        } else {
            person.goright();
        }
        
        super.step(g);
        
    }
    
}

