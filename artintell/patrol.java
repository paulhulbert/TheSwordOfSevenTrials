/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artintell;

import every.unit;
import every.AI;
import every.constants;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class patrol extends AI{
    
    private boolean attacks;
    private int far;
    
    private int startx;
    
    
    public patrol( int how_far, boolean does_attack )
    {
        super( 30 );
        
        far = how_far;
        attacks = does_attack;
        
        
    }
    
    @Override
    public void setperson( unit per )
    {
        super.setperson(per);
        startx = per.getcenterx();
        
        person.goright();
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
        
        if ( person.getcenterx() > startx + far - 30 ) {
            person.stopright();
            person.goleft();
        }
        
        if ( person.getcenterx() < startx + 30 ) {
            person.stopleft();
            person.goright();
        }
        
        
        
        if ( attacks && act ) {
            person.attack();
            counter = 0;
        }
        
        
        super.step(g);
        
    }
    
}


