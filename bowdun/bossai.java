/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowdun;

import every.AI;
import every.trigger;
import every.unit;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class bossai extends AI{
    
    private boolean hit;
    public int dira;
    
    public boolean debug;
    
    public int freezetimer;
    
    public trigger activated;
    
    public bossai( trigger t )
    {
        super( 7 );
        
        freezetimer = 0;
        activated = t;
        hit = false;
        dira = -1;
        
        
        debug = false;
    }
    
    
    public boolean hitback()
    {
        
        if ( freezetimer < 60 ) {
            return true;
        } else {
            return false;
        }
        
//        if ( dira == -1 ) {
//            if ( target.getcenterx() > person.getcenterx() ) {
//                return true;
//            }
//        }
//        
//        if ( dira == 1 ) {
//            if ( target.getcenterx() < person.getcenterx() ) {
//                return true;
//            }
//        }
        
//        return false;
        
    }
    
    @Override
    public unit gettarget()
    {
        return target;
    }
    
    public void hitthis()
    {
        hit = true;
        person.jump();
    }
    
    public void unhit()
    {
        hit = false;
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
        
        if ( person.gety() > 200 && person.gety() < 300 ) {
            person.stopleft();
            person.stopright();
            return;
        }
        
        boolean act = true;
        
        if ( counter < attspeed ) {
            act = false;
            counter++;
        }
        
        
        if ( act /*&& !hit*/ ) {
            person.attack();
            counter = 0;
        }
        
        
        super.step(g);
        
        
        
        if ( freezetimer <= 60 ) {
            freezetimer++;
            person.stopleft();
            person.stopright();
            return;
        }
        
        
        
        if ( person.getcenterx() < 100 && dira == -1 ) {
            
                freezetimer = 0;
                dira = 1;
                person.goright();
            
        }
        if ( person.getcenterx() > 900 && dira == 1 ) {
            
            
            freezetimer = 0;
                dira = -1;
                person.goleft();
        }
        if ( person.getcenterx() < 900 && dira == 1 ) {
            person.goright();
        }
        if ( person.getcenterx() > 100 && dira == -1 ) {
            person.goleft();
        }
        
        
        
        
        
        
        
        
        
    }
    
}
