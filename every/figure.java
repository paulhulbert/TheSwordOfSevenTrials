/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;



/**
 *
 * @author Dad
 */
public class figure {
    
    //  figure
    private int x;
    private int y;
    private int dir;
    private boolean[] paintable;
    private Color[] pic;
    private int width; // sideways
    private int length;  // down
    
    private unit person;
    private weapon weap;
    
    private boolean isweap;
    
    private int formerdir;
    
    
    private int rednum = 10;
    
    
    public void redit()
    {
        if ( rednum >= 10 ) {
            rednum = 0;
        }
        
    }
    
    public void unred()
    {
        rednum = 10;
    }
    
    
    public void setpixel( int x, int y, Color col )
    {
        paintable[ y * width + x ] = true;
        pic[ y * width + x ] = col;
    }
    
    public void erasepixel( int x, int y )
    {
        if ( x < 0 && x >= width ) {
            return;
        }
        if ( y < 0 && y >= length ) {
            return;
        }
        paintable[ y * width + x ] = false;
        pic[ y * width + x ] = null;
    }
    
    public void setpic( Color[] picture )
    {
        pic = picture;
    }
    
    public void setpaintable( boolean[] paintable )
    {
        this.paintable = paintable;
    }
    
    public void paintit( Graphics g )
    {
        if ( rednum < 10 ) {
            rednum++;
        }
        
        if ( rednum < 6 ) {
            painter.paint(g, this, true);
            return;
        }
        
        painter.paint(g, this);
        
    }
    
    public void setx( int x )
    {
        this.x = x;
        if ( person != null ) {
            person.setx(x);
        }
        if ( weap != null ) {
            weap.setx(x);
        }
    }
    
    public void sety( int y )
    {
        this.y = y;
        if ( person != null ) {
            person.sety(y);
        }
        if ( weap != null ) {
            weap.sety(y);
        }
    }
    
    public void setdir( int dir )
    {
        this.dir = dir;
    }
    
    
    public Color[] getpic()
    {
        return pic;
    }
    
    public int getlength()
    {
        return length;
    }
    
    public int getwidth()
    {
        return width;
    }
    
    public boolean[] getpaintable()
    {
        return paintable;
    }
    
    public boolean getpaintableat( int x, int y )
    {
        return paintable[ y * width + x];
    }
    
    public void setwidth( int w )
    {
        width = w;
    }
    
    public void setlength( int l )
    {
        length = l;
    }
    
    
    public int getdir()
    {
        return dir;
    }
    
    public int getx()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
    public int getformerdir()
    {
        return formerdir;
    }
    
    public void setformerdir( int dir )
    {
        formerdir = dir;
    }
    
    public void setperson( unit person )
    {
        this.person = person;
    }
    
    public void setweapon( weapon weap )
    {
        this.weap = weap;
        isweap = true;
    }
    
