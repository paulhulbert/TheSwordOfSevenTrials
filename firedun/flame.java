/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;

import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class flame extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public flame( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 10, dir * 15, 1, 10, 150, false, new boolean[10], new Color[10], 47, 7, momentx, momenty );
        
        melee = false;
        
        

sa = new Color(255,0,0);
sb = new Color(255,204,0);
sc = new Color(255,102,0);
sd = new Color(255,255,255);
se = new Color(255,255,153);
        
        buildpic();
        
        
        name = "flame";
        
        
    }
    
    public static int getrange()
    {
        
        return 100;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 47 * 7; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        setpixel(15, 0, sa);
setpixel(8, 1, sa);
setpixel(10, 1, sa);
setpixel(18, 1, sa);
setpixel(19, 1, sa);
setpixel(26, 1, sa);
setpixel(27, 1, sa);
setpixel(28, 1, sa);
setpixel(29, 1, sa);
setpixel(30, 1, sa);
setpixel(31, 1, sb);
setpixel(37, 1, sb);
setpixel(41, 1, sb);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sa);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(15, 2, sa);
setpixel(16, 2, sa);
setpixel(17, 2, sa);
setpixel(20, 2, sa);
setpixel(21, 2, sa);
setpixel(22, 2, sa);
setpixel(23, 2, sa);
setpixel(24, 2, sa);
setpixel(25, 2, sb);
setpixel(26, 2, sa);
setpixel(27, 2, sa);
setpixel(28, 2, sb);
setpixel(29, 2, sc);
setpixel(30, 2, sc);
setpixel(31, 2, sb);
setpixel(32, 2, sc);
setpixel(33, 2, sb);
setpixel(34, 2, sc);
setpixel(35, 2, sb);
setpixel(36, 2, sb);
setpixel(38, 2, sa);
setpixel(39, 2, sd);
setpixel(40, 2, sc);
setpixel(42, 2, sa);
setpixel(43, 2, se);
setpixel(45, 2, sb);
setpixel(0, 3, sd);
setpixel(1, 3, sa);
setpixel(2, 3, sa);
setpixel(3, 3, sa);
setpixel(4, 3, sa);
setpixel(5, 3, sc);
setpixel(6, 3, sc);
setpixel(7, 3, sa);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(18, 3, sa);
setpixel(19, 3, sa);
setpixel(20, 3, sa);
setpixel(21, 3, sa);
setpixel(22, 3, sa);
setpixel(24, 3, sa);
setpixel(26, 3, sc);
setpixel(27, 3, sc);
setpixel(28, 3, sc);
setpixel(29, 3, sc);
setpixel(30, 3, sc);
setpixel(31, 3, sb);
setpixel(32, 3, sc);
setpixel(33, 3, sc);
setpixel(34, 3, sb);
setpixel(35, 3, sc);
setpixel(36, 3, sb);
setpixel(37, 3, sa);
setpixel(38, 3, sd);
setpixel(39, 3, sc);
setpixel(40, 3, sb);
setpixel(41, 3, sd);
setpixel(42, 3, sd);
setpixel(44, 3, sb);
setpixel(45, 3, sd);
setpixel(47, 3, sd);
setpixel(3, 4, sa);
setpixel(4, 4, sa);
setpixel(6, 4, sc);
setpixel(7, 4, sc);
setpixel(8, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sc);
setpixel(13, 4, sc);
setpixel(15, 4, sa);
setpixel(17, 4, sa);
setpixel(18, 4, sa);
setpixel(20, 4, sa);
setpixel(24, 4, sb);
setpixel(26, 4, sb);
setpixel(29, 4, sa);
setpixel(32, 4, sa);
setpixel(33, 4, sa);
setpixel(34, 4, sb);
setpixel(35, 4, sb);
setpixel(36, 4, sb);
setpixel(37, 4, sc);
setpixel(38, 4, sc);
setpixel(39, 4, sd);
setpixel(40, 4, sc);
setpixel(41, 4, se);
setpixel(42, 4, sc);
setpixel(43, 4, sc);
setpixel(45, 4, se);
setpixel(4, 5, sa);
setpixel(5, 5, sa);
setpixel(8, 5, sa);
setpixel(10, 5, sa);
setpixel(11, 5, sa);
setpixel(15, 5, sc);
setpixel(17, 5, sc);
setpixel(18, 5, sc);
setpixel(19, 5, sc);
setpixel(20, 5, sa);
setpixel(21, 5, sc);
setpixel(22, 5, sc);
setpixel(23, 5, sb);
setpixel(24, 5, sc);
setpixel(25, 5, sb);
setpixel(26, 5, sc);
setpixel(30, 5, sb);
setpixel(31, 5, sa);
setpixel(32, 5, sb);
setpixel(33, 5, sb);
setpixel(34, 5, sb);
setpixel(36, 5, sb);
setpixel(38, 5, sa);
setpixel(39, 5, se);
setpixel(40, 5, se);
setpixel(41, 5, sd);
setpixel(42, 5, sd);
setpixel(43, 5, sd);
setpixel(44, 5, sd);
setpixel(46, 5, sd);
setpixel(10, 6, sa);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(13, 6, sa);
setpixel(14, 6, sa);
setpixel(16, 6, sa);
setpixel(17, 6, sa);
setpixel(18, 6, sa);
setpixel(19, 6, sa);
setpixel(20, 6, sa);
setpixel(22, 6, sa);
setpixel(23, 6, sb);
setpixel(24, 6, sb);
setpixel(25, 6, sc);
setpixel(27, 6, sa);
setpixel(28, 6, sc);
setpixel(29, 6, sc);
setpixel(30, 6, sc);
setpixel(31, 6, sa);
setpixel(33, 6, sc);
setpixel(34, 6, sb);
setpixel(35, 6, sc);
setpixel(36, 6, sd);
setpixel(38, 6, sd);
setpixel(39, 6, sd);
setpixel(40, 6, sd);
setpixel(43, 6, sd);
setpixel(22, 7, sa);
setpixel(25, 7, sa);
setpixel(30, 7, sb);
setpixel(32, 7, sb);
        
        
for ( int c = 0; c < 7; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


