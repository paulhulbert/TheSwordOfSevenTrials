/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class mobilefiretrap extends unit {
    
    
    public mobilefiretrap( room currentroom, int x, int y, AI ai )
    {
        super( 5, 0, 1, "fireballup", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
        
        name = "mobilefiretrap";
    
    }
    
    
    @Override
    public void step( Graphics g )
    {
        attack();
        
        if ( Math.abs(momentx) > 3 ) {
            momentx = momentx / Math.abs(momentx) * 3;
        }
        
        super.step(g);
        
        
        
        
    }
    
    @Override
    public void attack()
    {
        if ( !ai.canattack() ) {
            return;
        }
        lastweapused = 1;
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
        if ( mainweapon.equals("fireballup") && temp == -1) {
            weapons.add(new firevil.fireballup( getcenterx(), y, temp, momentx, momenty ));
            
        } else {
            weapons.add(new firevil.fireballup( getcenterx() + 27, y, temp, momentx, momenty ));
            
        }
        
    }
    
    
    @Override
    public void hit( weapon weap )
    {
        
        if ( weap.checkweap("handsword") || weap.checkweap("sost") ) {
            life -= (weap.getatt() - def);
            if ( weap.getatt() > 0 ) {
            getfig().redit();
        }
        }
        weap.hitit();
        weap.onhittrigger();
        if ( life > 100 ) {
            life = 100;
        }
    }
    
    
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(32);
        f.setlength(46);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
        
        
        
        
Color sa = new Color(255,255,0);
Color sb = new Color(204,0,0);
Color sc = new Color(255,0,0);
Color sd = new Color(255,51,0);
Color se = new Color(255,102,0);
Color sf = new Color(51,51,51);
Color sg = new Color(102,102,102);
Color sh = new Color(153,153,153);

//<editor-fold defaultstate="collapsed" desc="build figure">






setpixel(0, 0, sa);
setpixel(0, 12, sa);
setpixel(17, 19, sb);
setpixel(16, 20, sb);
setpixel(17, 20, sb);
setpixel(18, 20, sb);
setpixel(15, 21, sb);
setpixel(16, 21, sb);
setpixel(17, 21, sc);
setpixel(18, 21, sb);
setpixel(19, 21, sb);
setpixel(14, 22, sb);
setpixel(15, 22, sb);
setpixel(16, 22, sc);
setpixel(17, 22, sc);
setpixel(18, 22, sc);
setpixel(19, 22, sb);
setpixel(20, 22, sb);
setpixel(13, 23, sb);
setpixel(14, 23, sb);
setpixel(15, 23, sc);
setpixel(16, 23, sc);
setpixel(17, 23, sd);
setpixel(18, 23, sc);
setpixel(19, 23, sc);
setpixel(20, 23, sb);
setpixel(21, 23, sb);
setpixel(12, 24, sb);
setpixel(13, 24, sb);
setpixel(14, 24, sc);
setpixel(15, 24, sc);
setpixel(16, 24, sd);
setpixel(17, 24, sd);
setpixel(18, 24, sd);
setpixel(19, 24, sc);
setpixel(20, 24, sc);
setpixel(21, 24, sb);
setpixel(22, 24, sb);
setpixel(0, 25, sa);
setpixel(11, 25, sb);
setpixel(12, 25, sb);
setpixel(13, 25, sc);
setpixel(14, 25, sc);
setpixel(15, 25, sd);
setpixel(16, 25, sd);
setpixel(17, 25, se);
setpixel(18, 25, sd);
setpixel(19, 25, sd);
setpixel(20, 25, sc);
setpixel(21, 25, sc);
setpixel(22, 25, sb);
setpixel(23, 25, sb);
setpixel(10, 26, sb);
setpixel(11, 26, sb);
setpixel(12, 26, sc);
setpixel(13, 26, sc);
setpixel(14, 26, sd);
setpixel(15, 26, sd);
setpixel(16, 26, sa);
setpixel(17, 26, se);
setpixel(18, 26, sa);
setpixel(19, 26, sd);
setpixel(20, 26, sd);
setpixel(21, 26, sc);
setpixel(22, 26, sc);
setpixel(23, 26, sb);
setpixel(24, 26, sb);
setpixel(9, 27, sb);
setpixel(10, 27, sb);
setpixel(11, 27, sc);
setpixel(12, 27, sc);
setpixel(13, 27, sd);
setpixel(14, 27, sd);
setpixel(15, 27, se);
setpixel(16, 27, se);
setpixel(17, 27, sa);
setpixel(18, 27, se);
setpixel(19, 27, se);
setpixel(20, 27, sd);
setpixel(21, 27, sd);
setpixel(22, 27, sc);
setpixel(23, 27, sc);
setpixel(24, 27, sb);
setpixel(25, 27, sb);
setpixel(8, 28, sb);
setpixel(9, 28, sb);
setpixel(10, 28, sc);
setpixel(11, 28, sc);
setpixel(12, 28, sd);
setpixel(13, 28, sd);
setpixel(14, 28, sd);
setpixel(15, 28, sd);
setpixel(16, 28, sd);
setpixel(17, 28, sd);
setpixel(18, 28, sd);
setpixel(19, 28, sd);
setpixel(20, 28, sd);
setpixel(21, 28, sd);
setpixel(22, 28, sd);
setpixel(23, 28, sc);
setpixel(24, 28, sc);
setpixel(25, 28, sb);
setpixel(26, 28, sb);
setpixel(7, 29, sb);
setpixel(8, 29, sb);
setpixel(9, 29, sc);
setpixel(10, 29, sc);
setpixel(11, 29, sd);
setpixel(12, 29, sd);
setpixel(13, 29, sd);
setpixel(14, 29, sd);
setpixel(15, 29, sd);
setpixel(16, 29, sd);
setpixel(17, 29, sd);
setpixel(18, 29, sd);
setpixel(19, 29, sd);
setpixel(20, 29, sd);
setpixel(21, 29, sd);
setpixel(22, 29, sd);
setpixel(23, 29, sd);
setpixel(24, 29, sc);
setpixel(25, 29, sc);
setpixel(26, 29, sb);
setpixel(27, 29, sb);
setpixel(6, 30, sb);
setpixel(7, 30, sb);
setpixel(8, 30, sc);
setpixel(9, 30, sc);
setpixel(10, 30, sc);
setpixel(11, 30, sc);
setpixel(12, 30, sc);
setpixel(13, 30, sc);
setpixel(14, 30, sc);
setpixel(15, 30, sc);
setpixel(16, 30, sc);
setpixel(17, 30, sc);
setpixel(18, 30, sc);
setpixel(19, 30, sc);
setpixel(20, 30, sc);
setpixel(21, 30, sc);
setpixel(22, 30, sc);
setpixel(23, 30, sc);
setpixel(24, 30, sc);
setpixel(25, 30, sc);
setpixel(26, 30, sc);
setpixel(27, 30, sb);
setpixel(28, 30, sb);
setpixel(5, 31, sb);
setpixel(6, 31, sb);
setpixel(7, 31, sc);
setpixel(8, 31, sc);
setpixel(9, 31, sc);
setpixel(10, 31, sc);
setpixel(11, 31, sc);
setpixel(12, 31, sc);
setpixel(13, 31, sc);
setpixel(14, 31, sc);
setpixel(15, 31, sc);
setpixel(16, 31, sc);
setpixel(17, 31, sc);
setpixel(18, 31, sc);
setpixel(19, 31, sc);
setpixel(20, 31, sc);
setpixel(21, 31, sc);
setpixel(22, 31, sc);
setpixel(23, 31, sc);
setpixel(24, 31, sc);
setpixel(25, 31, sc);
setpixel(26, 31, sc);
setpixel(27, 31, sc);
setpixel(28, 31, sb);
setpixel(29, 31, sb);
setpixel(5, 32, sb);
setpixel(6, 32, sb);
setpixel(7, 32, sb);
setpixel(8, 32, sb);
setpixel(9, 32, sb);
setpixel(10, 32, sb);
setpixel(11, 32, sb);
setpixel(12, 32, sb);
setpixel(13, 32, sb);
setpixel(14, 32, sb);
setpixel(15, 32, sb);
setpixel(16, 32, sb);
setpixel(17, 32, sb);
setpixel(18, 32, sb);
setpixel(19, 32, sb);
setpixel(20, 32, sb);
setpixel(21, 32, sb);
setpixel(22, 32, sb);
setpixel(23, 32, sb);
setpixel(24, 32, sb);
setpixel(25, 32, sb);
setpixel(26, 32, sb);
setpixel(27, 32, sb);
setpixel(28, 32, sb);
setpixel(29, 32, sb);
setpixel(5, 33, sb);
setpixel(6, 33, sb);
setpixel(7, 33, sb);
setpixel(8, 33, sb);
setpixel(9, 33, sb);
setpixel(10, 33, sb);
setpixel(11, 33, sb);
setpixel(12, 33, sb);
setpixel(13, 33, sb);
setpixel(14, 33, sb);
setpixel(15, 33, sb);
setpixel(16, 33, sb);
setpixel(17, 33, sb);
setpixel(18, 33, sb);
setpixel(19, 33, sb);
setpixel(20, 33, sb);
setpixel(21, 33, sb);
setpixel(22, 33, sb);
setpixel(23, 33, sb);
setpixel(24, 33, sb);
setpixel(25, 33, sb);
setpixel(26, 33, sb);
setpixel(27, 33, sb);
setpixel(28, 33, sb);
setpixel(29, 33, sb);
setpixel(5, 34, sb);
setpixel(8, 34, sb);
setpixel(11, 34, sb);
setpixel(14, 34, sb);
setpixel(17, 34, sb);
setpixel(20, 34, sb);
setpixel(23, 34, sb);
setpixel(26, 34, sb);
setpixel(29, 34, sb);
setpixel(5, 35, sb);
setpixel(6, 35, sf);
setpixel(7, 35, sg);
setpixel(8, 35, sg);
setpixel(9, 35, sf);
setpixel(10, 35, sg);
setpixel(11, 35, sg);
setpixel(12, 35, sf);
setpixel(13, 35, sg);
setpixel(14, 35, sg);
setpixel(15, 35, sf);
setpixel(16, 35, sg);
setpixel(17, 35, sg);
setpixel(18, 35, sf);
setpixel(19, 35, sg);
setpixel(20, 35, sg);
setpixel(21, 35, sf);
setpixel(22, 35, sg);
setpixel(23, 35, sg);
setpixel(24, 35, sf);
setpixel(25, 35, sg);
setpixel(26, 35, sg);
setpixel(27, 35, sf);
setpixel(29, 35, sb);
setpixel(4, 36, sg);
setpixel(5, 36, sg);
setpixel(6, 36, sf);
setpixel(7, 36, sg);
setpixel(8, 36, sg);
setpixel(9, 36, sf);
setpixel(10, 36, sg);
setpixel(11, 36, sg);
setpixel(12, 36, sf);
setpixel(13, 36, sg);
setpixel(14, 36, sg);
setpixel(15, 36, sf);
setpixel(16, 36, sg);
setpixel(17, 36, sg);
setpixel(18, 36, sf);
setpixel(19, 36, sg);
setpixel(20, 36, sg);
setpixel(21, 36, sf);
setpixel(22, 36, sg);
setpixel(23, 36, sg);
setpixel(24, 36, sf);
setpixel(25, 36, sg);
setpixel(26, 36, sg);
setpixel(27, 36, sf);
setpixel(28, 36, sg);
setpixel(29, 36, sg);
setpixel(3, 37, sf);
setpixel(4, 37, sg);
setpixel(5, 37, sg);
setpixel(6, 37, sh);
setpixel(7, 37, sh);
setpixel(8, 37, sh);
setpixel(9, 37, sh);
setpixel(10, 37, sh);
setpixel(11, 37, sh);
setpixel(12, 37, sh);
setpixel(13, 37, sh);
setpixel(14, 37, sh);
setpixel(15, 37, sh);
setpixel(16, 37, sh);
setpixel(17, 37, sh);
setpixel(18, 37, sh);
setpixel(19, 37, sh);
setpixel(20, 37, sh);
setpixel(21, 37, sh);
setpixel(22, 37, sh);
setpixel(23, 37, sh);
setpixel(24, 37, sh);
setpixel(25, 37, sh);
setpixel(26, 37, sh);
setpixel(27, 37, sh);
setpixel(28, 37, sg);
setpixel(29, 37, sg);
setpixel(30, 37, sg);
setpixel(0, 38, sa);
setpixel(2, 38, sg);
setpixel(3, 38, sf);
setpixel(4, 38, sh);
setpixel(5, 38, sh);
setpixel(6, 38, sh);
setpixel(7, 38, sh);
setpixel(8, 38, sh);
setpixel(9, 38, sh);
setpixel(10, 38, sh);
setpixel(11, 38, sf);
setpixel(12, 38, sf);
setpixel(13, 38, sf);
setpixel(14, 38, sf);
setpixel(15, 38, sh);
setpixel(16, 38, sh);
setpixel(17, 38, sh);
setpixel(18, 38, sh);
setpixel(19, 38, sf);
setpixel(20, 38, sf);
setpixel(21, 38, sf);
setpixel(22, 38, sf);
setpixel(23, 38, sh);
setpixel(24, 38, sh);
setpixel(25, 38, sh);
setpixel(26, 38, sh);
setpixel(27, 38, sh);
setpixel(28, 38, sh);
setpixel(29, 38, sh);
setpixel(30, 38, sf);
setpixel(31, 38, sf);
setpixel(1, 39, sg);
setpixel(2, 39, sg);
setpixel(3, 39, sh);
setpixel(4, 39, sh);
setpixel(5, 39, sf);
setpixel(6, 39, sf);
setpixel(7, 39, sh);
setpixel(8, 39, sh);
setpixel(9, 39, sh);
setpixel(10, 39, sf);
setpixel(11, 39, sf);
setpixel(12, 39, sg);
setpixel(13, 39, sg);
setpixel(14, 39, sf);
setpixel(15, 39, sf);
setpixel(16, 39, sh);
setpixel(17, 39, sh);
setpixel(18, 39, sf);
setpixel(19, 39, sf);
setpixel(20, 39, sg);
setpixel(21, 39, sg);
setpixel(22, 39, sf);
setpixel(23, 39, sf);
setpixel(24, 39, sh);
setpixel(25, 39, sh);
setpixel(26, 39, sh);
setpixel(27, 39, sf);
setpixel(28, 39, sf);
setpixel(29, 39, sh);
setpixel(30, 39, sh);
setpixel(31, 39, sg);
setpixel(32, 39, sg);
setpixel(1, 40, sf);
setpixel(2, 40, sf);
setpixel(3, 40, sh);
setpixel(4, 40, sf);
setpixel(5, 40, sg);
setpixel(6, 40, sg);
setpixel(7, 40, sf);
setpixel(8, 40, sh);
setpixel(9, 40, sh);
setpixel(10, 40, sf);
setpixel(11, 40, sg);
setpixel(12, 40, sg);
setpixel(13, 40, sg);
setpixel(14, 40, sg);
setpixel(15, 40, sf);
setpixel(16, 40, sh);
setpixel(17, 40, sh);
setpixel(18, 40, sf);
setpixel(19, 40, sg);
setpixel(20, 40, sg);
setpixel(21, 40, sg);
setpixel(22, 40, sg);
setpixel(23, 40, sf);
setpixel(24, 40, sh);
setpixel(25, 40, sh);
setpixel(26, 40, sf);
setpixel(27, 40, sg);
setpixel(28, 40, sg);
setpixel(29, 40, sf);
setpixel(30, 40, sh);
setpixel(31, 40, sg);
setpixel(32, 40, sg);
setpixel(1, 41, sg);
setpixel(2, 41, sg);
setpixel(3, 41, sh);
setpixel(4, 41, sf);
setpixel(5, 41, sg);
setpixel(6, 41, sg);
setpixel(7, 41, sf);
setpixel(8, 41, sh);
setpixel(9, 41, sh);
setpixel(10, 41, sf);
setpixel(11, 41, sg);
setpixel(12, 41, sg);
setpixel(13, 41, sg);
setpixel(14, 41, sg);
setpixel(15, 41, sf);
setpixel(16, 41, sh);
setpixel(17, 41, sh);
setpixel(18, 41, sf);
setpixel(19, 41, sg);
setpixel(20, 41, sg);
setpixel(21, 41, sg);
setpixel(22, 41, sg);
setpixel(23, 41, sf);
setpixel(24, 41, sh);
setpixel(25, 41, sh);
setpixel(26, 41, sf);
setpixel(27, 41, sg);
setpixel(28, 41, sg);
setpixel(29, 41, sf);
setpixel(30, 41, sh);
setpixel(31, 41, sf);
setpixel(32, 41, sf);
setpixel(1, 42, sg);
setpixel(2, 42, sg);
setpixel(3, 42, sh);
setpixel(4, 42, sh);
setpixel(5, 42, sf);
setpixel(6, 42, sf);
setpixel(7, 42, sh);
setpixel(8, 42, sh);
setpixel(9, 42, sh);
setpixel(10, 42, sf);
setpixel(11, 42, sf);
setpixel(12, 42, sg);
setpixel(13, 42, sg);
setpixel(14, 42, sf);
setpixel(15, 42, sf);
setpixel(16, 42, sh);
setpixel(17, 42, sh);
setpixel(18, 42, sf);
setpixel(19, 42, sf);
setpixel(20, 42, sg);
setpixel(21, 42, sg);
setpixel(22, 42, sf);
setpixel(23, 42, sf);
setpixel(24, 42, sh);
setpixel(25, 42, sh);
setpixel(26, 42, sh);
setpixel(27, 42, sf);
setpixel(28, 42, sf);
setpixel(29, 42, sh);
setpixel(30, 42, sh);
setpixel(31, 42, sg);
setpixel(32, 42, sg);
setpixel(2, 43, sf);
setpixel(3, 43, sf);
setpixel(4, 43, sh);
setpixel(5, 43, sh);
setpixel(6, 43, sh);
setpixel(7, 43, sh);
setpixel(8, 43, sh);
setpixel(9, 43, sh);
setpixel(10, 43, sh);
setpixel(11, 43, sf);
setpixel(12, 43, sf);
setpixel(13, 43, sf);
setpixel(14, 43, sf);
setpixel(15, 43, sh);
setpixel(16, 43, sh);
setpixel(17, 43, sh);
setpixel(18, 43, sh);
setpixel(19, 43, sf);
setpixel(20, 43, sf);
setpixel(21, 43, sf);
setpixel(22, 43, sf);
setpixel(23, 43, sh);
setpixel(24, 43, sh);
setpixel(25, 43, sh);
setpixel(26, 43, sh);
setpixel(27, 43, sh);
setpixel(28, 43, sh);
setpixel(29, 43, sh);
setpixel(30, 43, sf);
setpixel(31, 43, sg);
setpixel(3, 44, sg);
setpixel(4, 44, sg);
setpixel(5, 44, sg);
setpixel(6, 44, sh);
setpixel(7, 44, sh);
setpixel(8, 44, sh);
setpixel(9, 44, sh);
setpixel(10, 44, sh);
setpixel(11, 44, sh);
setpixel(12, 44, sh);
setpixel(13, 44, sh);
setpixel(14, 44, sh);
setpixel(15, 44, sh);
setpixel(16, 44, sh);
setpixel(17, 44, sh);
setpixel(18, 44, sh);
setpixel(19, 44, sh);
setpixel(20, 44, sh);
setpixel(21, 44, sh);
setpixel(22, 44, sh);
setpixel(23, 44, sh);
setpixel(24, 44, sh);
setpixel(25, 44, sh);
setpixel(26, 44, sh);
setpixel(27, 44, sh);
setpixel(28, 44, sg);
setpixel(29, 44, sg);
setpixel(30, 44, sf);
setpixel(4, 45, sg);
setpixel(5, 45, sg);
setpixel(6, 45, sf);
setpixel(7, 45, sg);
setpixel(8, 45, sg);
setpixel(9, 45, sf);
setpixel(10, 45, sg);
setpixel(11, 45, sg);
setpixel(12, 45, sf);
setpixel(13, 45, sg);
setpixel(14, 45, sg);
setpixel(15, 45, sf);
setpixel(16, 45, sg);
setpixel(17, 45, sg);
setpixel(18, 45, sf);
setpixel(19, 45, sg);
setpixel(20, 45, sg);
setpixel(21, 45, sf);
setpixel(22, 45, sg);
setpixel(23, 45, sg);
setpixel(24, 45, sf);
setpixel(25, 45, sg);
setpixel(26, 45, sg);
setpixel(27, 45, sf);
setpixel(28, 45, sg);
setpixel(29, 45, sg);
setpixel(6, 46, sf);
setpixel(7, 46, sg);
setpixel(8, 46, sg);
setpixel(9, 46, sf);
setpixel(10, 46, sg);
setpixel(11, 46, sg);
setpixel(12, 46, sf);
setpixel(13, 46, sg);
setpixel(14, 46, sg);
setpixel(15, 46, sf);
setpixel(16, 46, sg);
setpixel(17, 46, sg);
setpixel(18, 46, sf);
setpixel(19, 46, sg);
setpixel(20, 46, sg);
setpixel(21, 46, sf);
setpixel(22, 46, sg);
setpixel(23, 46, sg);
setpixel(24, 46, sf);
setpixel(25, 46, sg);
setpixel(26, 46, sg);
setpixel(27, 46, sf);

for ( int c = 0; c < 46; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}
