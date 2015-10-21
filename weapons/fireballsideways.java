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
public class fireballsideways extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public fireballsideways( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 90, dir * 8, 0, 10, 1000, false, new boolean[10], new Color[10], 37, 16, momentx, momenty );
        
        melee = false;
        
        
sa = new Color(255,255,255);
sb = new Color(255,0,0);
sc = new Color(255,59,0);
sd = new Color(255,106,0);
se = new Color(255,27,2);
sf = new Color(255,186,1);
sg = new Color(255,255,27);

        
        buildpic();
        
        
        name = "fireballsideways";
        
        
    }
    
    public static int getrange()
    {
        
        return 1000;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 37 * 16; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        


setpixel(21, 0, sa);
setpixel(22, 0, sa);
setpixel(26, 0, sb);
setpixel(27, 0, sb);
setpixel(28, 0, sb);
setpixel(29, 0, sb);
setpixel(30, 0, sb);
setpixel(31, 0, sb);
setpixel(32, 0, sb);
setpixel(10, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sa);
setpixel(16, 1, sa);
setpixel(17, 1, sa);
setpixel(18, 1, sa);
setpixel(19, 1, sa);
setpixel(20, 1, sa);
setpixel(22, 1, sc);
setpixel(23, 1, sc);
setpixel(24, 1, sc);
setpixel(25, 1, sc);
setpixel(26, 1, sc);
setpixel(27, 1, sc);
setpixel(28, 1, sb);
setpixel(29, 1, sb);
setpixel(30, 1, sb);
setpixel(31, 1, sb);
setpixel(32, 1, sc);
setpixel(33, 1, sb);
setpixel(34, 1, sb);
setpixel(21, 2, sc);
setpixel(22, 2, sc);
setpixel(23, 2, sb);
setpixel(24, 2, sd);
setpixel(25, 2, sd);
setpixel(26, 2, sd);
setpixel(27, 2, sd);
setpixel(28, 2, sd);
setpixel(29, 2, se);
setpixel(30, 2, se);
setpixel(31, 2, sb);
setpixel(32, 2, sc);
setpixel(33, 2, se);
setpixel(34, 2, se);
setpixel(35, 2, sb);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(16, 3, sa);
setpixel(17, 3, sa);
setpixel(18, 3, sa);
setpixel(19, 3, sa);
setpixel(20, 3, sf);
setpixel(21, 3, sf);
setpixel(22, 3, sf);
setpixel(23, 3, sb);
setpixel(24, 3, sb);
setpixel(25, 3, sb);
setpixel(26, 3, se);
setpixel(27, 3, sb);
setpixel(28, 3, sd);
setpixel(29, 3, sb);
setpixel(30, 3, se);
setpixel(31, 3, se);
setpixel(32, 3, sc);
setpixel(33, 3, sc);
setpixel(34, 3, se);
setpixel(35, 3, se);
setpixel(36, 3, sb);
setpixel(4, 4, sa);
setpixel(5, 4, sa);
setpixel(6, 4, sa);
setpixel(9, 4, sa);
setpixel(18, 4, sb);
setpixel(19, 4, sf);
setpixel(20, 4, sf);
setpixel(21, 4, sb);
setpixel(22, 4, sd);
setpixel(23, 4, se);
setpixel(24, 4, se);
setpixel(25, 4, se);
setpixel(26, 4, sc);
setpixel(27, 4, sc);
setpixel(28, 4, sc);
setpixel(29, 4, sc);
setpixel(30, 4, sc);
setpixel(31, 4, sc);
setpixel(32, 4, sc);
setpixel(33, 4, sc);
setpixel(34, 4, se);
setpixel(35, 4, se);
setpixel(36, 4, sb);
setpixel(7, 5, sa);
setpixel(8, 5, sa);
setpixel(9, 5, sa);
setpixel(12, 5, sf);
setpixel(13, 5, sf);
setpixel(14, 5, sf);
setpixel(15, 5, sf);
setpixel(16, 5, sf);
setpixel(17, 5, sf);
setpixel(18, 5, sf);
setpixel(19, 5, sf);
setpixel(20, 5, sf);
setpixel(21, 5, sf);
setpixel(22, 5, sf);
setpixel(23, 5, sc);
setpixel(24, 5, sc);
setpixel(25, 5, sc);
setpixel(26, 5, se);
setpixel(27, 5, se);
setpixel(28, 5, sc);
setpixel(29, 5, sb);
setpixel(30, 5, sb);
setpixel(31, 5, se);
setpixel(32, 5, sc);
setpixel(33, 5, sc);
setpixel(34, 5, se);
setpixel(35, 5, se);
setpixel(36, 5, sb);
setpixel(37, 5, sb);
setpixel(11, 6, sf);
setpixel(12, 6, sg);
setpixel(13, 6, sg);
setpixel(14, 6, sb);
setpixel(15, 6, sb);
setpixel(16, 6, sd);
setpixel(17, 6, sd);
setpixel(18, 6, sd);
setpixel(19, 6, sd);
setpixel(20, 6, sd);
setpixel(21, 6, sd);
setpixel(22, 6, sd);
setpixel(23, 6, se);
setpixel(24, 6, se);
setpixel(25, 6, se);
setpixel(26, 6, sb);
setpixel(27, 6, sb);
setpixel(28, 6, sc);
setpixel(29, 6, sc);
setpixel(30, 6, sb);
setpixel(31, 6, sb);
setpixel(32, 6, se);
setpixel(33, 6, sc);
setpixel(34, 6, se);
setpixel(35, 6, se);
setpixel(36, 6, se);
setpixel(37, 6, sb);
setpixel(5, 7, sa);
setpixel(6, 7, sa);
setpixel(7, 7, sa);
setpixel(8, 7, sa);
setpixel(9, 7, sf);
setpixel(10, 7, sf);
setpixel(11, 7, sf);
setpixel(12, 7, sf);
setpixel(13, 7, sf);
setpixel(14, 7, sf);
setpixel(15, 7, sd);
setpixel(16, 7, sf);
setpixel(17, 7, sb);
setpixel(18, 7, sd);
setpixel(19, 7, sd);
setpixel(20, 7, sf);
setpixel(21, 7, sf);
setpixel(22, 7, sf);
setpixel(23, 7, sf);
setpixel(24, 7, sf);
setpixel(25, 7, sf);
setpixel(26, 7, sd);
setpixel(27, 7, sd);
setpixel(28, 7, sd);
setpixel(29, 7, sd);
setpixel(30, 7, sd);
setpixel(31, 7, sd);
setpixel(32, 7, sd);
setpixel(33, 7, sc);
setpixel(34, 7, sb);
setpixel(35, 7, se);
setpixel(36, 7, se);
setpixel(37, 7, sb);
setpixel(4, 8, sa);
setpixel(5, 8, sa);
setpixel(6, 8, sg);
setpixel(7, 8, sg);
setpixel(8, 8, sg);
setpixel(9, 8, sg);
setpixel(10, 8, sf);
setpixel(11, 8, sf);
setpixel(12, 8, sf);
setpixel(13, 8, sf);
setpixel(14, 8, sf);
setpixel(15, 8, sf);
setpixel(16, 8, sb);
setpixel(17, 8, sc);
setpixel(18, 8, sc);
setpixel(19, 8, sc);
setpixel(20, 8, sf);
setpixel(21, 8, sb);
setpixel(22, 8, sb);
setpixel(23, 8, sd);
setpixel(24, 8, sd);
setpixel(25, 8, se);
setpixel(26, 8, se);
setpixel(27, 8, sb);
setpixel(28, 8, sd);
setpixel(29, 8, sc);
setpixel(30, 8, sb);
setpixel(31, 8, sb);
setpixel(32, 8, se);
setpixel(33, 8, sc);
setpixel(34, 8, sb);
setpixel(35, 8, se);
setpixel(36, 8, se);
setpixel(37, 8, sb);
setpixel(0, 9, sa);
setpixel(6, 9, sa);
setpixel(7, 9, sa);
setpixel(8, 9, sa);
setpixel(9, 9, sg);
setpixel(10, 9, sg);
setpixel(11, 9, sg);
setpixel(12, 9, sf);
setpixel(13, 9, sf);
setpixel(14, 9, sf);
setpixel(15, 9, sa);
setpixel(16, 9, sa);
setpixel(17, 9, sf);
setpixel(18, 9, se);
setpixel(19, 9, se);
setpixel(20, 9, se);
setpixel(21, 9, se);
setpixel(22, 9, se);
setpixel(23, 9, sc);
setpixel(24, 9, sd);
setpixel(25, 9, sb);
setpixel(26, 9, se);
setpixel(27, 9, sc);
setpixel(28, 9, sd);
setpixel(29, 9, sb);
setpixel(30, 9, sb);
setpixel(31, 9, sb);
setpixel(32, 9, se);
setpixel(33, 9, sc);
setpixel(34, 9, sb);
setpixel(35, 9, se);
setpixel(36, 9, se);
setpixel(37, 9, sb);
setpixel(13, 10, sa);
setpixel(14, 10, sf);
setpixel(15, 10, sf);
setpixel(16, 10, sf);
setpixel(17, 10, sa);
setpixel(18, 10, sf);
setpixel(19, 10, sa);
setpixel(20, 10, sa);
setpixel(21, 10, sb);
setpixel(22, 10, sf);
setpixel(23, 10, sc);
setpixel(24, 10, sd);
setpixel(25, 10, sb);
setpixel(26, 10, sb);
setpixel(27, 10, sb);
setpixel(28, 10, sd);
setpixel(29, 10, se);
setpixel(30, 10, se);
setpixel(31, 10, se);
setpixel(32, 10, se);
setpixel(33, 10, sc);
setpixel(34, 10, se);
setpixel(35, 10, se);
setpixel(36, 10, sb);
setpixel(37, 10, sb);
setpixel(9, 11, sa);
setpixel(10, 11, sa);
setpixel(11, 11, sa);
setpixel(12, 11, sa);
setpixel(16, 11, sb);
setpixel(17, 11, sb);
setpixel(18, 11, sf);
setpixel(19, 11, sf);
setpixel(20, 11, sd);
setpixel(21, 11, se);
setpixel(22, 11, se);
setpixel(23, 11, sf);
setpixel(24, 11, sd);
setpixel(25, 11, sc);
setpixel(26, 11, sc);
setpixel(27, 11, sd);
setpixel(28, 11, sd);
setpixel(29, 11, sc);
setpixel(30, 11, sc);
setpixel(31, 11, sc);
setpixel(32, 11, sc);
setpixel(33, 11, sc);
setpixel(34, 11, se);
setpixel(35, 11, sb);
setpixel(36, 11, sb);
setpixel(37, 11, sb);
setpixel(1, 12, sa);
setpixel(2, 12, sa);
setpixel(3, 12, sa);
setpixel(4, 12, sa);
setpixel(5, 12, sa);
setpixel(18, 12, sb);
setpixel(19, 12, sb);
setpixel(20, 12, sd);
setpixel(21, 12, sd);
setpixel(22, 12, sd);
setpixel(23, 12, sd);
setpixel(24, 12, sf);
setpixel(25, 12, sf);
setpixel(26, 12, sb);
setpixel(27, 12, sd);
setpixel(28, 12, sd);
setpixel(29, 12, sd);
setpixel(30, 12, sb);
setpixel(31, 12, sb);
setpixel(32, 12, sc);
setpixel(33, 12, se);
setpixel(34, 12, se);
setpixel(35, 12, sb);
setpixel(36, 12, sb);
setpixel(5, 13, sa);
setpixel(6, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(13, 13, sa);
setpixel(14, 13, sa);
setpixel(15, 13, sa);
setpixel(16, 13, sa);
setpixel(17, 13, sa);
setpixel(18, 13, sa);
setpixel(19, 13, sf);
setpixel(20, 13, sf);
setpixel(21, 13, sd);
setpixel(22, 13, sd);
setpixel(23, 13, sd);
setpixel(24, 13, sc);
setpixel(25, 13, sc);
setpixel(26, 13, sf);
setpixel(27, 13, sf);
setpixel(28, 13, sd);
setpixel(29, 13, sd);
setpixel(30, 13, sd);
setpixel(31, 13, sc);
setpixel(32, 13, sc);
setpixel(33, 13, se);
setpixel(34, 13, sb);
setpixel(35, 13, sb);
setpixel(36, 13, sb);
setpixel(11, 14, sa);
setpixel(12, 14, sa);
setpixel(13, 14, sa);
setpixel(14, 14, sa);
setpixel(15, 14, sa);
setpixel(18, 14, sa);
setpixel(19, 14, sa);
setpixel(20, 14, sf);
setpixel(21, 14, sf);
setpixel(22, 14, sd);
setpixel(23, 14, sd);
setpixel(24, 14, sd);
setpixel(25, 14, sd);
setpixel(26, 14, sb);
setpixel(27, 14, sf);
setpixel(28, 14, sf);
setpixel(29, 14, sb);
setpixel(30, 14, sd);
setpixel(31, 14, sb);
setpixel(32, 14, sb);
setpixel(33, 14, sb);
setpixel(34, 14, sb);
setpixel(35, 14, sb);
setpixel(15, 15, sa);
setpixel(16, 15, sa);
setpixel(17, 15, sa);
setpixel(21, 15, sf);
setpixel(22, 15, sf);
setpixel(24, 15, sb);
setpixel(25, 15, sb);
setpixel(26, 15, sb);
setpixel(27, 15, sb);
setpixel(28, 15, sd);
setpixel(29, 15, sc);
setpixel(30, 15, sc);
setpixel(31, 15, sd);
setpixel(32, 15, sb);
setpixel(33, 15, sb);
setpixel(34, 15, sb);
setpixel(26, 16, sb);
setpixel(27, 16, sb);
setpixel(28, 16, sb);
setpixel(29, 16, sb);
setpixel(30, 16, sb);
setpixel(31, 16, sd);
setpixel(32, 16, sb);
        
for ( int c = 0; c < 16; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


