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
public class gobclaws_taldo extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    
    
    
    
    public gobclaws_taldo( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 20, dir * 5, 5, 8, 30, true, new boolean[10], new Color[10], 35, 11, momentx, momenty, u );
        


sa = new Color(102,102,102);
sb = new Color(37,37,37);
sc = new Color(14,14,14);
sd = new Color(51,51,51);


        buildpic();
        
        
        name = "gobclaws_taldo";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 35 * 11; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        




setpixel(24, 0, sa);
setpixel(25, 0, sa);
setpixel(26, 0, sa);
setpixel(27, 0, sa);
setpixel(28, 0, sa);
setpixel(29, 0, sa);
setpixel(14, 1, sb);
setpixel(15, 1, sb);
setpixel(16, 1, sb);
setpixel(17, 1, sb);
setpixel(18, 1, sb);
setpixel(19, 1, sa);
setpixel(20, 1, sa);
setpixel(21, 1, sa);
setpixel(22, 1, sa);
setpixel(23, 1, sa);
setpixel(30, 1, sa);
setpixel(31, 1, sa);
setpixel(32, 1, sa);
setpixel(33, 1, sa);
setpixel(14, 2, sc);
setpixel(15, 2, sc);
setpixel(16, 2, sc);
setpixel(17, 2, sc);
setpixel(18, 2, sc);
setpixel(19, 2, sb);
setpixel(20, 2, sb);
setpixel(26, 2, sa);
setpixel(27, 2, sa);
setpixel(28, 2, sa);
setpixel(29, 2, sa);
setpixel(34, 2, sa);
setpixel(2, 3, sb);
setpixel(3, 3, sb);
setpixel(4, 3, sb);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sb);
setpixel(8, 3, sb);
setpixel(9, 3, sb);
setpixel(10, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sb);
setpixel(14, 3, sb);
setpixel(15, 3, sb);
setpixel(16, 3, sc);
setpixel(17, 3, sc);
setpixel(18, 3, sc);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(21, 3, sa);
setpixel(22, 3, sa);
setpixel(23, 3, sa);
setpixel(24, 3, sa);
setpixel(25, 3, sa);
setpixel(30, 3, sa);
setpixel(31, 3, sa);
setpixel(32, 3, sa);
setpixel(33, 3, sa);
setpixel(35, 3, sa);
setpixel(1, 4, sb);
setpixel(2, 4, sb);
setpixel(3, 4, sb);
setpixel(4, 4, sb);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sb);
setpixel(8, 4, sb);
setpixel(9, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sb);
setpixel(14, 4, sb);
setpixel(15, 4, sc);
setpixel(16, 4, sb);
setpixel(17, 4, sb);
setpixel(18, 4, sb);
setpixel(19, 4, sb);
setpixel(20, 4, sb);
setpixel(26, 4, sa);
setpixel(27, 4, sa);
setpixel(28, 4, sa);
setpixel(29, 4, sa);
setpixel(34, 4, sa);
setpixel(0, 5, sa);
setpixel(1, 5, sb);
setpixel(2, 5, sb);
setpixel(3, 5, sb);
setpixel(4, 5, sb);
setpixel(5, 5, sb);
setpixel(6, 5, sb);
setpixel(7, 5, sb);
setpixel(8, 5, sc);
setpixel(9, 5, sc);
setpixel(10, 5, sb);
setpixel(11, 5, sb);
setpixel(12, 5, sb);
setpixel(13, 5, sb);
setpixel(14, 5, sb);
setpixel(15, 5, sc);
setpixel(16, 5, sc);
setpixel(17, 5, sc);
setpixel(18, 5, sc);
setpixel(19, 5, sc);
setpixel(20, 5, sc);
setpixel(21, 5, sa);
setpixel(22, 5, sa);
setpixel(23, 5, sa);
setpixel(24, 5, sa);
setpixel(25, 5, sa);
setpixel(30, 5, sa);
setpixel(31, 5, sa);
setpixel(32, 5, sa);
setpixel(33, 5, sa);
setpixel(35, 5, sa);
setpixel(1, 6, sb);
setpixel(2, 6, sb);
setpixel(3, 6, sb);
setpixel(4, 6, sb);
setpixel(5, 6, sb);
setpixel(6, 6, sb);
setpixel(7, 6, sb);
setpixel(8, 6, sc);
setpixel(9, 6, sb);
setpixel(10, 6, sb);
setpixel(11, 6, sb);
setpixel(12, 6, sb);
setpixel(13, 6, sb);
setpixel(14, 6, sb);
setpixel(15, 6, sc);
setpixel(16, 6, sb);
setpixel(17, 6, sb);
setpixel(18, 6, sb);
setpixel(19, 6, sb);
setpixel(20, 6, sb);
setpixel(26, 6, sa);
setpixel(27, 6, sa);
setpixel(28, 6, sa);
setpixel(29, 6, sa);
setpixel(34, 6, sa);
setpixel(1, 7, sb);
setpixel(2, 7, sb);
setpixel(3, 7, sb);
setpixel(4, 7, sb);
setpixel(5, 7, sb);
setpixel(6, 7, sb);
setpixel(7, 7, sb);
setpixel(8, 7, sc);
setpixel(9, 7, sb);
setpixel(10, 7, sb);
setpixel(11, 7, sb);
setpixel(12, 7, sb);
setpixel(13, 7, sb);
setpixel(14, 7, sb);
setpixel(15, 7, sc);
setpixel(16, 7, sc);
setpixel(17, 7, sc);
setpixel(18, 7, sc);
setpixel(19, 7, sb);
setpixel(20, 7, sd);
setpixel(21, 7, sa);
setpixel(22, 7, sa);
setpixel(23, 7, sa);
setpixel(24, 7, sa);
setpixel(25, 7, sa);
setpixel(30, 7, sa);
setpixel(31, 7, sa);
setpixel(32, 7, sa);
setpixel(33, 7, sa);
setpixel(35, 7, sa);
setpixel(1, 8, sb);
setpixel(2, 8, sb);
setpixel(3, 8, sb);
setpixel(4, 8, sb);
setpixel(5, 8, sb);
setpixel(6, 8, sb);
setpixel(7, 8, sb);
setpixel(8, 8, sc);
setpixel(9, 8, sc);
setpixel(10, 8, sb);
setpixel(11, 8, sb);
setpixel(12, 8, sb);
setpixel(13, 8, sb);
setpixel(14, 8, sc);
setpixel(15, 8, sb);
setpixel(16, 8, sb);
setpixel(17, 8, sb);
setpixel(18, 8, sb);
setpixel(19, 8, sd);
setpixel(24, 8, sa);
setpixel(25, 8, sa);
setpixel(26, 8, sa);
setpixel(27, 8, sa);
setpixel(28, 8, sa);
setpixel(29, 8, sa);
setpixel(34, 8, sa);
setpixel(2, 9, sb);
setpixel(3, 9, sb);
setpixel(4, 9, sb);
setpixel(5, 9, sb);
setpixel(6, 9, sb);
setpixel(7, 9, sb);
setpixel(8, 9, sb);
setpixel(9, 9, sc);
setpixel(10, 9, sb);
setpixel(11, 9, sb);
setpixel(14, 9, sc);
setpixel(15, 9, sb);
setpixel(16, 9, sb);
setpixel(17, 9, sb);
setpixel(18, 9, sb);
setpixel(19, 9, sa);
setpixel(20, 9, sa);
setpixel(21, 9, sa);
setpixel(22, 9, sa);
setpixel(23, 9, sa);
setpixel(30, 9, sa);
setpixel(31, 9, sa);
setpixel(32, 9, sa);
setpixel(33, 9, sa);
setpixel(35, 9, sa);
setpixel(2, 10, sb);
setpixel(3, 10, sb);
setpixel(4, 10, sb);
setpixel(5, 10, sb);
setpixel(6, 10, sb);
setpixel(7, 10, sb);
setpixel(34, 10, sa);
setpixel(35, 11, sa);



for ( int c = 0; c < 11; c++ ) {
    fig.erasepixel( 0, c );
}

        
    }
    
    
    
}


