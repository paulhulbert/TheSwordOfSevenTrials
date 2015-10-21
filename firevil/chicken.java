/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;
import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class chicken extends unit {
    
    AI nai;
    AI fai;
    
    public chicken( ArrayList<weapon> weaps, room currentroom, int x, int y, unit mainchar )
    {
        super( 100, 1, 5, "fireball", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        nai = new basicai();
        nai.setperson(this);
        nai.settarget(mainchar);
        
        fai = new noai();
        buildvil1();
        
    
    }
    
    @Override
    public void attack()
    {
        if ( !ai.canattack() ) {
            return;
        }
        int temp;
        if ( dir == 1 ) {
            temp = -1;
        }
        else {
            temp = 1;
        }
        if ( mainweapon.equals("fireball")) {
            weapons.add(new fireball( x, y - 30, temp, momentx, momenty ));
            
        }
        
    }
    
    @Override
    public void changeai()
    {
        this.setai(nai);
    }
    
    @Override
    public void resetai()
    {
        this.setai(fai);
    }
    
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(24);
        f.setlength(22);

Color sa = new Color(255,0,0);
Color sb = new Color(255,255,255);
Color sc = new Color(0,0,0);
Color sd = new Color(255,102,0);
Color se = new Color(204,204,204);




//<editor-fold defaultstate="collapsed" desc="build figure">









f.setpixel(18, 0, sa);
f.setpixel(20, 0, sa);
f.setpixel(22, 0, sa);
f.setpixel(18, 1, sa);
f.setpixel(19, 1, sa);
f.setpixel(20, 1, sa);
f.setpixel(21, 1, sa);
f.setpixel(22, 1, sa);
f.setpixel(17, 2, sa);
f.setpixel(18, 2, sa);
f.setpixel(19, 2, sa);
f.setpixel(20, 2, sa);
f.setpixel(21, 2, sa);
f.setpixel(22, 2, sa);
f.setpixel(16, 3, sb);
f.setpixel(17, 3, sb);
f.setpixel(18, 3, sb);
f.setpixel(19, 3, sb);
f.setpixel(20, 3, sb);
f.setpixel(21, 3, sb);
f.setpixel(16, 4, sb);
f.setpixel(17, 4, sb);
f.setpixel(18, 4, sb);
f.setpixel(19, 4, sc);
f.setpixel(20, 4, sc);
f.setpixel(21, 4, sb);
f.setpixel(22, 4, sb);
f.setpixel(16, 5, sb);
f.setpixel(17, 5, sb);
f.setpixel(18, 5, sb);
f.setpixel(19, 5, sc);
f.setpixel(20, 5, sc);
f.setpixel(21, 5, sb);
f.setpixel(22, 5, sb);
f.setpixel(16, 6, sb);
f.setpixel(17, 6, sb);
f.setpixel(18, 6, sb);
f.setpixel(19, 6, sb);
f.setpixel(20, 6, sb);
f.setpixel(21, 6, sb);
f.setpixel(22, 6, sb);
f.setpixel(0, 7, sb);
f.setpixel(1, 7, sb);
f.setpixel(2, 7, sb);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sb);
f.setpixel(13, 7, sb);
f.setpixel(16, 7, sb);
f.setpixel(17, 7, sb);
f.setpixel(18, 7, sb);
f.setpixel(19, 7, sb);
f.setpixel(20, 7, sb);
f.setpixel(21, 7, sb);
f.setpixel(22, 7, sd);
f.setpixel(23, 7, sd);
f.setpixel(0, 8, sb);
f.setpixel(1, 8, sb);
f.setpixel(2, 8, sb);
f.setpixel(3, 8, sb);
f.setpixel(4, 8, sb);
f.setpixel(5, 8, sb);
f.setpixel(6, 8, sb);
f.setpixel(7, 8, sb);
f.setpixel(8, 8, sb);
f.setpixel(9, 8, sb);
f.setpixel(10, 8, sb);
f.setpixel(11, 8, sb);
f.setpixel(12, 8, sb);
f.setpixel(13, 8, sb);
f.setpixel(14, 8, sb);
f.setpixel(15, 8, sb);
f.setpixel(16, 8, sb);
f.setpixel(17, 8, sb);
f.setpixel(18, 8, sb);
f.setpixel(19, 8, sb);
f.setpixel(20, 8, sb);
f.setpixel(21, 8, sb);
f.setpixel(22, 8, sd);
f.setpixel(23, 8, sd);
f.setpixel(24, 8, sd);
f.setpixel(0, 9, sb);
f.setpixel(1, 9, sb);
f.setpixel(2, 9, sb);
f.setpixel(3, 9, sb);
f.setpixel(4, 9, sb);
f.setpixel(5, 9, sb);
f.setpixel(6, 9, sb);
f.setpixel(7, 9, sb);
f.setpixel(8, 9, sb);
f.setpixel(9, 9, sb);
f.setpixel(10, 9, sb);
f.setpixel(11, 9, sb);
f.setpixel(12, 9, sb);
f.setpixel(13, 9, sb);
f.setpixel(14, 9, sb);
f.setpixel(15, 9, sb);
f.setpixel(16, 9, sb);
f.setpixel(17, 9, sb);
f.setpixel(18, 9, sb);
f.setpixel(19, 9, sb);
f.setpixel(20, 9, sa);
f.setpixel(21, 9, sa);
f.setpixel(0, 10, sb);
f.setpixel(1, 10, sb);
f.setpixel(2, 10, sb);
f.setpixel(3, 10, se);
f.setpixel(4, 10, se);
f.setpixel(5, 10, se);
f.setpixel(6, 10, se);
f.setpixel(7, 10, se);
f.setpixel(8, 10, se);
f.setpixel(9, 10, se);
f.setpixel(10, 10, se);
f.setpixel(11, 10, se);
f.setpixel(12, 10, se);
f.setpixel(13, 10, sb);
f.setpixel(14, 10, sb);
f.setpixel(15, 10, sb);
f.setpixel(16, 10, sb);
f.setpixel(17, 10, sb);
f.setpixel(18, 10, sb);
f.setpixel(21, 10, sa);
f.setpixel(1, 11, sb);
f.setpixel(2, 11, sb);
f.setpixel(3, 11, sb);
f.setpixel(4, 11, se);
f.setpixel(5, 11, se);
f.setpixel(6, 11, sb);
f.setpixel(7, 11, sb);
f.setpixel(8, 11, sb);
f.setpixel(9, 11, sb);
f.setpixel(10, 11, sb);
f.setpixel(11, 11, sb);
f.setpixel(12, 11, se);
f.setpixel(13, 11, se);
f.setpixel(14, 11, sb);
f.setpixel(15, 11, sb);
f.setpixel(16, 11, sb);
f.setpixel(17, 11, sb);
f.setpixel(18, 11, sb);
f.setpixel(1, 12, sb);
f.setpixel(2, 12, sb);
f.setpixel(3, 12, sb);
f.setpixel(4, 12, sb);
f.setpixel(5, 12, se);
f.setpixel(6, 12, se);
f.setpixel(7, 12, sb);
f.setpixel(8, 12, sb);
f.setpixel(9, 12, sb);
f.setpixel(10, 12, sb);
f.setpixel(11, 12, sb);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, sb);
f.setpixel(14, 12, sb);
f.setpixel(15, 12, sb);
f.setpixel(16, 12, sb);
f.setpixel(17, 12, sb);
f.setpixel(18, 12, sb);
f.setpixel(2, 13, sb);
f.setpixel(3, 13, sb);
f.setpixel(4, 13, sb);
f.setpixel(5, 13, sb);
f.setpixel(6, 13, se);
f.setpixel(7, 13, sb);
f.setpixel(8, 13, sb);
f.setpixel(9, 13, sb);
f.setpixel(10, 13, sb);
f.setpixel(11, 13, sb);
f.setpixel(12, 13, sb);
f.setpixel(13, 13, sb);
f.setpixel(14, 13, sb);
f.setpixel(15, 13, sb);
f.setpixel(16, 13, sb);
f.setpixel(17, 13, sb);
f.setpixel(2, 14, sb);
f.setpixel(3, 14, sb);
f.setpixel(4, 14, sb);
f.setpixel(5, 14, sb);
f.setpixel(6, 14, se);
f.setpixel(7, 14, se);
f.setpixel(8, 14, se);
f.setpixel(9, 14, se);
f.setpixel(10, 14, se);
f.setpixel(11, 14, se);
f.setpixel(12, 14, sb);
f.setpixel(13, 14, sb);
f.setpixel(14, 14, sb);
f.setpixel(15, 14, sb);
f.setpixel(16, 14, sb);
f.setpixel(17, 14, sb);
f.setpixel(3, 15, sb);
f.setpixel(4, 15, sb);
f.setpixel(5, 15, sb);
f.setpixel(6, 15, sb);
f.setpixel(7, 15, sb);
f.setpixel(8, 15, sb);
f.setpixel(9, 15, sb);
f.setpixel(10, 15, sb);
f.setpixel(11, 15, sb);
f.setpixel(12, 15, sb);
f.setpixel(13, 15, sb);
f.setpixel(14, 15, sb);
f.setpixel(15, 15, sb);
f.setpixel(16, 15, sb);
f.setpixel(3, 16, sb);
f.setpixel(4, 16, sb);
f.setpixel(5, 16, sb);
f.setpixel(6, 16, sb);
f.setpixel(7, 16, sb);
f.setpixel(8, 16, sb);
f.setpixel(9, 16, sb);
f.setpixel(10, 16, sb);
f.setpixel(11, 16, sb);
f.setpixel(12, 16, sb);
f.setpixel(13, 16, sb);
f.setpixel(14, 16, sb);
f.setpixel(15, 16, sb);
f.setpixel(6, 17, sb);
f.setpixel(7, 17, sb);
f.setpixel(8, 17, sb);
f.setpixel(9, 17, sb);
f.setpixel(10, 17, sb);
f.setpixel(11, 17, sb);
f.setpixel(7, 18, sb);
f.setpixel(8, 18, sb);
f.setpixel(9, 18, sb);
f.setpixel(7, 19, sd);
f.setpixel(9, 19, sd);
f.setpixel(6, 20, sd);
f.setpixel(7, 20, sd);
f.setpixel(8, 20, sd);
f.setpixel(9, 20, sd);
f.setpixel(10, 20, sd);
f.setpixel(6, 21, sd);
f.setpixel(8, 21, sd);
f.setpixel(10, 21, sd);
f.setpixel(6, 22, sd);
f.setpixel(8, 22, sd);
f.setpixel(10, 22, sd);


for ( int c = 0; c < 77; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}


