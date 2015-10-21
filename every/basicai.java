/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JOptionPane;
/**
 *
 * @author Dad
 */
public class basicai extends AI{
    
    
    private int platx;
    private boolean targplat;
    
    public basicai()
    {
        super( 7 );
        
        
        platx = 0;
        targplat = false;
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
    
    
    
    public void jumping()
    {
        boolean gopast = false;
        
        if ( person.getmomenty() == 0 && target.getmomenty() == 0 && person.getcurrentplat() == target.getcurrentplat() ) {
            targplat = false;
            return;
        }
        
        
        if ( person.gety() + person.getfig().getlength() < target.gety() + target.getfig().getlength() ) {
            targplat = false;
            return;
        }
        
        
        if ( person.getroom().getnearestplatx(person) == -1 || person.getroom().getnearestplaty(person) > person.gety() + person.getfig().getlength() ) {
            person.stopleft();
            person.stopright();
            return;
        }
        
        if ( person.getcurrentplat() == -1 && person.getmomenty() == 0 ) {
            
            if ( person.gety() + person.getfig().getlength() > person.getroom().getnearestplaty(person) && person.getroom().getnearestplaty(person) != -1 ) {
                gopast = true;
            }
            else {
                person.stopleft();
                person.stopright();
            }
            
            
        }
        
        if ( constants.cheatbool ) {
//            constants.cheatbool = false;
//            JOptionPane.showMessageDialog(null, " " + person.gety() + ", " + person.getroom().getnearestplaty(person));
        }
        
        if ( person.getcurrentplat() == -1 && !gopast ) {
            return;
        }
        
        if ( target.getcurrentplat() == -1 || target.getcurrentplat() == person.getcurrentplat() ) {
            targplat = false;
            return;
        }
        
        int cx = -1;
        if ( target.getcurrentplat() != -1 && target.getcurrentplat() != 0 && target.getcurrentplat() != person.getcurrentplat() ) {
            cx = person.getroom().getnearestplatx(person);
            
        }
        else {
            targplat = false;
        }
        
        if ( cx == 1 ) {
            targplat = false;
            return;
        }
        else {
            targplat = true;
            platx = cx;
        }
        
        
        if ( constants.distance(platx, 0, person.getcenterx(), 0) < 70 && cx != -1 ) {
            person.jump();
        }
        
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
        
        
        
        if ( block ) {
            person.jump();
        }
        
        
        if ( targplat ) {
            
            
            if ( person.getcenterx() > platx ) {
                person.goleft();
                person.stopright();
            }
            if ( person.getcenterx() < platx ) {
                person.goright();
                person.stopleft();
            }
            
            
            
        }
        else {
            
                if ( person.getcenterx() > target.getcenterx() && !person.inrange(target) ) {
                    person.goleft();
                    person.stopright();
                }
                if ( person.getcenterx() < target.getcenterx() && !person.inrange(target) ) {
                    person.goright();
                    person.stopleft();
                }
            
            
        }
        
        
        
        
        if ( person.inrange(target) ) {
//            person.attack();
            person.stopleft();
            person.stopright();
//            person.setmomentx(0);
        }
        
        if ( person.inrange(target) && act ) {
            person.attack();
            counter = 0;
        }
        
        jumping();
        
        
        super.step(g);
        
    }
    
}
