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
public class greenspikeball extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public greenspikeball( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y - 25, dir * 8, 0, 10, 2000, false, new boolean[10], new Color[10], 30, 25, momentx, momenty );
        
        melee = false;
        
        
        
sa = new Color(204,51,0);
sb = new Color(255,51,0);
sc = new Color(102,153,0);
sd = new Color(102,204,0);
se = new Color(51,255,51);
sf = new Color(153,153,153);
sg = new Color(102,102,102);
        
        buildpic();
        
        
        name = "greenspikeball";
        
        
    }
    
    public static int getrange()
    {
        
        return 2000;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 30 * 25; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        


setpixel(15, 0, sa);
setpixel(16, 0, sb);
setpixel(17, 0, sa);
setpixel(14, 1, sb);
setpixel(15, 1, sa);
setpixel(16, 1, sb);
setpixel(17, 1, sa);
setpixel(18, 1, sb);
setpixel(13, 2, sa);
setpixel(14, 2, sb);
setpixel(15, 2, sa);
setpixel(16, 2, sb);
setpixel(17, 2, sa);
setpixel(18, 2, sb);
setpixel(19, 2, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sb);
setpixel(15, 3, sa);
setpixel(16, 3, sa);
setpixel(17, 3, sa);
setpixel(18, 3, sb);
setpixel(19, 3, sa);
setpixel(20, 3, sa);
setpixel(12, 4, sc);
setpixel(13, 4, sa);
setpixel(14, 4, sa);
setpixel(15, 4, sb);
setpixel(16, 4, sa);
setpixel(17, 4, sb);
setpixel(18, 4, sa);
setpixel(19, 4, sa);
setpixel(20, 4, sd);
setpixel(11, 5, sc);
setpixel(12, 5, sd);
setpixel(13, 5, sd);
setpixel(14, 5, sc);
setpixel(15, 5, sc);
setpixel(16, 5, sd);
setpixel(17, 5, sc);
setpixel(18, 5, sc);
setpixel(19, 5, sc);
setpixel(20, 5, sd);
setpixel(21, 5, se);
setpixel(10, 6, sc);
setpixel(11, 6, sc);
setpixel(12, 6, sd);
setpixel(13, 6, sc);
setpixel(14, 6, se);
setpixel(15, 6, se);
setpixel(16, 6, sd);
setpixel(17, 6, sc);
setpixel(18, 6, sc);
setpixel(19, 6, sc);
setpixel(20, 6, sd);
setpixel(21, 6, se);
setpixel(22, 6, se);
setpixel(5, 7, sf);
setpixel(6, 7, sf);
setpixel(7, 7, sf);
setpixel(8, 7, sf);
setpixel(9, 7, sc);
setpixel(10, 7, sc);
setpixel(11, 7, sd);
setpixel(12, 7, sf);
setpixel(13, 7, sf);
setpixel(14, 7, sc);
setpixel(15, 7, sc);
setpixel(16, 7, sd);
setpixel(17, 7, sc);
setpixel(18, 7, sc);
setpixel(19, 7, sf);
setpixel(20, 7, sf);
setpixel(21, 7, sc);
setpixel(22, 7, sc);
setpixel(23, 7, sc);
setpixel(24, 7, sf);
setpixel(25, 7, sf);
setpixel(26, 7, sf);
setpixel(0, 8, se);
setpixel(2, 8, sg);
setpixel(3, 8, sg);
setpixel(4, 8, sg);
setpixel(5, 8, sf);
setpixel(6, 8, sf);
setpixel(7, 8, sf);
setpixel(8, 8, sf);
setpixel(9, 8, sc);
setpixel(10, 8, sc);
setpixel(11, 8, sf);
setpixel(12, 8, sf);
setpixel(13, 8, sf);
setpixel(14, 8, sf);
setpixel(15, 8, sc);
setpixel(16, 8, sd);
setpixel(17, 8, sc);
setpixel(18, 8, sf);
setpixel(19, 8, sf);
setpixel(20, 8, sf);
setpixel(21, 8, sf);
setpixel(22, 8, sc);
setpixel(23, 8, sc);
setpixel(24, 8, sf);
setpixel(25, 8, sf);
setpixel(26, 8, sf);
setpixel(27, 8, sf);
setpixel(28, 8, sg);
setpixel(29, 8, sg);
setpixel(30, 8, sg);
setpixel(6, 9, sf);
setpixel(7, 9, sf);
setpixel(8, 9, sf);
setpixel(9, 9, sc);
setpixel(10, 9, sf);
setpixel(11, 9, sf);
setpixel(12, 9, sf);
setpixel(13, 9, sf);
setpixel(14, 9, sf);
setpixel(15, 9, sd);
setpixel(16, 9, sd);
setpixel(17, 9, sc);
setpixel(18, 9, sf);
setpixel(19, 9, sf);
setpixel(20, 9, sf);
setpixel(21, 9, sf);
setpixel(22, 9, sf);
setpixel(23, 9, sc);
setpixel(24, 9, sf);
setpixel(25, 9, sf);
setpixel(26, 9, sf);
setpixel(27, 9, sf);
setpixel(8, 10, sc);
setpixel(9, 10, sc);
setpixel(10, 10, sf);
setpixel(11, 10, sg);
setpixel(12, 10, sf);
setpixel(13, 10, sc);
setpixel(14, 10, sc);
setpixel(15, 10, sd);
setpixel(16, 10, sd);
setpixel(17, 10, sd);
setpixel(18, 10, sc);
setpixel(19, 10, sc);
setpixel(20, 10, sf);
setpixel(21, 10, sg);
setpixel(22, 10, sf);
setpixel(23, 10, sc);
setpixel(24, 10, sc);
setpixel(8, 11, sc);
setpixel(9, 11, sg);
setpixel(10, 11, sg);
setpixel(11, 11, sc);
setpixel(12, 11, sc);
setpixel(13, 11, sc);
setpixel(14, 11, sc);
setpixel(15, 11, sd);
setpixel(16, 11, sc);
setpixel(17, 11, sd);
setpixel(18, 11, sc);
setpixel(19, 11, sc);
setpixel(20, 11, sc);
setpixel(21, 11, sd);
setpixel(22, 11, sg);
setpixel(23, 11, sg);
setpixel(24, 11, sc);
setpixel(8, 12, sc);
setpixel(9, 12, sc);
setpixel(10, 12, sd);
setpixel(11, 12, sc);
setpixel(12, 12, sc);
setpixel(13, 12, sc);
setpixel(14, 12, sc);
setpixel(15, 12, sd);
setpixel(16, 12, sc);
setpixel(17, 12, sd);
setpixel(18, 12, sd);
setpixel(19, 12, sc);
setpixel(20, 12, sc);
setpixel(21, 12, sc);
setpixel(22, 12, sd);
setpixel(23, 12, sc);
setpixel(24, 12, sc);
setpixel(7, 13, sc);
setpixel(8, 13, sc);
setpixel(9, 13, sd);
setpixel(10, 13, sd);
setpixel(11, 13, sc);
setpixel(12, 13, sc);
setpixel(13, 13, se);
setpixel(14, 13, sc);
setpixel(15, 13, sd);
setpixel(16, 13, sc);
setpixel(17, 13, sc);
setpixel(18, 13, sd);
setpixel(19, 13, sc);
setpixel(20, 13, sc);
setpixel(21, 13, sc);
setpixel(22, 13, sd);
setpixel(23, 13, sc);
setpixel(24, 13, sc);
setpixel(25, 13, sc);
setpixel(7, 14, sc);
setpixel(8, 14, sc);
setpixel(9, 14, sd);
setpixel(10, 14, sc);
setpixel(11, 14, sc);
setpixel(12, 14, se);
setpixel(13, 14, sc);
setpixel(14, 14, sc);
setpixel(15, 14, sd);
setpixel(16, 14, sc);
setpixel(17, 14, sc);
setpixel(18, 14, sd);
setpixel(19, 14, sc);
setpixel(20, 14, sc);
setpixel(21, 14, sc);
setpixel(22, 14, sd);
setpixel(23, 14, sd);
setpixel(24, 14, sc);
setpixel(25, 14, sc);
setpixel(7, 15, sc);
setpixel(8, 15, sc);
setpixel(9, 15, sd);
setpixel(10, 15, sc);
setpixel(11, 15, sc);
setpixel(12, 15, se);
setpixel(13, 15, sc);
setpixel(14, 15, sc);
setpixel(15, 15, sd);
setpixel(16, 15, sc);
setpixel(17, 15, sc);
setpixel(18, 15, sd);
setpixel(19, 15, sc);
setpixel(20, 15, sc);
setpixel(21, 15, sc);
setpixel(22, 15, sc);
setpixel(23, 15, sd);
setpixel(24, 15, sc);
setpixel(25, 15, sc);
setpixel(7, 16, sc);
setpixel(8, 16, sd);
setpixel(9, 16, sd);
setpixel(10, 16, sc);
setpixel(11, 16, se);
setpixel(12, 16, se);
setpixel(13, 16, sc);
setpixel(14, 16, sc);
setpixel(15, 16, sd);
setpixel(16, 16, sc);
setpixel(17, 16, sc);
setpixel(18, 16, sd);
setpixel(19, 16, se);
setpixel(20, 16, se);
setpixel(21, 16, sc);
setpixel(22, 16, sc);
setpixel(23, 16, sd);
setpixel(24, 16, sc);
setpixel(25, 16, sc);
setpixel(7, 17, sc);
setpixel(8, 17, sd);
setpixel(9, 17, sc);
setpixel(10, 17, sc);
setpixel(11, 17, se);
setpixel(12, 17, sc);
setpixel(13, 17, sc);
setpixel(14, 17, sd);
setpixel(15, 17, sc);
setpixel(16, 17, sc);
setpixel(17, 17, sc);
setpixel(18, 17, sd);
setpixel(19, 17, sc);
setpixel(20, 17, se);
setpixel(21, 17, sc);
setpixel(22, 17, sc);
setpixel(23, 17, sd);
setpixel(24, 17, sc);
setpixel(25, 17, sc);
setpixel(6, 18, sc);
setpixel(7, 18, sc);
setpixel(8, 18, sd);
setpixel(9, 18, sc);
setpixel(10, 18, sc);
setpixel(11, 18, se);
setpixel(12, 18, sc);
setpixel(13, 18, sc);
setpixel(14, 18, sd);
setpixel(15, 18, sc);
setpixel(16, 18, sc);
setpixel(17, 18, sc);
setpixel(18, 18, sd);
setpixel(19, 18, sc);
setpixel(20, 18, se);
setpixel(21, 18, sc);
setpixel(22, 18, sc);
setpixel(23, 18, sd);
setpixel(24, 18, sc);
setpixel(25, 18, sc);
setpixel(26, 18, sc);
setpixel(6, 19, sc);
setpixel(7, 19, sc);
setpixel(8, 19, sd);
setpixel(9, 19, sc);
setpixel(10, 19, sc);
setpixel(11, 19, sc);
setpixel(12, 19, sc);
setpixel(13, 19, sd);
setpixel(14, 19, sd);
setpixel(15, 19, sc);
setpixel(16, 19, sc);
setpixel(17, 19, sc);
setpixel(18, 19, sc);
setpixel(19, 19, sd);
setpixel(20, 19, se);
setpixel(21, 19, sc);
setpixel(22, 19, sc);
setpixel(23, 19, sd);
setpixel(24, 19, sc);
setpixel(25, 19, sc);
setpixel(26, 19, sc);
setpixel(6, 20, se);
setpixel(7, 20, sc);
setpixel(8, 20, sd);
setpixel(9, 20, sc);
setpixel(10, 20, sc);
setpixel(11, 20, sc);
setpixel(12, 20, sc);
setpixel(13, 20, sd);
setpixel(14, 20, sc);
setpixel(15, 20, sc);
setpixel(16, 20, sc);
setpixel(17, 20, se);
setpixel(18, 20, sc);
setpixel(19, 20, sd);
setpixel(20, 20, se);
setpixel(21, 20, se);
setpixel(22, 20, sc);
setpixel(23, 20, sd);
setpixel(24, 20, sd);
setpixel(25, 20, sc);
setpixel(26, 20, sc);
setpixel(6, 21, se);
setpixel(7, 21, sd);
setpixel(8, 21, sd);
setpixel(9, 21, sc);
setpixel(10, 21, sc);
setpixel(11, 21, sc);
setpixel(12, 21, sc);
setpixel(13, 21, sd);
setpixel(14, 21, sc);
setpixel(15, 21, sc);
setpixel(16, 21, sc);
setpixel(17, 21, se);
setpixel(18, 21, sc);
setpixel(19, 21, sd);
setpixel(20, 21, sc);
setpixel(21, 21, se);
setpixel(22, 21, sc);
setpixel(23, 21, sc);
setpixel(24, 21, sd);
setpixel(25, 21, sc);
setpixel(26, 21, sc);
setpixel(6, 22, se);
setpixel(7, 22, sd);
setpixel(8, 22, sc);
setpixel(9, 22, sc);
setpixel(10, 22, sc);
setpixel(11, 22, sc);
setpixel(12, 22, sc);
setpixel(13, 22, sd);
setpixel(14, 22, sc);
setpixel(15, 22, sc);
setpixel(16, 22, se);
setpixel(17, 22, sc);
setpixel(18, 22, sc);
setpixel(19, 22, sd);
setpixel(20, 22, sc);
setpixel(21, 22, sc);
setpixel(22, 22, sc);
setpixel(23, 22, sc);
setpixel(24, 22, sc);
setpixel(25, 22, sd);
setpixel(26, 22, sc);
setpixel(6, 23, sc);
setpixel(7, 23, sd);
setpixel(8, 23, sc);
setpixel(9, 23, sc);
setpixel(10, 23, sc);
setpixel(11, 23, sc);
setpixel(12, 23, sc);
setpixel(13, 23, sd);
setpixel(14, 23, sc);
setpixel(15, 23, sc);
setpixel(16, 23, se);
setpixel(17, 23, sc);
setpixel(18, 23, sc);
setpixel(19, 23, sd);
setpixel(20, 23, sc);
setpixel(21, 23, sc);
setpixel(22, 23, sc);
setpixel(23, 23, sc);
setpixel(24, 23, sc);
setpixel(25, 23, sd);
setpixel(26, 23, sc);
setpixel(6, 24, sc);
setpixel(7, 24, sd);
setpixel(8, 24, sc);
setpixel(9, 24, sc);
setpixel(10, 24, sc);
setpixel(11, 24, sc);
setpixel(12, 24, sc);
setpixel(13, 24, sd);
setpixel(14, 24, sc);
setpixel(15, 24, sc);
setpixel(16, 24, sc);
setpixel(17, 24, sc);
setpixel(18, 24, sc);
setpixel(19, 24, sd);
setpixel(20, 24, sc);
setpixel(21, 24, sc);
setpixel(22, 24, sc);
setpixel(23, 24, sc);
setpixel(24, 24, sc);
setpixel(25, 24, sd);
setpixel(26, 24, sc);
setpixel(6, 25, sa);
setpixel(7, 25, sb);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sb);
setpixel(11, 25, sa);
setpixel(12, 25, sa);
setpixel(13, 25, sa);
setpixel(14, 25, sb);
setpixel(15, 25, sa);
setpixel(16, 25, sb);
setpixel(17, 25, sa);
setpixel(18, 25, sb);
setpixel(19, 25, sa);
setpixel(20, 25, sa);
setpixel(21, 25, sa);
setpixel(22, 25, sb);
setpixel(23, 25, sa);
setpixel(24, 25, sa);
setpixel(25, 25, sb);
setpixel(26, 25, sa);
        


        
        
for ( int c = 0; c < 25; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


