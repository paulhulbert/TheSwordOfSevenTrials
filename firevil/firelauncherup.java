/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class firelauncherup extends unit {
    
    public firelauncherup( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 100, 1, 1, "fireballup", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        AI ai = new artintell.nearbyattack();
        ai.setperson(this);
        this.setai(ai);
        
        buildvil1();
        
    
    }
    
    public void settarget( unit targ )
    {
        ai.settarget(targ);
    }
    
    
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(19);
        f.setlength(9);
        



Color sa = new Color(255,0,0);
Color sb = new Color(0,0,0);
Color sc = new Color(255,204,0);
Color sd = new Color(255,255,255);







//<editor-fold defaultstate="collapsed" desc="build figure">




f.setpixel(9, 0, sa);
f.setpixel(10, 0, sa);
f.setpixel(8, 1, sa);
f.setpixel(9, 1, sa);
f.setpixel(10, 1, sa);
f.setpixel(11, 1, sa);
f.setpixel(7, 2, sa);
f.setpixel(8, 2, sa);
f.setpixel(9, 2, sa);
f.setpixel(10, 2, sa);
f.setpixel(11, 2, sa);
f.setpixel(12, 2, sa);
f.setpixel(6, 3, sa);
f.setpixel(7, 3, sa);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sb);
f.setpixel(10, 3, sb);
f.setpixel(11, 3, sa);
f.setpixel(12, 3, sa);
f.setpixel(13, 3, sa);
f.setpixel(5, 4, sa);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sa);
f.setpixel(8, 4, sb);
f.setpixel(9, 4, sa);
f.setpixel(10, 4, sa);
f.setpixel(11, 4, sb);
f.setpixel(12, 4, sa);
f.setpixel(13, 4, sa);
f.setpixel(14, 4, sa);
f.setpixel(4, 5, sa);
f.setpixel(5, 5, sa);
f.setpixel(6, 5, sa);
f.setpixel(7, 5, sb);
f.setpixel(8, 5, sa);
f.setpixel(9, 5, sc);
f.setpixel(10, 5, sd);
f.setpixel(11, 5, sa);
f.setpixel(12, 5, sb);
f.setpixel(13, 5, sa);
f.setpixel(14, 5, sa);
f.setpixel(15, 5, sa);
f.setpixel(3, 6, sa);
f.setpixel(4, 6, sa);
f.setpixel(5, 6, sa);
f.setpixel(6, 6, sa);
f.setpixel(7, 6, sb);
f.setpixel(8, 6, sa);
f.setpixel(9, 6, sd);
f.setpixel(10, 6, sc);
f.setpixel(11, 6, sa);
f.setpixel(12, 6, sb);
f.setpixel(13, 6, sa);
f.setpixel(14, 6, sa);
f.setpixel(15, 6, sa);
f.setpixel(16, 6, sa);
f.setpixel(2, 7, sa);
f.setpixel(3, 7, sa);
f.setpixel(4, 7, sa);
f.setpixel(5, 7, sa);
f.setpixel(6, 7, sa);
f.setpixel(7, 7, sa);
f.setpixel(8, 7, sb);
f.setpixel(9, 7, sa);
f.setpixel(10, 7, sa);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sa);
f.setpixel(13, 7, sa);
f.setpixel(14, 7, sa);
f.setpixel(15, 7, sa);
f.setpixel(16, 7, sa);
f.setpixel(17, 7, sa);
f.setpixel(1, 8, sa);
f.setpixel(2, 8, sa);
f.setpixel(3, 8, sa);
f.setpixel(4, 8, sa);
f.setpixel(5, 8, sa);
f.setpixel(6, 8, sa);
f.setpixel(7, 8, sa);
f.setpixel(8, 8, sa);
f.setpixel(9, 8, sb);
f.setpixel(10, 8, sb);
f.setpixel(11, 8, sa);
f.setpixel(12, 8, sa);
f.setpixel(13, 8, sa);
f.setpixel(14, 8, sa);
f.setpixel(15, 8, sa);
f.setpixel(16, 8, sa);
f.setpixel(17, 8, sa);
f.setpixel(18, 8, sa);
f.setpixel(0, 9, sa);
f.setpixel(1, 9, sa);
f.setpixel(2, 9, sa);
f.setpixel(3, 9, sa);
f.setpixel(4, 9, sa);
f.setpixel(5, 9, sa);
f.setpixel(6, 9, sa);
f.setpixel(7, 9, sa);
f.setpixel(8, 9, sa);
f.setpixel(9, 9, sa);
f.setpixel(10, 9, sa);
f.setpixel(11, 9, sa);
f.setpixel(12, 9, sa);
f.setpixel(13, 9, sa);
f.setpixel(14, 9, sa);
f.setpixel(15, 9, sa);
f.setpixel(16, 9, sa);
f.setpixel(17, 9, sa);
f.setpixel(18, 9, sa);
f.setpixel(19, 9, sa);


//for ( int c = 0; c < 77; c++ ) {
//    f.erasepixel( 0, c );
//}


//</editor-fold>
        
        
    }
    
    
    
}



