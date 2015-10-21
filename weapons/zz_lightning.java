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
public class zz_lightning extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public zz_lightning( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x - dir * 10, y + 30, dir * 5, 0, 2, 50, true, new boolean[10], new Color[10], 27, 23, momentx, momenty );
        
        melee = false;
        
        
sa = new Color(153,255,255);
sb = new Color(0,255,255);
sc = new Color(0,153,255);

        
        


        
        buildpic();
        
        
        name = "zz_lightning";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 27 * 23; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        

setpixel(15, 0, sa);
setpixel(16, 0, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sa);
setpixel(13, 2, sb);
setpixel(14, 2, sc);
setpixel(12, 3, sb);
setpixel(13, 3, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sc);
setpixel(18, 4, sb);
setpixel(19, 4, sb);
setpixel(20, 4, sc);
setpixel(21, 4, sc);
setpixel(22, 4, sc);
setpixel(23, 4, sb);
setpixel(24, 4, sa);
setpixel(25, 4, sa);
setpixel(26, 4, sa);
setpixel(9, 5, sc);
setpixel(10, 5, sc);
setpixel(11, 5, sc);
setpixel(12, 5, sc);
setpixel(17, 5, sc);
setpixel(18, 5, sb);
setpixel(22, 5, sb);
setpixel(7, 6, sc);
setpixel(8, 6, sc);
setpixel(9, 6, sc);
setpixel(17, 6, sb);
setpixel(18, 6, sb);
setpixel(3, 7, sc);
setpixel(4, 7, sc);
setpixel(5, 7, sc);
setpixel(6, 7, sa);
setpixel(7, 7, sc);
setpixel(14, 7, sc);
setpixel(15, 7, sc);
setpixel(16, 7, sc);
setpixel(17, 7, sb);
setpixel(18, 7, sc);
setpixel(19, 7, sc);
setpixel(20, 7, sb);
setpixel(21, 7, sb);
setpixel(22, 7, sb);
setpixel(23, 7, sb);
setpixel(24, 7, sb);
setpixel(25, 7, sa);
setpixel(26, 7, sa);
setpixel(1, 8, sc);
setpixel(2, 8, sc);
setpixel(3, 8, sc);
setpixel(6, 8, sc);
setpixel(7, 8, sc);
setpixel(14, 8, sc);
setpixel(5, 9, sa);
setpixel(6, 9, sc);
setpixel(7, 9, sc);
setpixel(8, 9, sc);
setpixel(12, 9, sc);
setpixel(13, 9, sc);
setpixel(14, 9, sc);
setpixel(19, 9, sb);
setpixel(0, 10, sa);
setpixel(1, 10, sc);
setpixel(2, 10, sc);
setpixel(3, 10, sc);
setpixel(4, 10, sc);
setpixel(5, 10, sc);
setpixel(6, 10, sc);
setpixel(8, 10, sb);
setpixel(9, 10, sb);
setpixel(10, 10, sc);
setpixel(11, 10, sc);
setpixel(12, 10, sc);
setpixel(18, 10, sc);
setpixel(19, 10, sb);
setpixel(20, 10, sb);
setpixel(21, 10, sa);
setpixel(6, 11, sc);
setpixel(8, 11, sc);
setpixel(10, 11, sc);
setpixel(11, 11, sc);
setpixel(12, 11, sc);
setpixel(18, 11, sb);
setpixel(19, 11, sb);
setpixel(20, 11, sb);
setpixel(21, 11, sa);
setpixel(22, 11, sa);
setpixel(23, 11, sa);
setpixel(1, 12, sc);
setpixel(2, 12, sc);
setpixel(3, 12, sc);
setpixel(4, 12, sc);
setpixel(5, 12, sc);
setpixel(6, 12, sc);
setpixel(8, 12, sc);
setpixel(9, 12, sc);
setpixel(12, 12, sc);
setpixel(13, 12, sc);
setpixel(18, 12, sb);
setpixel(23, 12, sa);
setpixel(24, 12, sa);
setpixel(9, 13, sc);
setpixel(13, 13, sc);
setpixel(14, 13, sb);
setpixel(15, 13, sb);
setpixel(16, 13, sb);
setpixel(17, 13, sb);
setpixel(18, 13, sc);
setpixel(19, 13, sc);
setpixel(10, 14, sc);
setpixel(11, 14, sc);
setpixel(16, 14, sc);
setpixel(11, 15, sc);
setpixel(16, 15, sc);
setpixel(17, 15, sb);
setpixel(11, 16, sb);
setpixel(12, 16, sc);
setpixel(17, 16, sb);
setpixel(18, 16, sb);
setpixel(12, 17, sc);
setpixel(13, 17, sc);
setpixel(18, 17, sb);
setpixel(19, 17, sa);
setpixel(20, 17, sa);
setpixel(13, 18, sc);
setpixel(14, 18, sc);
setpixel(15, 18, sc);
setpixel(19, 18, sa);
setpixel(20, 18, sa);
setpixel(21, 18, sa);
setpixel(14, 19, sb);
setpixel(15, 19, sb);
setpixel(16, 19, sb);
setpixel(16, 20, sb);
setpixel(17, 20, sb);
setpixel(18, 20, sb);
setpixel(19, 20, sb);
setpixel(20, 20, sb);
setpixel(21, 20, sb);
setpixel(22, 20, sa);
setpixel(23, 20, sa);
setpixel(18, 21, sb);
setpixel(19, 21, sc);
setpixel(21, 21, sb);
setpixel(22, 21, sb);
setpixel(23, 21, sa);
setpixel(24, 21, sa);
setpixel(25, 21, sa);
setpixel(26, 21, sa);
setpixel(27, 21, sa);
setpixel(19, 22, sb);
setpixel(20, 22, sc);
setpixel(23, 22, sa);
setpixel(24, 22, sb);
setpixel(20, 23, sb);
setpixel(21, 23, sb);
setpixel(22, 23, sb);
setpixel(23, 23, sa);
setpixel(24, 23, sa);
setpixel(25, 23, sa);
setpixel(26, 23, sa);



        
        
        
        
    }
    
    
    
    
    
    
    
    
}

