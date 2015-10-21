/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;

import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class weakelectricspear extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public weakelectricspear( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 10, dir * 15, 1, 5, 150, false, new boolean[10], new Color[10], 33, 5, momentx, momenty );
        
        melee = false;
        
        

sa = new Color(153,153,153);
sb = new Color(51,204,255);
sc = new Color(204,204,204);

        
        buildpic();
        
        
        name = "electricspear";
        
        
    }
    
    public static int getrange()
    {
        
        return 100;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 33 * 5; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        setpixel(28, 0, sa);
setpixel(29, 0, sa);
setpixel(30, 0, sa);
setpixel(29, 1, sa);
setpixel(30, 1, sb);
setpixel(31, 1, sa);
setpixel(32, 1, sa);
setpixel(0, 2, sa);
setpixel(1, 2, sc);
setpixel(2, 2, sc);
setpixel(3, 2, sc);
setpixel(4, 2, sa);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sa);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
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
setpixel(25, 2, sb);
setpixel(26, 2, sc);
setpixel(27, 2, sb);
setpixel(28, 2, sc);
setpixel(29, 2, sb);
setpixel(30, 2, sc);
setpixel(31, 2, sb);
setpixel(32, 2, sa);
setpixel(33, 2, sa);
setpixel(1, 3, sc);
setpixel(2, 3, sc);
setpixel(3, 3, sc);
setpixel(4, 3, sa);
setpixel(5, 3, sa);
setpixel(6, 3, sa);
setpixel(7, 3, sa);
setpixel(8, 3, sa);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sc);
setpixel(16, 3, sc);
setpixel(17, 3, sc);
setpixel(18, 3, sc);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(21, 3, sc);
setpixel(22, 3, sc);
setpixel(23, 3, sc);
setpixel(24, 3, sb);
setpixel(25, 3, sc);
setpixel(26, 3, sb);
setpixel(27, 3, sc);
setpixel(28, 3, sc);
setpixel(29, 3, sb);
setpixel(30, 3, sc);
setpixel(31, 3, sb);
setpixel(32, 3, sa);
setpixel(33, 3, sa);
setpixel(29, 4, sa);
setpixel(30, 4, sb);
setpixel(31, 4, sa);
setpixel(32, 4, sa);
setpixel(28, 5, sa);
setpixel(29, 5, sa);
setpixel(30, 5, sa);

for ( int c = 0; c < 5; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


