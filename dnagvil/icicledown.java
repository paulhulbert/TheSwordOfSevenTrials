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
public class icicledown extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    
    public icicledown( int x, int y, int dir )
    {
            
        super( x - dir * 10, y, dir, 0, 25, 30, false, new boolean[10], new Color[10], 13, 67, 0, 0 );
        
        

sa = new Color(204,255,255);
sb = new Color(153,255,255);
sc = new Color(147,177,177);



        
        buildpic();
        
        
        name = "icicledown";
        
        
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
        for ( int c = 0; c < 13 * 67; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        


setpixel(0, 0, sa);
setpixel(1, 0, sb);
setpixel(2, 0, sa);
setpixel(3, 0, sa);
setpixel(4, 0, sc);
setpixel(5, 0, sc);
setpixel(6, 0, sc);
setpixel(7, 0, sc);
setpixel(8, 0, sc);
setpixel(9, 0, sc);
setpixel(10, 0, sc);
setpixel(11, 0, sa);
setpixel(12, 0, sa);
setpixel(13, 0, sa);
setpixel(1, 1, sb);
setpixel(2, 1, sa);
setpixel(3, 1, sa);
setpixel(4, 1, sc);
setpixel(5, 1, sc);
setpixel(6, 1, sc);
setpixel(7, 1, sc);
setpixel(8, 1, sc);
setpixel(9, 1, sc);
setpixel(10, 1, sc);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(1, 2, sb);
setpixel(2, 2, sa);
setpixel(3, 2, sa);
setpixel(4, 2, sc);
setpixel(5, 2, sc);
setpixel(6, 2, sc);
setpixel(7, 2, sc);
setpixel(8, 2, sc);
setpixel(9, 2, sc);
setpixel(10, 2, sc);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(1, 3, sb);
setpixel(2, 3, sa);
setpixel(3, 3, sa);
setpixel(4, 3, sc);
setpixel(5, 3, sc);
setpixel(6, 3, sc);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(1, 4, sb);
setpixel(2, 4, sa);
setpixel(3, 4, sb);
setpixel(4, 4, sc);
setpixel(5, 4, sc);
setpixel(6, 4, sc);
setpixel(7, 4, sc);
setpixel(8, 4, sc);
setpixel(9, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sa);
setpixel(12, 4, sa);
setpixel(2, 5, sa);
setpixel(3, 5, sb);
setpixel(4, 5, sc);
setpixel(5, 5, sc);
setpixel(6, 5, sc);
setpixel(7, 5, sc);
setpixel(8, 5, sc);
setpixel(9, 5, sc);
setpixel(10, 5, sc);
setpixel(11, 5, sa);
setpixel(12, 5, sa);
setpixel(2, 6, sa);
setpixel(3, 6, sb);
setpixel(4, 6, sc);
setpixel(5, 6, sc);
setpixel(6, 6, sc);
setpixel(7, 6, sc);
setpixel(8, 6, sc);
setpixel(9, 6, sc);
setpixel(10, 6, sc);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(2, 7, sa);
setpixel(3, 7, sb);
setpixel(4, 7, sa);
setpixel(5, 7, sc);
setpixel(6, 7, sc);
setpixel(7, 7, sc);
setpixel(8, 7, sc);
setpixel(9, 7, sc);
setpixel(10, 7, sb);
setpixel(11, 7, sa);
setpixel(12, 7, sa);
setpixel(3, 8, sb);
setpixel(4, 8, sb);
setpixel(5, 8, sc);
setpixel(6, 8, sc);
setpixel(7, 8, sc);
setpixel(8, 8, sc);
setpixel(9, 8, sc);
setpixel(10, 8, sb);
setpixel(11, 8, sa);
setpixel(12, 8, sa);
setpixel(3, 9, sa);
setpixel(4, 9, sb);
setpixel(5, 9, sc);
setpixel(6, 9, sc);
setpixel(7, 9, sc);
setpixel(8, 9, sc);
setpixel(9, 9, sc);
setpixel(10, 9, sb);
setpixel(11, 9, sa);
setpixel(3, 10, sa);
setpixel(4, 10, sa);
setpixel(5, 10, sc);
setpixel(6, 10, sc);
setpixel(7, 10, sc);
setpixel(8, 10, sc);
setpixel(9, 10, sc);
setpixel(10, 10, sa);
setpixel(11, 10, sa);
setpixel(3, 11, sa);
setpixel(4, 11, sa);
setpixel(5, 11, sc);
setpixel(6, 11, sc);
setpixel(7, 11, sc);
setpixel(8, 11, sc);
setpixel(9, 11, sc);
setpixel(10, 11, sa);
setpixel(11, 11, sa);
setpixel(3, 12, sa);
setpixel(4, 12, sa);
setpixel(5, 12, sc);
setpixel(6, 12, sc);
setpixel(7, 12, sc);
setpixel(8, 12, sc);
setpixel(9, 12, sc);
setpixel(10, 12, sa);
setpixel(11, 12, sa);
setpixel(3, 13, sa);
setpixel(4, 13, sa);
setpixel(5, 13, sc);
setpixel(6, 13, sc);
setpixel(7, 13, sc);
setpixel(8, 13, sc);
setpixel(9, 13, sc);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(3, 14, sa);
setpixel(4, 14, sa);
setpixel(5, 14, sc);
setpixel(6, 14, sc);
setpixel(7, 14, sc);
setpixel(8, 14, sc);
setpixel(9, 14, sc);
setpixel(10, 14, sa);
setpixel(11, 14, sa);
setpixel(3, 15, sa);
setpixel(4, 15, sa);
setpixel(5, 15, sa);
setpixel(6, 15, sc);
setpixel(7, 15, sc);
setpixel(8, 15, sc);
setpixel(9, 15, sa);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(4, 16, sa);
setpixel(5, 16, sa);
setpixel(6, 16, sc);
setpixel(7, 16, sc);
setpixel(8, 16, sc);
setpixel(9, 16, sb);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(4, 17, sa);
setpixel(5, 17, sa);
setpixel(6, 17, sc);
setpixel(7, 17, sc);
setpixel(8, 17, sc);
setpixel(9, 17, sb);
setpixel(10, 17, sa);
setpixel(4, 18, sa);
setpixel(5, 18, sa);
setpixel(6, 18, sc);
setpixel(7, 18, sc);
setpixel(8, 18, sc);
setpixel(9, 18, sb);
setpixel(10, 18, sa);
setpixel(4, 19, sa);
setpixel(5, 19, sa);
setpixel(6, 19, sc);
setpixel(7, 19, sc);
setpixel(8, 19, sc);
setpixel(9, 19, sa);
setpixel(10, 19, sa);
setpixel(4, 20, sa);
setpixel(5, 20, sa);
setpixel(6, 20, sc);
setpixel(7, 20, sc);
setpixel(8, 20, sc);
setpixel(9, 20, sa);
setpixel(10, 20, sa);
setpixel(4, 21, sa);
setpixel(5, 21, sa);
setpixel(6, 21, sc);
setpixel(7, 21, sc);
setpixel(8, 21, sc);
setpixel(9, 21, sa);
setpixel(10, 21, sa);
setpixel(4, 22, sa);
setpixel(5, 22, sa);
setpixel(6, 22, sc);
setpixel(7, 22, sc);
setpixel(8, 22, sc);
setpixel(9, 22, sa);
setpixel(10, 22, sa);
setpixel(4, 23, sa);
setpixel(5, 23, sa);
setpixel(6, 23, sb);
setpixel(7, 23, sc);
setpixel(8, 23, sa);
setpixel(9, 23, sa);
setpixel(4, 24, sa);
setpixel(5, 24, sa);
setpixel(6, 24, sb);
setpixel(7, 24, sc);
setpixel(8, 24, sa);
setpixel(9, 24, sa);
setpixel(4, 25, sa);
setpixel(5, 25, sa);
setpixel(6, 25, sb);
setpixel(7, 25, sc);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(4, 26, sa);
setpixel(5, 26, sa);
setpixel(6, 26, sb);
setpixel(7, 26, sc);
setpixel(8, 26, sa);
setpixel(9, 26, sb);
setpixel(4, 27, sa);
setpixel(5, 27, sa);
setpixel(6, 27, sb);
setpixel(7, 27, sc);
setpixel(8, 27, sa);
setpixel(9, 27, sb);
setpixel(5, 28, sa);
setpixel(6, 28, sa);
setpixel(7, 28, sc);
setpixel(8, 28, sa);
setpixel(9, 28, sb);
setpixel(5, 29, sa);
setpixel(6, 29, sa);
setpixel(7, 29, sc);
setpixel(8, 29, sa);
setpixel(9, 29, sb);
setpixel(5, 30, sa);
setpixel(6, 30, sa);
setpixel(7, 30, sc);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(5, 31, sa);
setpixel(6, 31, sa);
setpixel(7, 31, sb);
setpixel(8, 31, sa);
setpixel(9, 31, sa);
setpixel(5, 32, sa);
setpixel(6, 32, sa);
setpixel(7, 32, sb);
setpixel(8, 32, sa);
setpixel(6, 33, sa);
setpixel(7, 33, sb);
setpixel(8, 33, sa);
setpixel(6, 34, sa);
setpixel(7, 34, sb);
setpixel(8, 34, sa);
setpixel(6, 35, sa);
setpixel(7, 35, sb);
setpixel(8, 35, sa);
setpixel(6, 36, sa);
setpixel(7, 36, sb);
setpixel(8, 36, sa);
setpixel(6, 37, sa);
setpixel(7, 37, sb);
setpixel(8, 37, sa);
setpixel(6, 38, sa);
setpixel(7, 38, sb);
setpixel(8, 38, sa);
setpixel(6, 39, sa);
setpixel(7, 39, sb);
setpixel(8, 39, sa);
setpixel(6, 40, sa);
setpixel(7, 40, sb);
setpixel(8, 40, sa);
setpixel(6, 41, sa);
setpixel(7, 41, sb);
setpixel(8, 41, sa);
setpixel(6, 42, sa);
setpixel(7, 42, sb);
setpixel(8, 42, sa);
setpixel(7, 43, sb);
setpixel(8, 43, sa);
setpixel(7, 44, sb);
setpixel(8, 44, sa);
setpixel(7, 45, sb);
setpixel(8, 45, sa);
setpixel(7, 46, sa);
setpixel(8, 46, sa);
setpixel(7, 47, sa);
setpixel(8, 47, sa);
setpixel(7, 48, sa);
setpixel(8, 48, sa);
setpixel(7, 49, sa);
setpixel(8, 49, sa);
setpixel(7, 50, sa);
setpixel(8, 50, sa);
setpixel(7, 51, sa);
setpixel(8, 51, sa);
setpixel(7, 52, sa);
setpixel(8, 52, sa);
setpixel(7, 53, sa);
setpixel(8, 53, sa);
setpixel(7, 54, sa);
setpixel(8, 54, sa);
setpixel(7, 55, sa);
setpixel(8, 55, sa);
setpixel(7, 56, sa);
setpixel(7, 57, sa);
setpixel(7, 58, sb);
setpixel(7, 59, sb);
setpixel(7, 60, sb);
setpixel(7, 61, sb);
setpixel(7, 62, sa);
setpixel(7, 63, sa);
setpixel(7, 64, sa);
setpixel(7, 65, sa);
setpixel(7, 66, sa);
setpixel(7, 67, sa);
    }
    
    
    
    
    
    
    
    
}

