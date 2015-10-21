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
public class hammer extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa = new Color(204,204,204);
    private Color sb = new Color(153,153,153);
    private Color sc = new Color(181,90,0);
    private Color sd = new Color(102,51,0);
    private Color se = new Color(23,10,1);
    
    
    
    public hammer( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 6, dir * 4, 5, 8, 30, true, new boolean[10], new Color[10], 30, 31, momentx, momenty, u );
        
        
        buildpic();
        
        
        
        name = "hammer";
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 47 * 48; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        














setpixel(20, 0, sa);
setpixel(19, 1, sa);
setpixel(20, 1, sb);
setpixel(21, 1, sa);
setpixel(18, 2, sa);
setpixel(19, 2, sb);
setpixel(20, 2, sb);
setpixel(21, 2, sb);
setpixel(22, 2, sa);
setpixel(17, 3, sa);
setpixel(18, 3, sb);
setpixel(19, 3, sb);
setpixel(20, 3, sb);
setpixel(21, 3, sb);
setpixel(22, 3, sb);
setpixel(23, 3, sa);
setpixel(25, 3, sc);
setpixel(17, 4, sa);
setpixel(18, 4, sb);
setpixel(19, 4, sb);
setpixel(20, 4, sb);
setpixel(21, 4, sb);
setpixel(22, 4, sb);
setpixel(23, 4, sb);
setpixel(24, 4, sd);
setpixel(25, 4, sd);
setpixel(26, 4, sc);
setpixel(18, 5, sa);
setpixel(19, 5, sb);
setpixel(20, 5, sb);
setpixel(21, 5, sb);
setpixel(22, 5, sb);
setpixel(23, 5, sb);
setpixel(24, 5, sb);
setpixel(25, 5, sc);
setpixel(26, 5, sd);
setpixel(27, 5, sd);
setpixel(19, 6, sa);
setpixel(20, 6, sb);
setpixel(21, 6, sb);
setpixel(22, 6, sb);
setpixel(23, 6, sb);
setpixel(24, 6, sb);
setpixel(25, 6, sb);
setpixel(26, 6, sd);
setpixel(20, 7, sa);
setpixel(21, 7, sb);
setpixel(22, 7, sb);
setpixel(23, 7, sb);
setpixel(24, 7, sb);
setpixel(25, 7, sb);
setpixel(26, 7, sb);
setpixel(27, 7, sa);
setpixel(21, 8, sd);
setpixel(22, 8, sb);
setpixel(23, 8, sb);
setpixel(24, 8, sb);
setpixel(25, 8, sb);
setpixel(26, 8, sb);
setpixel(27, 8, sb);
setpixel(28, 8, sa);
setpixel(20, 9, sd);
setpixel(21, 9, sd);
setpixel(22, 9, sc);
setpixel(23, 9, sb);
setpixel(24, 9, sb);
setpixel(25, 9, sb);
setpixel(26, 9, sb);
setpixel(27, 9, sb);
setpixel(28, 9, sa);
setpixel(19, 10, sd);
setpixel(20, 10, sd);
setpixel(21, 10, sc);
setpixel(22, 10, sd);
setpixel(23, 10, sd);
setpixel(24, 10, sa);
setpixel(25, 10, sb);
setpixel(26, 10, sb);
setpixel(27, 10, sb);
setpixel(28, 10, sb);
setpixel(29, 10, sa);
setpixel(18, 11, sd);
setpixel(19, 11, sd);
setpixel(20, 11, sc);
setpixel(21, 11, sd);
setpixel(22, 11, sd);
setpixel(25, 11, sa);
setpixel(26, 11, sa);
setpixel(27, 11, sb);
setpixel(28, 11, sb);
setpixel(29, 11, sb);
setpixel(30, 11, sa);
setpixel(17, 12, sd);
setpixel(18, 12, sd);
setpixel(19, 12, sc);
setpixel(20, 12, sd);
setpixel(21, 12, sd);
setpixel(27, 12, sa);
setpixel(28, 12, sb);
setpixel(29, 12, sb);
setpixel(30, 12, sa);
setpixel(16, 13, sd);
setpixel(17, 13, sc);
setpixel(18, 13, sc);
setpixel(19, 13, sd);
setpixel(20, 13, sd);
setpixel(28, 13, sa);
setpixel(29, 13, sa);
setpixel(15, 14, sd);
setpixel(16, 14, sd);
setpixel(17, 14, sc);
setpixel(18, 14, sd);
setpixel(19, 14, sc);
setpixel(14, 15, sd);
setpixel(15, 15, sd);
setpixel(16, 15, sc);
setpixel(17, 15, sd);
setpixel(18, 15, sc);
setpixel(19, 15, se);
setpixel(13, 16, sd);
setpixel(14, 16, sd);
setpixel(15, 16, sc);
setpixel(16, 16, sd);
setpixel(17, 16, sd);
setpixel(12, 17, sd);
setpixel(13, 17, sd);
setpixel(14, 17, sc);
setpixel(15, 17, sd);
setpixel(16, 17, sd);
setpixel(11, 18, sd);
setpixel(12, 18, sd);
setpixel(13, 18, sc);
setpixel(14, 18, sd);
setpixel(15, 18, sd);
setpixel(9, 19, se);
setpixel(10, 19, sc);
setpixel(11, 19, sd);
setpixel(12, 19, sc);
setpixel(13, 19, sd);
setpixel(14, 19, sd);
setpixel(9, 20, sc);
setpixel(10, 20, sd);
setpixel(11, 20, sc);
setpixel(12, 20, sd);
setpixel(13, 20, sd);
setpixel(8, 21, sd);
setpixel(9, 21, sd);
setpixel(10, 21, sd);
setpixel(11, 21, sc);
setpixel(12, 21, sd);
setpixel(7, 22, sd);
setpixel(8, 22, sd);
setpixel(9, 22, sd);
setpixel(10, 22, sc);
setpixel(11, 22, sc);
setpixel(6, 23, sd);
setpixel(7, 23, sd);
setpixel(8, 23, sc);
setpixel(9, 23, sc);
setpixel(10, 23, sc);
setpixel(5, 24, sd);
setpixel(6, 24, sd);
setpixel(7, 24, sc);
setpixel(8, 24, sd);
setpixel(9, 24, sd);
setpixel(4, 25, sd);
setpixel(5, 25, sd);
setpixel(6, 25, sc);
setpixel(7, 25, sd);
setpixel(8, 25, sd);
setpixel(3, 26, sd);
setpixel(4, 26, sd);
setpixel(5, 26, sc);
setpixel(6, 26, sd);
setpixel(7, 26, sd);
setpixel(2, 27, sd);
setpixel(3, 27, sd);
setpixel(4, 27, sc);
setpixel(5, 27, sd);
setpixel(6, 27, sd);
setpixel(1, 28, sd);
setpixel(2, 28, sd);
setpixel(3, 28, sc);
setpixel(4, 28, sd);
setpixel(5, 28, sd);
setpixel(0, 29, sd);
setpixel(1, 29, sd);
setpixel(2, 29, sc);
setpixel(3, 29, sd);
setpixel(4, 29, sd);
setpixel(1, 30, sc);
setpixel(2, 30, sd);
setpixel(3, 30, sd);
setpixel(2, 31, sc);









        
        
        
        
        
        
    }
    
    
    
}
