/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class sword extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public sword( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 20, dir * 5, 5, 10, 30, true, new boolean[10], new Color[10], 25, 25, momentx, momenty, u );
        
        
        sa = new Color(204,204,204);
        sb = new Color(102,102,102);
        sc = new Color(153,153,153);
        sd = new Color(255,204,0);
        se = new Color(44,18,0);
        sf = new Color(96,39,0);
        
        buildpic();
        
        
        name = "sword";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 25 * 25; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        














setpixel(23, 0, sa);
setpixel(24, 0, sa);
setpixel(22, 1, sa);
setpixel(23, 1, sa);
setpixel(24, 1, sb);
setpixel(21, 2, sa);
setpixel(22, 2, sa);
setpixel(23, 2, sb);
setpixel(24, 2, sc);
setpixel(20, 3, sa);
setpixel(21, 3, sa);
setpixel(22, 3, sb);
setpixel(23, 3, sc);
setpixel(24, 3, sc);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(21, 4, sb);
setpixel(22, 4, sc);
setpixel(23, 4, sc);
setpixel(18, 5, sa);
setpixel(19, 5, sa);
setpixel(20, 5, sb);
setpixel(21, 5, sc);
setpixel(22, 5, sc);
setpixel(17, 6, sa);
setpixel(18, 6, sa);
setpixel(19, 6, sb);
setpixel(20, 6, sc);
setpixel(21, 6, sc);
setpixel(16, 7, sa);
setpixel(17, 7, sa);
setpixel(18, 7, sb);
setpixel(19, 7, sc);
setpixel(20, 7, sc);
setpixel(15, 8, sa);
setpixel(16, 8, sa);
setpixel(17, 8, sb);
setpixel(18, 8, sc);
setpixel(19, 8, sc);
setpixel(14, 9, sa);
setpixel(15, 9, sa);
setpixel(16, 9, sb);
setpixel(17, 9, sc);
setpixel(18, 9, sc);
setpixel(13, 10, sa);
setpixel(14, 10, sa);
setpixel(15, 10, sb);
setpixel(16, 10, sc);
setpixel(17, 10, sc);
setpixel(12, 11, sa);
setpixel(13, 11, sa);
setpixel(14, 11, sb);
setpixel(15, 11, sc);
setpixel(16, 11, sc);
setpixel(5, 12, sd);
setpixel(6, 12, sd);
setpixel(11, 12, sa);
setpixel(12, 12, sa);
setpixel(13, 12, sb);
setpixel(14, 12, sc);
setpixel(15, 12, sc);
setpixel(5, 13, sd);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(12, 13, sb);
setpixel(13, 13, sc);
setpixel(14, 13, sc);
setpixel(5, 14, sd);
setpixel(6, 14, sd);
setpixel(9, 14, sa);
setpixel(10, 14, sa);
setpixel(11, 14, sb);
setpixel(12, 14, sc);
setpixel(13, 14, sc);
setpixel(5, 15, sd);
setpixel(6, 15, sd);
setpixel(7, 15, sd);
setpixel(8, 15, sa);
setpixel(9, 15, sa);
setpixel(10, 15, sb);
setpixel(11, 15, sc);
setpixel(12, 15, sc);
setpixel(6, 16, sd);
setpixel(7, 16, sd);
setpixel(8, 16, sd);
setpixel(9, 16, sb);
setpixel(10, 16, sc);
setpixel(11, 16, sc);
setpixel(6, 17, se);
setpixel(7, 17, sd);
setpixel(8, 17, sd);
setpixel(9, 17, sd);
setpixel(10, 17, sc);
setpixel(5, 18, sf);
setpixel(6, 18, se);
setpixel(7, 18, se);
setpixel(8, 18, sd);
setpixel(9, 18, sd);
setpixel(10, 18, sd);
setpixel(4, 19, se);
setpixel(5, 19, sf);
setpixel(6, 19, se);
setpixel(7, 19, se);
setpixel(8, 19, sf);
setpixel(9, 19, sd);
setpixel(10, 19, sd);
setpixel(11, 19, sd);
setpixel(13, 19, sd);
setpixel(3, 20, se);
setpixel(4, 20, se);
setpixel(5, 20, sf);
setpixel(6, 20, se);
setpixel(7, 20, se);
setpixel(10, 20, sd);
setpixel(11, 20, sd);
setpixel(12, 20, sd);
setpixel(13, 20, sd);
setpixel(2, 21, sf);
setpixel(3, 21, se);
setpixel(4, 21, se);
setpixel(5, 21, sf);
setpixel(6, 21, se);
setpixel(1, 22, se);
setpixel(2, 22, sf);
setpixel(3, 22, se);
setpixel(4, 22, se);
setpixel(5, 22, sf);
setpixel(0, 23, sd);
setpixel(1, 23, sd);
setpixel(2, 23, sf);
setpixel(3, 23, se);
setpixel(4, 23, se);
setpixel(0, 24, sd);
setpixel(1, 24, sd);
setpixel(2, 24, sd);
setpixel(3, 24, se);
setpixel(0, 25, sd);
setpixel(1, 25, sd);
setpixel(2, 25, sd);
        
        
        
        
        
        
    }
    
    
    
}
