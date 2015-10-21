/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class dnagitem extends unit {
    
    public dnagitem( ArrayList<weapon> weaps, room currentroom )
    {
        super( 1, 1, 1, "blankweap", 510, 400, new noai(), weaps, currentroom, 100, 140 );
        
        buildvil1();
        
        this.setStatement( "You got the sword!  This weapon is far more deadly than the hammer." );
        this.setName("Di-nag");
        
        
        trigger spoke1 = new trigger( false, "gotweap_dnag" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat( "You got the Di-nag.  This double-bladed weapon can attack on both sides at once." );
        
        addchattrigger(chat1);
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(14);
        f.setlength(97);
        
        
        
Color sa = new Color (102,102,102);
Color sb = new Color (211,119,50);
Color sc = new Color (204,160,127);
Color sd = new Color (213,168,135);
        
        
//<editor-fold defaultstate="collapsed" desc="build figure">







setpixel(14, 0, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(11, 4, sa);
setpixel(12, 4, sa);
setpixel(13, 4, sa);
setpixel(11, 5, sa);
setpixel(12, 5, sa);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(10, 7, sa);
setpixel(11, 7, sa);
setpixel(12, 7, sa);
setpixel(10, 8, sa);
setpixel(11, 8, sa);
setpixel(10, 9, sa);
setpixel(11, 9, sa);
setpixel(10, 10, sa);
setpixel(11, 10, sa);
setpixel(10, 11, sa);
setpixel(11, 11, sa);
setpixel(9, 12, sa);
setpixel(10, 12, sa);
setpixel(11, 12, sa);
setpixel(9, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sa);
setpixel(11, 14, sa);
setpixel(9, 15, sa);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(9, 16, sa);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(8, 17, sa);
setpixel(9, 17, sa);
setpixel(10, 17, sa);
setpixel(11, 17, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sa);
setpixel(10, 18, sa);
setpixel(8, 19, sa);
setpixel(9, 19, sa);
setpixel(10, 19, sa);
setpixel(8, 20, sa);
setpixel(9, 20, sa);
setpixel(10, 20, sa);
setpixel(7, 21, sa);
setpixel(8, 21, sa);
setpixel(9, 21, sa);
setpixel(10, 21, sa);
setpixel(7, 22, sa);
setpixel(8, 22, sa);
setpixel(9, 22, sa);
setpixel(7, 23, sa);
setpixel(8, 23, sa);
setpixel(9, 23, sa);
setpixel(7, 24, sa);
setpixel(8, 24, sa);
setpixel(9, 24, sa);
setpixel(7, 25, sa);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(7, 26, sa);
setpixel(8, 26, sa);
setpixel(9, 26, sa);
setpixel(7, 27, sa);
setpixel(8, 27, sa);
setpixel(9, 27, sa);
setpixel(7, 28, sa);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(7, 29, sa);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(7, 30, sa);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(7, 31, sa);
setpixel(8, 31, sa);
setpixel(9, 31, sa);
setpixel(7, 32, sa);
setpixel(8, 32, sa);
setpixel(9, 32, sb);
setpixel(6, 33, sb);
setpixel(7, 33, sb);
setpixel(8, 33, sb);
setpixel(9, 33, sb);
setpixel(10, 33, sb);
setpixel(7, 34, sc);
setpixel(8, 34, sd);
setpixel(9, 34, sc);
setpixel(7, 35, sc);
setpixel(8, 35, sd);
setpixel(9, 35, sc);
setpixel(7, 36, sc);
setpixel(8, 36, sd);
setpixel(9, 36, sc);
setpixel(7, 37, sc);
setpixel(8, 37, sd);
setpixel(9, 37, sc);
setpixel(7, 38, sc);
setpixel(8, 38, sd);
setpixel(9, 38, sc);
setpixel(6, 39, sb);
setpixel(7, 39, sb);
setpixel(8, 39, sb);
setpixel(9, 39, sb);
setpixel(10, 39, sb);
setpixel(7, 40, sc);
setpixel(8, 40, sd);
setpixel(9, 40, sc);
setpixel(7, 41, sc);
setpixel(8, 41, sd);
setpixel(9, 41, sd);
setpixel(7, 42, sc);
setpixel(8, 42, sd);
setpixel(9, 42, sd);
setpixel(7, 43, sc);
setpixel(8, 43, sd);
setpixel(9, 43, sc);
setpixel(6, 44, sb);
setpixel(7, 44, sb);
setpixel(8, 44, sb);
setpixel(9, 44, sb);
setpixel(10, 44, sb);
setpixel(7, 45, sd);
setpixel(8, 45, sd);
setpixel(9, 45, sc);
setpixel(7, 46, sc);
setpixel(8, 46, sd);
setpixel(9, 46, sc);
setpixel(7, 47, sc);
setpixel(8, 47, sd);
setpixel(9, 47, sc);
setpixel(7, 48, sd);
setpixel(8, 48, sd);
setpixel(9, 48, sc);
setpixel(6, 49, sb);
setpixel(7, 49, sb);
setpixel(8, 49, sb);
setpixel(9, 49, sb);
setpixel(10, 49, sb);
setpixel(7, 50, sc);
setpixel(8, 50, sd);
setpixel(9, 50, sc);
setpixel(7, 51, sc);
setpixel(8, 51, sd);
setpixel(9, 51, sc);
setpixel(7, 52, sc);
setpixel(8, 52, sd);
setpixel(9, 52, sc);
setpixel(7, 53, sc);
setpixel(8, 53, sd);
setpixel(9, 53, sc);
setpixel(6, 54, sb);
setpixel(7, 54, sb);
setpixel(8, 54, sb);
setpixel(9, 54, sb);
setpixel(10, 54, sb);
setpixel(7, 55, sc);
setpixel(8, 55, sd);
setpixel(9, 55, sc);
setpixel(7, 56, sc);
setpixel(8, 56, sd);
setpixel(9, 56, sc);
setpixel(7, 57, sc);
setpixel(8, 57, sd);
setpixel(9, 57, sc);
setpixel(7, 58, sc);
setpixel(8, 58, sd);
setpixel(9, 58, sc);
setpixel(6, 59, sb);
setpixel(7, 59, sb);
setpixel(8, 59, sb);
setpixel(9, 59, sb);
setpixel(10, 59, sb);
setpixel(7, 60, sc);
setpixel(8, 60, sd);
setpixel(9, 60, sc);
setpixel(7, 61, sc);
setpixel(8, 61, sd);
setpixel(9, 61, sc);
setpixel(7, 62, sc);
setpixel(8, 62, sd);
setpixel(9, 62, sc);
setpixel(7, 63, sc);
setpixel(8, 63, sd);
setpixel(9, 63, sc);
setpixel(6, 64, sb);
setpixel(7, 64, sb);
setpixel(8, 64, sb);
setpixel(9, 64, sb);
setpixel(10, 64, sb);
setpixel(7, 65, sb);
setpixel(8, 65, sa);
setpixel(9, 65, sa);
setpixel(7, 66, sa);
setpixel(8, 66, sa);
setpixel(9, 66, sa);
setpixel(7, 67, sa);
setpixel(8, 67, sa);
setpixel(9, 67, sa);
setpixel(7, 68, sa);
setpixel(8, 68, sa);
setpixel(9, 68, sa);
setpixel(7, 69, sa);
setpixel(8, 69, sa);
setpixel(9, 69, sa);
setpixel(7, 70, sa);
setpixel(8, 70, sa);
setpixel(9, 70, sa);
setpixel(7, 71, sa);
setpixel(8, 71, sa);
setpixel(9, 71, sa);
setpixel(7, 72, sa);
setpixel(8, 72, sa);
setpixel(9, 72, sa);
setpixel(7, 73, sa);
setpixel(8, 73, sa);
setpixel(9, 73, sa);
setpixel(7, 74, sa);
setpixel(8, 74, sa);
setpixel(9, 74, sa);
setpixel(7, 75, sa);
setpixel(8, 75, sa);
setpixel(9, 75, sa);
setpixel(6, 76, sa);
setpixel(7, 76, sa);
setpixel(8, 76, sa);
setpixel(9, 76, sa);
setpixel(6, 77, sa);
setpixel(7, 77, sa);
setpixel(8, 77, sa);
setpixel(6, 78, sa);
setpixel(7, 78, sa);
setpixel(8, 78, sa);
setpixel(6, 79, sa);
setpixel(7, 79, sa);
setpixel(8, 79, sa);
setpixel(5, 80, sa);
setpixel(6, 80, sa);
setpixel(7, 80, sa);
setpixel(8, 80, sa);
setpixel(5, 81, sa);
setpixel(6, 81, sa);
setpixel(7, 81, sa);
setpixel(5, 82, sa);
setpixel(6, 82, sa);
setpixel(7, 82, sa);
setpixel(5, 83, sa);
setpixel(6, 83, sa);
setpixel(7, 83, sa);
setpixel(5, 84, sa);
setpixel(6, 84, sa);
setpixel(7, 84, sa);
setpixel(5, 85, sa);
setpixel(6, 85, sa);
setpixel(7, 85, sa);
setpixel(5, 86, sa);
setpixel(6, 86, sa);
setpixel(5, 87, sa);
setpixel(6, 87, sa);
setpixel(5, 88, sa);
setpixel(6, 88, sa);
setpixel(5, 89, sa);
setpixel(6, 89, sa);
setpixel(4, 90, sa);
setpixel(5, 90, sa);
setpixel(6, 90, sa);
setpixel(4, 91, sa);
setpixel(5, 91, sa);
setpixel(4, 92, sa);
setpixel(5, 92, sa);
setpixel(3, 93, sa);
setpixel(4, 93, sa);
setpixel(5, 93, sa);
setpixel(3, 94, sa);
setpixel(4, 94, sa);
setpixel(5, 94, sa);
setpixel(3, 95, sa);
setpixel(4, 95, sa);
setpixel(2, 96, sa);
setpixel(3, 96, sa);
setpixel(0, 97, sd);
setpixel(2, 97, sa);


for ( int c = 0; c < 97; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
