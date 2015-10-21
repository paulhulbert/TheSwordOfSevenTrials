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
public class greenfireball extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    public greenfireball( int x, int y, int movex, int movey )
    {
            
        super( x, y, movex, movey, 13, 250, false, new boolean[10], new Color[10], 17, 16, 0, 0 );
        
        melee = false;
        
        
sa = new Color(0,255,51,217);
sb = new Color(0,255,0,217);
sc = new Color(102,255,51,217);
sd = new Color(204,255,0,217);
se = new Color(255,204,0,217);
sf = new Color(255,102,0,217);
sg = new Color(255,0,0,217);


        
        buildpic();
        
        
        name = "greenfireball";
        
        
    }
    
    public static int getrange()
    {
        
        return 40;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 17 * 16; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(9, 0, sa);
setpixel(10, 0, sa);
setpixel(11, 0, sa);
setpixel(5, 1, sa);
setpixel(6, 1, sa);
setpixel(7, 1, sa);
setpixel(8, 1, sb);
setpixel(9, 1, sb);
setpixel(10, 1, sb);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(4, 2, sa);
setpixel(5, 2, sa);
setpixel(6, 2, sb);
setpixel(7, 2, sb);
setpixel(8, 2, sb);
setpixel(9, 2, sb);
setpixel(10, 2, sb);
setpixel(11, 2, sb);
setpixel(12, 2, sb);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(3, 3, sa);
setpixel(4, 3, sa);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sb);
setpixel(8, 3, sb);
setpixel(9, 3, sb);
setpixel(10, 3, sb);
setpixel(11, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sb);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(2, 4, sa);
setpixel(3, 4, sa);
setpixel(4, 4, sb);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sc);
setpixel(8, 4, sc);
setpixel(9, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sc);
setpixel(12, 4, sb);
setpixel(13, 4, sb);
setpixel(14, 4, sb);
setpixel(15, 4, sa);
setpixel(16, 4, sa);
setpixel(2, 5, sa);
setpixel(3, 5, sb);
setpixel(4, 5, sb);
setpixel(5, 5, sb);
setpixel(6, 5, sc);
setpixel(7, 5, sc);
setpixel(8, 5, sd);
setpixel(9, 5, sd);
setpixel(10, 5, sd);
setpixel(11, 5, sc);
setpixel(12, 5, sc);
setpixel(13, 5, sb);
setpixel(14, 5, sb);
setpixel(15, 5, sb);
setpixel(16, 5, sa);
setpixel(1, 6, sa);
setpixel(2, 6, sa);
setpixel(3, 6, sb);
setpixel(4, 6, sb);
setpixel(5, 6, sc);
setpixel(6, 6, sc);
setpixel(7, 6, sd);
setpixel(8, 6, sd);
setpixel(9, 6, se);
setpixel(10, 6, sd);
setpixel(11, 6, sd);
setpixel(12, 6, sc);
setpixel(13, 6, sc);
setpixel(14, 6, sb);
setpixel(15, 6, sb);
setpixel(16, 6, sa);
setpixel(17, 6, sa);
setpixel(1, 7, sa);
setpixel(2, 7, sb);
setpixel(3, 7, sb);
setpixel(4, 7, sb);
setpixel(5, 7, sc);
setpixel(6, 7, sd);
setpixel(7, 7, sd);
setpixel(8, 7, se);
setpixel(9, 7, sf);
setpixel(10, 7, se);
setpixel(11, 7, sd);
setpixel(12, 7, sd);
setpixel(13, 7, sc);
setpixel(14, 7, sb);
setpixel(15, 7, sb);
setpixel(16, 7, sb);
setpixel(17, 7, sa);
setpixel(1, 8, sa);
setpixel(2, 8, sb);
setpixel(3, 8, sb);
setpixel(4, 8, sb);
setpixel(5, 8, sc);
setpixel(6, 8, sd);
setpixel(7, 8, se);
setpixel(8, 8, sf);
setpixel(9, 8, sg);
setpixel(10, 8, sf);
setpixel(11, 8, se);
setpixel(12, 8, sd);
setpixel(13, 8, sc);
setpixel(14, 8, sb);
setpixel(15, 8, sb);
setpixel(16, 8, sb);
setpixel(17, 8, sa);
setpixel(0, 9, sa);
setpixel(1, 9, sa);
setpixel(2, 9, sb);
setpixel(3, 9, sb);
setpixel(4, 9, sb);
setpixel(5, 9, sc);
setpixel(6, 9, sd);
setpixel(7, 9, sd);
setpixel(8, 9, se);
setpixel(9, 9, sf);
setpixel(10, 9, se);
setpixel(11, 9, sd);
setpixel(12, 9, sd);
setpixel(13, 9, sc);
setpixel(14, 9, sb);
setpixel(15, 9, sb);
setpixel(16, 9, sb);
setpixel(17, 9, sa);
setpixel(1, 10, sa);
setpixel(2, 10, sa);
setpixel(3, 10, sb);
setpixel(4, 10, sb);
setpixel(5, 10, sc);
setpixel(6, 10, sc);
setpixel(7, 10, sd);
setpixel(8, 10, sd);
setpixel(9, 10, se);
setpixel(10, 10, sd);
setpixel(11, 10, sd);
setpixel(12, 10, sc);
setpixel(13, 10, sc);
setpixel(14, 10, sb);
setpixel(15, 10, sb);
setpixel(16, 10, sa);
setpixel(17, 10, sa);
setpixel(2, 11, sa);
setpixel(3, 11, sb);
setpixel(4, 11, sb);
setpixel(5, 11, sb);
setpixel(6, 11, sc);
setpixel(7, 11, sc);
setpixel(8, 11, sd);
setpixel(9, 11, sd);
setpixel(10, 11, sd);
setpixel(11, 11, sc);
setpixel(12, 11, sc);
setpixel(13, 11, sb);
setpixel(14, 11, sb);
setpixel(15, 11, sb);
setpixel(16, 11, sa);
setpixel(2, 12, sa);
setpixel(3, 12, sa);
setpixel(4, 12, sb);
setpixel(5, 12, sb);
setpixel(6, 12, sb);
setpixel(7, 12, sc);
setpixel(8, 12, sc);
setpixel(9, 12, sc);
setpixel(10, 12, sc);
setpixel(11, 12, sc);
setpixel(12, 12, sb);
setpixel(13, 12, sb);
setpixel(14, 12, sb);
setpixel(15, 12, sa);
setpixel(3, 13, sa);
setpixel(4, 13, sa);
setpixel(5, 13, sb);
setpixel(6, 13, sb);
setpixel(7, 13, sb);
setpixel(8, 13, sb);
setpixel(9, 13, sb);
setpixel(10, 13, sb);
setpixel(11, 13, sb);
setpixel(12, 13, sb);
setpixel(13, 13, sb);
setpixel(14, 13, sa);
setpixel(15, 13, sa);
setpixel(4, 14, sa);
setpixel(5, 14, sa);
setpixel(6, 14, sb);
setpixel(7, 14, sb);
setpixel(8, 14, sb);
setpixel(9, 14, sb);
setpixel(10, 14, sb);
setpixel(11, 14, sb);
setpixel(12, 14, sb);
setpixel(13, 14, sa);
setpixel(14, 14, sa);
setpixel(5, 15, sa);
setpixel(6, 15, sa);
setpixel(7, 15, sa);
setpixel(8, 15, sb);
setpixel(9, 15, sb);
setpixel(10, 15, sb);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sa);
setpixel(9, 16, sa);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
        
        
for ( int c = 0; c < 16; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


