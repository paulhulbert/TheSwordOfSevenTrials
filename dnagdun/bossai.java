/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;

import every.AI;
import every.trigger;
import every.constants;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JOptionPane;
/**
 *
 * @author Dad
 */
public class bossai extends AI{
    
    
    private trigger activated;
    
    public bossai( trigger t )
    {
        super( 7 );
        
        
        activated = t;
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
        
        if ( target.getdead() || !activated.gettrigger() ) {
            person.stopleft();
            person.stopright();
            return;
        }
        
        
        boolean act = true;
        
        if ( counter < attspeed ) {
            act = false;
            counter++;
        }
        
        
        
        if ( act ) {
            person.attack();
            counter = 0;
        }
        if ( person.gety() > 100 ) {
            person.jump();
        }
        if ( person.getcenterx() < 200 ) {
            person.goright();
            person.stopleft();
            
        }
        if ( person.getcenterx() > 1000 ) {
            person.goleft();
            person.stopright();
        }
        
        
        super.step(g);
        
    }
    
}
