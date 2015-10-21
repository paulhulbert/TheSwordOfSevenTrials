/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weapons;

import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class hammerblast extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public hammerblast( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x, y + 21, dir * 3, 0, 10, 40, true, new boolean[10], new Color[10], 33, 7, momentx, momenty );
        
        melee = false;
        
        
sa = new Color(255,198,0,100);
sb = new Color(255,141,0,120);
sc = new Color(255,102,0,140);
sd = new Color(255,51,0,160);
se = new Color(255,0,0,180);
sf = new Color(204,0,0,200);
        
        buildpic();
        
        
        name = "hammerblast";
        
        
    }
    
    public static int getrange()
    {
        
        return 1000;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 33 * 7; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        


setpixel(15, 0, sa);
setpixel(16, 0, sa);
setpixel(17, 0, sa);
setpixel(18, 0, sa);
setpixel(19, 0, sa);
setpixel(20, 0, sa);
setpixel(21, 0, sa);
setpixel(22, 0, sa);
setpixel(23, 0, sa);
setpixel(24, 0, sa);
setpixel(25, 0, sa);
setpixel(26, 0, sa);
setpixel(27, 0, sa);
setpixel(28, 0, sa);
setpixel(29, 0, sa);
setpixel(30, 0, sa);
setpixel(31, 0, sa);
setpixel(32, 0, sa);
setpixel(33, 0, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sb);
setpixel(16, 1, sb);
setpixel(17, 1, sb);
setpixel(18, 1, sb);
setpixel(19, 1, sb);
setpixel(20, 1, sb);
setpixel(21, 1, sb);
setpixel(22, 1, sb);
setpixel(23, 1, sb);
setpixel(24, 1, sb);
setpixel(25, 1, sb);
setpixel(26, 1, sb);
setpixel(27, 1, sb);
setpixel(28, 1, sb);
setpixel(29, 1, sb);
setpixel(30, 1, sb);
setpixel(31, 1, sb);
setpixel(32, 1, sb);
setpixel(33, 1, sb);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sb);
setpixel(14, 2, sb);
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
setpixel(32, 2, sc);
setpixel(33, 2, sc);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sc);
setpixel(14, 3, sc);
setpixel(15, 3, sd);
setpixel(16, 3, sd);
setpixel(17, 3, sd);
setpixel(18, 3, sd);
setpixel(19, 3, sd);
setpixel(20, 3, sd);
setpixel(21, 3, sd);
setpixel(22, 3, sd);
setpixel(23, 3, sd);
setpixel(24, 3, sd);
setpixel(25, 3, sd);
setpixel(26, 3, sd);
setpixel(27, 3, sd);
setpixel(28, 3, sd);
setpixel(29, 3, sd);
setpixel(30, 3, sd);
setpixel(31, 3, sd);
setpixel(32, 3, sd);
setpixel(33, 3, sd);
setpixel(7, 4, sa);
setpixel(8, 4, sa);
setpixel(9, 4, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sc);
setpixel(12, 4, sc);
setpixel(13, 4, sd);
setpixel(14, 4, sd);
setpixel(15, 4, se);
setpixel(16, 4, se);
setpixel(17, 4, se);
setpixel(18, 4, se);
setpixel(19, 4, se);
setpixel(20, 4, se);
setpixel(21, 4, se);
setpixel(22, 4, se);
setpixel(23, 4, se);
setpixel(24, 4, se);
setpixel(25, 4, se);
setpixel(26, 4, se);
setpixel(27, 4, se);
setpixel(28, 4, se);
setpixel(29, 4, se);
setpixel(30, 4, se);
setpixel(31, 4, se);
setpixel(32, 4, se);
setpixel(33, 4, se);
setpixel(5, 5, sa);
setpixel(6, 5, sa);
setpixel(7, 5, sb);
setpixel(8, 5, sb);
setpixel(9, 5, sc);
setpixel(10, 5, sc);
setpixel(11, 5, sd);
setpixel(12, 5, sd);
setpixel(13, 5, se);
setpixel(14, 5, se);
setpixel(15, 5, se);
setpixel(16, 5, se);
setpixel(17, 5, se);
setpixel(18, 5, se);
setpixel(19, 5, se);
setpixel(20, 5, se);
setpixel(21, 5, se);
setpixel(22, 5, se);
setpixel(23, 5, se);
setpixel(24, 5, se);
setpixel(25, 5, se);
setpixel(26, 5, se);
setpixel(27, 5, se);
setpixel(28, 5, se);
setpixel(29, 5, se);
setpixel(30, 5, se);
setpixel(31, 5, se);
setpixel(32, 5, se);
setpixel(33, 5, se);
setpixel(3, 6, sa);
setpixel(4, 6, sa);
setpixel(5, 6, sb);
setpixel(6, 6, sb);
setpixel(7, 6, sc);
setpixel(8, 6, sc);
setpixel(9, 6, sd);
setpixel(10, 6, sd);
setpixel(11, 6, se);
setpixel(12, 6, se);
setpixel(13, 6, se);
setpixel(14, 6, se);
setpixel(15, 6, sf);
setpixel(16, 6, sf);
setpixel(17, 6, sf);
setpixel(18, 6, sf);
setpixel(19, 6, sf);
setpixel(20, 6, sf);
setpixel(21, 6, sf);
setpixel(22, 6, sf);
setpixel(23, 6, sf);
setpixel(24, 6, sf);
setpixel(25, 6, sf);
setpixel(26, 6, sf);
setpixel(27, 6, sf);
setpixel(28, 6, sf);
setpixel(29, 6, sf);
setpixel(30, 6, sf);
setpixel(31, 6, sf);
setpixel(32, 6, sf);
setpixel(33, 6, sf);
setpixel(0, 7, sa);
setpixel(1, 7, sa);
setpixel(2, 7, sa);
setpixel(3, 7, sb);
setpixel(4, 7, sb);
setpixel(5, 7, sc);
setpixel(6, 7, sc);
setpixel(7, 7, sd);
setpixel(8, 7, sd);
setpixel(9, 7, se);
setpixel(10, 7, se);
setpixel(11, 7, se);
setpixel(12, 7, se);
setpixel(13, 7, sf);
setpixel(14, 7, sf);
setpixel(15, 7, sf);
setpixel(16, 7, sf);
setpixel(17, 7, sf);
setpixel(18, 7, sf);
setpixel(19, 7, sf);
setpixel(20, 7, sf);
setpixel(21, 7, sf);
setpixel(22, 7, sf);
setpixel(23, 7, sf);
setpixel(24, 7, sf);
setpixel(25, 7, sf);
setpixel(26, 7, sf);
setpixel(27, 7, sf);
setpixel(28, 7, sf);
setpixel(29, 7, sf);
setpixel(30, 7, sf);
setpixel(31, 7, sf);
setpixel(32, 7, sf);
setpixel(33, 7, sf);
        
     
for ( int c = 0; c < 7; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


