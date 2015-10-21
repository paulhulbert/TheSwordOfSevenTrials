/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class bow extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public bow( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 10, dir * 1, 0, 0, 80, true, new boolean[10], new Color[10], 9, 49, momentx, momenty, u );
        
        
        sa = new Color(143,57,17);
        sb = new Color(190,163,85);
        sc = new Color(190,165,85);
        sd = new Color(190,155,57);
        
        
        name = "bow";

        
        buildpic();
        
        
        
        
        
    }
    
//    @Override
//    public void step( Graphics g )
//    {
//        if ( !this.active ) {
//            return;
//        }
//        
//        counter++;
//        
//        
//        if ( counter > range / 8 ) {
//            active = false;
//            return;
//        }
//        
////        if ( distance( firstx, firsty, x, y ) >= range ) {
////            active = false;
////            return;
////        }
//        
//        paintit( g );
//        
//    }
    
    public static int getrange()
    {
        
        return 150;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 9 * 49; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        
setpixel(0, 0, sa);
setpixel(0, 1, sa);
setpixel(1, 1, sb);
setpixel(0, 2, sb);
setpixel(1, 2, sa);
setpixel(2, 2, sa);
setpixel(0, 3, sb);
setpixel(1, 3, sa);
setpixel(2, 3, sa);
setpixel(3, 3, sa);
setpixel(0, 4, sb);
setpixel(2, 4, sa);
setpixel(3, 4, sa);
setpixel(0, 5, sb);
setpixel(2, 5, sa);
setpixel(3, 5, sa);
setpixel(4, 5, sa);
setpixel(0, 6, sb);
setpixel(3, 6, sa);
setpixel(4, 6, sa);
setpixel(0, 7, sb);
setpixel(3, 7, sa);
setpixel(4, 7, sa);
setpixel(5, 7, sa);
setpixel(0, 8, sb);
setpixel(4, 8, sa);
setpixel(5, 8, sa);
setpixel(0, 9, sb);
setpixel(4, 9, sa);
setpixel(5, 9, sa);
setpixel(6, 9, sa);
setpixel(0, 10, sb);
setpixel(5, 10, sa);
setpixel(6, 10, sa);
setpixel(0, 11, sb);
setpixel(5, 11, sa);
setpixel(6, 11, sa);
setpixel(0, 12, sb);
setpixel(6, 12, sa);
setpixel(7, 12, sa);
setpixel(0, 13, sb);
setpixel(6, 13, sa);
setpixel(7, 13, sa);
setpixel(0, 14, sb);
setpixel(6, 14, sa);
setpixel(7, 14, sa);
setpixel(0, 15, sb);
setpixel(6, 15, sa);
setpixel(7, 15, sa);
setpixel(8, 15, sa);
setpixel(0, 16, sb);
setpixel(7, 16, sa);
setpixel(8, 16, sa);
setpixel(0, 17, sb);
setpixel(7, 17, sa);
setpixel(8, 17, sa);
setpixel(9, 17, sa);
setpixel(0, 18, sb);
setpixel(7, 18, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sa);
setpixel(0, 19, sb);
setpixel(8, 19, sa);
setpixel(9, 19, sa);
setpixel(0, 20, sb);
setpixel(8, 20, sa);
setpixel(9, 20, sa);
setpixel(0, 21, sb);
setpixel(8, 21, sc);
setpixel(9, 21, sc);
setpixel(0, 22, sb);
setpixel(8, 22, sd);
setpixel(9, 22, sd);
setpixel(0, 23, sb);
setpixel(8, 23, sc);
setpixel(9, 23, sc);
setpixel(0, 24, sb);
setpixel(8, 24, sd);
setpixel(9, 24, sd);
setpixel(0, 25, sb);
setpixel(8, 25, sb);
setpixel(9, 25, sb);
setpixel(0, 26, sb);
setpixel(8, 26, sd);
setpixel(9, 26, sd);
setpixel(0, 27, sb);
setpixel(8, 27, sb);
setpixel(9, 27, sb);
setpixel(0, 28, sb);
setpixel(8, 28, sd);
setpixel(9, 28, sd);
setpixel(0, 29, sb);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(0, 30, sb);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(0, 31, sb);
setpixel(7, 31, sa);
setpixel(8, 31, sa);
setpixel(9, 31, sa);
setpixel(0, 32, sb);
setpixel(7, 32, sa);
setpixel(8, 32, sa);
setpixel(9, 32, sa);
setpixel(0, 33, sb);
setpixel(7, 33, sa);
setpixel(8, 33, sa);
setpixel(0, 34, sb);
setpixel(6, 34, sa);
setpixel(7, 34, sa);
setpixel(8, 34, sa);
setpixel(0, 35, sb);
setpixel(6, 35, sa);
setpixel(7, 35, sa);
setpixel(0, 36, sb);
setpixel(6, 36, sa);
setpixel(7, 36, sa);
setpixel(0, 37, sb);
setpixel(6, 37, sa);
setpixel(7, 37, sa);
setpixel(0, 38, sb);
setpixel(5, 38, sa);
setpixel(6, 38, sa);
setpixel(0, 39, sb);
setpixel(5, 39, sa);
setpixel(6, 39, sa);
setpixel(0, 40, sb);
setpixel(4, 40, sa);
setpixel(5, 40, sa);
setpixel(6, 40, sa);
setpixel(0, 41, sb);
setpixel(4, 41, sa);
setpixel(5, 41, sa);
setpixel(0, 42, sb);
setpixel(3, 42, sa);
setpixel(4, 42, sa);
setpixel(5, 42, sa);
setpixel(0, 43, sb);
setpixel(3, 43, sa);
setpixel(4, 43, sa);
setpixel(0, 44, sb);
setpixel(2, 44, sa);
setpixel(3, 44, sa);
setpixel(4, 44, sa);
setpixel(0, 45, sb);
setpixel(2, 45, sa);
setpixel(3, 45, sa);
setpixel(0, 46, sb);
setpixel(1, 46, sa);
setpixel(2, 46, sa);
setpixel(3, 46, sa);
setpixel(0, 47, sb);
setpixel(1, 47, sa);
setpixel(2, 47, sa);
setpixel(0, 48, sa);
setpixel(1, 48, sb);
setpixel(0, 49, sa);














        
        
        
        
        
    }
    
}
