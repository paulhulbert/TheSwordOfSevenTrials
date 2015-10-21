/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.weapon;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class icicleup extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    
    public icicleup( int x, int y, int dir )
    {
            
        super( x - dir * 10, y - 54, dir, 0, 25, 30, false, new boolean[10], new Color[10], 13, 54, 0, 0 );
        
        
sa = new Color(153,255,255);
sb = new Color(204,255,255);
sc = new Color(147,177,177);


        
        buildpic();
        
        
        name = "icicleup";
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        if ( !active ) {
            return;
        }
        paintit(g);
        
    }
    
    public static int getrange()
    {
        
        return 25;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 13 * 54; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        

        


setpixel(7, 0, sa);
setpixel(7, 1, sa);
setpixel(7, 2, sa);
setpixel(7, 3, sb);
setpixel(7, 4, sb);
setpixel(7, 5, sb);
setpixel(7, 6, sb);
setpixel(8, 6, sb);
setpixel(7, 7, sb);
setpixel(8, 7, sb);
setpixel(7, 8, sb);
setpixel(8, 8, sb);
setpixel(6, 9, sb);
setpixel(7, 9, sb);
setpixel(8, 9, sb);
setpixel(6, 10, sb);
setpixel(7, 10, sb);
setpixel(8, 10, sb);
setpixel(6, 11, sb);
setpixel(7, 11, sa);
setpixel(8, 11, sb);
setpixel(6, 12, sb);
setpixel(7, 12, sa);
setpixel(8, 12, sb);
setpixel(6, 13, sb);
setpixel(7, 13, sa);
setpixel(8, 13, sb);
setpixel(6, 14, sb);
setpixel(7, 14, sa);
setpixel(8, 14, sb);
setpixel(6, 15, sb);
setpixel(7, 15, sa);
setpixel(8, 15, sb);
setpixel(6, 16, sb);
setpixel(7, 16, sa);
setpixel(8, 16, sb);
setpixel(6, 17, sb);
setpixel(7, 17, sa);
setpixel(8, 17, sb);
setpixel(9, 17, sb);
setpixel(6, 18, sb);
setpixel(7, 18, sa);
setpixel(8, 18, sb);
setpixel(9, 18, sb);
setpixel(6, 19, sb);
setpixel(7, 19, sa);
setpixel(8, 19, sb);
setpixel(9, 19, sb);
setpixel(6, 20, sb);
setpixel(7, 20, sb);
setpixel(8, 20, sb);
setpixel(9, 20, sb);
setpixel(5, 21, sb);
setpixel(6, 21, sa);
setpixel(7, 21, sb);
setpixel(8, 21, sb);
setpixel(9, 21, sb);
setpixel(5, 22, sb);
setpixel(6, 22, sa);
setpixel(7, 22, sb);
setpixel(8, 22, sb);
setpixel(9, 22, sb);
setpixel(5, 23, sb);
setpixel(6, 23, sa);
setpixel(7, 23, sc);
setpixel(8, 23, sb);
setpixel(9, 23, sa);
setpixel(5, 24, sb);
setpixel(6, 24, sa);
setpixel(7, 24, sc);
setpixel(8, 24, sb);
setpixel(9, 24, sa);
setpixel(10, 24, sb);
setpixel(5, 25, sb);
setpixel(6, 25, sa);
setpixel(7, 25, sc);
setpixel(8, 25, sb);
setpixel(9, 25, sa);
setpixel(10, 25, sa);
setpixel(5, 26, sb);
setpixel(6, 26, sa);
setpixel(7, 26, sc);
setpixel(8, 26, sb);
setpixel(9, 26, sb);
setpixel(10, 26, sa);
setpixel(5, 27, sb);
setpixel(6, 27, sa);
setpixel(7, 27, sc);
setpixel(8, 27, sb);
setpixel(9, 27, sb);
setpixel(10, 27, sa);
setpixel(5, 28, sb);
setpixel(6, 28, sa);
setpixel(7, 28, sc);
setpixel(8, 28, sb);
setpixel(9, 28, sb);
setpixel(10, 28, sa);
setpixel(4, 29, sb);
setpixel(5, 29, sb);
setpixel(6, 29, sb);
setpixel(7, 29, sc);
setpixel(8, 29, sb);
setpixel(9, 29, sb);
setpixel(10, 29, sa);
setpixel(4, 30, sb);
setpixel(5, 30, sb);
setpixel(6, 30, sb);
setpixel(7, 30, sc);
setpixel(8, 30, sb);
setpixel(9, 30, sb);
setpixel(10, 30, sb);
setpixel(4, 31, sb);
setpixel(5, 31, sb);
setpixel(6, 31, sc);
setpixel(7, 31, sc);
setpixel(8, 31, sc);
setpixel(9, 31, sb);
setpixel(10, 31, sb);
setpixel(4, 32, sb);
setpixel(5, 32, sb);
setpixel(6, 32, sc);
setpixel(7, 32, sc);
setpixel(8, 32, sc);
setpixel(9, 32, sb);
setpixel(10, 32, sb);
setpixel(4, 33, sb);
setpixel(5, 33, sb);
setpixel(6, 33, sc);
setpixel(7, 33, sc);
setpixel(8, 33, sc);
setpixel(9, 33, sb);
setpixel(10, 33, sb);
setpixel(11, 33, sb);
setpixel(4, 34, sb);
setpixel(5, 34, sb);
setpixel(6, 34, sc);
setpixel(7, 34, sc);
setpixel(8, 34, sc);
setpixel(9, 34, sb);
setpixel(10, 34, sa);
setpixel(11, 34, sb);
setpixel(4, 35, sb);
setpixel(5, 35, sb);
setpixel(6, 35, sc);
setpixel(7, 35, sc);
setpixel(8, 35, sc);
setpixel(9, 35, sb);
setpixel(10, 35, sa);
setpixel(11, 35, sb);
setpixel(4, 36, sb);
setpixel(5, 36, sb);
setpixel(6, 36, sc);
setpixel(7, 36, sc);
setpixel(8, 36, sc);
setpixel(9, 36, sb);
setpixel(10, 36, sa);
setpixel(11, 36, sb);
setpixel(3, 37, sb);
setpixel(4, 37, sb);
setpixel(5, 37, sb);
setpixel(6, 37, sc);
setpixel(7, 37, sc);
setpixel(8, 37, sc);
setpixel(9, 37, sb);
setpixel(10, 37, sb);
setpixel(11, 37, sa);
setpixel(3, 38, sb);
setpixel(4, 38, sb);
setpixel(5, 38, sb);
setpixel(6, 38, sc);
setpixel(7, 38, sc);
setpixel(8, 38, sc);
setpixel(9, 38, sb);
setpixel(10, 38, sb);
setpixel(11, 38, sa);
setpixel(3, 39, sb);
setpixel(4, 39, sb);
setpixel(5, 39, sc);
setpixel(6, 39, sc);
setpixel(7, 39, sc);
setpixel(8, 39, sc);
setpixel(9, 39, sc);
setpixel(10, 39, sb);
setpixel(11, 39, sa);
setpixel(3, 40, sb);
setpixel(4, 40, sb);
setpixel(5, 40, sc);
setpixel(6, 40, sc);
setpixel(7, 40, sc);
setpixel(8, 40, sc);
setpixel(9, 40, sc);
setpixel(10, 40, sb);
setpixel(11, 40, sa);
setpixel(3, 41, sb);
setpixel(4, 41, sa);
setpixel(5, 41, sc);
setpixel(6, 41, sc);
setpixel(7, 41, sc);
setpixel(8, 41, sc);
setpixel(9, 41, sc);
setpixel(10, 41, sb);
setpixel(11, 41, sa);
setpixel(12, 41, sb);
setpixel(2, 42, sb);
setpixel(3, 42, sa);
setpixel(4, 42, sa);
setpixel(5, 42, sc);
setpixel(6, 42, sc);
setpixel(7, 42, sc);
setpixel(8, 42, sc);
setpixel(9, 42, sc);
setpixel(10, 42, sb);
setpixel(11, 42, sa);
setpixel(12, 42, sb);
setpixel(2, 43, sb);
setpixel(3, 43, sa);
setpixel(4, 43, sb);
setpixel(5, 43, sc);
setpixel(6, 43, sc);
setpixel(7, 43, sc);
setpixel(8, 43, sc);
setpixel(9, 43, sc);
setpixel(10, 43, sb);
setpixel(11, 43, sa);
setpixel(12, 43, sb);
setpixel(2, 44, sb);
setpixel(3, 44, sa);
setpixel(4, 44, sb);
setpixel(5, 44, sc);
setpixel(6, 44, sc);
setpixel(7, 44, sc);
setpixel(8, 44, sc);
setpixel(9, 44, sc);
setpixel(10, 44, sb);
setpixel(11, 44, sa);
setpixel(12, 44, sa);
setpixel(2, 45, sb);
setpixel(3, 45, sa);
setpixel(4, 45, sb);
setpixel(5, 45, sc);
setpixel(6, 45, sc);
setpixel(7, 45, sc);
setpixel(8, 45, sc);
setpixel(9, 45, sc);
setpixel(10, 45, sb);
setpixel(11, 45, sb);
setpixel(12, 45, sa);
setpixel(2, 46, sa);
setpixel(3, 46, sb);
setpixel(4, 46, sb);
setpixel(5, 46, sc);
setpixel(6, 46, sc);
setpixel(7, 46, sc);
setpixel(8, 46, sc);
setpixel(9, 46, sc);
setpixel(10, 46, sb);
setpixel(11, 46, sb);
setpixel(12, 46, sa);
setpixel(2, 47, sa);
setpixel(3, 47, sb);
setpixel(4, 47, sc);
setpixel(5, 47, sc);
setpixel(6, 47, sc);
setpixel(7, 47, sc);
setpixel(8, 47, sc);
setpixel(9, 47, sc);
setpixel(10, 47, sb);
setpixel(11, 47, sb);
setpixel(12, 47, sb);
setpixel(2, 48, sa);
setpixel(3, 48, sb);
setpixel(4, 48, sc);
setpixel(5, 48, sc);
setpixel(6, 48, sc);
setpixel(7, 48, sc);
setpixel(8, 48, sc);
setpixel(9, 48, sc);
setpixel(10, 48, sc);
setpixel(11, 48, sb);
setpixel(12, 48, sb);
setpixel(2, 49, sa);
setpixel(3, 49, sb);
setpixel(4, 49, sc);
setpixel(5, 49, sc);
setpixel(6, 49, sc);
setpixel(7, 49, sc);
setpixel(8, 49, sc);
setpixel(9, 49, sc);
setpixel(10, 49, sc);
setpixel(11, 49, sb);
setpixel(12, 49, sb);
setpixel(2, 50, sa);
setpixel(3, 50, sb);
setpixel(4, 50, sc);
setpixel(5, 50, sc);
setpixel(6, 50, sc);
setpixel(7, 50, sc);
setpixel(8, 50, sc);
setpixel(9, 50, sc);
setpixel(10, 50, sc);
setpixel(11, 50, sb);
setpixel(12, 50, sb);
setpixel(1, 51, sb);
setpixel(2, 51, sa);
setpixel(3, 51, sb);
setpixel(4, 51, sc);
setpixel(5, 51, sc);
setpixel(6, 51, sc);
setpixel(7, 51, sc);
setpixel(8, 51, sc);
setpixel(9, 51, sc);
setpixel(10, 51, sc);
setpixel(11, 51, sb);
setpixel(12, 51, sa);
setpixel(1, 52, sb);
setpixel(2, 52, sa);
setpixel(3, 52, sb);
setpixel(4, 52, sc);
setpixel(5, 52, sc);
setpixel(6, 52, sc);
setpixel(7, 52, sc);
setpixel(8, 52, sc);
setpixel(9, 52, sc);
setpixel(10, 52, sc);
setpixel(11, 52, sb);
setpixel(12, 52, sa);
setpixel(1, 53, sb);
setpixel(2, 53, sa);
setpixel(3, 53, sb);
setpixel(4, 53, sc);
setpixel(5, 53, sc);
setpixel(6, 53, sc);
setpixel(7, 53, sc);
setpixel(8, 53, sc);
setpixel(9, 53, sc);
setpixel(10, 53, sc);
setpixel(11, 53, sb);
setpixel(12, 53, sa);
setpixel(13, 53, sb);
setpixel(0, 54, sa);
setpixel(1, 54, sb);
setpixel(2, 54, sb);
setpixel(3, 54, sb);
setpixel(4, 54, sc);
setpixel(5, 54, sc);
setpixel(6, 54, sc);
setpixel(7, 54, sc);
setpixel(8, 54, sc);
setpixel(9, 54, sc);
setpixel(10, 54, sc);
setpixel(11, 54, sb);
setpixel(12, 54, sa);
setpixel(13, 54, sb);
        
        
        
        
    }
    
    
    
    
    
    
    
    
}

