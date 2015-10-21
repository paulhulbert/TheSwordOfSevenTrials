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
public class squidguy_acid extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public squidguy_acid( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 30, dir * 5, 0, 10, 120, false, new boolean[10], new Color[10], 31, 25, momentx, momenty );
        
        melee = false;
        
        

Color sa = new Color(0,255,0);
Color sb = new Color(0,69,37);
Color sc = new Color(0,128,29);
Color sd = new Color(0,23,12);
Color se = new Color(0,0,0);
        
        


        
        buildpic();
        
        
        name = "squidguy_acid";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 31 * 25; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        
setpixel(29, 0, sa);
setpixel(25, 1, sa);
setpixel(26, 1, sa);
setpixel(27, 1, sa);
setpixel(28, 1, sa);
setpixel(29, 1, sa);
setpixel(18, 2, sb);
setpixel(20, 2, sa);
setpixel(22, 2, sa);
setpixel(23, 2, sa);
setpixel(30, 2, sa);
setpixel(16, 3, sb);
setpixel(20, 3, sa);
setpixel(21, 3, sa);
setpixel(25, 3, sa);
setpixel(26, 3, sa);
setpixel(27, 3, sa);
setpixel(28, 3, sa);
setpixel(29, 3, sa);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(21, 4, sa);
setpixel(22, 4, sa);
setpixel(23, 4, sa);
setpixel(24, 4, sa);
setpixel(17, 5, sa);
setpixel(18, 5, sa);
setpixel(19, 5, sa);
setpixel(20, 5, sa);
setpixel(22, 5, sa);
setpixel(23, 5, sc);
setpixel(24, 5, sa);
setpixel(26, 5, sa);
setpixel(27, 5, sa);
setpixel(28, 5, sa);
setpixel(13, 6, sb);
setpixel(14, 6, sb);
setpixel(15, 6, sa);
setpixel(16, 6, sa);
setpixel(17, 6, sc);
setpixel(18, 6, sc);
setpixel(19, 6, sc);
setpixel(20, 6, sc);
setpixel(21, 6, sc);
setpixel(22, 6, sc);
setpixel(23, 6, sc);
setpixel(24, 6, sa);
setpixel(25, 6, sa);
setpixel(26, 6, sa);
setpixel(12, 7, sb);
setpixel(13, 7, sb);
setpixel(14, 7, sa);
setpixel(15, 7, sc);
setpixel(16, 7, sc);
setpixel(17, 7, sc);
setpixel(18, 7, sa);
setpixel(19, 7, sa);
setpixel(20, 7, sa);
setpixel(9, 8, sd);
setpixel(10, 8, sd);
setpixel(11, 8, sb);
setpixel(12, 8, sb);
setpixel(13, 8, sc);
setpixel(14, 8, sc);
setpixel(15, 8, sc);
setpixel(16, 8, sa);
setpixel(17, 8, sa);
setpixel(18, 8, sa);
setpixel(19, 8, sa);
setpixel(20, 8, sa);
setpixel(21, 8, sa);
setpixel(22, 8, sa);
setpixel(4, 9, sd);
setpixel(5, 9, sd);
setpixel(6, 9, sd);
setpixel(7, 9, sd);
setpixel(8, 9, sd);
setpixel(9, 9, sb);
setpixel(10, 9, sb);
setpixel(11, 9, sb);
setpixel(12, 9, sc);
setpixel(13, 9, sc);
setpixel(14, 9, sc);
setpixel(15, 9, sa);
setpixel(16, 9, sc);
setpixel(17, 9, sc);
setpixel(18, 9, sa);
setpixel(19, 9, sa);
setpixel(20, 9, sa);
setpixel(21, 9, sa);
setpixel(22, 9, sa);
setpixel(23, 9, sa);
setpixel(24, 9, sa);
setpixel(25, 9, sa);
setpixel(26, 9, sa);
setpixel(0, 10, se);
setpixel(1, 10, se);
setpixel(2, 10, se);
setpixel(3, 10, se);
setpixel(4, 10, sd);
setpixel(5, 10, sd);
setpixel(6, 10, sd);
setpixel(7, 10, sd);
setpixel(8, 10, sd);
setpixel(9, 10, sb);
setpixel(10, 10, sb);
setpixel(11, 10, sb);
setpixel(12, 10, sb);
setpixel(13, 10, sb);
setpixel(14, 10, sb);
setpixel(15, 10, sa);
setpixel(16, 10, sa);
setpixel(17, 10, sc);
setpixel(22, 10, sa);
setpixel(23, 10, sa);
setpixel(27, 10, sa);
setpixel(28, 10, sa);
setpixel(7, 11, sd);
setpixel(8, 11, sd);
setpixel(9, 11, sd);
setpixel(10, 11, sb);
setpixel(11, 11, sb);
setpixel(12, 11, sc);
setpixel(13, 11, sc);
setpixel(14, 11, sc);
setpixel(15, 11, sc);
setpixel(16, 11, sc);
setpixel(17, 11, sa);
setpixel(18, 11, sc);
setpixel(19, 11, sc);
setpixel(20, 11, sa);
setpixel(21, 11, sa);
setpixel(22, 11, sa);
setpixel(28, 11, sa);
setpixel(29, 11, sa);
setpixel(8, 12, sd);
setpixel(9, 12, sd);
setpixel(10, 12, sb);
setpixel(11, 12, sb);
setpixel(12, 12, sc);
setpixel(13, 12, sc);
setpixel(14, 12, sc);
setpixel(15, 12, sc);
setpixel(16, 12, sc);
setpixel(17, 12, sa);
setpixel(19, 12, sc);
setpixel(20, 12, sc);
setpixel(21, 12, sa);
setpixel(22, 12, sa);
setpixel(23, 12, sa);
setpixel(24, 12, sa);
setpixel(25, 12, sa);
setpixel(9, 13, sb);
setpixel(10, 13, sb);
setpixel(11, 13, sb);
setpixel(12, 13, sb);
setpixel(13, 13, sb);
setpixel(14, 13, sa);
setpixel(15, 13, sc);
setpixel(16, 13, sc);
setpixel(17, 13, sc);
setpixel(18, 13, sa);
setpixel(19, 13, sa);
setpixel(20, 13, sc);
setpixel(21, 13, sc);
setpixel(22, 13, sa);
setpixel(23, 13, sa);
setpixel(10, 14, sb);
setpixel(11, 14, sb);
setpixel(12, 14, sb);
setpixel(13, 14, sb);
setpixel(14, 14, sc);
setpixel(15, 14, sc);
setpixel(16, 14, sa);
setpixel(17, 14, sc);
setpixel(18, 14, sc);
setpixel(19, 14, sa);
setpixel(20, 14, sa);
setpixel(21, 14, sa);
setpixel(22, 14, sa);
setpixel(13, 15, sb);
setpixel(14, 15, sb);
setpixel(15, 15, sc);
setpixel(16, 15, sc);
setpixel(17, 15, sc);
setpixel(18, 15, sa);
setpixel(19, 15, sc);
setpixel(20, 15, sc);
setpixel(21, 15, sa);
setpixel(22, 15, sa);
setpixel(23, 15, sa);
setpixel(12, 16, sb);
setpixel(14, 16, sb);
setpixel(15, 16, sc);
setpixel(16, 16, sa);
setpixel(17, 16, sc);
setpixel(18, 16, sc);
setpixel(19, 16, sc);
setpixel(20, 16, sa);
setpixel(21, 16, sc);
setpixel(22, 16, sc);
setpixel(23, 16, sa);
setpixel(24, 16, sa);
setpixel(25, 16, sa);
setpixel(12, 17, sc);
setpixel(13, 17, sb);
setpixel(14, 17, sb);
setpixel(15, 17, sc);
setpixel(16, 17, sc);
setpixel(17, 17, sa);
setpixel(18, 17, sa);
setpixel(19, 17, sc);
setpixel(20, 17, sc);
setpixel(21, 17, sa);
setpixel(22, 17, sa);
setpixel(23, 17, sa);
setpixel(25, 17, sa);
setpixel(26, 17, sa);
setpixel(12, 18, sc);
setpixel(13, 18, sc);
setpixel(15, 18, sc);
setpixel(16, 18, sc);
setpixel(17, 18, sa);
setpixel(18, 18, sc);
setpixel(19, 18, sa);
setpixel(20, 18, sc);
setpixel(21, 18, sc);
setpixel(22, 18, sa);
setpixel(23, 18, sa);
setpixel(27, 18, sa);
setpixel(13, 19, sc);
setpixel(16, 19, sc);
setpixel(17, 19, sc);
setpixel(18, 19, sa);
setpixel(19, 19, sa);
setpixel(23, 19, sa);
setpixel(24, 19, sa);
setpixel(25, 19, sa);
setpixel(27, 19, sa);
setpixel(17, 20, sc);
setpixel(19, 20, sa);
setpixel(20, 20, sa);
setpixel(21, 20, sa);
setpixel(22, 20, sa);
setpixel(25, 20, sa);
setpixel(26, 20, sa);
setpixel(27, 20, sa);
setpixel(18, 21, sc);
setpixel(19, 21, sc);
setpixel(22, 21, sa);
setpixel(23, 21, sa);
setpixel(26, 21, sa);
setpixel(27, 21, sa);
setpixel(28, 21, sa);
setpixel(20, 22, sc);
setpixel(21, 22, sc);
setpixel(24, 22, sa);
setpixel(27, 22, sa);
setpixel(28, 22, sa);
setpixel(25, 23, sa);
setpixel(27, 23, sa);
setpixel(28, 23, sa);
setpixel(29, 24, sa);
setpixel(30, 24, sa);
setpixel(31, 25, sa);


        
for ( int c = 0; c < 68; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


