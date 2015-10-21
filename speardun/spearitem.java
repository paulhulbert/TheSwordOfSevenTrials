/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class spearitem extends unit {
    
    public spearitem( ArrayList<weapon> weaps, room currentroom )
    {
        super( 1, 1, 1, "blankweap", 510, 420, new noai(), weaps, currentroom, 100, 140 );
        
        buildvil1();
        
        this.setStatement( "You got the spear!  Charge!" );
        this.setName("Spear");
        
        
        trigger spoke1 = new trigger( false, "gotweap_spear" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat( "You got the spear!  Charge!" );
        
        addchattrigger(chat1);
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(5);
        f.setlength(55);
        
Color sa = new Color(51,51,51);
Color sb = new Color(102,102,102);
Color sc = new Color(59,19,0);
        
        
//<editor-fold defaultstate="collapsed" desc="build figure">






setpixel(3, 0, sa);
setpixel(3, 1, sa);
setpixel(3, 2, sa);
setpixel(2, 3, sb);
setpixel(3, 3, sa);
setpixel(4, 3, sb);
setpixel(2, 4, sb);
setpixel(3, 4, sa);
setpixel(4, 4, sb);
setpixel(2, 5, sb);
setpixel(3, 5, sa);
setpixel(4, 5, sb);
setpixel(1, 6, sb);
setpixel(2, 6, sb);
setpixel(3, 6, sc);
setpixel(4, 6, sb);
setpixel(5, 6, sb);
setpixel(1, 7, sb);
setpixel(2, 7, sb);
setpixel(3, 7, sc);
setpixel(4, 7, sb);
setpixel(5, 7, sb);
setpixel(0, 8, sa);
setpixel(1, 8, sb);
setpixel(2, 8, sc);
setpixel(3, 8, sc);
setpixel(4, 8, sc);
setpixel(5, 8, sb);
setpixel(2, 9, sc);
setpixel(3, 9, sc);
setpixel(4, 9, sc);
setpixel(2, 10, sc);
setpixel(3, 10, sc);
setpixel(4, 10, sc);
setpixel(2, 11, sc);
setpixel(3, 11, sc);
setpixel(4, 11, sc);
setpixel(2, 12, sc);
setpixel(3, 12, sc);
setpixel(4, 12, sc);
setpixel(2, 13, sc);
setpixel(3, 13, sc);
setpixel(4, 13, sc);
setpixel(2, 14, sc);
setpixel(3, 14, sc);
setpixel(4, 14, sc);
setpixel(2, 15, sc);
setpixel(3, 15, sc);
setpixel(4, 15, sc);
setpixel(2, 16, sc);
setpixel(3, 16, sc);
setpixel(4, 16, sc);
setpixel(2, 17, sc);
setpixel(3, 17, sc);
setpixel(4, 17, sc);
setpixel(2, 18, sc);
setpixel(3, 18, sc);
setpixel(4, 18, sc);
setpixel(2, 19, sc);
setpixel(3, 19, sc);
setpixel(4, 19, sc);
setpixel(2, 20, sc);
setpixel(3, 20, sc);
setpixel(4, 20, sc);
setpixel(2, 21, sc);
setpixel(3, 21, sc);
setpixel(4, 21, sc);
setpixel(2, 22, sc);
setpixel(3, 22, sc);
setpixel(4, 22, sc);
setpixel(2, 23, sc);
setpixel(3, 23, sc);
setpixel(4, 23, sc);
setpixel(2, 24, sc);
setpixel(3, 24, sc);
setpixel(4, 24, sc);
setpixel(2, 25, sc);
setpixel(3, 25, sc);
setpixel(4, 25, sc);
setpixel(2, 26, sc);
setpixel(3, 26, sc);
setpixel(4, 26, sc);
setpixel(2, 27, sc);
setpixel(3, 27, sc);
setpixel(4, 27, sc);
setpixel(2, 28, sc);
setpixel(3, 28, sc);
setpixel(4, 28, sc);
setpixel(2, 29, sc);
setpixel(3, 29, sc);
setpixel(4, 29, sc);
setpixel(2, 30, sc);
setpixel(3, 30, sc);
setpixel(4, 30, sc);
setpixel(2, 31, sc);
setpixel(3, 31, sc);
setpixel(4, 31, sc);
setpixel(2, 32, sc);
setpixel(3, 32, sc);
setpixel(4, 32, sc);
setpixel(2, 33, sc);
setpixel(3, 33, sc);
setpixel(4, 33, sc);
setpixel(2, 34, sc);
setpixel(3, 34, sc);
setpixel(4, 34, sc);
setpixel(2, 35, sc);
setpixel(3, 35, sc);
setpixel(4, 35, sc);
setpixel(2, 36, sc);
setpixel(3, 36, sc);
setpixel(4, 36, sc);
setpixel(2, 37, sc);
setpixel(3, 37, sc);
setpixel(4, 37, sc);
setpixel(2, 38, sc);
setpixel(3, 38, sc);
setpixel(4, 38, sc);
setpixel(2, 39, sc);
setpixel(3, 39, sc);
setpixel(4, 39, sc);
setpixel(2, 40, sc);
setpixel(3, 40, sc);
setpixel(4, 40, sc);
setpixel(2, 41, sc);
setpixel(3, 41, sc);
setpixel(4, 41, sc);
setpixel(2, 42, sc);
setpixel(3, 42, sc);
setpixel(4, 42, sc);
setpixel(2, 43, sc);
setpixel(3, 43, sc);
setpixel(4, 43, sc);
setpixel(2, 44, sc);
setpixel(3, 44, sc);
setpixel(4, 44, sc);
setpixel(2, 45, sc);
setpixel(3, 45, sc);
setpixel(4, 45, sc);
setpixel(2, 46, sc);
setpixel(3, 46, sc);
setpixel(4, 46, sc);
setpixel(2, 47, sc);
setpixel(3, 47, sc);
setpixel(4, 47, sc);
setpixel(2, 48, sc);
setpixel(3, 48, sc);
setpixel(4, 48, sc);
setpixel(2, 49, sc);
setpixel(3, 49, sc);
setpixel(4, 49, sc);
setpixel(2, 50, sc);
setpixel(3, 50, sc);
setpixel(4, 50, sc);
setpixel(2, 51, sc);
setpixel(3, 51, sc);
setpixel(4, 51, sc);
setpixel(2, 52, sc);
setpixel(3, 52, sc);
setpixel(4, 52, sc);
setpixel(2, 53, sc);
setpixel(3, 53, sc);
setpixel(4, 53, sc);
setpixel(2, 54, sc);
setpixel(3, 54, sc);
setpixel(4, 54, sc);
setpixel(2, 55, sc);
setpixel(3, 55, sc);
setpixel(4, 55, sc);


for ( int c = 0; c < 55; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
