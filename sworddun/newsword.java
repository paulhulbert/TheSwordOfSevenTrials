/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class newsword extends unit {
    
    public newsword( ArrayList<weapon> weaps, room currentroom )
    {
        super( 1, 1, 1, "blankweap", 510, 420, new noai(), weaps, currentroom, 100, 140 );
        
        buildvil1();
        
        this.setStatement( "You got the sword!  This weapon is far more deadly than the hammer." );
        this.setName("Sword");
        
        
        trigger spoke1 = new trigger( false, "gotweap_sword" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat( "You got the sword!  This weapon is far more deadly than the hammer." );
        
        addchattrigger(chat1);
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(13);
        f.setlength(44);
        
Color sa = new Color(102,102,102);
Color sb = new Color(153,153,153);
Color sc = new Color(255,185,0);
Color sd = new Color(255,204,0);
Color se = new Color(255,188,0);
Color sf = new Color(86,28,0);
Color sg = new Color(108,31,0);

//<editor-fold defaultstate="collapsed" desc="build figure">





setpixel(7, 0, sa);
setpixel(7, 1, sa);
setpixel(6, 2, sb);
setpixel(7, 2, sa);
setpixel(8, 2, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sa);
setpixel(8, 3, sb);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sa);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(5, 5, sb);
setpixel(6, 5, sb);
setpixel(7, 5, sa);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(5, 6, sb);
setpixel(6, 6, sb);
setpixel(7, 6, sa);
setpixel(8, 6, sb);
setpixel(9, 6, sb);
setpixel(5, 7, sb);
setpixel(6, 7, sb);
setpixel(7, 7, sa);
setpixel(8, 7, sb);
setpixel(9, 7, sb);
setpixel(5, 8, sb);
setpixel(6, 8, sb);
setpixel(7, 8, sa);
setpixel(8, 8, sb);
setpixel(9, 8, sb);
setpixel(5, 9, sb);
setpixel(6, 9, sb);
setpixel(7, 9, sa);
setpixel(8, 9, sb);
setpixel(9, 9, sb);
setpixel(5, 10, sb);
setpixel(6, 10, sb);
setpixel(7, 10, sa);
setpixel(8, 10, sb);
setpixel(9, 10, sb);
setpixel(5, 11, sb);
setpixel(6, 11, sb);
setpixel(7, 11, sa);
setpixel(8, 11, sb);
setpixel(9, 11, sb);
setpixel(5, 12, sb);
setpixel(6, 12, sb);
setpixel(7, 12, sa);
setpixel(8, 12, sb);
setpixel(9, 12, sb);
setpixel(5, 13, sb);
setpixel(6, 13, sb);
setpixel(7, 13, sa);
setpixel(8, 13, sb);
setpixel(9, 13, sb);
setpixel(5, 14, sb);
setpixel(6, 14, sb);
setpixel(7, 14, sa);
setpixel(8, 14, sb);
setpixel(9, 14, sb);
setpixel(5, 15, sb);
setpixel(6, 15, sb);
setpixel(7, 15, sa);
setpixel(8, 15, sb);
setpixel(9, 15, sb);
setpixel(5, 16, sb);
setpixel(6, 16, sb);
setpixel(7, 16, sa);
setpixel(8, 16, sb);
setpixel(9, 16, sb);
setpixel(5, 17, sb);
setpixel(6, 17, sb);
setpixel(7, 17, sa);
setpixel(8, 17, sb);
setpixel(9, 17, sb);
setpixel(5, 18, sb);
setpixel(6, 18, sb);
setpixel(7, 18, sa);
setpixel(8, 18, sb);
setpixel(9, 18, sb);
setpixel(5, 19, sb);
setpixel(6, 19, sb);
setpixel(7, 19, sa);
setpixel(8, 19, sb);
setpixel(9, 19, sb);
setpixel(5, 20, sb);
setpixel(6, 20, sb);
setpixel(7, 20, sa);
setpixel(8, 20, sb);
setpixel(9, 20, sb);
setpixel(5, 21, sb);
setpixel(6, 21, sb);
setpixel(7, 21, sa);
setpixel(8, 21, sb);
setpixel(9, 21, sb);
setpixel(5, 22, sb);
setpixel(6, 22, sb);
setpixel(7, 22, sa);
setpixel(8, 22, sb);
setpixel(9, 22, sb);
setpixel(5, 23, sb);
setpixel(6, 23, sb);
setpixel(7, 23, sa);
setpixel(8, 23, sb);
setpixel(9, 23, sb);
setpixel(5, 24, sb);
setpixel(6, 24, sb);
setpixel(7, 24, sa);
setpixel(8, 24, sb);
setpixel(9, 24, sb);
setpixel(5, 25, sb);
setpixel(6, 25, sb);
setpixel(7, 25, sa);
setpixel(8, 25, sb);
setpixel(9, 25, sb);
setpixel(5, 26, sb);
setpixel(6, 26, sb);
setpixel(7, 26, sa);
setpixel(8, 26, sb);
setpixel(9, 26, sb);
setpixel(3, 27, sc);
setpixel(5, 27, sb);
setpixel(6, 27, sb);
setpixel(7, 27, sa);
setpixel(8, 27, sb);
setpixel(9, 27, sb);
setpixel(11, 27, sc);
setpixel(2, 28, sc);
setpixel(3, 28, sd);
setpixel(5, 28, sb);
setpixel(6, 28, sb);
setpixel(7, 28, sa);
setpixel(8, 28, sb);
setpixel(9, 28, sb);
setpixel(11, 28, sd);
setpixel(12, 28, sc);
setpixel(0, 29, se);
setpixel(1, 29, sc);
setpixel(2, 29, sd);
setpixel(5, 29, sb);
setpixel(6, 29, sb);
setpixel(7, 29, sa);
setpixel(8, 29, sb);
setpixel(9, 29, sb);
setpixel(12, 29, sd);
setpixel(13, 29, sc);
setpixel(1, 30, sc);
setpixel(2, 30, sd);
setpixel(5, 30, sb);
setpixel(6, 30, sb);
setpixel(7, 30, sa);
setpixel(8, 30, sb);
setpixel(9, 30, sb);
setpixel(12, 30, sd);
setpixel(13, 30, sc);
setpixel(2, 31, sc);
setpixel(3, 31, sd);
setpixel(4, 31, sc);
setpixel(5, 31, sc);
setpixel(6, 31, sc);
setpixel(7, 31, sc);
setpixel(8, 31, sc);
setpixel(9, 31, sc);
setpixel(10, 31, sc);
setpixel(11, 31, sd);
setpixel(12, 31, sc);
setpixel(3, 32, sc);
setpixel(4, 32, sd);
setpixel(5, 32, sd);
setpixel(6, 32, sd);
setpixel(7, 32, sd);
setpixel(8, 32, sd);
setpixel(9, 32, sd);
setpixel(10, 32, sd);
setpixel(11, 32, sc);
setpixel(4, 33, sc);
setpixel(5, 33, sc);
setpixel(6, 33, sc);
setpixel(7, 33, sc);
setpixel(8, 33, sc);
setpixel(9, 33, sc);
setpixel(10, 33, sc);
setpixel(6, 34, sf);
setpixel(7, 34, sf);
setpixel(8, 34, sg);
setpixel(6, 35, sg);
setpixel(7, 35, sf);
setpixel(8, 35, sf);
setpixel(6, 36, sf);
setpixel(7, 36, sg);
setpixel(8, 36, sf);
setpixel(6, 37, sf);
setpixel(7, 37, sf);
setpixel(8, 37, sg);
setpixel(6, 38, sg);
setpixel(7, 38, sf);
setpixel(8, 38, sf);
setpixel(6, 39, sf);
setpixel(7, 39, sg);
setpixel(8, 39, sf);
setpixel(6, 40, sf);
setpixel(7, 40, sf);
setpixel(8, 40, sg);
setpixel(6, 41, se);
setpixel(7, 41, sd);
setpixel(8, 41, se);
setpixel(5, 42, se);
setpixel(6, 42, sd);
setpixel(7, 42, sd);
setpixel(8, 42, sd);
setpixel(9, 42, se);
setpixel(6, 43, se);
setpixel(7, 43, sd);
setpixel(8, 43, se);
setpixel(7, 44, se);

for ( int c = 0; c < 44; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
