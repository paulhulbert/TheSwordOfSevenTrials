/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;

/**
 *
 * @author Dad
 */
public class dnagup extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public dnagup( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x - dir * 10, y + 30, dir * 5, 2, 7, 30, true, new boolean[10], new Color[10], 62, 9, momentx, momenty, u );
        

sa = new Color(170,161,146);
sb = new Color(205,167,89);
sc = new Color(218,211,128);
sd = new Color(218,196,128);

        
        buildpic();
        
        
        name = "dnagup";
        
        
    }
    
    public static int getrange()
    {
        
        return 15;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 62 * 9; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        


















setpixel(59, 0, sa);
setpixel(60, 0, sa);
setpixel(61, 0, sa);
setpixel(62, 0, sa);
setpixel(56, 1, sa);
setpixel(57, 1, sa);
setpixel(58, 1, sa);
setpixel(59, 1, sa);
setpixel(60, 1, sa);
setpixel(61, 1, sa);
setpixel(52, 2, sa);
setpixel(53, 2, sa);
setpixel(54, 2, sa);
setpixel(55, 2, sa);
setpixel(56, 2, sa);
setpixel(57, 2, sa);
setpixel(58, 2, sa);
setpixel(59, 2, sa);
setpixel(48, 3, sa);
setpixel(49, 3, sa);
setpixel(50, 3, sa);
setpixel(51, 3, sa);
setpixel(52, 3, sa);
setpixel(53, 3, sa);
setpixel(54, 3, sa);
setpixel(55, 3, sa);
setpixel(56, 3, sa);
setpixel(40, 4, sa);
setpixel(41, 4, sa);
setpixel(42, 4, sa);
setpixel(43, 4, sa);
setpixel(44, 4, sa);
setpixel(45, 4, sa);
setpixel(46, 4, sa);
setpixel(47, 4, sa);
setpixel(48, 4, sa);
setpixel(49, 4, sa);
setpixel(50, 4, sa);
setpixel(51, 4, sa);
setpixel(52, 4, sa);
setpixel(2, 5, sb);
setpixel(7, 5, sb);
setpixel(12, 5, sb);
setpixel(17, 5, sb);
setpixel(22, 5, sb);
setpixel(27, 5, sa);
setpixel(28, 5, sa);
setpixel(34, 5, sa);
setpixel(35, 5, sa);
setpixel(36, 5, sa);
setpixel(37, 5, sa);
setpixel(38, 5, sa);
setpixel(39, 5, sa);
setpixel(40, 5, sa);
setpixel(41, 5, sa);
setpixel(42, 5, sa);
setpixel(43, 5, sa);
setpixel(44, 5, sa);
setpixel(45, 5, sa);
setpixel(46, 5, sa);
setpixel(47, 5, sa);
setpixel(0, 6, sc);
setpixel(1, 6, sc);
setpixel(2, 6, sb);
setpixel(3, 6, sc);
setpixel(4, 6, sc);
setpixel(5, 6, sc);
setpixel(6, 6, sc);
setpixel(7, 6, sb);
setpixel(8, 6, sc);
setpixel(9, 6, sc);
setpixel(10, 6, sc);
setpixel(11, 6, sc);
setpixel(12, 6, sb);
setpixel(13, 6, sc);
setpixel(14, 6, sc);
setpixel(15, 6, sc);
setpixel(16, 6, sc);
setpixel(17, 6, sb);
setpixel(18, 6, sc);
setpixel(19, 6, sc);
setpixel(20, 6, sc);
setpixel(21, 6, sc);
setpixel(22, 6, sb);
setpixel(23, 6, sc);
setpixel(24, 6, sc);
setpixel(25, 6, sc);
setpixel(26, 6, sc);
setpixel(27, 6, sc);
setpixel(28, 6, sa);
setpixel(29, 6, sa);
setpixel(30, 6, sa);
setpixel(31, 6, sa);
setpixel(32, 6, sa);
setpixel(33, 6, sa);
setpixel(34, 6, sa);
setpixel(35, 6, sa);
setpixel(36, 6, sa);
setpixel(37, 6, sa);
setpixel(38, 6, sa);
setpixel(39, 6, sa);
setpixel(40, 6, sa);
setpixel(0, 7, sd);
setpixel(1, 7, sd);
setpixel(2, 7, sb);
setpixel(3, 7, sd);
setpixel(4, 7, sd);
setpixel(5, 7, sd);
setpixel(6, 7, sd);
setpixel(7, 7, sb);
setpixel(8, 7, sd);
setpixel(9, 7, sd);
setpixel(10, 7, sd);
setpixel(11, 7, sd);
setpixel(12, 7, sb);
setpixel(13, 7, sd);
setpixel(14, 7, sd);
setpixel(15, 7, sd);
setpixel(16, 7, sd);
setpixel(17, 7, sb);
setpixel(18, 7, sd);
setpixel(19, 7, sd);
setpixel(20, 7, sd);
setpixel(21, 7, sd);
setpixel(22, 7, sb);
setpixel(23, 7, sd);
setpixel(24, 7, sd);
setpixel(25, 7, sd);
setpixel(26, 7, sd);
setpixel(27, 7, sd);
setpixel(28, 7, sa);
setpixel(29, 7, sa);
setpixel(30, 7, sa);
setpixel(31, 7, sa);
setpixel(32, 7, sa);
setpixel(33, 7, sa);
setpixel(34, 7, sa);
setpixel(0, 8, sc);
setpixel(1, 8, sc);
setpixel(2, 8, sb);
setpixel(3, 8, sc);
setpixel(4, 8, sc);
setpixel(5, 8, sc);
setpixel(6, 8, sc);
setpixel(7, 8, sb);
setpixel(8, 8, sc);
setpixel(9, 8, sc);
setpixel(10, 8, sc);
setpixel(11, 8, sc);
setpixel(12, 8, sb);
setpixel(13, 8, sc);
setpixel(14, 8, sc);
setpixel(15, 8, sc);
setpixel(16, 8, sc);
setpixel(17, 8, sb);
setpixel(18, 8, sc);
setpixel(19, 8, sc);
setpixel(20, 8, sc);
setpixel(21, 8, sc);
setpixel(22, 8, sb);
setpixel(23, 8, sc);
setpixel(24, 8, sc);
setpixel(25, 8, sc);
setpixel(26, 8, sc);
setpixel(27, 8, sc);
setpixel(28, 8, sa);
setpixel(2, 9, sb);
setpixel(7, 9, sb);
setpixel(12, 9, sb);
setpixel(17, 9, sb);
setpixel(22, 9, sb);
setpixel(27, 9, sa);
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
