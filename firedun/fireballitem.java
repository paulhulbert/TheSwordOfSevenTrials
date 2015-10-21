/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class fireballitem extends unit {
    
    public fireballitem( ArrayList<weapon> weaps, room currentroom )
    {
        super( 1, 1, 1, "blankweap", 510, 420, new noai(), weaps, currentroom, 100, 140 );
        
        buildvil1();
        
        this.setStatement( "You got the sword!  This weapon is far more deadly than the hammer." );
        this.setName("Fire Stone");
        
        
        trigger spoke1 = new trigger( false, "gotweap_fireball" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat( "You got the fire stone!  This weapon will spew out a constant stream of small fireballs." );
        
        addchattrigger(chat1);
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(23);
        f.setlength(50);
        
        
        
Color sa = new Color(255,51,0,190);
Color sb = new Color(165,165,165);
Color sc = new Color(204,204,204);
Color sd = new Color(190,190,190);
Color se = new Color(255,0,0);
Color sf = new Color(180,180,180);
        
//<editor-fold defaultstate="collapsed" desc="build figure">






setpixel(12, 0, sa);
setpixel(9, 1, sa);
setpixel(12, 1, sa);
setpixel(15, 1, sa);
setpixel(5, 2, sa);
setpixel(9, 2, sa);
setpixel(12, 2, sa);
setpixel(15, 2, sa);
setpixel(19, 2, sa);
setpixel(6, 3, sa);
setpixel(10, 3, sa);
setpixel(12, 3, sa);
setpixel(14, 3, sa);
setpixel(18, 3, sa);
setpixel(3, 4, sa);
setpixel(7, 4, sa);
setpixel(10, 4, sa);
setpixel(12, 4, sa);
setpixel(14, 4, sa);
setpixel(17, 4, sa);
setpixel(21, 4, sa);
setpixel(4, 5, sa);
setpixel(8, 5, sa);
setpixel(16, 5, sa);
setpixel(20, 5, sa);
setpixel(5, 6, sa);
setpixel(19, 6, sa);
setpixel(6, 7, sa);
setpixel(10, 7, sb);
setpixel(11, 7, sb);
setpixel(12, 7, sb);
setpixel(13, 7, sc);
setpixel(14, 7, sc);
setpixel(18, 7, sa);
setpixel(2, 8, sa);
setpixel(3, 8, sa);
setpixel(9, 8, sb);
setpixel(10, 8, sd);
setpixel(11, 8, sd);
setpixel(12, 8, se);
setpixel(13, 8, se);
setpixel(14, 8, sd);
setpixel(15, 8, sc);
setpixel(21, 8, sa);
setpixel(22, 8, sa);
setpixel(4, 9, sa);
setpixel(5, 9, sa);
setpixel(8, 9, sb);
setpixel(9, 9, sf);
setpixel(10, 9, sf);
setpixel(11, 9, se);
setpixel(12, 9, sf);
setpixel(13, 9, sf);
setpixel(14, 9, sf);
setpixel(15, 9, sd);
setpixel(16, 9, sc);
setpixel(19, 9, sa);
setpixel(20, 9, sa);
setpixel(8, 10, sb);
setpixel(9, 10, sf);
setpixel(10, 10, se);
setpixel(11, 10, sf);
setpixel(12, 10, sf);
setpixel(13, 10, se);
setpixel(14, 10, sf);
setpixel(15, 10, sd);
setpixel(16, 10, sc);
setpixel(1, 11, sa);
setpixel(2, 11, sa);
setpixel(3, 11, sa);
setpixel(4, 11, sa);
setpixel(5, 11, sa);
setpixel(8, 11, sb);
setpixel(9, 11, sf);
setpixel(10, 11, se);
setpixel(11, 11, sf);
setpixel(12, 11, se);
setpixel(13, 11, sf);
setpixel(14, 11, se);
setpixel(15, 11, sd);
setpixel(16, 11, sc);
setpixel(19, 11, sa);
setpixel(20, 11, sa);
setpixel(21, 11, sa);
setpixel(22, 11, sa);
setpixel(23, 11, sa);
setpixel(8, 12, sb);
setpixel(9, 12, sf);
setpixel(10, 12, sf);
setpixel(11, 12, se);
setpixel(12, 12, sf);
setpixel(13, 12, se);
setpixel(14, 12, sf);
setpixel(15, 12, sd);
setpixel(16, 12, sc);
setpixel(4, 13, sa);
setpixel(5, 13, sa);
setpixel(8, 13, sb);
setpixel(9, 13, sf);
setpixel(10, 13, sf);
setpixel(11, 13, sf);
setpixel(12, 13, se);
setpixel(13, 13, sf);
setpixel(14, 13, sf);
setpixel(15, 13, sd);
setpixel(16, 13, sc);
setpixel(19, 13, sa);
setpixel(20, 13, sa);
setpixel(2, 14, sa);
setpixel(3, 14, sa);
setpixel(9, 14, sb);
setpixel(10, 14, sd);
setpixel(11, 14, sd);
setpixel(12, 14, sd);
setpixel(13, 14, sd);
setpixel(14, 14, sd);
setpixel(15, 14, sc);
setpixel(21, 14, sa);
setpixel(22, 14, sa);
setpixel(6, 15, sa);
setpixel(10, 15, sb);
setpixel(11, 15, sb);
setpixel(12, 15, sc);
setpixel(13, 15, sc);
setpixel(14, 15, sc);
setpixel(18, 15, sa);
setpixel(0, 16, sa);
setpixel(5, 16, sa);
setpixel(19, 16, sa);
setpixel(4, 17, sa);
setpixel(8, 17, sa);
setpixel(16, 17, sa);
setpixel(20, 17, sa);
setpixel(3, 18, sa);
setpixel(7, 18, sa);
setpixel(10, 18, sa);
setpixel(12, 18, sa);
setpixel(14, 18, sa);
setpixel(17, 18, sa);
setpixel(21, 18, sa);
setpixel(6, 19, sa);
setpixel(10, 19, sa);
setpixel(12, 19, sa);
setpixel(14, 19, sa);
setpixel(18, 19, sa);
setpixel(5, 20, sa);
setpixel(9, 20, sa);
setpixel(12, 20, sa);
setpixel(15, 20, sa);
setpixel(19, 20, sa);
setpixel(9, 21, sa);
setpixel(12, 21, sa);
setpixel(15, 21, sa);
setpixel(12, 22, sa);
setpixel(0, 23, sa);
setpixel(0, 30, sa);
setpixel(0, 38, sa);
setpixel(0, 44, sa);
setpixel(0, 50, sa);


for ( int c = 0; c < 50; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