    public boolean getisweap()
    {
        return isweap;
    }
    
    
    public figure( int x, int y, int dir, boolean[] paintable, Color[] pic, int width, int length )
    {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.paintable = paintable;
        this.pic = pic;
        this.width = width;
        this.length = length;
        
        formerdir = dir;
        
        isweap = false;
        
        
        
    }
    
    
    public boolean infigure( figure fig )
    {
        
        int left1 = 1;
        int left2 = 1;
        int right1 = 1;
        int right2 = 1;
        
        int top1 = this.gety();
        int top2 = fig.gety();
        int bottom1 = top1 + this.getlength();
        int bottom2 = top2 + fig.getlength();
        
        
        
        
        
        if ( this.getisweap() ) {
            if ( this.getdir() == -1 ) {
                left1 = this.getx() - this.getwidth();
                right1 = this.getx();
            } 
            else {
                left1 = this.getx();
                right1 = this.getx() + this.getwidth();
            }
            
        }
        else {
            if ( this.getdir() == 1 ) {
                left1 = this.getx() - this.getwidth();
                right1 = this.getx();
            } 
            else {
                left1 = this.getx();
                right1 = this.getx() + this.getwidth();
            }
            
        }
        
        if ( fig.getisweap() ) {
            if ( fig.getdir() == -1 ) {
                left2 = fig.getx() - fig.getwidth();
                right2 = fig.getx();
            } 
            else {
                left2 = fig.getx();
                right2 = fig.getx() + fig.getwidth();
            }
            
        }
        else {
            if ( fig.getdir() == 1 ) {
                left2 = fig.getx() - fig.getwidth();
                right2 = fig.getx();
            } 
            else {
                left2 = fig.getx();
                right2 = fig.getx() + fig.getwidth();
            }
        }
        
        
        
        
        
        
        if ( left1 > right2 ) {
//            JOptionPane.showMessageDialog(null, "left1 > right2");
            return false;
        }
        
        if ( left2 > right1 ) {
//            JOptionPane.showMessageDialog(null, "left2 > right1");
            return false;
        }
        
        if ( top1 > bottom2 ) {
//            JOptionPane.showMessageDialog(null, "top1 > bottom2");
            return false;
        }
        
        if ( top2 > bottom1 ) {
//            JOptionPane.showMessageDialog(null, "top2 > bottom1");
            
            return false;
        }
        
        
        
        
        
        if ( 0 < 1 ) {
            return true;
        }
        
        if ( x > fig.getx() + fig.getwidth() ) {
            return false;
        }
        
        if ( x + width < fig.getx() ) {
            return false;
        }
        
        if ( y > fig.gety() + fig.getlength() ) {
            return false;
        }
        
        if ( y + length < fig.gety() ) {
            return false;
        }
        
        
//        boolean[] screen = new boolean[ 10000000 ];
        
        
//        for ( int c = 0; c < 1000; c++ ) {
//            for ( int d = 0; d < 10000; d++ ) {
//                screen[ c * 1000 + d ] = false;
//                
//            }
//            
//        }
        
        
        int topx = getx();
        int topy = gety();
        int direction = getdir();
        
        int topx2 = fig.getx();
        int topy2 = fig.gety();
        int direction2 = fig.getdir();
        
        
        int dir1 = direction;
        int dir2 = direction2;
        
        if ( !getisweap() ) {
        if ( direction == 2 ) {  // decide between weap or not
            dir1 = 1;
        }
        else {
            dir1 = -1;
        }
        }
        
        
        if ( !fig.getisweap() ) {
        if ( direction2 == 2 ) {  // decide between weap or not
            dir2 = 1;
        }
        else {
            dir2 = -1;
        }
        }
        
        int[] screen = new int[1000*1800];  
        
        for ( int c = 0; c < 1800000; c++ ) {
            screen[c] = 0;
        }
        
//        fig.setformerdir(direction);
        
        for ( int c = 0; c < length; c++ ) {
            
            for ( int d = 0; d < width; d++ ) {
                
                screen[( topx + d * dir1 )  + ( topy + c ) * 100 ]++;
                
                screen[( topx2 + d * dir2 )  + ( topy2 + c ) * 100 ]++;
            }
        }
        
        for ( int c = 0; c < 1800000; c++ ) {
            if ( screen[c] == 2 ) {
                return true;
            }
        }
        
        if ( 0 < 1 ) {
            return false;
        }
        
        
        
        for ( int c = 0; c < 1800000; c++ ) {
//            screen[c] = false;
        }
        
        for ( int c = 0; c < length; c++ ) {
            for ( int d = 0; d < width; d++ ) {
//                screen[ ( y + c ) * width + x + d ] = getpaintableat( d, c );
                
            }
        }
        
        for ( int c = 0; c < length; c++ ) {
            for ( int d = 0; d < width; d++ ) {
//                if ( screen[ ( fig.gety() + c ) * width + fig.getx() + d ] ) {
//                    return true;
//                }
            }
        }
        
        if ( 0 < 1 ) {
            return false;
        }
        
        
        for ( int c = 0; c < 1000; c++ ) {
            for ( int d = 0; d < 10000; d++ ) {
                if( d > x && c > y && d < x + width && c < y + length ) {
                    if( d > fig.getx() && c > fig.gety() && d < fig.getx() + fig.getwidth() && c < fig.gety() + fig.getlength() ) {
                        
                        if ( paintable[ ( y - c ) * width + x - d ] && fig.getpaintable()[ ( fig.gety() - c ) * fig.getwidth() + fig.getx() - d ]) {
                            return true;
                        }
                        
                    }
                    
                }
                
                
            }
            
        }
        
        
        
        return false;
    }
    
    
    
    public boolean infigure( int x, int y )
    {
        
        if ( x > this.getx() && x < this.getx() + this.getwidth() ) {
            if ( y > this.gety() && y < this.gety() + this.getlength() ) {
                return true;
            }
        }
        
        return false;
        
    }
    
    
    
    
    
    
    
}
