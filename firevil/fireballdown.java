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
public class fireballdown extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    
    public fireballdown( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y, 0, 15, 20, 130, false, new boolean[10], new Color[10], 10, 18, momentx, momenty );
        
        
        
melee = false;
        

sa = new Color(255,255,204);
sb = new Color(255,255,0);
sc = new Color(255,153,0);
sd = new Color(255,0,0);
        
        name = "fireballdown";

        
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
        
        
        
        













setpixel(5, 0, sa);
setpixel(5, 1, sa);
setpixel(5, 2, sa);
setpixel(4, 3, sa);
setpixel(5, 3, sa);
setpixel(6, 3, sa);
setpixel(4, 4, sa);
setpixel(5, 4, sb);
setpixel(6, 4, sa);
setpixel(4, 5, sa);
setpixel(5, 5, sb);
setpixel(6, 5, sa);
setpixel(3, 6, sa);
setpixel(4, 6, sa);
setpixel(5, 6, sb);
setpixel(6, 6, sa);
setpixel(7, 6, sa);
setpixel(3, 7, sa);
setpixel(4, 7, sb);
setpixel(5, 7, sc);
setpixel(6, 7, sb);
setpixel(7, 7, sa);
setpixel(2, 8, sa);
setpixel(3, 8, sb);
setpixel(4, 8, sc);
setpixel(5, 8, sc);
setpixel(6, 8, sc);
setpixel(7, 8, sb);
setpixel(8, 8, sa);
setpixel(1, 9, sa);
setpixel(2, 9, sb);
setpixel(3, 9, sc);
setpixel(4, 9, sd);
setpixel(5, 9, sd);
setpixel(6, 9, sd);
setpixel(7, 9, sc);
setpixel(8, 9, sb);
setpixel(9, 9, sa);
setpixel(0, 10, sa);
setpixel(1, 10, sb);
setpixel(2, 10, sc);
setpixel(3, 10, sd);
setpixel(4, 10, sc);
setpixel(5, 10, sc);
setpixel(6, 10, sc);
setpixel(7, 10, sd);
setpixel(8, 10, sc);
setpixel(9, 10, sb);
setpixel(10, 10, sa);
setpixel(0, 11, sb);
setpixel(1, 11, sc);
setpixel(2, 11, sd);
setpixel(3, 11, sc);
setpixel(4, 11, sb);
setpixel(5, 11, sb);
setpixel(6, 11, sb);
setpixel(7, 11, sc);
setpixel(8, 11, sd);
setpixel(9, 11, sc);
setpixel(10, 11, sb);
setpixel(0, 12, sb);
setpixel(1, 12, sc);
setpixel(2, 12, sd);
setpixel(3, 12, sb);
setpixel(4, 12, sd);
setpixel(5, 12, sd);
setpixel(6, 12, sd);
setpixel(7, 12, sb);
setpixel(8, 12, sd);
setpixel(9, 12, sc);
setpixel(10, 12, sb);
setpixel(0, 13, sb);
setpixel(1, 13, sc);
setpixel(2, 13, sd);
setpixel(3, 13, sb);
setpixel(4, 13, sd);
setpixel(5, 13, sd);
setpixel(6, 13, sd);
setpixel(7, 13, sb);
setpixel(8, 13, sd);
setpixel(9, 13, sc);
setpixel(10, 13, sb);
setpixel(0, 14, sb);
setpixel(1, 14, sc);
setpixel(2, 14, sd);
setpixel(3, 14, sc);
setpixel(4, 14, sb);
setpixel(5, 14, sb);
setpixel(6, 14, sb);
setpixel(7, 14, sc);
setpixel(8, 14, sd);
setpixel(9, 14, sc);
setpixel(10, 14, sb);
setpixel(0, 15, sb);
setpixel(1, 15, sc);
setpixel(2, 15, sd);
setpixel(3, 15, sd);
setpixel(4, 15, sc);
setpixel(5, 15, sc);
setpixel(6, 15, sc);
setpixel(7, 15, sd);
setpixel(8, 15, sd);
setpixel(9, 15, sc);
setpixel(10, 15, sb);
setpixel(1, 16, sb);
setpixel(2, 16, sc);
setpixel(3, 16, sd);
setpixel(4, 16, sd);
setpixel(5, 16, sd);
setpixel(6, 16, sd);
setpixel(7, 16, sd);
setpixel(8, 16, sc);
setpixel(9, 16, sb);
setpixel(2, 17, sb);
setpixel(3, 17, sc);
setpixel(4, 17, sc);
setpixel(5, 17, sc);
setpixel(6, 17, sc);
setpixel(7, 17, sc);
setpixel(8, 17, sb);
setpixel(3, 18, sb);
setpixel(4, 18, sb);
setpixel(5, 18, sb);
setpixel(6, 18, sb);
setpixel(7, 18, sb);
        
        
        
        
        
        
    }
    
}


