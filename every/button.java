/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class button extends hardblock {
    
    private boolean pressed;
    private int firstx;
    private trigger lock;
    
    private boolean on_push;
    
    private room r;
    
    public button( int x, int ybase, int height, Color col, ArrayList<weapon> weap, trigger trig, room r, boolean on_push )
    {
        super( x, ybase - height, 50, height, col, Color.WHITE, false, weap );
        
        pressed = false;
        
        firstx = x;
        
        lock = trig;
        
        this.r = r;
        
        this.on_push = on_push;
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        
        if ( lock.gettrigger() != on_push ) {
            unlock();
        }
        else {
            lock();
        }
        
//        locker( lock.gettrigger() );
        
        int q = r.getmainchar().getcurrentplat();
        
        if ( q != -1 ) {
            
            platform w = r.getterrainat(q);
            if ( w == this ) {
                lock();
            }
        }
        
        
        
        platform w;
        
        for ( int c = 0; c < r.bags.size(); c++ ) {
            q = r.bags.get(c).getcurrentplat();
            if ( q != -1 ) {
            
            w = r.getterrainat(q);
            if ( w == this ) {
                lock();
            }
        }
            
        }
        
        
        for ( int c = 0; c < r.neutral.size(); c++ ) {
            q = r.neutral.get(c).getcurrentplat();
            if ( q != -1 ) {
            
            w = r.getterrainat(q);
            if ( w == this ) {
                lock();
            }
        }
            
        }
        
        
        
    }
    
    
    @Override
    public void lock()
    {
        if ( !pressed ) {
            x = -999;
        }
        pressed = true;
        lock.settrigger(on_push, r.getpanel());
        
    }
    
    @Override
    public void unlock()
    {
        if ( pressed ) {
            x = firstx;
        }
        pressed = false;
        lock.settrigger(!on_push, r.getpanel());
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

