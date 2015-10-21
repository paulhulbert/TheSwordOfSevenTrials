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
public class arrow extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    
    public arrow( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 30, dir * 15, 1, 34, 150, false, new boolean[10], new Color[10], 35, 5, momentx * 4, momenty );
        
        
        sa = new Color(164,0,0);
        sb = new Color(153,153,153);
        sc = new Color(153,110,44);
        
        melee = false;

        name = "arrow";

        
        buildpic();
        
        if ( momentx * dir < 0 ) {
            directionx = dir * 15;
        }
        
        
        
        
    }
    
    public static int getrange()
    {
        
        return 25;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 35 * 5; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        




















setpixel(0, 0, sa);
setpixel(1, 0, sa);
setpixel(2, 0, sa);
setpixel(3, 0, sa);
setpixel(4, 0, sa);
setpixel(31, 0, sb);
setpixel(1, 1, sa);
setpixel(2, 1, sa);
setpixel(3, 1, sa);
setpixel(4, 1, sa);
setpixel(5, 1, sa);
setpixel(31, 1, sb);
setpixel(32, 1, sb);
setpixel(33, 1, sb);
setpixel(1, 2, sc);
setpixel(2, 2, sc);
setpixel(3, 2, sc);
setpixel(4, 2, sc);
setpixel(5, 2, sc);
setpixel(6, 2, sc);
setpixel(7, 2, sc);
setpixel(8, 2, sc);
setpixel(9, 2, sc);
setpixel(10, 2, sc);
setpixel(11, 2, sc);
setpixel(12, 2, sc);
setpixel(13, 2, sc);
setpixel(14, 2, sc);
setpixel(15, 2, sc);
setpixel(16, 2, sc);
setpixel(17, 2, sc);
setpixel(18, 2, sc);
setpixel(19, 2, sc);
setpixel(20, 2, sc);
setpixel(21, 2, sc);
setpixel(22, 2, sc);
setpixel(23, 2, sc);
setpixel(24, 2, sc);
setpixel(25, 2, sc);
setpixel(26, 2, sc);
setpixel(27, 2, sc);
setpixel(28, 2, sc);
setpixel(29, 2, sc);
setpixel(30, 2, sc);
setpixel(31, 2, sc);
setpixel(32, 2, sb);
setpixel(33, 2, sb);
setpixel(34, 2, sb);
setpixel(35, 2, sb);
setpixel(1, 3, sc);
setpixel(2, 3, sc);
setpixel(3, 3, sc);
setpixel(4, 3, sc);
setpixel(5, 3, sc);
setpixel(6, 3, sc);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sc);
setpixel(12, 3, sc);
setpixel(13, 3, sc);
setpixel(14, 3, sc);
setpixel(15, 3, sc);
setpixel(16, 3, sc);
setpixel(17, 3, sc);
setpixel(18, 3, sc);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(21, 3, sc);
setpixel(22, 3, sc);
setpixel(23, 3, sc);
setpixel(24, 3, sc);
setpixel(25, 3, sc);
setpixel(26, 3, sc);
setpixel(27, 3, sc);
setpixel(28, 3, sc);
setpixel(29, 3, sc);
setpixel(30, 3, sc);
setpixel(31, 3, sc);
setpixel(32, 3, sb);
setpixel(33, 3, sb);
setpixel(34, 3, sb);
setpixel(35, 3, sb);
setpixel(1, 4, sa);
setpixel(2, 4, sa);
setpixel(3, 4, sa);
setpixel(4, 4, sa);
setpixel(5, 4, sa);
setpixel(31, 4, sb);
setpixel(32, 4, sb);
setpixel(33, 4, sb);
setpixel(0, 5, sa);
setpixel(1, 5, sa);
setpixel(2, 5, sa);
setpixel(3, 5, sa);
setpixel(4, 5, sa);
setpixel(31, 5, sb);
        
        
        
        
        
        
    }
    
}
