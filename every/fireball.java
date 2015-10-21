/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;

/**
 *
 * @author Dad
 */
public class fireball extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    
    public fireball( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 30, dir * 15, 0, 2, 90, false, new boolean[10], new Color[10], 5, 2, 0, 0 );
        
        melee = false;
        
        
sa = new Color(255,217,205);
sb = new Color(255,255,0);
sc = new Color(255,139,55);
sd = new Color(255,0,0);
        

        name = "fireball";

        
        buildpic();
        
        
        
        
        
    }
    
    public static int getrange()
    {
        
        return 15;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 5 * 2; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        







setpixel(1, 0, sa);
setpixel(2, 0, sb);
setpixel(3, 0, sc);
setpixel(4, 0, sd);
setpixel(0, 1, sa);
setpixel(1, 1, sb);
setpixel(2, 1, sc);
setpixel(3, 1, sd);
setpixel(4, 1, sd);
setpixel(5, 1, sd);
setpixel(1, 2, sa);
setpixel(2, 2, sb);
setpixel(3, 2, sc);
setpixel(4, 2, sd);
        
        
        
        
        
        
    }
    
}

