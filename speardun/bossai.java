/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

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
    
    
    private int targetdir;
    
    private trigger activated;
    
    private int typeattack;
    
    public bossai( trigger t )
    {
        super( 7 );
        
        targetdir = 0;
        
        activated = t;
        
        typeattack = 0;
    }
    
    
    public void sendleft()
    {
        targetdir = -1;
        
        
    }
    
    public void sendright()
    {
        targetdir = 1;
        
    }
    
    public void plant()
    {
        targetdir = 0;
        
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
        
        if ( targetdir != 0 ) {
            
            person.jump();
            
            if ( targetdir == -1 ) {
                person.goleft();
            } else {
                person.goright();
            }
            
            
        } else {
            person.stopleft();
            person.stopright();
        }
        
        
        if ( person.getdir() == 2 && targetdir == 0 ) {
            if ( person.getx() > 400 ) {
                person.goleft();
            }
        }
        
        if ( person.getdir() == 1 && targetdir == 0 ) {
            if ( person.getx() < 400 ) {
                person.goright();
            }
        }
        
        
        
        
        if ( act && targetdir == 0 ) {
            
            if ( typeattack % 4 != 0  ) {
                
                person.attack2();
                
            }
            if ( typeattack % 4 == 0 ) {
                person.attack();
            }
            counter = 0;
            
            typeattack++;
            
            
        }
        
        
        super.step(g);
        
    }
    
}
