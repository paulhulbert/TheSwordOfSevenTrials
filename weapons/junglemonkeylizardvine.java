/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weapons;

import every.unit;
import every.weapon;
import java.awt.Color;



import every.weapon;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class junglemonkeylizardvine extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    
    public junglemonkeylizardvine( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 33, dir * 3, 0, 3, 70, true, new boolean[10], new Color[10], 44, 4, momentx, momenty, u );
        
        
        

Color sa = new Color(51,102,0);
        
        


        
        buildpic();
        
        
        name = "junglemonkeylizardvine";
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 44 * 4; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        


setpixel(3, 0, sa);
setpixel(19, 0, sa);
setpixel(20, 0, sa);
setpixel(4, 1, sa);
setpixel(5, 1, sa);
setpixel(21, 1, sa);
setpixel(28, 1, sa);
setpixel(29, 1, sa);
setpixel(38, 1, sa);
setpixel(0, 2, sa);
setpixel(1, 2, sa);
setpixel(2, 2, sa);
setpixel(3, 2, sa);
setpixel(4, 2, sa);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sa);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(15, 2, sa);
setpixel(16, 2, sa);
setpixel(17, 2, sa);
setpixel(18, 2, sa);
setpixel(19, 2, sa);
setpixel(20, 2, sa);
setpixel(21, 2, sa);
setpixel(22, 2, sa);
setpixel(23, 2, sa);
setpixel(24, 2, sa);
setpixel(25, 2, sa);
setpixel(26, 2, sa);
setpixel(27, 2, sa);
setpixel(28, 2, sa);
setpixel(29, 2, sa);
setpixel(30, 2, sa);
setpixel(31, 2, sa);
setpixel(32, 2, sa);
setpixel(33, 2, sa);
setpixel(34, 2, sa);
setpixel(35, 2, sa);
setpixel(36, 2, sa);
setpixel(37, 2, sa);
setpixel(38, 2, sa);
setpixel(39, 2, sa);
setpixel(40, 2, sa);
setpixel(41, 2, sa);
setpixel(42, 2, sa);
setpixel(43, 2, sa);
setpixel(44, 2, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(26, 3, sa);
setpixel(27, 3, sa);
setpixel(38, 3, sa);
setpixel(39, 3, sa);
setpixel(43, 3, sa);
setpixel(14, 4, sa);

        
for ( int c = 0; c < 44; c++ ) {
    erasepixel( 0, c );
}
        
        
    }
    
    
    
    
    
    
    
    
}


