/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class AI {
    
    protected unit person;
    protected unit target;
    
    protected int counter;
    protected int attspeed;
    
    protected boolean block;
    
    public boolean canattack()
    {
        return true;
    }
    
    public boolean canattack2()
    {
        return true;
    }
    
    public void hithard()
    {
        block = true;
    }
    
    
    
    
    public void setreload( int reload )
    {
        
        attspeed = reload;
        
    }
    
    
    public AI( int attspeed )
    {
        counter = 0;
        this.attspeed = attspeed;
        block = false;
    }
    
    public void setperson( unit per )
    {
        person = per;
    }
    
    public void settarget( unit targ )
    {
        target = targ;
    }
    
    public void goright()
    {
        person.goright();
    }
    
    public void goleft()
    {
        person.goleft();
    }
    
    public void stopright()
    {
        person.stopright();
    }
    
    public void stopleft()
    {
        person.stopleft();
    }
    
    
    public unit gettarget()
    {
        return target;
    }
    
    public void step( Graphics g )
    {
        block = false;
        
    }
    
    
    
    
    
}
