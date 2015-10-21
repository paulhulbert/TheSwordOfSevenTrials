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
public class bombexplosion extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public bombexplosion( int x, int y, int movex, int movey )
    {
            
        super( x, y, movex, movey, 7, 50, true, new boolean[10], new Color[10], 19, 17, 0, 0 );
        
        melee = false;
        
        
sa = new Color(255,204,0,200);
sb = new Color(255,255,255,200);
sc = new Color(255,102,0,200);
sd = new Color(255,0,0,200);
        
        


        
        buildpic();
        
        
        name = "bombexplosion";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 19 * 17; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        setpixel(9, 0, sa);
setpixel(13, 0, sb);
setpixel(14, 0, sb);
setpixel(5, 1, sb);
setpixel(7, 1, sa);
setpixel(8, 1, sa);
setpixel(10, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(15, 1, sb);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sc);
setpixel(9, 2, sc);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(15, 2, sa);
setpixel(16, 2, sa);
setpixel(6, 3, sa);
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
setpixel(5, 4, sa);
setpixel(6, 4, sa);
setpixel(7, 4, sc);
setpixel(8, 4, sd);
setpixel(9, 4, sd);
setpixel(10, 4, sd);
setpixel(11, 4, sd);
setpixel(12, 4, sc);
setpixel(13, 4, sc);
setpixel(14, 4, sc);
setpixel(15, 4, sc);
setpixel(16, 4, sc);
setpixel(17, 4, sc);
setpixel(1, 5, sb);
setpixel(4, 5, sa);
setpixel(5, 5, sa);
setpixel(6, 5, sc);
setpixel(7, 5, sd);
setpixel(8, 5, sd);
setpixel(9, 5, sd);
setpixel(10, 5, sd);
setpixel(11, 5, sd);
setpixel(12, 5, sd);
setpixel(13, 5, sc);
setpixel(14, 5, sd);
setpixel(15, 5, sc);
setpixel(16, 5, sc);
setpixel(17, 5, sc);
setpixel(1, 6, sb);
setpixel(4, 6, sa);
setpixel(5, 6, sc);
setpixel(6, 6, sd);
setpixel(7, 6, sd);
setpixel(8, 6, sd);
setpixel(9, 6, sc);
setpixel(10, 6, sc);
setpixel(11, 6, sc);
setpixel(12, 6, sd);
setpixel(13, 6, sd);
setpixel(14, 6, sd);
setpixel(15, 6, sd);
setpixel(16, 6, sc);
setpixel(18, 6, sa);
setpixel(4, 7, sc);
setpixel(5, 7, sc);
setpixel(6, 7, sd);
setpixel(7, 7, sd);
setpixel(8, 7, sd);
setpixel(9, 7, sd);
setpixel(10, 7, sd);
setpixel(11, 7, sd);
setpixel(12, 7, sc);
setpixel(13, 7, sd);
setpixel(14, 7, sd);
setpixel(15, 7, sd);
setpixel(16, 7, sc);
setpixel(17, 7, sa);
setpixel(18, 7, sa);
setpixel(0, 8, sb);
setpixel(4, 8, sc);
setpixel(5, 8, sd);
setpixel(6, 8, sd);
setpixel(7, 8, sd);
setpixel(8, 8, sc);
setpixel(9, 8, sd);
setpixel(10, 8, sd);
setpixel(11, 8, sd);
setpixel(12, 8, sc);
setpixel(13, 8, sd);
setpixel(14, 8, sc);
setpixel(15, 8, sd);
setpixel(16, 8, sc);
setpixel(17, 8, sa);
setpixel(1, 9, sb);
setpixel(3, 9, sa);
setpixel(4, 9, sc);
setpixel(5, 9, sd);
setpixel(6, 9, sd);
setpixel(7, 9, sd);
setpixel(8, 9, sc);
setpixel(9, 9, sd);
setpixel(10, 9, sd);
setpixel(11, 9, sc);
setpixel(12, 9, sd);
setpixel(13, 9, sd);
setpixel(14, 9, sc);
setpixel(15, 9, sd);
setpixel(16, 9, sc);
setpixel(17, 9, sa);
setpixel(18, 9, sb);
setpixel(19, 9, sb);
setpixel(1, 10, sb);
setpixel(3, 10, sa);
setpixel(4, 10, sc);
setpixel(5, 10, sd);
setpixel(6, 10, sd);
setpixel(7, 10, sd);
setpixel(8, 10, sd);
setpixel(9, 10, sd);
setpixel(10, 10, sd);
setpixel(11, 10, sc);
setpixel(12, 10, sd);
setpixel(13, 10, sd);
setpixel(14, 10, sd);
setpixel(15, 10, sc);
setpixel(16, 10, sc);
setpixel(18, 10, sb);
setpixel(1, 11, sb);
setpixel(3, 11, sa);
setpixel(4, 11, sc);
setpixel(5, 11, sd);
setpixel(6, 11, sc);
setpixel(7, 11, sc);
setpixel(8, 11, sd);
setpixel(9, 11, sd);
setpixel(10, 11, sd);
setpixel(11, 11, sc);
setpixel(12, 11, sd);
setpixel(13, 11, sc);
setpixel(14, 11, sd);
setpixel(15, 11, sc);
setpixel(16, 11, sd);
setpixel(17, 11, sa);
setpixel(18, 11, sb);
setpixel(4, 12, sa);
setpixel(5, 12, sc);
setpixel(6, 12, sd);
setpixel(7, 12, sd);
setpixel(8, 12, sd);
setpixel(9, 12, sc);
setpixel(10, 12, sd);
setpixel(11, 12, sd);
setpixel(12, 12, sd);
setpixel(13, 12, sd);
setpixel(14, 12, sd);
setpixel(15, 12, sd);
setpixel(16, 12, sa);
setpixel(17, 12, sb);
setpixel(18, 12, sb);
setpixel(4, 13, sa);
setpixel(5, 13, sa);
setpixel(6, 13, sc);
setpixel(7, 13, sc);
setpixel(8, 13, sd);
setpixel(9, 13, sd);
setpixel(10, 13, sd);
setpixel(11, 13, sc);
setpixel(12, 13, sc);
setpixel(13, 13, sd);
setpixel(14, 13, sc);
setpixel(15, 13, sc);
setpixel(16, 13, sa);
setpixel(17, 13, sb);
setpixel(5, 14, sa);
setpixel(7, 14, sc);
setpixel(8, 14, sc);
setpixel(9, 14, sc);
setpixel(10, 14, sc);
setpixel(11, 14, sc);
setpixel(12, 14, sc);
setpixel(13, 14, sc);
setpixel(14, 14, sc);
setpixel(15, 14, sc);
setpixel(16, 14, sa);
setpixel(4, 15, sb);
setpixel(8, 15, sa);
setpixel(9, 15, sa);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sa);
setpixel(5, 16, sb);
setpixel(6, 16, sb);
setpixel(9, 16, sb);
setpixel(10, 16, sb);
setpixel(10, 17, sb);
setpixel(11, 17, sb);
setpixel(12, 17, sb);
        
for ( int c = 0; c < 17; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


