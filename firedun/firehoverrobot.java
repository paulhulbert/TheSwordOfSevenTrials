/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class firehoverrobot extends unit {
    
    
    public firehoverrobot( room currentroom, int x, int y, AI ai )
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
        if ( mainweapon.equals("fireball")) {
            weapons.add(new fireball( x, y - 12, temp, momentx, momenty ));
            
        }
        
    }
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(27);
        f.setlength(66);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
Color sa = new Color(102,102,102);
Color sb = new Color(51,51,51);
Color sc = new Color(255,0,0);
Color sd = new Color(153,153,153);
Color se = new Color(0,0,0);
Color sf = new Color(255,1,0);
Color sg = new Color(255,102,0);
Color sh = new Color(255,204,0);
        
        
        
//<editor-fold defaultstate="collapsed" desc="build figure">





setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(9, 0, sb);
setpixel(10, 0, sb);
setpixel(11, 0, sb);
setpixel(12, 0, sb);
setpixel(13, 0, sb);
setpixel(14, 0, sb);
setpixel(15, 0, sb);
setpixel(16, 0, sb);
setpixel(17, 0, sa);
setpixel(18, 0, sb);
setpixel(19, 0, sb);
setpixel(20, 0, sb);
setpixel(5, 1, sc);
setpixel(6, 1, sc);
setpixel(7, 1, sc);
setpixel(8, 1, sc);
setpixel(9, 1, sa);
setpixel(10, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sb);
setpixel(15, 1, sb);
setpixel(16, 1, sb);
setpixel(17, 1, sa);
setpixel(18, 1, sa);
setpixel(19, 1, sa);
setpixel(20, 1, sb);
setpixel(1, 2, sa);
setpixel(2, 2, sa);
setpixel(3, 2, sa);
setpixel(4, 2, sa);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sc);
setpixel(10, 2, sc);
setpixel(11, 2, sc);
setpixel(12, 2, sc);
setpixel(13, 2, sa);
setpixel(14, 2, sb);
setpixel(15, 2, sb);
setpixel(16, 2, sb);
setpixel(17, 2, sa);
setpixel(18, 2, sc);
setpixel(19, 2, sc);
setpixel(20, 2, sa);
setpixel(4, 3, sb);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sb);
setpixel(8, 3, sa);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sc);
setpixel(14, 3, sa);
setpixel(15, 3, sb);
setpixel(16, 3, sa);
setpixel(17, 3, sc);
setpixel(18, 3, sa);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sb);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sa);
setpixel(14, 4, sc);
setpixel(15, 4, sa);
setpixel(16, 4, sc);
setpixel(17, 4, sa);
setpixel(18, 4, sb);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(7, 5, sb);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(10, 5, sb);
setpixel(11, 5, sb);
setpixel(12, 5, sb);
setpixel(13, 5, sb);
setpixel(14, 5, sa);
setpixel(15, 5, sc);
setpixel(16, 5, sa);
setpixel(17, 5, sb);
setpixel(18, 5, sb);
setpixel(19, 5, sb);
setpixel(20, 5, sb);
setpixel(12, 6, sb);
setpixel(13, 6, sb);
setpixel(14, 6, sa);
setpixel(15, 6, sc);
setpixel(16, 6, sa);
setpixel(17, 6, sb);
setpixel(18, 6, sa);
setpixel(19, 6, sa);
setpixel(20, 6, sa);
setpixel(13, 7, sb);
setpixel(14, 7, sa);
setpixel(15, 7, sc);
setpixel(16, 7, sa);
setpixel(17, 7, sb);
setpixel(18, 7, sb);
setpixel(19, 7, sb);
setpixel(20, 7, sb);
setpixel(14, 8, sa);
setpixel(15, 8, sc);
setpixel(16, 8, sa);
setpixel(17, 8, sb);
setpixel(18, 8, sb);
setpixel(19, 8, sb);
setpixel(14, 9, sa);
setpixel(15, 9, sc);
setpixel(16, 9, sa);
setpixel(17, 9, sb);
setpixel(18, 9, sb);
setpixel(19, 9, sb);
setpixel(9, 10, sa);
setpixel(10, 10, sa);
setpixel(11, 10, sa);
setpixel(12, 10, sa);
setpixel(13, 10, sa);
setpixel(14, 10, sa);
setpixel(15, 10, sc);
setpixel(16, 10, sa);
setpixel(17, 10, sb);
setpixel(18, 10, sb);
setpixel(19, 10, sa);
setpixel(20, 10, sa);
setpixel(21, 10, sa);
setpixel(22, 10, sa);
setpixel(23, 10, sa);
setpixel(10, 11, sb);
setpixel(11, 11, sb);
setpixel(12, 11, sb);
setpixel(13, 11, sb);
setpixel(14, 11, sa);
setpixel(15, 11, sc);
setpixel(16, 11, sa);
setpixel(17, 11, sb);
setpixel(18, 11, sb);
setpixel(19, 11, sb);
setpixel(20, 11, sb);
setpixel(21, 11, sb);
setpixel(22, 11, sb);
setpixel(23, 11, sb);
setpixel(11, 12, sb);
setpixel(12, 12, sb);
setpixel(13, 12, sb);
setpixel(14, 12, sa);
setpixel(15, 12, sc);
setpixel(16, 12, sc);
setpixel(17, 12, sa);
setpixel(18, 12, sb);
setpixel(19, 12, sb);
setpixel(20, 12, sb);
setpixel(21, 12, sb);
setpixel(22, 12, sb);
setpixel(23, 12, sb);
setpixel(11, 13, sb);
setpixel(12, 13, sb);
setpixel(13, 13, sb);
setpixel(14, 13, sa);
setpixel(15, 13, sc);
setpixel(16, 13, sa);
setpixel(17, 13, sa);
setpixel(18, 13, sa);
setpixel(19, 13, sb);
setpixel(20, 13, sb);
setpixel(21, 13, sb);
setpixel(22, 13, sb);
setpixel(23, 13, sb);
setpixel(11, 14, sb);
setpixel(12, 14, sb);
setpixel(13, 14, sb);
setpixel(14, 14, sa);
setpixel(15, 14, sc);
setpixel(16, 14, sc);
setpixel(17, 14, sc);
setpixel(18, 14, sc);
setpixel(19, 14, sa);
setpixel(20, 14, sb);
setpixel(21, 14, sb);
setpixel(22, 14, sb);
setpixel(23, 14, sb);
setpixel(12, 15, sb);
setpixel(13, 15, sb);
setpixel(14, 15, sa);
setpixel(15, 15, sc);
setpixel(16, 15, sa);
setpixel(17, 15, sa);
setpixel(18, 15, sc);
setpixel(19, 15, sb);
setpixel(20, 15, sa);
setpixel(21, 15, sb);
setpixel(22, 15, sb);
setpixel(12, 16, sb);
setpixel(13, 16, sb);
setpixel(14, 16, sa);
setpixel(15, 16, sc);
setpixel(16, 16, sb);
setpixel(17, 16, sa);
setpixel(18, 16, sc);
setpixel(19, 16, sb);
setpixel(20, 16, sb);
setpixel(21, 16, sa);
setpixel(22, 16, sb);
setpixel(12, 17, sb);
setpixel(13, 17, sb);
setpixel(14, 17, sa);
setpixel(15, 17, sc);
setpixel(16, 17, sb);
setpixel(17, 17, sb);
setpixel(18, 17, sa);
setpixel(19, 17, sc);
setpixel(20, 17, sb);
setpixel(21, 17, sb);
setpixel(22, 17, sa);
setpixel(23, 17, sa);
setpixel(24, 17, sa);
setpixel(25, 17, sa);
setpixel(26, 17, sa);
setpixel(27, 17, sa);
setpixel(12, 18, sb);
setpixel(13, 18, sb);
setpixel(14, 18, sa);
setpixel(15, 18, sc);
setpixel(16, 18, sb);
setpixel(17, 18, sb);
setpixel(18, 18, sb);
setpixel(19, 18, sa);
setpixel(20, 18, sc);
setpixel(21, 18, sb);
setpixel(22, 18, sb);
setpixel(23, 18, sb);
setpixel(24, 18, sb);
setpixel(25, 18, sb);
setpixel(26, 18, sb);
setpixel(27, 18, sb);
setpixel(13, 19, sd);
setpixel(14, 19, sd);
setpixel(15, 19, sd);
setpixel(16, 19, sd);
setpixel(17, 19, sd);
setpixel(18, 19, sd);
setpixel(19, 19, sd);
setpixel(20, 19, sa);
setpixel(21, 19, sc);
setpixel(22, 19, sc);
setpixel(23, 19, sc);
setpixel(24, 19, sc);
setpixel(25, 19, sc);
setpixel(26, 19, sc);
setpixel(27, 19, sc);
setpixel(14, 20, sb);
setpixel(15, 20, sc);
setpixel(16, 20, sb);
setpixel(17, 20, sb);
setpixel(18, 20, sb);
setpixel(19, 20, sb);
setpixel(20, 20, sb);
setpixel(21, 20, sa);
setpixel(22, 20, sa);
setpixel(23, 20, sa);
setpixel(24, 20, sa);
setpixel(25, 20, sa);
setpixel(26, 20, sa);
setpixel(27, 20, sa);
setpixel(13, 21, sd);
setpixel(14, 21, sd);
setpixel(15, 21, sd);
setpixel(16, 21, sd);
setpixel(17, 21, sd);
setpixel(18, 21, sd);
setpixel(19, 21, sd);
setpixel(20, 21, sd);
setpixel(21, 21, sd);
setpixel(14, 22, sb);
setpixel(15, 22, sc);
setpixel(16, 22, sb);
setpixel(17, 22, sb);
setpixel(18, 22, sb);
setpixel(19, 22, sb);
setpixel(20, 22, sb);
setpixel(10, 23, sa);
setpixel(11, 23, sa);
setpixel(12, 23, sa);
setpixel(13, 23, sa);
setpixel(14, 23, sa);
setpixel(15, 23, sc);
setpixel(16, 23, sa);
setpixel(17, 23, sa);
setpixel(18, 23, sa);
setpixel(19, 23, sa);
setpixel(20, 23, sa);
setpixel(21, 23, sa);
setpixel(22, 23, sa);
setpixel(23, 23, sa);
setpixel(24, 23, sa);
setpixel(9, 24, sa);
setpixel(10, 24, sb);
setpixel(11, 24, sc);
setpixel(12, 24, sc);
setpixel(13, 24, sc);
setpixel(14, 24, sc);
setpixel(15, 24, sc);
setpixel(16, 24, sc);
setpixel(17, 24, sc);
setpixel(18, 24, sc);
setpixel(19, 24, sc);
setpixel(20, 24, sc);
setpixel(21, 24, sc);
setpixel(22, 24, sc);
setpixel(23, 24, sc);
setpixel(24, 24, sb);
setpixel(25, 24, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sb);
setpixel(11, 25, sc);
setpixel(12, 25, sb);
setpixel(13, 25, sa);
setpixel(14, 25, sb);
setpixel(15, 25, sc);
setpixel(16, 25, sb);
setpixel(17, 25, sa);
setpixel(18, 25, sb);
setpixel(19, 25, sc);
setpixel(20, 25, sb);
setpixel(21, 25, sa);
setpixel(22, 25, sb);
setpixel(23, 25, sc);
setpixel(24, 25, sb);
setpixel(25, 25, sa);
setpixel(9, 26, sa);
setpixel(10, 26, sb);
setpixel(11, 26, sc);
setpixel(12, 26, sb);
setpixel(14, 26, sb);
setpixel(15, 26, sc);
setpixel(16, 26, sb);
setpixel(18, 26, sb);
setpixel(19, 26, sc);
setpixel(20, 26, sb);
setpixel(22, 26, sb);
setpixel(23, 26, sc);
setpixel(24, 26, sb);
setpixel(25, 26, sa);
setpixel(9, 27, sa);
setpixel(10, 27, sb);
setpixel(11, 27, sc);
setpixel(12, 27, sb);
setpixel(14, 27, sb);
setpixel(15, 27, sc);
setpixel(16, 27, sb);
setpixel(18, 27, sb);
setpixel(19, 27, sc);
setpixel(20, 27, sb);
setpixel(22, 27, sb);
setpixel(23, 27, sc);
setpixel(24, 27, sb);
setpixel(25, 27, sa);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(10, 28, sb);
setpixel(11, 28, sc);
setpixel(12, 28, sb);
setpixel(14, 28, sb);
setpixel(15, 28, sc);
setpixel(16, 28, sb);
setpixel(18, 28, sb);
setpixel(19, 28, sc);
setpixel(20, 28, sb);
setpixel(22, 28, sb);
setpixel(23, 28, sc);
setpixel(24, 28, sb);
setpixel(25, 28, sa);
setpixel(26, 28, sa);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(10, 29, sb);
setpixel(11, 29, sc);
setpixel(12, 29, sb);
setpixel(14, 29, sb);
setpixel(15, 29, sc);
setpixel(16, 29, sb);
setpixel(18, 29, sb);
setpixel(19, 29, sc);
setpixel(20, 29, sb);
setpixel(22, 29, sb);
setpixel(23, 29, sc);
setpixel(24, 29, sb);
setpixel(25, 29, sa);
setpixel(26, 29, sa);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(10, 30, se);
setpixel(11, 30, se);
setpixel(12, 30, se);
setpixel(14, 30, se);
setpixel(15, 30, se);
setpixel(16, 30, se);
setpixel(18, 30, se);
setpixel(19, 30, se);
setpixel(20, 30, se);
setpixel(22, 30, se);
setpixel(23, 30, se);
setpixel(24, 30, se);
setpixel(25, 30, sa);
setpixel(26, 30, sa);
setpixel(10, 31, sf);
setpixel(11, 31, sf);
setpixel(16, 31, sf);
setpixel(19, 31, sf);
setpixel(20, 31, sf);
setpixel(23, 31, sf);
setpixel(10, 32, sf);
setpixel(12, 32, sf);
setpixel(15, 32, sf);
setpixel(16, 32, sg);
setpixel(19, 32, sf);
setpixel(20, 32, sf);
setpixel(23, 32, sf);
setpixel(24, 32, sf);
setpixel(9, 33, sf);
setpixel(10, 33, sf);
setpixel(12, 33, sg);
setpixel(15, 33, sf);
setpixel(16, 33, sg);
setpixel(18, 33, sg);
setpixel(19, 33, sg);
setpixel(20, 33, sf);
setpixel(22, 33, sg);
setpixel(23, 33, sf);
setpixel(24, 33, sf);
setpixel(9, 34, sf);
setpixel(11, 34, sg);
setpixel(13, 34, sf);
setpixel(15, 34, sf);
setpixel(16, 34, sg);
setpixel(17, 34, sf);
setpixel(19, 34, sg);
setpixel(20, 34, sg);
setpixel(21, 34, sg);
setpixel(22, 34, sg);
setpixel(23, 34, sf);
setpixel(24, 34, sf);
setpixel(9, 35, sf);
setpixel(11, 35, sg);
setpixel(15, 35, sf);
setpixel(16, 35, sg);
setpixel(17, 35, sf);
setpixel(20, 35, sf);
setpixel(21, 35, sf);
setpixel(22, 35, sg);
setpixel(23, 35, sf);
setpixel(24, 35, sf);
setpixel(9, 36, sf);
setpixel(11, 36, sg);
setpixel(12, 36, sf);
setpixel(13, 36, sf);
setpixel(15, 36, sf);
setpixel(16, 36, sg);
setpixel(17, 36, sf);
setpixel(19, 36, sf);
setpixel(21, 36, sf);
setpixel(22, 36, sg);
setpixel(23, 36, sf);
setpixel(24, 36, sf);
setpixel(9, 37, sf);
setpixel(11, 37, sg);
setpixel(12, 37, sf);
setpixel(14, 37, sf);
setpixel(16, 37, sg);
setpixel(17, 37, sf);
setpixel(21, 37, sf);
setpixel(22, 37, sg);
setpixel(23, 37, sf);
setpixel(24, 37, sf);
setpixel(9, 38, sf);
setpixel(11, 38, sg);
setpixel(12, 38, sf);
setpixel(14, 38, sf);
setpixel(16, 38, sg);
setpixel(17, 38, sf);
setpixel(19, 38, sf);
setpixel(21, 38, sf);
setpixel(22, 38, sg);
setpixel(23, 38, sf);
setpixel(24, 38, sf);
setpixel(9, 39, sf);
setpixel(11, 39, sg);
setpixel(12, 39, sf);
setpixel(14, 39, sf);
setpixel(16, 39, sg);
setpixel(17, 39, sf);
setpixel(19, 39, sf);
setpixel(20, 39, sf);
setpixel(21, 39, sf);
setpixel(22, 39, sg);
setpixel(23, 39, sf);
setpixel(24, 39, sf);
setpixel(9, 40, sf);
setpixel(11, 40, sh);
setpixel(12, 40, sf);
setpixel(14, 40, sf);
setpixel(15, 40, sg);
setpixel(19, 40, sf);
setpixel(20, 40, sf);
setpixel(23, 40, sf);
setpixel(24, 40, sf);
setpixel(9, 41, sf);
setpixel(11, 41, sg);
setpixel(12, 41, sf);
setpixel(14, 41, sf);
setpixel(15, 41, sg);
setpixel(17, 41, sg);
setpixel(18, 41, sf);
setpixel(21, 41, sf);
setpixel(22, 41, sg);
setpixel(23, 41, sf);
setpixel(24, 41, sf);
setpixel(9, 42, sf);
setpixel(10, 42, sh);
setpixel(11, 42, sg);
setpixel(12, 42, sf);
setpixel(14, 42, sf);
setpixel(15, 42, sg);
setpixel(16, 42, sh);
setpixel(17, 42, sg);
setpixel(18, 42, sf);
setpixel(20, 42, sf);
setpixel(22, 42, sg);
setpixel(23, 42, sf);
setpixel(24, 42, sf);
setpixel(9, 43, sf);
setpixel(10, 43, sh);
setpixel(11, 43, sg);
setpixel(12, 43, sf);
setpixel(13, 43, sf);
setpixel(14, 43, sh);
setpixel(15, 43, sf);
setpixel(16, 43, sg);
setpixel(17, 43, sf);
setpixel(20, 43, sf);
setpixel(21, 43, sh);
setpixel(22, 43, sg);
setpixel(23, 43, sf);
setpixel(24, 43, sf);
setpixel(10, 44, sg);
setpixel(11, 44, sg);
setpixel(12, 44, sf);
setpixel(13, 44, sf);
setpixel(15, 44, sg);
setpixel(18, 44, sf);
setpixel(20, 44, sh);
setpixel(21, 44, sh);
setpixel(22, 44, sg);
setpixel(23, 44, sf);
setpixel(24, 44, sf);
setpixel(10, 45, sg);
setpixel(11, 45, sf);
setpixel(12, 45, sg);
setpixel(13, 45, sf);
setpixel(15, 45, sg);
setpixel(16, 45, sg);
setpixel(17, 45, sf);
setpixel(18, 45, sf);
setpixel(19, 45, sf);
setpixel(20, 45, sh);
setpixel(22, 45, sg);
setpixel(23, 45, sf);
setpixel(24, 45, sh);
setpixel(10, 46, sg);
setpixel(11, 46, sf);
setpixel(12, 46, sg);
setpixel(13, 46, sf);
setpixel(15, 46, sg);
setpixel(17, 46, sf);
setpixel(18, 46, sf);
setpixel(19, 46, sf);
setpixel(21, 46, sf);
setpixel(22, 46, sg);
setpixel(23, 46, sf);
setpixel(24, 46, sf);
setpixel(10, 47, sg);
setpixel(11, 47, sf);
setpixel(12, 47, sg);
setpixel(13, 47, sf);
setpixel(14, 47, sg);
setpixel(15, 47, sf);
setpixel(16, 47, sg);
setpixel(17, 47, sf);
setpixel(18, 47, sh);
setpixel(21, 47, sf);
setpixel(22, 47, sg);
setpixel(10, 48, sg);
setpixel(12, 48, sf);
setpixel(13, 48, sg);
setpixel(14, 48, sg);
setpixel(16, 48, sg);
setpixel(17, 48, sf);
setpixel(19, 48, sf);
setpixel(20, 48, sf);
setpixel(22, 48, sg);
setpixel(23, 48, sf);
setpixel(10, 49, sg);
setpixel(11, 49, sf);
setpixel(12, 49, sh);
setpixel(13, 49, sg);
setpixel(14, 49, sf);
setpixel(15, 49, sg);
setpixel(16, 49, sh);
setpixel(17, 49, sf);
setpixel(19, 49, sf);
setpixel(20, 49, sf);
setpixel(22, 49, sh);
setpixel(23, 49, sh);
setpixel(8, 50, sg);
setpixel(10, 50, sh);
setpixel(11, 50, sf);
setpixel(12, 50, sh);
setpixel(14, 50, sg);
setpixel(15, 50, sh);
setpixel(16, 50, sh);
setpixel(18, 50, sf);
setpixel(19, 50, sf);
setpixel(22, 50, sh);
setpixel(9, 51, sg);
setpixel(10, 51, sh);
setpixel(11, 51, sg);
setpixel(12, 51, sh);
setpixel(13, 51, sf);
setpixel(14, 51, sf);
setpixel(15, 51, sh);
setpixel(16, 51, sh);
setpixel(17, 51, sf);
setpixel(18, 51, sh);
setpixel(19, 51, sg);
setpixel(21, 51, sg);
setpixel(22, 51, sh);
setpixel(10, 52, sh);
setpixel(11, 52, sg);
setpixel(12, 52, sh);
setpixel(13, 52, sf);
setpixel(14, 52, sh);
setpixel(15, 52, sg);
setpixel(16, 52, sh);
setpixel(17, 52, sh);
setpixel(18, 52, sg);
setpixel(19, 52, sf);
setpixel(21, 52, sg);
setpixel(22, 52, sg);
setpixel(11, 53, sg);
setpixel(13, 53, sf);
setpixel(14, 53, sh);
setpixel(16, 53, sh);
setpixel(17, 53, sh);
setpixel(18, 53, sh);
setpixel(19, 53, sf);
setpixel(11, 54, sg);
setpixel(12, 54, sf);
setpixel(13, 54, sh);
setpixel(14, 54, sf);
setpixel(15, 54, sh);
setpixel(16, 54, sh);
setpixel(17, 54, sh);
setpixel(20, 54, sh);
setpixel(9, 55, sg);
setpixel(11, 55, sg);
setpixel(12, 55, sf);
setpixel(13, 55, sh);
setpixel(15, 55, sh);
setpixel(16, 55, sh);
setpixel(19, 55, sf);
setpixel(10, 56, sg);
setpixel(11, 56, sg);
setpixel(12, 56, sh);
setpixel(13, 56, sh);
setpixel(14, 56, sh);
setpixel(15, 56, sh);
setpixel(16, 56, sg);
setpixel(19, 56, sh);
setpixel(20, 56, sg);
setpixel(11, 57, sg);
setpixel(13, 57, sg);
setpixel(14, 57, sh);
setpixel(15, 57, sh);
setpixel(18, 57, sh);
setpixel(19, 57, sg);
setpixel(11, 58, sh);
setpixel(12, 59, sg);
setpixel(15, 59, sh);
setpixel(17, 59, sf);
setpixel(17, 60, sf);


for ( int c = 0; c < 66; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}


