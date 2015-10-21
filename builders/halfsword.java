/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class halfsword extends unit {
    
    public halfsword( ArrayList<weapon> weaps, room currentroom )
    {
        super( 1, 1, 1, "blankweap", 510, 413, new noai(), weaps, currentroom, 100, 140 );
        
        buildvil1();
        
        this.setStatement( "You got the Regent's sword back!" );
        this.setName("Regent's Sword");
        
        
        trigger spoke1 = new trigger( false, "builders_halfsword_spoke1" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat("You got the Regent's sword back!");
        
        addchattrigger(chat1);
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(14);
        f.setlength(86);
        

Color sa = new Color(102,102,102);
Color sb = new Color(153,153,153);
Color sc = new Color(255,153,0);
Color sd = new Color(255,0,0);
Color se = new Color(51,0,0);
Color sf = new Color(102,0,0);


//<editor-fold defaultstate="collapsed" desc="build figure">




setpixel(8, 0, sa);
setpixel(8, 1, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sb);
setpixel(9, 2, sa);
setpixel(7, 3, sa);
setpixel(8, 3, sb);
setpixel(9, 3, sa);
setpixel(6, 4, sa);
setpixel(7, 4, sb);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(10, 4, sa);
setpixel(6, 5, sa);
setpixel(7, 5, sb);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(10, 5, sa);
setpixel(6, 6, sa);
setpixel(7, 6, sb);
setpixel(8, 6, sb);
setpixel(9, 6, sb);
setpixel(10, 6, sa);
setpixel(6, 7, sa);
setpixel(7, 7, sb);
setpixel(8, 7, sb);
setpixel(9, 7, sb);
setpixel(10, 7, sa);
setpixel(6, 8, sa);
setpixel(7, 8, sb);
setpixel(8, 8, sb);
setpixel(9, 8, sb);
setpixel(10, 8, sa);
setpixel(6, 9, sa);
setpixel(7, 9, sb);
setpixel(8, 9, sb);
setpixel(9, 9, sb);
setpixel(10, 9, sa);
setpixel(6, 10, sa);
setpixel(7, 10, sb);
setpixel(8, 10, sb);
setpixel(9, 10, sb);
setpixel(10, 10, sa);
setpixel(6, 11, sa);
setpixel(7, 11, sb);
setpixel(8, 11, sb);
setpixel(9, 11, sb);
setpixel(10, 11, sa);
setpixel(6, 12, sa);
setpixel(7, 12, sb);
setpixel(8, 12, sb);
setpixel(9, 12, sb);
setpixel(10, 12, sa);
setpixel(6, 13, sa);
setpixel(7, 13, sb);
setpixel(8, 13, sb);
setpixel(9, 13, sb);
setpixel(10, 13, sa);
setpixel(6, 14, sa);
setpixel(7, 14, sb);
setpixel(8, 14, sb);
setpixel(9, 14, sb);
setpixel(10, 14, sa);
setpixel(6, 15, sa);
setpixel(7, 15, sb);
setpixel(8, 15, sb);
setpixel(9, 15, sb);
setpixel(10, 15, sa);
setpixel(6, 16, sa);
setpixel(7, 16, sb);
setpixel(8, 16, sb);
setpixel(9, 16, sb);
setpixel(10, 16, sa);
setpixel(6, 17, sa);
setpixel(7, 17, sb);
setpixel(8, 17, sb);
setpixel(9, 17, sb);
setpixel(10, 17, sa);
setpixel(6, 18, sa);
setpixel(7, 18, sb);
setpixel(8, 18, sb);
setpixel(9, 18, sb);
setpixel(10, 18, sa);
setpixel(6, 19, sa);
setpixel(7, 19, sb);
setpixel(8, 19, sb);
setpixel(9, 19, sb);
setpixel(10, 19, sa);
setpixel(6, 20, sa);
setpixel(7, 20, sb);
setpixel(8, 20, sb);
setpixel(9, 20, sb);
setpixel(10, 20, sa);
setpixel(6, 21, sa);
setpixel(7, 21, sb);
setpixel(8, 21, sb);
setpixel(9, 21, sb);
setpixel(10, 21, sa);
setpixel(6, 22, sa);
setpixel(7, 22, sb);
setpixel(8, 22, sb);
setpixel(9, 22, sb);
setpixel(10, 22, sa);
setpixel(6, 23, sa);
setpixel(7, 23, sb);
setpixel(8, 23, sb);
setpixel(9, 23, sb);
setpixel(10, 23, sa);
setpixel(6, 24, sa);
setpixel(7, 24, sb);
setpixel(8, 24, sb);
setpixel(9, 24, sb);
setpixel(10, 24, sa);
setpixel(6, 25, sa);
setpixel(7, 25, sb);
setpixel(8, 25, sb);
setpixel(9, 25, sb);
setpixel(10, 25, sa);
setpixel(6, 26, sa);
setpixel(7, 26, sb);
setpixel(8, 26, sb);
setpixel(9, 26, sb);
setpixel(10, 26, sa);
setpixel(6, 27, sa);
setpixel(7, 27, sb);
setpixel(8, 27, sb);
setpixel(9, 27, sb);
setpixel(10, 27, sa);
setpixel(6, 28, sa);
setpixel(7, 28, sb);
setpixel(8, 28, sb);
setpixel(9, 28, sb);
setpixel(10, 28, sa);
setpixel(6, 29, sa);
setpixel(7, 29, sb);
setpixel(8, 29, sb);
setpixel(9, 29, sb);
setpixel(10, 29, sa);
setpixel(6, 30, sa);
setpixel(7, 30, sb);
setpixel(8, 30, sb);
setpixel(9, 30, sb);
setpixel(10, 30, sa);
setpixel(6, 31, sa);
setpixel(7, 31, sb);
setpixel(8, 31, sb);
setpixel(9, 31, sb);
setpixel(10, 31, sa);
setpixel(6, 32, sa);
setpixel(7, 32, sb);
setpixel(8, 32, sb);
setpixel(9, 32, sb);
setpixel(10, 32, sa);
setpixel(6, 33, sa);
setpixel(7, 33, sb);
setpixel(8, 33, sb);
setpixel(9, 33, sb);
setpixel(10, 33, sa);
setpixel(6, 34, sa);
setpixel(7, 34, sb);
setpixel(8, 34, sb);
setpixel(9, 34, sb);
setpixel(10, 34, sa);
setpixel(6, 35, sa);
setpixel(7, 35, sb);
setpixel(8, 35, sb);
setpixel(9, 35, sb);
setpixel(10, 35, sa);
setpixel(6, 36, sa);
setpixel(7, 36, sb);
setpixel(8, 36, sb);
setpixel(9, 36, sb);
setpixel(10, 36, sa);
setpixel(6, 37, sa);
setpixel(7, 37, sb);
setpixel(8, 37, sb);
setpixel(9, 37, sb);
setpixel(10, 37, sa);
setpixel(3, 38, sc);
setpixel(4, 38, sc);
setpixel(6, 38, sa);
setpixel(7, 38, sb);
setpixel(8, 38, sb);
setpixel(9, 38, sb);
setpixel(10, 38, sa);
setpixel(12, 38, sc);
setpixel(13, 38, sc);
setpixel(2, 39, sc);
setpixel(3, 39, sc);
setpixel(6, 39, sa);
setpixel(7, 39, sb);
setpixel(8, 39, sb);
setpixel(9, 39, sb);
setpixel(10, 39, sa);
setpixel(13, 39, sc);
setpixel(14, 39, sc);
setpixel(2, 40, sc);
setpixel(4, 40, sc);
setpixel(5, 40, sc);
setpixel(6, 40, sc);
setpixel(7, 40, sb);
setpixel(8, 40, sb);
setpixel(9, 40, sb);
setpixel(10, 40, sc);
setpixel(11, 40, sc);
setpixel(12, 40, sc);
setpixel(14, 40, sc);
setpixel(2, 41, sc);
setpixel(3, 41, sc);
setpixel(6, 41, sa);
setpixel(7, 41, sc);
setpixel(8, 41, sb);
setpixel(9, 41, sc);
setpixel(10, 41, sa);
setpixel(13, 41, sc);
setpixel(14, 41, sc);
setpixel(3, 42, sc);
setpixel(4, 42, sc);
setpixel(6, 42, sa);
setpixel(7, 42, sb);
setpixel(8, 42, sc);
setpixel(9, 42, sb);
setpixel(10, 42, sa);
setpixel(12, 42, sc);
setpixel(13, 42, sc);
setpixel(4, 43, sc);
setpixel(5, 43, sc);
setpixel(6, 43, sc);
setpixel(7, 43, sc);
setpixel(8, 43, sd);
setpixel(9, 43, sc);
setpixel(10, 43, sc);
setpixel(11, 43, sc);
setpixel(12, 43, sc);
setpixel(5, 44, sc);
setpixel(6, 44, sd);
setpixel(7, 44, sc);
setpixel(8, 44, sc);
setpixel(9, 44, sc);
setpixel(10, 44, sd);
setpixel(11, 44, sc);
setpixel(5, 45, sc);
setpixel(6, 45, sd);
setpixel(7, 45, sd);
setpixel(8, 45, sc);
setpixel(9, 45, sd);
setpixel(10, 45, sd);
setpixel(11, 45, sc);
setpixel(6, 46, sc);
setpixel(7, 46, sc);
setpixel(8, 46, sd);
setpixel(9, 46, sc);
setpixel(10, 46, sc);
setpixel(6, 47, se);
setpixel(7, 47, sf);
setpixel(8, 47, sf);
setpixel(9, 47, sf);
setpixel(10, 47, se);
setpixel(6, 48, sf);
setpixel(7, 48, se);
setpixel(8, 48, sf);
setpixel(9, 48, se);
setpixel(10, 48, sf);
setpixel(6, 49, sf);
setpixel(7, 49, sf);
setpixel(8, 49, se);
setpixel(9, 49, sf);
setpixel(10, 49, sf);
setpixel(6, 50, sf);
setpixel(7, 50, sf);
setpixel(8, 50, sf);
setpixel(9, 50, se);
setpixel(10, 50, sf);
setpixel(6, 51, se);
setpixel(7, 51, sf);
setpixel(8, 51, sf);
setpixel(9, 51, sf);
setpixel(10, 51, se);
setpixel(6, 52, sf);
setpixel(7, 52, se);
setpixel(8, 52, sf);
setpixel(9, 52, sf);
setpixel(10, 52, sf);
setpixel(6, 53, sf);
setpixel(7, 53, sf);
setpixel(8, 53, se);
setpixel(9, 53, sf);
setpixel(10, 53, sf);
setpixel(6, 54, sf);
setpixel(7, 54, se);
setpixel(8, 54, sf);
setpixel(9, 54, se);
setpixel(10, 54, sf);
setpixel(6, 55, se);
setpixel(7, 55, sf);
setpixel(8, 55, sf);
setpixel(9, 55, sf);
setpixel(10, 55, se);
setpixel(6, 56, sc);
setpixel(7, 56, sc);
setpixel(8, 56, sc);
setpixel(9, 56, sc);
setpixel(10, 56, sc);
setpixel(6, 57, sc);
setpixel(10, 57, sc);
setpixel(5, 58, sc);
setpixel(8, 58, sd);
setpixel(11, 58, sc);
setpixel(5, 59, sc);
setpixel(7, 59, sd);
setpixel(8, 59, sd);
setpixel(9, 59, sd);
setpixel(11, 59, sc);
setpixel(6, 60, sc);
setpixel(7, 60, sd);
setpixel(8, 60, sd);
setpixel(9, 60, sd);
setpixel(10, 60, sc);
setpixel(8, 61, sd);
setpixel(0, 86, sa);

for ( int c = 0; c < 86; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
