/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class atarget extends unit {
    
    public atarget( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 1000000, 10000, 1, "bow", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(13);
        f.setlength(79);
        




Color sa = new Color(0,0,0);
Color sb = new Color(255,255,150);
Color sc = new Color(255,0,0);
Color sd = new Color(102,51,0);
Color se = new Color(38,21,10);







//<editor-fold defaultstate="collapsed" desc="build figure">


f.setpixel(0, 0, sa);
f.setpixel(0, 1, sa);
f.setpixel(0, 2, sa);
f.setpixel(0, 3, sa);
f.setpixel(0, 4, sa);
f.setpixel(0, 5, sa);
f.setpixel(0, 6, sa);
f.setpixel(0, 7, sa);
f.setpixel(0, 8, sa);
f.setpixel(0, 9, sa);
f.setpixel(0, 10, sa);
f.setpixel(0, 11, sa);
f.setpixel(0, 12, sa);
f.setpixel(0, 13, sa);
f.setpixel(0, 14, sa);
f.setpixel(0, 15, sa);
f.setpixel(0, 16, sa);
f.setpixel(0, 17, sa);
f.setpixel(0, 18, sa);
f.setpixel(0, 19, sa);
f.setpixel(0, 20, sa);
f.setpixel(0, 21, sa);
f.setpixel(0, 22, sa);
f.setpixel(0, 23, sa);
f.setpixel(0, 24, sa);
f.setpixel(0, 25, sa);
f.setpixel(0, 26, sa);
f.setpixel(0, 27, sa);
f.setpixel(0, 28, sa);
f.setpixel(0, 29, sa);
f.setpixel(0, 30, sa);
f.setpixel(0, 31, sa);
f.setpixel(0, 32, sa);
f.setpixel(0, 33, sa);
f.setpixel(0, 35, sa);
f.setpixel(0, 36, sa);
f.setpixel(0, 37, sa);
f.setpixel(0, 38, sa);
f.setpixel(7, 38, sb);
f.setpixel(8, 38, sb);
f.setpixel(9, 38, sb);
f.setpixel(10, 38, sb);
f.setpixel(0, 39, sa);
f.setpixel(7, 39, sc);
f.setpixel(8, 39, sc);
f.setpixel(9, 39, sb);
f.setpixel(10, 39, sb);
f.setpixel(11, 39, sb);
f.setpixel(0, 40, sa);
f.setpixel(6, 40, sc);
f.setpixel(7, 40, sc);
f.setpixel(8, 40, sc);
f.setpixel(9, 40, sc);
f.setpixel(10, 40, sd);
f.setpixel(11, 40, sd);
f.setpixel(12, 40, sd);
f.setpixel(13, 40, sd);
f.setpixel(0, 41, sa);
f.setpixel(6, 41, sb);
f.setpixel(7, 41, sb);
f.setpixel(8, 41, sc);
f.setpixel(9, 41, sc);
f.setpixel(10, 41, sd);
f.setpixel(11, 41, sd);
f.setpixel(12, 41, sd);
f.setpixel(13, 41, sd);
f.setpixel(0, 42, sa);
f.setpixel(6, 42, sb);
f.setpixel(7, 42, sb);
f.setpixel(8, 42, sc);
f.setpixel(9, 42, sc);
f.setpixel(10, 42, sd);
f.setpixel(11, 42, sd);
f.setpixel(12, 42, sd);
f.setpixel(13, 42, sd);
f.setpixel(0, 43, sa);
f.setpixel(6, 43, sb);
f.setpixel(7, 43, sb);
f.setpixel(8, 43, sc);
f.setpixel(9, 43, sc);
f.setpixel(10, 43, sd);
f.setpixel(11, 43, sd);
f.setpixel(12, 43, sd);
f.setpixel(13, 43, sd);
f.setpixel(0, 44, sa);
f.setpixel(6, 44, sb);
f.setpixel(7, 44, sb);
f.setpixel(8, 44, sc);
f.setpixel(9, 44, sc);
f.setpixel(10, 44, sd);
f.setpixel(11, 44, sd);
f.setpixel(12, 44, sd);
f.setpixel(13, 44, sd);
f.setpixel(0, 45, sa);
f.setpixel(6, 45, sc);
f.setpixel(7, 45, sb);
f.setpixel(8, 45, sc);
f.setpixel(9, 45, sc);
f.setpixel(10, 45, sd);
f.setpixel(11, 45, sd);
f.setpixel(12, 45, sd);
f.setpixel(13, 45, sd);
f.setpixel(0, 46, sa);
f.setpixel(6, 46, sc);
f.setpixel(7, 46, sb);
f.setpixel(8, 46, sc);
f.setpixel(9, 46, sc);
f.setpixel(10, 46, sd);
f.setpixel(11, 46, sd);
f.setpixel(12, 46, sd);
f.setpixel(13, 46, sd);
f.setpixel(0, 47, sa);
f.setpixel(6, 47, sc);
f.setpixel(7, 47, sb);
f.setpixel(8, 47, sc);
f.setpixel(9, 47, sc);
f.setpixel(10, 47, sd);
f.setpixel(11, 47, sd);
f.setpixel(12, 47, sd);
f.setpixel(13, 47, sd);
f.setpixel(0, 48, sa);
f.setpixel(6, 48, sc);
f.setpixel(7, 48, sb);
f.setpixel(8, 48, sc);
f.setpixel(9, 48, sc);
f.setpixel(10, 48, sd);
f.setpixel(11, 48, sd);
f.setpixel(12, 48, sd);
f.setpixel(13, 48, sd);
f.setpixel(0, 49, sa);
f.setpixel(6, 49, sc);
f.setpixel(7, 49, sb);
f.setpixel(8, 49, sc);
f.setpixel(9, 49, sc);
f.setpixel(10, 49, sd);
f.setpixel(11, 49, sd);
f.setpixel(12, 49, sd);
f.setpixel(13, 49, sd);
f.setpixel(0, 50, sa);
f.setpixel(6, 50, sc);
f.setpixel(7, 50, sb);
f.setpixel(8, 50, sc);
f.setpixel(9, 50, sc);
f.setpixel(10, 50, sd);
f.setpixel(11, 50, sd);
f.setpixel(12, 50, sd);
f.setpixel(13, 50, sd);
f.setpixel(0, 51, sa);
f.setpixel(6, 51, sc);
f.setpixel(7, 51, sb);
f.setpixel(8, 51, sc);
f.setpixel(9, 51, sc);
f.setpixel(10, 51, sd);
f.setpixel(11, 51, sd);
f.setpixel(12, 51, sd);
f.setpixel(13, 51, sd);
f.setpixel(0, 52, sa);
f.setpixel(6, 52, sc);
f.setpixel(7, 52, sb);
f.setpixel(8, 52, sc);
f.setpixel(9, 52, sc);
f.setpixel(10, 52, sd);
f.setpixel(11, 52, sd);
f.setpixel(12, 52, sd);
f.setpixel(13, 52, sd);
f.setpixel(0, 53, sa);
f.setpixel(6, 53, sc);
f.setpixel(7, 53, sb);
f.setpixel(8, 53, sc);
f.setpixel(9, 53, sc);
f.setpixel(10, 53, sd);
f.setpixel(11, 53, sd);
f.setpixel(12, 53, sd);
f.setpixel(13, 53, sd);
f.setpixel(0, 54, sa);
f.setpixel(6, 54, sc);
f.setpixel(7, 54, sb);
f.setpixel(8, 54, sc);
f.setpixel(9, 54, sc);
f.setpixel(10, 54, sd);
f.setpixel(11, 54, sd);
f.setpixel(12, 54, sd);
f.setpixel(13, 54, sd);
f.setpixel(0, 55, sa);
f.setpixel(6, 55, sc);
f.setpixel(7, 55, sb);
f.setpixel(8, 55, sc);
f.setpixel(9, 55, sc);
f.setpixel(10, 55, sd);
f.setpixel(11, 55, sd);
f.setpixel(12, 55, sd);
f.setpixel(13, 55, sd);
f.setpixel(0, 56, sa);
f.setpixel(6, 56, sc);
f.setpixel(7, 56, sb);
f.setpixel(8, 56, sc);
f.setpixel(9, 56, sc);
f.setpixel(10, 56, sd);
f.setpixel(11, 56, sd);
f.setpixel(12, 56, sd);
f.setpixel(13, 56, sd);
f.setpixel(0, 57, sa);
f.setpixel(6, 57, sc);
f.setpixel(7, 57, sb);
f.setpixel(8, 57, sc);
f.setpixel(9, 57, sc);
f.setpixel(10, 57, sd);
f.setpixel(11, 57, sd);
f.setpixel(12, 57, sd);
f.setpixel(13, 57, sd);
f.setpixel(0, 58, sa);
f.setpixel(6, 58, sc);
f.setpixel(7, 58, sb);
f.setpixel(8, 58, sc);
f.setpixel(9, 58, sc);
f.setpixel(10, 58, sd);
f.setpixel(11, 58, sd);
f.setpixel(12, 58, sd);
f.setpixel(13, 58, sd);
f.setpixel(0, 59, sa);
f.setpixel(6, 59, sc);
f.setpixel(7, 59, sb);
f.setpixel(8, 59, sc);
f.setpixel(9, 59, sc);
f.setpixel(10, 59, sd);
f.setpixel(11, 59, sd);
f.setpixel(12, 59, sd);
f.setpixel(13, 59, sd);
f.setpixel(0, 60, sa);
f.setpixel(6, 60, sb);
f.setpixel(7, 60, sb);
f.setpixel(8, 60, sc);
f.setpixel(9, 60, sc);
f.setpixel(10, 60, sd);
f.setpixel(11, 60, sd);
f.setpixel(12, 60, sd);
f.setpixel(13, 60, sd);
f.setpixel(0, 61, sa);
f.setpixel(6, 61, sb);
f.setpixel(7, 61, sb);
f.setpixel(8, 61, sc);
f.setpixel(9, 61, sc);
f.setpixel(10, 61, sd);
f.setpixel(11, 61, sd);
f.setpixel(12, 61, sd);
f.setpixel(13, 61, sd);
f.setpixel(0, 62, sa);
f.setpixel(6, 62, sb);
f.setpixel(7, 62, sb);
f.setpixel(8, 62, sc);
f.setpixel(9, 62, sc);
f.setpixel(10, 62, sd);
f.setpixel(11, 62, sd);
f.setpixel(12, 62, sd);
f.setpixel(13, 62, sd);
f.setpixel(0, 63, sa);
f.setpixel(6, 63, sb);
f.setpixel(7, 63, sb);
f.setpixel(8, 63, sc);
f.setpixel(9, 63, sc);
f.setpixel(10, 63, sd);
f.setpixel(11, 63, sd);
f.setpixel(12, 63, sd);
f.setpixel(13, 63, sd);
f.setpixel(0, 64, sa);
f.setpixel(6, 64, sb);
f.setpixel(7, 64, sb);
f.setpixel(8, 64, sc);
f.setpixel(9, 64, sc);
f.setpixel(10, 64, sd);
f.setpixel(11, 64, sd);
f.setpixel(12, 64, sd);
f.setpixel(13, 64, sd);
f.setpixel(0, 65, sa);
f.setpixel(6, 65, sc);
f.setpixel(7, 65, sc);
f.setpixel(8, 65, sc);
f.setpixel(9, 65, sc);
f.setpixel(10, 65, sd);
f.setpixel(11, 65, sd);
f.setpixel(12, 65, sd);
f.setpixel(13, 65, sd);
f.setpixel(0, 66, sa);
f.setpixel(7, 66, sc);
f.setpixel(8, 66, sc);
f.setpixel(9, 66, sb);
f.setpixel(10, 66, sd);
f.setpixel(11, 66, sd);
f.setpixel(12, 66, sd);
f.setpixel(13, 66, sd);
f.setpixel(0, 67, sa);
f.setpixel(7, 67, sb);
f.setpixel(8, 67, sb);
f.setpixel(9, 67, sb);
f.setpixel(10, 67, sd);
f.setpixel(11, 67, sd);
f.setpixel(12, 67, sd);
f.setpixel(13, 67, sd);
f.setpixel(0, 68, sa);
f.setpixel(7, 68, sd);
f.setpixel(8, 68, sd);
f.setpixel(9, 68, se);
f.setpixel(10, 68, sd);
f.setpixel(11, 68, sd);
f.setpixel(12, 68, sd);
f.setpixel(13, 68, sd);
f.setpixel(0, 69, sa);
f.setpixel(7, 69, sd);
f.setpixel(8, 69, sd);
f.setpixel(9, 69, se);
f.setpixel(10, 69, sd);
f.setpixel(11, 69, sd);
f.setpixel(12, 69, sd);
f.setpixel(13, 69, sd);
f.setpixel(0, 70, sa);
f.setpixel(7, 70, sd);
f.setpixel(8, 70, sd);
f.setpixel(9, 70, se);
f.setpixel(10, 70, sd);
f.setpixel(11, 70, sd);
f.setpixel(12, 70, sd);
f.setpixel(13, 70, sd);
f.setpixel(0, 71, sa);
f.setpixel(7, 71, sd);
f.setpixel(8, 71, sd);
f.setpixel(9, 71, se);
f.setpixel(10, 71, sd);
f.setpixel(11, 71, sd);
f.setpixel(12, 71, sd);
f.setpixel(13, 71, sd);
f.setpixel(0, 72, sa);
f.setpixel(7, 72, sd);
f.setpixel(8, 72, sd);
f.setpixel(9, 72, se);
f.setpixel(10, 72, sd);
f.setpixel(11, 72, sd);
f.setpixel(12, 72, sd);
f.setpixel(13, 72, sd);
f.setpixel(0, 73, sa);
f.setpixel(7, 73, sd);
f.setpixel(8, 73, sd);
f.setpixel(9, 73, se);
f.setpixel(10, 73, sd);
f.setpixel(11, 73, sd);
f.setpixel(12, 73, sd);
f.setpixel(13, 73, sd);
f.setpixel(0, 74, sa);
f.setpixel(7, 74, sd);
f.setpixel(8, 74, sd);
f.setpixel(9, 74, se);
f.setpixel(10, 74, sd);
f.setpixel(11, 74, sd);
f.setpixel(12, 74, sd);
f.setpixel(13, 74, sd);
f.setpixel(0, 75, sa);
f.setpixel(7, 75, sd);
f.setpixel(8, 75, sd);
f.setpixel(9, 75, se);
f.setpixel(10, 75, sd);
f.setpixel(11, 75, sd);
f.setpixel(12, 75, sd);
f.setpixel(13, 75, sd);
f.setpixel(0, 76, sa);
f.setpixel(7, 76, sd);
f.setpixel(8, 76, sd);
f.setpixel(9, 76, se);
f.setpixel(10, 76, sd);
f.setpixel(11, 76, sd);
f.setpixel(12, 76, sd);
f.setpixel(13, 76, sd);
f.setpixel(0, 77, sa);
f.setpixel(7, 77, sd);
f.setpixel(8, 77, sd);
f.setpixel(9, 77, se);
f.setpixel(10, 77, sd);
f.setpixel(11, 77, sd);
f.setpixel(12, 77, sd);
f.setpixel(13, 77, sd);
f.setpixel(0, 78, sa);
f.setpixel(7, 78, sd);
f.setpixel(8, 78, sd);
f.setpixel(9, 78, se);
f.setpixel(10, 78, sd);
f.setpixel(11, 78, sd);
f.setpixel(12, 78, sd);
f.setpixel(13, 78, sd);
f.setpixel(0, 79, sa);
f.setpixel(7, 79, sd);
f.setpixel(8, 79, sd);
f.setpixel(9, 79, se);
f.setpixel(10, 79, sd);
f.setpixel(11, 79, sd);
f.setpixel(12, 79, sd);
f.setpixel(13, 79, sd);


for ( int c = 0; c < 79; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}


