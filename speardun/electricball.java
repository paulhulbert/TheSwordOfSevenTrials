/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class electricball extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public electricball( int x, int y, int movex, int movey )
    {
            
        super( x, y, movex, movey, 7, 300, false, new boolean[10], new Color[10], 11, 10, 0, 0 );
        
        melee = false;
        
        

sa = new Color(153,255,255,180);
sb = new Color(51,204,255,180);
sc = new Color(0,153,255,180);
        


        
        buildpic();
        
        
        name = "electricball";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 11 * 10; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        


setpixel(4, 0, sa);
setpixel(5, 0, sa);
setpixel(6, 0, sa);
setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(3, 1, sa);
setpixel(9, 1, sa);
setpixel(2, 2, sa);
setpixel(5, 2, sb);
setpixel(6, 2, sc);
setpixel(7, 2, sb);
setpixel(10, 2, sa);
setpixel(0, 3, sc);
setpixel(1, 3, sa);
setpixel(4, 3, sc);
setpixel(5, 3, sb);
setpixel(6, 3, sc);
setpixel(7, 3, sb);
setpixel(8, 3, sc);
setpixel(11, 3, sa);
setpixel(1, 4, sa);
setpixel(3, 4, sb);
setpixel(4, 4, sb);
setpixel(5, 4, sc);
setpixel(6, 4, sb);
setpixel(7, 4, sc);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(11, 4, sa);
setpixel(1, 5, sa);
setpixel(3, 5, sc);
setpixel(4, 5, sc);
setpixel(5, 5, sb);
setpixel(6, 5, sc);
setpixel(7, 5, sb);
setpixel(8, 5, sc);
setpixel(9, 5, sc);
setpixel(11, 5, sa);
setpixel(1, 6, sa);
setpixel(3, 6, sb);
setpixel(4, 6, sb);
setpixel(5, 6, sc);
setpixel(6, 6, sb);
setpixel(7, 6, sc);
setpixel(8, 6, sb);
setpixel(9, 6, sb);
setpixel(11, 6, sa);
setpixel(1, 7, sa);
setpixel(4, 7, sc);
setpixel(5, 7, sb);
setpixel(6, 7, sc);
setpixel(7, 7, sb);
setpixel(8, 7, sc);
setpixel(11, 7, sa);
setpixel(2, 8, sa);
setpixel(5, 8, sb);
setpixel(6, 8, sc);
setpixel(7, 8, sb);
setpixel(10, 8, sa);
setpixel(3, 9, sa);
setpixel(9, 9, sa);
setpixel(4, 10, sa);
setpixel(5, 10, sa);
setpixel(6, 10, sa);
setpixel(7, 10, sa);
setpixel(8, 10, sa);
        
        
        
        
for ( int c = 0; c < 10; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}
