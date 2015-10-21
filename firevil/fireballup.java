/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class fireballup extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    
    public fireballup( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y, 0, -15, 20, 130, false, new boolean[10], new Color[10], 10, 18, momentx, momenty );
        
        
        
melee = false;
        

sa = new Color(255,255,0);
sb = new Color(255,153,0);
sc = new Color(255,0,0);
sd = new Color(255,255,204);
        
        name = "fireballup";

        
        buildpic();
        
        
        
        
        
    }
    
    public static int getrange()
    {
        
        return 15;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 10 * 18; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        










setpixel(3, 0, sa);
setpixel(4, 0, sa);
setpixel(5, 0, sa);
setpixel(6, 0, sa);
setpixel(7, 0, sa);
setpixel(2, 1, sa);
setpixel(3, 1, sb);
setpixel(4, 1, sb);
setpixel(5, 1, sb);
setpixel(6, 1, sb);
setpixel(7, 1, sb);
setpixel(8, 1, sa);
setpixel(1, 2, sa);
setpixel(2, 2, sb);
setpixel(3, 2, sc);
setpixel(4, 2, sc);
setpixel(5, 2, sc);
setpixel(6, 2, sc);
setpixel(7, 2, sc);
setpixel(8, 2, sb);
setpixel(9, 2, sa);
setpixel(0, 3, sa);
setpixel(1, 3, sb);
setpixel(2, 3, sc);
setpixel(3, 3, sc);
setpixel(4, 3, sb);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sb);
setpixel(10, 3, sa);
setpixel(0, 4, sa);
setpixel(1, 4, sb);
setpixel(2, 4, sc);
setpixel(3, 4, sb);
setpixel(4, 4, sa);
setpixel(5, 4, sa);
setpixel(6, 4, sa);
setpixel(7, 4, sb);
setpixel(8, 4, sc);
setpixel(9, 4, sb);
setpixel(10, 4, sa);
setpixel(0, 5, sa);
setpixel(1, 5, sb);
setpixel(2, 5, sc);
setpixel(3, 5, sa);
setpixel(4, 5, sc);
setpixel(5, 5, sc);
setpixel(6, 5, sc);
setpixel(7, 5, sa);
setpixel(8, 5, sc);
setpixel(9, 5, sb);
setpixel(10, 5, sa);
setpixel(0, 6, sa);
setpixel(1, 6, sb);
setpixel(2, 6, sc);
setpixel(3, 6, sa);
setpixel(4, 6, sc);
setpixel(5, 6, sc);
setpixel(6, 6, sc);
setpixel(7, 6, sa);
setpixel(8, 6, sc);
setpixel(9, 6, sb);
setpixel(10, 6, sa);
setpixel(0, 7, sa);
setpixel(1, 7, sb);
setpixel(2, 7, sc);
setpixel(3, 7, sb);
setpixel(4, 7, sa);
setpixel(5, 7, sa);
setpixel(6, 7, sa);
setpixel(7, 7, sb);
setpixel(8, 7, sc);
setpixel(9, 7, sb);
setpixel(10, 7, sa);
setpixel(0, 8, sd);
setpixel(1, 8, sa);
setpixel(2, 8, sb);
setpixel(3, 8, sc);
setpixel(4, 8, sb);
setpixel(5, 8, sb);
setpixel(6, 8, sb);
setpixel(7, 8, sc);
setpixel(8, 8, sb);
setpixel(9, 8, sa);
setpixel(10, 8, sd);
setpixel(1, 9, sd);
setpixel(2, 9, sa);
setpixel(3, 9, sb);
setpixel(4, 9, sc);
setpixel(5, 9, sc);
setpixel(6, 9, sc);
setpixel(7, 9, sb);
setpixel(8, 9, sa);
setpixel(9, 9, sd);
setpixel(2, 10, sd);
setpixel(3, 10, sa);
setpixel(4, 10, sb);
setpixel(5, 10, sb);
setpixel(6, 10, sb);
setpixel(7, 10, sa);
setpixel(8, 10, sd);
setpixel(3, 11, sd);
setpixel(4, 11, sa);
setpixel(5, 11, sb);
setpixel(6, 11, sa);
setpixel(7, 11, sd);
setpixel(3, 12, sd);
setpixel(4, 12, sd);
setpixel(5, 12, sa);
setpixel(6, 12, sd);
setpixel(7, 12, sd);
setpixel(4, 13, sd);
setpixel(5, 13, sa);
setpixel(6, 13, sd);
setpixel(4, 14, sd);
setpixel(5, 14, sa);
setpixel(6, 14, sd);
setpixel(4, 15, sd);
setpixel(5, 15, sd);
setpixel(6, 15, sd);
setpixel(5, 16, sd);
setpixel(5, 17, sd);
setpixel(5, 18, sd);
        
        
        
        
        
        
    }
    
}

