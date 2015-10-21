/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
//import weapons.pointattack;
/**
 *
 * @author Dad
 */
public class floaterball extends unit {
    
    
    public floaterball( room currentroom, int x, int y, AI ai )
    {
        super( 40, 0, 4, "fireball", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    @Override
       public void attack()
    {
        if ( !ai.canattack() ) {
            return;
        }
        int temp;
        int temp_opposite;
        if ( dir == 1 ) {
            temp = -1;
            temp_opposite = 1;
        }
        else {
            temp = 1;
            temp_opposite = -1;
        }
        if ( mainweapon.equals("fireball")) {
            weapons.add(new fireball( x, y - 23, temp, momentx, momenty ));
            
        }
        
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(10);
        f.setlength(46);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
Color sa = new Color(0,0,0);
Color sb = new Color(255,255,255);
Color sc = new Color(51,51,51);
Color sd = new Color(255,0,0);










//<editor-fold defaultstate="collapsed" desc="build figure">
f.setpixel(4, 0, sa);
f.setpixel(5, 0, sa);
f.setpixel(6, 0, sa);
f.setpixel(7, 0, sa);
f.setpixel(8, 0, sa);
f.setpixel(3, 1, sa);
f.setpixel(4, 1, sa);
f.setpixel(5, 1, sa);
f.setpixel(6, 1, sa);
f.setpixel(7, 1, sa);
f.setpixel(8, 1, sa);
f.setpixel(9, 1, sa);
f.setpixel(2, 2, sa);
f.setpixel(3, 2, sa);
f.setpixel(4, 2, sa);
f.setpixel(5, 2, sa);
f.setpixel(6, 2, sa);
f.setpixel(7, 2, sa);
f.setpixel(8, 2, sa);
f.setpixel(9, 2, sa);
f.setpixel(10, 2, sa);
f.setpixel(0, 3, sb);
f.setpixel(1, 3, sa);
f.setpixel(2, 3, sa);
f.setpixel(3, 3, sa);
f.setpixel(4, 3, sa);
f.setpixel(5, 3, sa);
f.setpixel(6, 3, sa);
f.setpixel(7, 3, sa);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sa);
f.setpixel(10, 3, sa);
f.setpixel(1, 4, sc);
f.setpixel(2, 4, sc);
f.setpixel(3, 4, sc);
f.setpixel(4, 4, sc);
f.setpixel(5, 4, sc);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sa);
f.setpixel(8, 4, sa);
f.setpixel(9, 4, sa);
f.setpixel(10, 4, sa);
f.setpixel(1, 5, sa);
f.setpixel(2, 5, sa);
f.setpixel(3, 5, sc);
f.setpixel(4, 5, sc);
f.setpixel(5, 5, sb);
f.setpixel(6, 5, sb);
f.setpixel(7, 5, sc);
f.setpixel(8, 5, sc);
f.setpixel(9, 5, sc);
f.setpixel(10, 5, sa);
f.setpixel(1, 6, sa);
f.setpixel(2, 6, sa);
f.setpixel(3, 6, sc);
f.setpixel(4, 6, sc);
f.setpixel(5, 6, sb);
f.setpixel(6, 6, sb);
f.setpixel(7, 6, sd);
f.setpixel(8, 6, sd);
f.setpixel(9, 6, sd);
f.setpixel(10, 6, sc);
f.setpixel(1, 7, sa);
f.setpixel(2, 7, sa);
f.setpixel(3, 7, sa);
f.setpixel(4, 7, sc);
f.setpixel(5, 7, sc);
f.setpixel(6, 7, sb);
f.setpixel(7, 7, sd);
f.setpixel(8, 7, sd);
f.setpixel(9, 7, sd);
f.setpixel(10, 7, sb);
f.setpixel(2, 8, sa);
f.setpixel(3, 8, sa);
f.setpixel(4, 8, sa);
f.setpixel(5, 8, sa);
f.setpixel(6, 8, sc);
f.setpixel(7, 8, sd);
f.setpixel(8, 8, sd);
f.setpixel(9, 8, sb);
f.setpixel(10, 8, sc);
f.setpixel(2, 9, sa);
f.setpixel(3, 9, sa);
f.setpixel(4, 9, sa);
f.setpixel(5, 9, sa);
f.setpixel(6, 9, sa);
f.setpixel(7, 9, sa);
f.setpixel(8, 9, sa);
f.setpixel(9, 9, sa);
f.setpixel(10, 9, sa);
f.setpixel(3, 10, sa);
f.setpixel(4, 10, sa);
f.setpixel(5, 10, sa);
f.setpixel(6, 10, sa);
f.setpixel(7, 10, sa);
f.setpixel(8, 10, sa);
f.setpixel(9, 10, sa);
f.setpixel(10, 10, sa);
f.setpixel(4, 11, sa);
f.setpixel(5, 11, sa);
f.setpixel(6, 11, sa);
f.setpixel(7, 11, sa);
f.setpixel(8, 11, sa);
f.setpixel(9, 11, sa);
f.setpixel(1, 17, sb);
f.setpixel(2, 19, sb);
f.setpixel(3, 20, sb);
f.setpixel(10, 20, sb);
f.setpixel(4, 21, sb);
f.setpixel(5, 21, sb);
f.setpixel(6, 21, sb);
f.setpixel(7, 21, sb);
f.setpixel(8, 21, sb);
f.setpixel(9, 21, sb);
f.setpixel(1, 25, sb);
f.setpixel(2, 27, sb);
f.setpixel(3, 28, sb);
f.setpixel(10, 28, sb);
f.setpixel(4, 29, sb);
f.setpixel(5, 29, sb);
f.setpixel(6, 29, sb);
f.setpixel(7, 29, sb);
f.setpixel(8, 29, sb);
f.setpixel(9, 29, sb);
f.setpixel(1, 34, sb);
f.setpixel(2, 36, sb);
f.setpixel(3, 37, sb);
f.setpixel(10, 37, sb);
f.setpixel(4, 38, sb);
f.setpixel(5, 38, sb);
f.setpixel(6, 38, sb);
f.setpixel(7, 38, sb);
f.setpixel(8, 38, sb);
f.setpixel(9, 38, sb);
f.setpixel(1, 42, sb);
f.setpixel(2, 44, sb);
f.setpixel(3, 45, sb);
f.setpixel(10, 45, sb);
f.setpixel(4, 46, sb);
f.setpixel(5, 46, sb);
f.setpixel(6, 46, sb);
f.setpixel(7, 46, sb);
f.setpixel(8, 46, sb);
f.setpixel(9, 46, sb);
for ( int c = 0; c < 68; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}



