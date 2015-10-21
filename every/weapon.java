/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;


import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class weapon {
    
    //   spot
    protected int x;  //  topleft
    protected int y;
    protected int directionx;
    protected int directiony;
    
    protected int counter = 0;
    
    protected int firstx;
    protected int firsty;
    
    
    //  stats
    protected int att;
    protected int range; // distance limit
    protected boolean multihit;
    protected boolean active;
    public String name;
    
    //   figure
//    private boolean[] paintable;
//    private Color[] pic;
//    private int width;  // how far sideways
//    private int length;  // how far down
    protected figure fig;
    
    protected boolean hastrigger = false;
    protected boolean newtrigvalue = false;
    protected trigger onhittrig;
    
    
    public boolean melee = true;
    public unit user;
    public boolean hasuser = false;
    public int startuserdistance = 0;
    public int enduserdistance = 0;
    
    
    public weapon( int x, int y, int directionx, int directiony, int attack, int range, boolean multihitable, boolean[] paintable, Color[] picture, int width, int length, int momentx, int momenty )
    {
        
        this.x = x;
        this.y = y;
        
        name = "";
        
        firstx = x;
        firsty = y;
        
        this.directionx = directionx + momentx / 10;
        this.directiony = directiony + momenty / 10;
        
        att = attack;
        this.range = range;
        multihit = multihitable;
        
        
        int temp;
        
        if ( directionx > 0 ) {
            temp = 1;
            this.x += 10;
            firstx += 10;
        }
        else {
            temp = -1;
            this.x -= 10;
            firstx -= 10;
        }
        
        fig = new figure( this.x, this.y, temp, paintable, picture, width, length );
        
        fig.setweapon(this);
        
        active = true;
        
        
    }
    
    public weapon( int x, int y, int directionx, int directiony, int attack, int range, boolean multihitable, boolean[] paintable, Color[] picture, int width, int length, int momentx, int momenty, unit u )
    {
        
        this.x = x;
        this.y = y;
        
        name = "";
        
        firstx = x;
        firsty = y;
        
        this.directionx = directionx + momentx / 10;
        this.directiony = directiony + momenty / 10;
        
        att = attack;
        this.range = range;
        multihit = multihitable;
        
        
        int temp;
        
        if ( directionx > 0 ) {
            temp = 1;
            this.x += 10;
            firstx += 10;
        }
        else {
            temp = -1;
            this.x -= 10;
            firstx -= 10;
        }
        
        fig = new figure( this.x, this.y, temp, paintable, picture, width, length );
        
        fig.setweapon(this);
        
        active = true;
        
        user = u;
        hasuser = true;
    }
    
    
    
    
    public void setx( int x )
    {
        this.x = x;
        
    }
    
    public void sety( int y )
    {
        this.y = y;
    }
    
    public figure getfigure()
    {
        return fig;
    }
    
    
    public boolean checkweap( String s )
    {
        if ( s.equals(name) ) {
            return true;
        }
        return false;
    }
    
    
    public void setpic( boolean[] paintable, Color[] pic )
    {
        fig.setpaintable(paintable);
        fig.setpic(pic);
    }
    
    
    public void setpixel( int x, int y, Color col )
    {
        fig.setpixel(x, y, col);
    }
    
    public void erasepixel( int x, int y )
    {
        fig.erasepixel(x, y);
    }
    
    
    
    public void hitit()
    {
        active = multihit;
        
    }
    
    
    
    public void step( Graphics g )
    {
        if ( !this.active ) {
            return;
        }
        
        counter++;
        
        x += directionx;
        y += directiony;
        
        startuserdistance += Math.abs(directionx);
        
        if ( startuserdistance > enduserdistance ) {
            startuserdistance = enduserdistance;
        }
        
        if ( hasuser && melee ) {
            int temp;
            if ( user.getdir() == 1 ) {
                temp = -1;
            }
            else {
                temp = 1;
            }
            
            
            x = user.getcenterx() + temp * ( user.getfig().getwidth() / 2 - 5 + startuserdistance);
        }
        
        fig.setx(x);
        fig.sety(y);
        
        if ( counter > range / 8 ) {
            active = false;
            return;
        }
        
//        if ( distance( firstx, firsty, x, y ) >= range ) {
//            active = false;
//            return;
//        }
        
        paintit( g );
        
        
        
        
    }
    
    public int getatt()
    {
        return att;
    }
    
    
    
    
    
    public void paintit( Graphics g )
    {
        int dir = 0;
        if ( directionx < 0 ) {
            dir = -1;
        }
        else {
            dir = 1;
        }
        
        fig.paintit(g);
        
//        painter.paint(g, fig);
    }
    
    public boolean getactive()
    {
        return active;
    }
    
    public void setonhittrigger( trigger t, boolean value )
    {
        hastrigger = true;
        onhittrig = t;
        newtrigvalue = value;
    }
    
    
    public void onhittrigger()
    {
        if ( hastrigger ) {
            onhittrig.settrigger(newtrigvalue);
        }
        
        
    }
    
    
}
