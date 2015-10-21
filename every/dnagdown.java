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
public class dnagdown extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public dnagdown( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x - dir * 30, y + 30, dir * 5, -2, 4, 30, true, new boolean[10], new Color[10], 60, 9, momentx, momenty, u );
        


sa = new Color(205,167,88);
sb = new Color(170,161,146);
sc = new Color(218,211,128);
sd = new Color(218,196,128);


        
        buildpic();
        
        
        name = "dnagdown";
        
        
    }
    
    public static int getrange()
    {
        
        return 15;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 60 * 9; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        



















setpixel(2, 0, sa);
setpixel(7, 0, sa);
setpixel(12, 0, sa);
setpixel(17, 0, sa);
setpixel(22, 0, sa);
setpixel(27, 0, sb);
setpixel(0, 1, sc);
setpixel(1, 1, sc);
setpixel(2, 1, sa);
setpixel(3, 1, sc);
setpixel(4, 1, sc);
setpixel(5, 1, sc);
setpixel(6, 1, sc);
setpixel(7, 1, sa);
setpixel(8, 1, sc);
setpixel(9, 1, sc);
setpixel(10, 1, sc);
setpixel(11, 1, sc);
setpixel(12, 1, sa);
setpixel(13, 1, sc);
setpixel(14, 1, sc);
setpixel(15, 1, sc);
setpixel(16, 1, sc);
setpixel(17, 1, sa);
setpixel(18, 1, sc);
setpixel(19, 1, sc);
setpixel(20, 1, sc);
setpixel(21, 1, sc);
setpixel(22, 1, sa);
setpixel(23, 1, sc);
setpixel(24, 1, sc);
setpixel(25, 1, sc);
setpixel(26, 1, sc);
setpixel(27, 1, sc);
setpixel(28, 1, sb);
setpixel(0, 2, sd);
setpixel(1, 2, sd);
setpixel(2, 2, sa);
setpixel(3, 2, sd);
setpixel(4, 2, sd);
setpixel(5, 2, sd);
setpixel(6, 2, sd);
setpixel(7, 2, sa);
setpixel(8, 2, sd);
setpixel(9, 2, sd);
setpixel(10, 2, sd);
setpixel(11, 2, sd);
setpixel(12, 2, sa);
setpixel(13, 2, sd);
setpixel(14, 2, sd);
setpixel(15, 2, sd);
setpixel(16, 2, sd);
setpixel(17, 2, sa);
setpixel(18, 2, sd);
setpixel(19, 2, sd);
setpixel(20, 2, sd);
setpixel(21, 2, sd);
setpixel(22, 2, sa);
setpixel(23, 2, sd);
setpixel(24, 2, sd);
setpixel(25, 2, sd);
setpixel(26, 2, sd);
setpixel(27, 2, sd);
setpixel(28, 2, sb);
setpixel(29, 2, sb);
setpixel(30, 2, sb);
setpixel(31, 2, sb);
setpixel(32, 2, sb);
setpixel(33, 2, sb);
setpixel(0, 3, sc);
setpixel(1, 3, sc);
setpixel(2, 3, sa);
setpixel(3, 3, sc);
setpixel(4, 3, sc);
setpixel(5, 3, sc);
setpixel(6, 3, sc);
setpixel(7, 3, sa);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sc);
setpixel(12, 3, sa);
setpixel(13, 3, sc);
setpixel(14, 3, sc);
setpixel(15, 3, sc);
setpixel(16, 3, sc);
setpixel(17, 3, sa);
setpixel(18, 3, sc);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(21, 3, sc);
setpixel(22, 3, sa);
setpixel(23, 3, sc);
setpixel(24, 3, sc);
setpixel(25, 3, sc);
setpixel(26, 3, sc);
setpixel(27, 3, sc);
setpixel(28, 3, sb);
setpixel(29, 3, sb);
setpixel(30, 3, sb);
setpixel(31, 3, sb);
setpixel(32, 3, sb);
setpixel(33, 3, sb);
setpixel(34, 3, sb);
setpixel(35, 3, sb);
setpixel(36, 3, sb);
setpixel(37, 3, sb);
setpixel(38, 3, sb);
setpixel(2, 4, sa);
setpixel(7, 4, sa);
setpixel(12, 4, sa);
setpixel(17, 4, sa);
setpixel(22, 4, sa);
setpixel(27, 4, sb);
setpixel(28, 4, sb);
setpixel(33, 4, sb);
setpixel(34, 4, sb);
setpixel(35, 4, sb);
setpixel(36, 4, sb);
setpixel(37, 4, sb);
setpixel(38, 4, sb);
setpixel(39, 4, sb);
setpixel(40, 4, sb);
setpixel(41, 4, sb);
setpixel(42, 4, sb);
setpixel(43, 4, sb);
setpixel(44, 4, sb);
setpixel(45, 4, sb);
setpixel(38, 5, sb);
setpixel(39, 5, sb);
setpixel(40, 5, sb);
setpixel(41, 5, sb);
setpixel(42, 5, sb);
setpixel(43, 5, sb);
setpixel(44, 5, sb);
setpixel(45, 5, sb);
setpixel(46, 5, sb);
setpixel(47, 5, sb);
setpixel(48, 5, sb);
setpixel(49, 5, sb);
setpixel(50, 5, sb);
setpixel(46, 6, sb);
setpixel(47, 6, sb);
setpixel(48, 6, sb);
setpixel(49, 6, sb);
setpixel(50, 6, sb);
setpixel(51, 6, sb);
setpixel(52, 6, sb);
setpixel(53, 6, sb);
setpixel(54, 6, sb);
setpixel(50, 7, sb);
setpixel(51, 7, sb);
setpixel(52, 7, sb);
setpixel(53, 7, sb);
setpixel(54, 7, sb);
setpixel(55, 7, sb);
setpixel(56, 7, sb);
setpixel(57, 7, sb);
setpixel(54, 8, sb);
setpixel(55, 8, sb);
setpixel(56, 8, sb);
setpixel(57, 8, sb);
setpixel(58, 8, sb);
setpixel(59, 8, sb);
setpixel(57, 9, sb);
setpixel(58, 9, sb);
setpixel(59, 9, sb);
setpixel(60, 9, sb);
        
        
    }
    
    
    
    
    
    
    
    
}

