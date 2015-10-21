/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class lockwall extends hardblock {
    
    private boolean locked;
    private int firstx;
    private trigger lock;
    private jpanel1 panel;
    
    public lockwall( int x, int ybase, int height, Color col, Color border, ArrayList<weapon> weap, trigger trig, jpanel1 panel1 )
    {
        super( x, ybase - height, 50, height, col, border, false, weap );
        
        locked = true;
        
        firstx = x;
        
        lock = trig;
        
        panel = panel1;
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        locker( lock.gettrigger( panel ) );
        
    }
    
    
    @Override
    public void lock()
    {
        if ( !locked ) {
            x = firstx;
        }
        locked = true;
        
    }
    
    @Override
    public void unlock()
    {
        if ( locked ) {
            x = -999;
        }
        locked = false;
    }
    
    @Override
    public void locker( boolean is_locked )
    {
        if ( is_locked ) {
            lock();
        }
        else {
            unlock();
        }
    }
    
}
