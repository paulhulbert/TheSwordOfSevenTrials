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
public class platform {
    
    public boolean isladder = false;
    
    public boolean ishardblock;
    
    private boolean ignoreai;
    
    private ArrayList<weapon> weapons;
    
    private room warppoint;
    private boolean warps;
    
    private int lastx;
    private int lasty;
    
    protected int wide;
    protected int tall;
    
    protected int x;
    protected int y;
    
    protected Color color;
    private boolean step;
    
    private boolean solid;
    
    private int warpx;
    private int warpy;
    
    
    private int xmove;
    private int ymove;
    private int cycle;
    
    private String weap;
    
    public platform( int x, int y, int wide, int tall, Color col, boolean step, ArrayList<weapon> weapons )
    {
        this.x = x;
        this.y = y;
        this.wide = wide;
        this.tall = tall;
        color = col;
        this.step = step;
        
        solid = true;
        warps = false;
        
        lastx = x;
        lasty = y;
        
        xmove = 0;
        ymove = 0;
        this.weapons = weapons;
        
        ignoreai = false;
        ishardblock = false;
    }
    
    public void unlock()
    {
        
    }
    
    public void lock()
    {
        
    }
    
    public void locker( boolean is_locked )
    {
        
    }
    
    public void drawladder( Graphics g )
    {
        
    }
    
    public void setignoreai( boolean b )
    {
        ignoreai = b;
        
    }
    
    public boolean getignoreai()
    {
        return ignoreai;
    }
    

    public room getWarppoint() {
        return warppoint;
    }

    public void setWarppoint(room warppoint) {
        this.warppoint = warppoint;
    }

    public boolean isWarps() {
        return warps;
    }

    public void setWarps(boolean warps) {
        this.warps = warps;
    }

    public int getWarpx() {
        return warpx;
    }

    public void setWarpx(int warpx) {
        this.warpx = warpx;
    }

    public int getWarpy() {
        return warpy;
    }

    public void setWarpy(int warpy) {
        this.warpy = warpy;
    }
    
    

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }
    
    
    
    public void makestep( int xmove, int ymove, int cycle, String weap )
    {
        this.xmove = xmove;
        this.ymove = ymove;
        this.cycle = cycle;
        this.weap = weap;
    }
    
    
    public void step( Graphics g )
    {
        
        
        
        x += xmove;
        y += ymove;
        
        draw(g);
        
        if ( !this.step ) {
            return;
        }
        
        
        if ( distance( lastx, lasty, x, y ) >= cycle )
        {
            xmove *= -1;
            ymove *= -1;
            lastx = x;
            lasty = y;
            if ( weap != null ) {
                if ( weap.equals("fireball")) {
                    weapons.add(new fireball( x, y, 1, 0, 0));
                }
                if ( weap.equals("fireballup")) {
                    weapons.add(new firevil.fireballup( x, y, 1, 0, 0));
                }
                if ( weap.equals("fireballdown")) {
                    weapons.add(new firevil.fireballdown( x, y, 1, 0, 0));
                }
                
            }
        }
        
    }
    
    private int distance( int x1, int y1, int x2, int y2 )
    {
        
        return ( int ) Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ));
        
        
    }
    
    
    public boolean getstep()
    {
        return step;
    }
    
    public void setstep( boolean value )
    {
        step = value;
    }
    
    
    public int getcenterx()
    {
        return x + wide / 2;
    }
    
    
    
    
    
    
    public void draw( Graphics g )
    {
        g.setColor(color);
        g.fillRect(x, y, wide, tall);
        
        drawover(g);
    }
    
    public void drawover( Graphics g )
    {
        
    }
    
    public void inplatform( unit u )
    {
        
        
        
    }
    
    
    public int getx1()
    {
        return x;
    }
    
    public int getx2()
    {
        return x + wide;
    }
    
    public int getlength()
    {
        return tall;
    }
    
    public int gety()
    {
        return y;
    }
    
    public int getstepx()
    {
        return xmove;
    }
    
    public int getstepy()
    {
        return ymove;
    }
    
    
    
    public void setx( int x )
    {
        this.x = x;
    }
    
    public void sety( int y )
    {
        this.y = y;
    }
    
    
    public void setwidth( int width )
    {
        this.wide = width;
    }
    
    public void setheight( int height )
    {
        this.tall = height;
    }
    
    
    
    
}
