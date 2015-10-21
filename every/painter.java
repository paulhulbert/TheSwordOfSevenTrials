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
public class painter {
    
    public static void chat( Graphics g, figure fig )
    {
        boolean[] paintable = fig.getpaintable();
        Color[] pic = fig.getpic();
        int width = fig.getwidth();
        int length = fig.getlength();
        
        
        
        
//        fig.setformerdir(direction);
        
        for ( int c = 0; c < length; c++ ) {
            
            for ( int d = 0; d < width; d++ ) {
                if ( paintable[c*width + d] ) {
                    g.setColor(pic[c*width + d]);
                    g.drawRect(260 + d, 70 + c, 0, 0);
                }
            }
        }
        
        
    }
    
    public static void chatto( Graphics g, figure fig )
    {
        boolean[] paintable = fig.getpaintable();
        Color[] pic = fig.getpic();
        int width = fig.getwidth();
        int length = fig.getlength();
        
        
        
        
//        fig.setformerdir(direction);
        
        for ( int c = 0; c < length; c++ ) {
            
            for ( int d = 0; d < width; d++ ) {
                if ( paintable[c*width + d] ) {
                    g.setColor(pic[c*width + d]);
                    g.drawRect(800 - d, 70 + c, 0, 0);
                }
            }
        }
        
        
    }
    
    public static void paint( Graphics g, figure fig )
    {
        boolean[] paintable = fig.getpaintable();
        Color[] pic = fig.getpic();
        int width = fig.getwidth();
        int length = fig.getlength();
        int topx = fig.getx();
        int topy = fig.gety();
        int direction = fig.getdir();
        
        
        
        int dir;
        
        int setting;
        
        if ( !fig.getisweap() ) {
        if ( direction == 2 ) {
            dir = 1;
            setting = 0;
            if ( fig.getformerdir() == 1 )
            {
                fig.setx(topx - width);
                fig.setformerdir(2);
                topx -= width;
            }
        }
        else {
            dir = -1;
            setting = width;
            if ( fig.getformerdir() == 2 )
            {
                fig.setx(topx + width);
                fig.setformerdir(1);
                topx += width;
            }
        }
        }
        else {
            
            if ( direction == 1 ) {
            dir = 1;
            setting = 0;
            if ( fig.getformerdir() == -1 )
            {
                fig.setx(topx - width);
                fig.setformerdir(1);
                topx -= width;
            }
        }
        else {
            dir = -1;
            setting = width;
            if ( fig.getformerdir() == 1 )
            {
                fig.setx(topx + width);
                fig.setformerdir(-1);
                topx += width;
            }
        }
            
        }
        
//        fig.setformerdir(direction);
        
        for ( int c = 0; c < length; c++ ) {
            
            for ( int d = 0; d < width; d++ ) {
                if ( paintable[c*width + d] ) {
                    g.setColor(pic[c*width + d]);
                    g.drawRect(topx + d * dir, topy + c, 0, 0);
                }
            }
        }
        
        
    }
    
    
    public static void paint( Graphics g, figure fig, boolean red )
    {
        boolean[] paintable = fig.getpaintable();
        Color[] pic = fig.getpic();
        int width = fig.getwidth();
        int length = fig.getlength();
        int topx = fig.getx();
        int topy = fig.gety();
        int direction = fig.getdir();
        
        
        
        int dir;
        
        int setting;
        
        if ( !fig.getisweap() ) {
        if ( direction == 2 ) {
            dir = 1;
            setting = 0;
            if ( fig.getformerdir() == 1 )
            {
                fig.setx(topx - width);
                fig.setformerdir(2);
                topx -= width;
            }
        }
        else {
            dir = -1;
            setting = width;
            if ( fig.getformerdir() == 2 )
            {
                fig.setx(topx + width);
                fig.setformerdir(1);
                topx += width;
            }
        }
        }
        else {
            
            if ( direction == 1 ) {
            dir = 1;
            setting = 0;
            if ( fig.getformerdir() == -1 )
            {
                fig.setx(topx - width);
                fig.setformerdir(1);
                topx -= width;
            }
        }
        else {
            dir = -1;
            setting = width;
            if ( fig.getformerdir() == 1 )
            {
                fig.setx(topx + width);
                fig.setformerdir(-1);
                topx += width;
            }
        }
            
        }
        
//        fig.setformerdir(direction);
        
        for ( int c = 0; c < length; c++ ) {
            
            for ( int d = 0; d < width; d++ ) {
                if ( paintable[c*width + d] ) {
                    
                    if ( !red ) {
                        g.setColor(pic[c*width + d]);
                    } else {
                        int redscale = pic[c*width + d].getBlue() + pic[c*width + d].getRed() + pic[c*width + d].getGreen();
                        redscale /= 3;
                        
                        redscale += 50;
                        if ( redscale > 255 ) {
                            redscale = 255;
                        }
                        
                        g.setColor(new Color( redscale, 0, 0, pic[c*width+d].getAlpha() ));
                    }
                    
                    
                    g.drawRect(topx + d * dir, topy + c, 0, 0);
                }
            }
        }
        
        
    }
    
    
    
}
