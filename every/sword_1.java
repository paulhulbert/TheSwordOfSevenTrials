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
public class sword_1 extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa = new Color(204,204,204);
    
    private Color sb = new Color(102,102,102);
    private Color sc = new Color(153,153,153);
    private Color sd = new Color(255,204,0);
    private Color se = new Color(238,139,40);
    private Color sf = new Color(44,18,0);
    private Color sg = new Color(96,39,0);
    
    public sword_1( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 13, dir * 5, 5, 10, 30, true, new boolean[10], new Color[10], 33, 25, momentx, momenty, u );
        
        
        buildpic();
        
        name = "handsword";
        
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 33 * 25; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        

















setpixel(31, 0, sa);
setpixel(32, 0, sa);
setpixel(33, 0, sb);
setpixel(30, 1, sa);
setpixel(31, 1, sa);
setpixel(32, 1, sb);
setpixel(33, 1, sc);
setpixel(29, 2, sa);
setpixel(30, 2, sa);
setpixel(31, 2, sb);
setpixel(32, 2, sc);
setpixel(33, 2, sc);
setpixel(28, 3, sa);
setpixel(29, 3, sa);
setpixel(30, 3, sb);
setpixel(31, 3, sc);
setpixel(32, 3, sc);
setpixel(27, 4, sa);
setpixel(28, 4, sa);
setpixel(29, 4, sb);
setpixel(30, 4, sc);
setpixel(31, 4, sc);
setpixel(26, 5, sa);
setpixel(27, 5, sa);
setpixel(28, 5, sb);
setpixel(29, 5, sc);
setpixel(30, 5, sc);
setpixel(25, 6, sa);
setpixel(26, 6, sa);
setpixel(27, 6, sb);
setpixel(28, 6, sc);
setpixel(29, 6, sc);
setpixel(24, 7, sa);
setpixel(25, 7, sa);
setpixel(26, 7, sb);
setpixel(27, 7, sc);
setpixel(28, 7, sc);
setpixel(23, 8, sa);
setpixel(24, 8, sa);
setpixel(25, 8, sb);
setpixel(26, 8, sc);
setpixel(27, 8, sc);
setpixel(22, 9, sa);
setpixel(23, 9, sa);
setpixel(24, 9, sb);
setpixel(25, 9, sc);
setpixel(26, 9, sc);
setpixel(21, 10, sa);
setpixel(22, 10, sa);
setpixel(23, 10, sb);
setpixel(24, 10, sc);
setpixel(25, 10, sc);
setpixel(20, 11, sa);
setpixel(21, 11, sa);
setpixel(22, 11, sb);
setpixel(23, 11, sc);
setpixel(24, 11, sc);
setpixel(13, 12, sd);
setpixel(14, 12, sd);
setpixel(19, 12, sa);
setpixel(20, 12, sa);
setpixel(21, 12, sb);
setpixel(22, 12, sc);
setpixel(23, 12, sc);
setpixel(13, 13, sd);
setpixel(18, 13, sa);
setpixel(19, 13, sa);
setpixel(20, 13, sb);
setpixel(21, 13, sc);
setpixel(22, 13, sc);
setpixel(13, 14, sd);
setpixel(14, 14, sd);
setpixel(17, 14, sa);
setpixel(18, 14, sa);
setpixel(19, 14, sb);
setpixel(20, 14, sc);
setpixel(21, 14, sc);
setpixel(13, 15, sd);
setpixel(14, 15, sd);
setpixel(15, 15, sd);
setpixel(16, 15, sa);
setpixel(17, 15, sa);
setpixel(18, 15, sb);
setpixel(19, 15, sc);
setpixel(20, 15, sc);
setpixel(10, 16, se);
setpixel(11, 16, se);
setpixel(12, 16, se);
setpixel(13, 16, se);
setpixel(14, 16, sd);
setpixel(15, 16, sd);
setpixel(16, 16, sd);
setpixel(17, 16, sb);
setpixel(18, 16, sc);
setpixel(19, 16, sc);
setpixel(0, 17, se);
setpixel(1, 17, se);
setpixel(2, 17, se);
setpixel(3, 17, se);
setpixel(4, 17, se);
setpixel(5, 17, se);
setpixel(6, 17, se);
setpixel(7, 17, se);
setpixel(8, 17, se);
setpixel(9, 17, se);
setpixel(10, 17, se);
setpixel(11, 17, se);
setpixel(12, 17, se);
setpixel(13, 17, se);
setpixel(14, 17, se);
setpixel(15, 17, se);
setpixel(16, 17, sd);
setpixel(17, 17, sd);
setpixel(18, 17, sc);
setpixel(0, 18, se);
setpixel(1, 18, se);
setpixel(2, 18, se);
setpixel(3, 18, se);
setpixel(4, 18, se);
setpixel(5, 18, se);
setpixel(6, 18, se);
setpixel(7, 18, se);
setpixel(8, 18, se);
setpixel(9, 18, se);
setpixel(10, 18, se);
setpixel(11, 18, se);
setpixel(12, 18, se);
setpixel(13, 18, se);
setpixel(14, 18, se);
setpixel(15, 18, se);
setpixel(16, 18, sd);
setpixel(17, 18, sd);
setpixel(18, 18, sd);
setpixel(0, 19, se);
setpixel(1, 19, se);
setpixel(2, 19, se);
setpixel(3, 19, se);
setpixel(4, 19, se);
setpixel(5, 19, se);
setpixel(6, 19, se);
setpixel(7, 19, se);
setpixel(8, 19, se);
setpixel(9, 19, se);
setpixel(10, 19, se);
setpixel(11, 19, se);
setpixel(12, 19, se);
setpixel(13, 19, se);
setpixel(14, 19, se);
setpixel(15, 19, se);
setpixel(16, 19, se);
setpixel(17, 19, sd);
setpixel(18, 19, sd);
setpixel(19, 19, sd);
setpixel(21, 19, sd);
setpixel(0, 20, se);
setpixel(1, 20, se);
setpixel(2, 20, se);
setpixel(3, 20, se);
setpixel(4, 20, se);
setpixel(5, 20, se);
setpixel(6, 20, se);
setpixel(7, 20, se);
setpixel(8, 20, se);
setpixel(9, 20, se);
setpixel(10, 20, se);
setpixel(11, 20, se);
setpixel(12, 20, se);
setpixel(13, 20, se);
setpixel(14, 20, se);
setpixel(15, 20, se);
setpixel(16, 20, se);
setpixel(18, 20, sd);
setpixel(19, 20, sd);
setpixel(20, 20, sd);
setpixel(21, 20, sd);
setpixel(0, 21, se);
setpixel(1, 21, se);
setpixel(2, 21, se);
setpixel(3, 21, se);
setpixel(4, 21, se);
setpixel(5, 21, se);
setpixel(6, 21, se);
setpixel(7, 21, se);
setpixel(8, 21, se);
setpixel(9, 21, se);
setpixel(10, 21, se);
setpixel(11, 21, se);
setpixel(12, 21, se);
setpixel(13, 21, se);
setpixel(14, 21, se);
setpixel(15, 21, se);
setpixel(9, 22, sf);
setpixel(10, 22, sg);
setpixel(11, 22, sf);
setpixel(12, 22, sf);
setpixel(13, 22, se);
setpixel(14, 22, se);
setpixel(8, 23, sd);
setpixel(9, 23, sd);
setpixel(10, 23, sg);
setpixel(11, 23, sf);
setpixel(12, 23, sf);
setpixel(8, 24, sd);
setpixel(9, 24, sd);
setpixel(10, 24, sd);
setpixel(11, 24, sf);
setpixel(8, 25, sd);
setpixel(9, 25, sd);
setpixel(10, 25, sd);
        
        
        
        
        
        
    }
    
    
    
}
