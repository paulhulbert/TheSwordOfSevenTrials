/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class lightgob extends unit {
    
    
    public lightgob( room currentroom, int x, int y, AI ai )
    {
        super( 100, 0, 4, "gobclaws_bag", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(28);
        f.setlength(79);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        

Color sa = new Color(0,102,102);
Color sb = new Color(0,70,70);
Color sc = new Color(255,255,255);
Color sd = new Color(0,0,0);
Color se = new Color(18,12,5);
Color sf = new Color(40,24,7);
Color sg = new Color(102,102,102);
Color sh = new Color(51,51,51);


//<editor-fold defaultstate="collapsed" desc="build figure">



setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(9, 0, sa);
setpixel(10, 0, sa);
setpixel(11, 0, sa);
setpixel(12, 0, sa);
setpixel(13, 0, sa);
setpixel(14, 0, sa);
setpixel(6, 1, sa);
setpixel(7, 1, sa);
setpixel(8, 1, sa);
setpixel(9, 1, sa);
setpixel(10, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sa);
setpixel(16, 1, sa);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sa);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(15, 2, sa);
setpixel(16, 2, sa);
setpixel(17, 2, sa);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sb);
setpixel(8, 3, sb);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sb);
setpixel(15, 3, sb);
setpixel(16, 3, sb);
setpixel(17, 3, sa);
setpixel(18, 3, sa);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sa);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(10, 4, sa);
setpixel(11, 4, sa);
setpixel(12, 4, sa);
setpixel(13, 4, sa);
setpixel(14, 4, sa);
setpixel(15, 4, sc);
setpixel(16, 4, sd);
setpixel(17, 4, sb);
setpixel(18, 4, sa);
setpixel(5, 5, sa);
setpixel(6, 5, sb);
setpixel(7, 5, sb);
setpixel(8, 5, sa);
setpixel(9, 5, sa);
setpixel(10, 5, sb);
setpixel(11, 5, sb);
setpixel(12, 5, sb);
setpixel(13, 5, sa);
setpixel(14, 5, sa);
setpixel(15, 5, sd);
setpixel(16, 5, sd);
setpixel(17, 5, sa);
setpixel(18, 5, sa);
setpixel(19, 5, sa);
setpixel(5, 6, sa);
setpixel(6, 6, sa);
setpixel(7, 6, sb);
setpixel(8, 6, sb);
setpixel(9, 6, sa);
setpixel(10, 6, sa);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(13, 6, sa);
setpixel(14, 6, sa);
setpixel(15, 6, sa);
setpixel(16, 6, sa);
setpixel(17, 6, sa);
setpixel(18, 6, sa);
setpixel(19, 6, sa);
setpixel(5, 7, sa);
setpixel(6, 7, sa);
setpixel(7, 7, sa);
setpixel(8, 7, sb);
setpixel(9, 7, sa);
setpixel(10, 7, sa);
setpixel(11, 7, sa);
setpixel(12, 7, sa);
setpixel(13, 7, sa);
setpixel(14, 7, sa);
setpixel(15, 7, sa);
setpixel(16, 7, sa);
setpixel(17, 7, sa);
setpixel(18, 7, sa);
setpixel(19, 7, sb);
setpixel(20, 7, sa);
setpixel(6, 8, sa);
setpixel(7, 8, sa);
setpixel(8, 8, sb);
setpixel(9, 8, sb);
setpixel(10, 8, sb);
setpixel(11, 8, sa);
setpixel(12, 8, sa);
setpixel(13, 8, sa);
setpixel(14, 8, sa);
setpixel(15, 8, sa);
setpixel(16, 8, sa);
setpixel(17, 8, sa);
setpixel(18, 8, sa);
setpixel(19, 8, sa);
setpixel(6, 9, sa);
setpixel(7, 9, sa);
setpixel(8, 9, sa);
setpixel(9, 9, sa);
setpixel(10, 9, sb);
setpixel(11, 9, sb);
setpixel(12, 9, sa);
setpixel(13, 9, sa);
setpixel(14, 9, sa);
setpixel(15, 9, sa);
setpixel(16, 9, sa);
setpixel(17, 9, sb);
setpixel(18, 9, sb);
setpixel(19, 9, sb);
setpixel(6, 10, sa);
setpixel(7, 10, sa);
setpixel(8, 10, sa);
setpixel(9, 10, sa);
setpixel(10, 10, sa);
setpixel(11, 10, sa);
setpixel(12, 10, sa);
setpixel(13, 10, sa);
setpixel(14, 10, sa);
setpixel(15, 10, sa);
setpixel(16, 10, sb);
setpixel(17, 10, sa);
setpixel(18, 10, sa);
setpixel(19, 10, sa);
setpixel(7, 11, sa);
setpixel(8, 11, sa);
setpixel(9, 11, sa);
setpixel(10, 11, sa);
setpixel(11, 11, sa);
setpixel(12, 11, sa);
setpixel(13, 11, sa);
setpixel(14, 11, sa);
setpixel(15, 11, sa);
setpixel(16, 11, sa);
setpixel(17, 11, sa);
setpixel(18, 11, sa);
setpixel(19, 11, sa);
setpixel(8, 12, sa);
setpixel(9, 12, sa);
setpixel(10, 12, sa);
setpixel(11, 12, sa);
setpixel(12, 12, sa);
setpixel(13, 12, sa);
setpixel(14, 12, sa);
setpixel(15, 12, sa);
setpixel(16, 12, sa);
setpixel(17, 12, sa);
setpixel(18, 12, sa);
setpixel(9, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(12, 13, sa);
setpixel(13, 13, sa);
setpixel(14, 13, sa);
setpixel(15, 13, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sa);
setpixel(11, 14, sa);
setpixel(12, 14, sa);
setpixel(13, 14, sa);
setpixel(14, 14, sa);
setpixel(15, 14, sa);
setpixel(16, 14, sa);
setpixel(8, 15, sa);
setpixel(9, 15, sa);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sa);
setpixel(14, 15, sa);
setpixel(15, 15, sa);
setpixel(16, 15, sa);
setpixel(17, 15, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sa);
setpixel(9, 16, sa);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(12, 16, sa);
setpixel(13, 16, sa);
setpixel(14, 16, sa);
setpixel(15, 16, sa);
setpixel(16, 16, sa);
setpixel(17, 16, sa);
setpixel(18, 16, sa);
setpixel(5, 17, se);
setpixel(6, 17, se);
setpixel(7, 17, se);
setpixel(8, 17, se);
setpixel(9, 17, se);
setpixel(10, 17, se);
setpixel(11, 17, se);
setpixel(12, 17, se);
setpixel(13, 17, se);
setpixel(14, 17, se);
setpixel(15, 17, se);
setpixel(16, 17, se);
setpixel(17, 17, sa);
setpixel(18, 17, sa);
setpixel(19, 17, sa);
setpixel(5, 18, se);
setpixel(6, 18, sf);
setpixel(7, 18, sf);
setpixel(8, 18, sf);
setpixel(9, 18, sf);
setpixel(10, 18, sf);
setpixel(11, 18, sf);
setpixel(12, 18, sf);
setpixel(13, 18, sf);
setpixel(14, 18, sf);
setpixel(15, 18, sf);
setpixel(16, 18, sf);
setpixel(17, 18, se);
setpixel(18, 18, se);
setpixel(19, 18, sa);
setpixel(4, 19, se);
setpixel(5, 19, sf);
setpixel(6, 19, sf);
setpixel(7, 19, se);
setpixel(8, 19, se);
setpixel(9, 19, se);
setpixel(10, 19, se);
setpixel(11, 19, se);
setpixel(12, 19, se);
setpixel(13, 19, sf);
setpixel(14, 19, sf);
setpixel(15, 19, sf);
setpixel(16, 19, sf);
setpixel(17, 19, sf);
setpixel(18, 19, sg);
setpixel(19, 19, se);
setpixel(4, 20, sf);
setpixel(5, 20, sf);
setpixel(6, 20, se);
setpixel(7, 20, sg);
setpixel(8, 20, sg);
setpixel(9, 20, sg);
setpixel(10, 20, sg);
setpixel(11, 20, sg);
setpixel(12, 20, sg);
setpixel(13, 20, se);
setpixel(14, 20, se);
setpixel(15, 20, sf);
setpixel(16, 20, sf);
setpixel(17, 20, sf);
setpixel(18, 20, sf);
setpixel(19, 20, sf);
setpixel(20, 20, se);
setpixel(4, 21, sf);
setpixel(5, 21, se);
setpixel(6, 21, sg);
setpixel(7, 21, sg);
setpixel(8, 21, sg);
setpixel(9, 21, sg);
setpixel(10, 21, sg);
setpixel(11, 21, sg);
setpixel(12, 21, sg);
setpixel(13, 21, sg);
setpixel(14, 21, sg);
setpixel(15, 21, se);
setpixel(16, 21, sf);
setpixel(17, 21, sf);
setpixel(18, 21, sf);
setpixel(19, 21, sf);
setpixel(20, 21, sf);
setpixel(4, 22, sf);
setpixel(5, 22, se);
setpixel(6, 22, sg);
setpixel(7, 22, sg);
setpixel(8, 22, sg);
setpixel(9, 22, sg);
setpixel(10, 22, sg);
setpixel(11, 22, sg);
setpixel(12, 22, sh);
setpixel(13, 22, sg);
setpixel(14, 22, sg);
setpixel(15, 22, sg);
setpixel(16, 22, sf);
setpixel(17, 22, sf);
setpixel(18, 22, sf);
setpixel(19, 22, sf);
setpixel(20, 22, sf);
setpixel(4, 23, sf);
setpixel(5, 23, se);
setpixel(6, 23, sg);
setpixel(7, 23, sg);
setpixel(8, 23, sh);
setpixel(9, 23, sg);
setpixel(10, 23, sg);
setpixel(11, 23, sg);
setpixel(12, 23, sh);
setpixel(13, 23, sg);
setpixel(14, 23, sg);
setpixel(15, 23, sg);
setpixel(16, 23, sf);
setpixel(17, 23, sf);
setpixel(18, 23, sf);
setpixel(19, 23, sf);
setpixel(20, 23, sf);
setpixel(4, 24, sf);
setpixel(5, 24, se);
setpixel(6, 24, sg);
setpixel(7, 24, sg);
setpixel(8, 24, sh);
setpixel(9, 24, sg);
setpixel(10, 24, sg);
setpixel(11, 24, sg);
setpixel(12, 24, sh);
setpixel(13, 24, sg);
setpixel(14, 24, sg);
setpixel(15, 24, sg);
setpixel(16, 24, sg);
setpixel(17, 24, sf);
setpixel(18, 24, sf);
setpixel(19, 24, sf);
setpixel(20, 24, sf);
setpixel(4, 25, sf);
setpixel(5, 25, se);
setpixel(6, 25, sg);
setpixel(7, 25, sg);
setpixel(8, 25, sh);
setpixel(9, 25, sg);
setpixel(10, 25, sg);
setpixel(11, 25, sg);
setpixel(12, 25, sg);
setpixel(13, 25, sh);
setpixel(14, 25, sg);
setpixel(15, 25, sg);
setpixel(16, 25, sf);
setpixel(17, 25, sf);
setpixel(18, 25, sf);
setpixel(19, 25, sf);
setpixel(20, 25, sf);
setpixel(4, 26, sf);
setpixel(5, 26, sf);
setpixel(6, 26, se);
setpixel(7, 26, sg);
setpixel(8, 26, sh);
setpixel(9, 26, sg);
setpixel(10, 26, sg);
setpixel(11, 26, sg);
setpixel(12, 26, sg);
setpixel(13, 26, sh);
setpixel(14, 26, sg);
setpixel(15, 26, sg);
setpixel(16, 26, sf);
setpixel(17, 26, sf);
setpixel(18, 26, sf);
setpixel(19, 26, sf);
setpixel(20, 26, sf);
setpixel(4, 27, sf);
setpixel(5, 27, sf);
setpixel(6, 27, sf);
setpixel(7, 27, sg);
setpixel(8, 27, sh);
setpixel(9, 27, sg);
setpixel(10, 27, sg);
setpixel(11, 27, sg);
setpixel(12, 27, sg);
setpixel(13, 27, sg);
setpixel(14, 27, sh);
setpixel(15, 27, sg);
setpixel(16, 27, sg);
setpixel(17, 27, sf);
setpixel(18, 27, sf);
setpixel(19, 27, sf);
setpixel(20, 27, sf);
setpixel(4, 28, sf);
setpixel(5, 28, sf);
setpixel(6, 28, sf);
setpixel(7, 28, sf);
setpixel(8, 28, sh);
setpixel(9, 28, sg);
setpixel(10, 28, sg);
setpixel(11, 28, sg);
setpixel(12, 28, sg);
setpixel(13, 28, sg);
setpixel(14, 28, sh);
setpixel(15, 28, sg);
setpixel(16, 28, sg);
setpixel(17, 28, sf);
setpixel(18, 28, sf);
setpixel(19, 28, sf);
setpixel(20, 28, sf);
setpixel(4, 29, sf);
setpixel(5, 29, sf);
setpixel(6, 29, sf);
setpixel(7, 29, sf);
setpixel(8, 29, sh);
setpixel(9, 29, sh);
setpixel(10, 29, sg);
setpixel(11, 29, sg);
setpixel(12, 29, sg);
setpixel(13, 29, sg);
setpixel(14, 29, sh);
setpixel(15, 29, sg);
setpixel(16, 29, sg);
setpixel(17, 29, sg);
setpixel(18, 29, sf);
setpixel(19, 29, sf);
setpixel(20, 29, sf);
setpixel(4, 30, sf);
setpixel(5, 30, sf);
setpixel(6, 30, sf);
setpixel(7, 30, sf);
setpixel(8, 30, sg);
setpixel(9, 30, sg);
setpixel(10, 30, sh);
setpixel(11, 30, sg);
setpixel(12, 30, sg);
setpixel(13, 30, sg);
setpixel(14, 30, sh);
setpixel(15, 30, sg);
setpixel(16, 30, sg);
setpixel(17, 30, sg);
setpixel(18, 30, sg);
setpixel(19, 30, sg);
setpixel(20, 30, sg);
setpixel(21, 30, sg);
setpixel(22, 30, sg);
setpixel(23, 30, sg);
setpixel(24, 30, sg);
setpixel(25, 30, sg);
setpixel(26, 30, sg);
setpixel(27, 30, sg);
setpixel(28, 30, sh);
setpixel(4, 31, sf);
setpixel(5, 31, sf);
setpixel(6, 31, sf);
setpixel(7, 31, sf);
setpixel(8, 31, sf);
setpixel(9, 31, sg);
setpixel(10, 31, sh);
setpixel(11, 31, sh);
setpixel(12, 31, sg);
setpixel(13, 31, sg);
setpixel(14, 31, sg);
setpixel(15, 31, sg);
setpixel(16, 31, sg);
setpixel(17, 31, sg);
setpixel(18, 31, sh);
setpixel(19, 31, sh);
setpixel(20, 31, sh);
setpixel(21, 31, sh);
setpixel(22, 31, sh);
setpixel(23, 31, sh);
setpixel(24, 31, sh);
setpixel(25, 31, sg);
setpixel(26, 31, sg);
setpixel(27, 31, sg);
setpixel(28, 31, sh);
setpixel(4, 32, sf);
setpixel(5, 32, sf);
setpixel(6, 32, se);
setpixel(7, 32, sf);
setpixel(8, 32, sf);
setpixel(9, 32, sg);
setpixel(10, 32, sg);
setpixel(11, 32, sh);
setpixel(12, 32, sg);
setpixel(13, 32, sg);
setpixel(14, 32, sg);
setpixel(15, 32, sg);
setpixel(16, 32, sg);
setpixel(17, 32, sg);
setpixel(18, 32, sg);
setpixel(19, 32, sg);
setpixel(20, 32, sg);
setpixel(21, 32, sg);
setpixel(22, 32, sg);
setpixel(23, 32, sg);
setpixel(24, 32, sh);
setpixel(25, 32, sh);
setpixel(26, 32, sh);
setpixel(27, 32, sh);
setpixel(28, 32, sh);
setpixel(4, 33, sf);
setpixel(5, 33, sf);
setpixel(6, 33, se);
setpixel(7, 33, sf);
setpixel(8, 33, sf);
setpixel(9, 33, sf);
setpixel(10, 33, sg);
setpixel(11, 33, sh);
setpixel(12, 33, sh);
setpixel(13, 33, sg);
setpixel(14, 33, sg);
setpixel(15, 33, sg);
setpixel(16, 33, sg);
setpixel(17, 33, sg);
setpixel(18, 33, sg);
setpixel(19, 33, sg);
setpixel(20, 33, sg);
setpixel(21, 33, sg);
setpixel(22, 33, sg);
setpixel(23, 33, sg);
setpixel(24, 33, sg);
setpixel(25, 33, sg);
setpixel(26, 33, sh);
setpixel(27, 33, sh);
setpixel(28, 33, sh);
setpixel(4, 34, sf);
setpixel(5, 34, sf);
setpixel(6, 34, se);
setpixel(7, 34, sf);
setpixel(8, 34, sf);
setpixel(9, 34, sf);
setpixel(10, 34, sg);
setpixel(11, 34, sg);
setpixel(12, 34, sg);
setpixel(13, 34, sg);
setpixel(14, 34, sg);
setpixel(15, 34, sg);
setpixel(16, 34, sg);
setpixel(17, 34, sh);
setpixel(18, 34, sh);
setpixel(19, 34, sg);
setpixel(20, 34, sg);
setpixel(21, 34, sg);
setpixel(22, 34, sg);
setpixel(23, 34, sg);
setpixel(24, 34, sg);
setpixel(25, 34, sg);
setpixel(26, 34, sg);
setpixel(27, 34, sg);
setpixel(28, 34, sh);
setpixel(4, 35, sf);
setpixel(5, 35, sf);
setpixel(6, 35, se);
setpixel(7, 35, sf);
setpixel(8, 35, sf);
setpixel(9, 35, sf);
setpixel(10, 35, se);
setpixel(11, 35, sf);
setpixel(12, 35, sg);
setpixel(13, 35, sg);
setpixel(14, 35, sg);
setpixel(15, 35, sg);
setpixel(16, 35, sg);
setpixel(17, 35, sg);
setpixel(18, 35, sh);
setpixel(19, 35, sh);
setpixel(20, 35, sh);
setpixel(21, 35, sg);
setpixel(22, 35, sg);
setpixel(23, 35, sg);
setpixel(24, 35, sg);
setpixel(25, 35, sg);
setpixel(26, 35, sg);
setpixel(27, 35, sg);
setpixel(28, 35, sh);
setpixel(4, 36, sf);
setpixel(5, 36, sf);
setpixel(6, 36, se);
setpixel(7, 36, sf);
setpixel(8, 36, sf);
setpixel(9, 36, sf);
setpixel(10, 36, se);
setpixel(11, 36, se);
setpixel(12, 36, sf);
setpixel(13, 36, sf);
setpixel(14, 36, sf);
setpixel(15, 36, sf);
setpixel(16, 36, sg);
setpixel(17, 36, sg);
setpixel(18, 36, sg);
setpixel(19, 36, sg);
setpixel(20, 36, sh);
setpixel(21, 36, sh);
setpixel(22, 36, sh);
setpixel(23, 36, sh);
setpixel(24, 36, sh);
setpixel(25, 36, sg);
setpixel(26, 36, sg);
setpixel(27, 36, sg);
setpixel(4, 37, sf);
setpixel(5, 37, sf);
setpixel(6, 37, sf);
setpixel(7, 37, sf);
setpixel(8, 37, sf);
setpixel(9, 37, sf);
setpixel(10, 37, sf);
setpixel(11, 37, se);
setpixel(12, 37, se);
setpixel(13, 37, sf);
setpixel(14, 37, sf);
setpixel(15, 37, sf);
setpixel(16, 37, sf);
setpixel(17, 37, se);
setpixel(18, 37, sf);
setpixel(19, 37, sg);
setpixel(20, 37, sg);
setpixel(21, 37, sg);
setpixel(22, 37, sg);
setpixel(23, 37, sg);
setpixel(24, 37, sg);
setpixel(25, 37, sg);
setpixel(26, 37, sg);
setpixel(4, 38, sh);
setpixel(5, 38, sh);
setpixel(6, 38, sf);
setpixel(7, 38, sf);
setpixel(8, 38, sf);
setpixel(9, 38, sf);
setpixel(10, 38, sg);
setpixel(11, 38, sf);
setpixel(12, 38, se);
setpixel(13, 38, sf);
setpixel(14, 38, sg);
setpixel(15, 38, sf);
setpixel(16, 38, sf);
setpixel(17, 38, se);
setpixel(18, 38, sf);
setpixel(19, 38, sh);
setpixel(20, 38, sf);
setpixel(4, 39, sh);
setpixel(5, 39, sh);
setpixel(6, 39, sh);
setpixel(7, 39, sh);
setpixel(8, 39, sh);
setpixel(9, 39, sh);
setpixel(10, 39, sh);
setpixel(11, 39, sh);
setpixel(12, 39, sh);
setpixel(13, 39, sh);
setpixel(14, 39, sh);
setpixel(15, 39, sh);
setpixel(16, 39, sh);
setpixel(17, 39, sh);
setpixel(18, 39, sh);
setpixel(19, 39, sh);
setpixel(20, 39, sh);
setpixel(4, 40, sf);
setpixel(5, 40, sf);
setpixel(6, 40, sh);
setpixel(7, 40, sh);
setpixel(8, 40, sh);
setpixel(9, 40, sh);
setpixel(10, 40, sh);
setpixel(11, 40, sh);
setpixel(12, 40, sh);
setpixel(13, 40, sh);
setpixel(14, 40, sh);
setpixel(15, 40, sh);
setpixel(16, 40, sh);
setpixel(17, 40, sh);
setpixel(18, 40, sh);
setpixel(19, 40, sh);
setpixel(20, 40, sh);
setpixel(4, 41, se);
setpixel(5, 41, sf);
setpixel(6, 41, sf);
setpixel(7, 41, sf);
setpixel(8, 41, sf);
setpixel(9, 41, sf);
setpixel(10, 41, sf);
setpixel(11, 41, sf);
setpixel(12, 41, se);
setpixel(13, 41, sf);
setpixel(14, 41, sf);
setpixel(15, 41, sf);
setpixel(16, 41, sh);
setpixel(17, 41, sh);
setpixel(18, 41, sh);
setpixel(19, 41, sh);
setpixel(20, 41, sh);
setpixel(4, 42, sg);
setpixel(5, 42, sg);
setpixel(6, 42, sf);
setpixel(7, 42, sf);
setpixel(8, 42, sf);
setpixel(9, 42, sf);
setpixel(10, 42, sf);
setpixel(11, 42, sf);
setpixel(12, 42, sf);
setpixel(13, 42, sf);
setpixel(14, 42, sf);
setpixel(15, 42, sf);
setpixel(16, 42, sf);
setpixel(17, 42, sf);
setpixel(18, 42, se);
setpixel(19, 42, se);
setpixel(20, 42, sg);
setpixel(4, 43, sg);
setpixel(5, 43, sg);
setpixel(6, 43, se);
setpixel(7, 43, sf);
setpixel(8, 43, sf);
setpixel(9, 43, sf);
setpixel(10, 43, sf);
setpixel(11, 43, sf);
setpixel(12, 43, sf);
setpixel(13, 43, sf);
setpixel(14, 43, sf);
setpixel(15, 43, se);
setpixel(16, 43, se);
setpixel(17, 43, se);
setpixel(18, 43, sg);
setpixel(19, 43, sg);
setpixel(20, 43, sg);
setpixel(4, 44, sg);
setpixel(5, 44, sh);
setpixel(6, 44, sg);
setpixel(7, 44, se);
setpixel(8, 44, sf);
setpixel(9, 44, sf);
setpixel(10, 44, sg);
setpixel(11, 44, se);
setpixel(12, 44, se);
setpixel(13, 44, se);
setpixel(14, 44, se);
setpixel(15, 44, sg);
setpixel(16, 44, sg);
setpixel(17, 44, sh);
setpixel(18, 44, sg);
setpixel(19, 44, sg);
setpixel(20, 44, sg);
setpixel(21, 44, sg);
setpixel(4, 45, sg);
setpixel(5, 45, sh);
setpixel(6, 45, sg);
setpixel(7, 45, sg);
setpixel(8, 45, sg);
setpixel(9, 45, se);
setpixel(10, 45, se);
setpixel(11, 45, sg);
setpixel(12, 45, sg);
setpixel(13, 45, sg);
setpixel(14, 45, sg);
setpixel(15, 45, sg);
setpixel(16, 45, sg);
setpixel(17, 45, sh);
setpixel(18, 45, sg);
setpixel(19, 45, sg);
setpixel(20, 45, sg);
setpixel(21, 45, sg);
setpixel(3, 46, sg);
setpixel(4, 46, sh);
setpixel(5, 46, sh);
setpixel(6, 46, sg);
setpixel(7, 46, sg);
setpixel(8, 46, sg);
setpixel(9, 46, sg);
setpixel(10, 46, sg);
setpixel(11, 46, sg);
setpixel(12, 46, sg);
setpixel(13, 46, sg);
setpixel(14, 46, sg);
setpixel(15, 46, sh);
setpixel(16, 46, sg);
setpixel(17, 46, sh);
setpixel(18, 46, sh);
setpixel(19, 46, sg);
setpixel(20, 46, sg);
setpixel(21, 46, sg);
setpixel(3, 47, sh);
setpixel(4, 47, sh);
setpixel(5, 47, sg);
setpixel(6, 47, sg);
setpixel(7, 47, sg);
setpixel(8, 47, sg);
setpixel(9, 47, sg);
setpixel(10, 47, sh);
setpixel(11, 47, sg);
setpixel(12, 47, sg);
setpixel(13, 47, sg);
setpixel(14, 47, sg);
setpixel(15, 47, sh);
setpixel(16, 47, sg);
setpixel(17, 47, sg);
setpixel(18, 47, sh);
setpixel(19, 47, sg);
setpixel(20, 47, sg);
setpixel(21, 47, sg);
setpixel(3, 48, sg);
setpixel(4, 48, sg);
setpixel(5, 48, sg);
setpixel(6, 48, sg);
setpixel(7, 48, sg);
setpixel(8, 48, sg);
setpixel(9, 48, sg);
setpixel(10, 48, sh);
setpixel(11, 48, sg);
setpixel(12, 48, sg);
setpixel(13, 48, sg);
setpixel(14, 48, sg);
setpixel(15, 48, sh);
setpixel(16, 48, sh);
setpixel(17, 48, sg);
setpixel(18, 48, sh);
setpixel(19, 48, sh);
setpixel(20, 48, sg);
setpixel(21, 48, sg);
setpixel(2, 49, sg);
setpixel(3, 49, sg);
setpixel(4, 49, sg);
setpixel(5, 49, sg);
setpixel(6, 49, sg);
setpixel(7, 49, sg);
setpixel(8, 49, sg);
setpixel(9, 49, sg);
setpixel(10, 49, sh);
setpixel(11, 49, sg);
setpixel(12, 49, sg);
setpixel(13, 49, sg);
setpixel(14, 49, sg);
setpixel(15, 49, sg);
setpixel(16, 49, sh);
setpixel(17, 49, sg);
setpixel(18, 49, sg);
setpixel(19, 49, sg);
setpixel(20, 49, sh);
setpixel(21, 49, sg);
setpixel(0, 50, sh);
setpixel(2, 50, sg);
setpixel(3, 50, sg);
setpixel(4, 50, sg);
setpixel(5, 50, sg);
setpixel(6, 50, sg);
setpixel(7, 50, sg);
setpixel(8, 50, sg);
setpixel(9, 50, sg);
setpixel(10, 50, sh);
setpixel(11, 50, sg);
setpixel(12, 50, sg);
setpixel(13, 50, sg);
setpixel(14, 50, sg);
setpixel(15, 50, sg);
setpixel(16, 50, sg);
setpixel(17, 50, sg);
setpixel(18, 50, sg);
setpixel(19, 50, sg);
setpixel(20, 50, sh);
setpixel(21, 50, sg);
setpixel(22, 50, sg);
setpixel(6, 51, sf);
setpixel(7, 51, sg);
setpixel(8, 51, sg);
setpixel(9, 51, sg);
setpixel(10, 51, sh);
setpixel(11, 51, sh);
setpixel(12, 51, sg);
setpixel(13, 51, sg);
setpixel(14, 51, sg);
setpixel(15, 51, sg);
setpixel(16, 51, sg);
setpixel(17, 51, sg);
setpixel(18, 51, sg);
setpixel(19, 51, sg);
setpixel(20, 51, sh);
setpixel(21, 51, sg);
setpixel(22, 51, sg);
setpixel(6, 52, sg);
setpixel(7, 52, sf);
setpixel(8, 52, sf);
setpixel(9, 52, sf);
setpixel(10, 52, sf);
setpixel(11, 52, sf);
setpixel(12, 52, sf);
setpixel(13, 52, sf);
setpixel(14, 52, sf);
setpixel(15, 52, sf);
setpixel(16, 52, sg);
setpixel(17, 52, sg);
setpixel(18, 52, sg);
setpixel(19, 52, sg);
setpixel(20, 52, sg);
setpixel(21, 52, sg);
setpixel(22, 52, sg);
setpixel(6, 53, sf);
setpixel(7, 53, sf);
setpixel(8, 53, sf);
setpixel(9, 53, sf);
setpixel(10, 53, sf);
setpixel(11, 53, sf);
setpixel(12, 53, sf);
setpixel(13, 53, se);
setpixel(14, 53, sf);
setpixel(15, 53, sf);
setpixel(16, 53, sf);
setpixel(17, 53, se);
setpixel(18, 53, sf);
setpixel(6, 54, sf);
setpixel(7, 54, sf);
setpixel(8, 54, sf);
setpixel(9, 54, sf);
setpixel(10, 54, sf);
setpixel(11, 54, sf);
setpixel(12, 54, sf);
setpixel(13, 54, se);
setpixel(14, 54, sf);
setpixel(15, 54, sf);
setpixel(16, 54, sf);
setpixel(17, 54, se);
setpixel(18, 54, sf);
setpixel(7, 55, sf);
setpixel(8, 55, sf);
setpixel(9, 55, sf);
setpixel(10, 55, sf);
setpixel(11, 55, sf);
setpixel(12, 55, se);
setpixel(13, 55, se);
setpixel(14, 55, sf);
setpixel(15, 55, sf);
setpixel(16, 55, sf);
setpixel(17, 55, se);
setpixel(18, 55, sf);
setpixel(7, 56, sf);
setpixel(8, 56, sf);
setpixel(9, 56, sf);
setpixel(10, 56, sf);
setpixel(11, 56, sf);
setpixel(12, 56, se);
setpixel(13, 56, sf);
setpixel(14, 56, sf);
setpixel(15, 56, sf);
setpixel(16, 56, sf);
setpixel(17, 56, se);
setpixel(18, 56, sf);
setpixel(7, 57, sf);
setpixel(8, 57, sf);
setpixel(9, 57, sf);
setpixel(10, 57, sf);
setpixel(11, 57, se);
setpixel(12, 57, se);
setpixel(13, 57, sf);
setpixel(14, 57, sf);
setpixel(15, 57, sf);
setpixel(16, 57, sf);
setpixel(17, 57, se);
setpixel(18, 57, sf);
setpixel(7, 58, sf);
setpixel(8, 58, sf);
setpixel(9, 58, sf);
setpixel(10, 58, sf);
setpixel(11, 58, sf);
setpixel(12, 58, sf);
setpixel(13, 58, sf);
setpixel(14, 58, sf);
setpixel(15, 58, sf);
setpixel(16, 58, sf);
setpixel(17, 58, se);
setpixel(18, 58, sf);
setpixel(7, 59, sf);
setpixel(8, 59, sf);
setpixel(9, 59, sf);
setpixel(10, 59, sf);
setpixel(11, 59, sf);
setpixel(12, 59, sf);
setpixel(13, 59, sf);
setpixel(14, 59, sf);
setpixel(15, 59, sf);
setpixel(16, 59, sf);
setpixel(17, 59, se);
setpixel(18, 59, sf);
setpixel(7, 60, sf);
setpixel(8, 60, sf);
setpixel(9, 60, sf);
setpixel(10, 60, sf);
setpixel(11, 60, sf);
setpixel(12, 60, sf);
setpixel(13, 60, sf);
setpixel(14, 60, sf);
setpixel(15, 60, sf);
setpixel(16, 60, se);
setpixel(17, 60, se);
setpixel(18, 60, sf);
setpixel(7, 61, sf);
setpixel(8, 61, sf);
setpixel(9, 61, sf);
setpixel(10, 61, sf);
setpixel(11, 61, se);
setpixel(12, 61, se);
setpixel(13, 61, se);
setpixel(14, 61, se);
setpixel(15, 61, se);
setpixel(16, 61, se);
setpixel(17, 61, sf);
setpixel(18, 61, se);
setpixel(19, 61, sf);
setpixel(8, 62, sf);
setpixel(9, 62, sf);
setpixel(10, 62, sf);
setpixel(11, 62, sf);
setpixel(12, 62, sf);
setpixel(13, 62, sf);
setpixel(14, 62, sf);
setpixel(15, 62, sf);
setpixel(16, 62, sf);
setpixel(17, 62, sf);
setpixel(18, 62, se);
setpixel(19, 62, sf);
setpixel(9, 63, sf);
setpixel(10, 63, sf);
setpixel(11, 63, sf);
setpixel(12, 63, se);
setpixel(13, 63, se);
setpixel(14, 63, se);
setpixel(15, 63, sf);
setpixel(16, 63, sf);
setpixel(17, 63, sf);
setpixel(18, 63, se);
setpixel(19, 63, sf);
setpixel(10, 64, sf);
setpixel(11, 64, sf);
setpixel(12, 64, sf);
setpixel(13, 64, sf);
setpixel(14, 64, se);
setpixel(15, 64, sf);
setpixel(16, 64, sf);
setpixel(17, 64, sf);
setpixel(18, 64, se);
setpixel(19, 64, sf);
setpixel(10, 65, sf);
setpixel(11, 65, sf);
setpixel(12, 65, sf);
setpixel(13, 65, sf);
setpixel(14, 65, sf);
setpixel(15, 65, sf);
setpixel(16, 65, sf);
setpixel(17, 65, sf);
setpixel(18, 65, se);
setpixel(19, 65, sf);
setpixel(10, 66, sf);
setpixel(11, 66, sf);
setpixel(12, 66, sf);
setpixel(13, 66, sf);
setpixel(14, 66, sf);
setpixel(15, 66, sf);
setpixel(16, 66, sf);
setpixel(17, 66, sf);
setpixel(18, 66, se);
setpixel(19, 66, sf);
setpixel(10, 67, sf);
setpixel(11, 67, sf);
setpixel(12, 67, sf);
setpixel(13, 67, sf);
setpixel(14, 67, sf);
setpixel(15, 67, sf);
setpixel(16, 67, sf);
setpixel(17, 67, sf);
setpixel(18, 67, se);
setpixel(19, 67, sf);
setpixel(6, 68, se);
setpixel(7, 68, se);
setpixel(8, 68, se);
setpixel(9, 68, se);
setpixel(10, 68, se);
setpixel(11, 68, se);
setpixel(12, 68, se);
setpixel(13, 68, se);
setpixel(14, 68, se);
setpixel(15, 68, se);
setpixel(16, 68, se);
setpixel(17, 68, se);
setpixel(18, 68, se);
setpixel(19, 68, sf);
setpixel(6, 69, se);
setpixel(7, 69, se);
setpixel(8, 69, se);
setpixel(9, 69, se);
setpixel(10, 69, se);
setpixel(11, 69, se);
setpixel(12, 69, se);
setpixel(13, 69, se);
setpixel(14, 69, se);
setpixel(15, 69, se);
setpixel(16, 69, se);
setpixel(17, 69, se);
setpixel(18, 69, se);
setpixel(19, 69, sf);
setpixel(7, 70, se);
setpixel(8, 70, sf);
setpixel(9, 70, sf);
setpixel(10, 70, sf);
setpixel(11, 70, sf);
setpixel(12, 70, sf);
setpixel(13, 70, sf);
setpixel(14, 70, sf);
setpixel(15, 70, sf);
setpixel(16, 70, sf);
setpixel(17, 70, se);
setpixel(18, 70, sf);
setpixel(7, 71, se);
setpixel(8, 71, sf);
setpixel(9, 71, se);
setpixel(10, 71, sf);
setpixel(11, 71, sf);
setpixel(12, 71, sf);
setpixel(13, 71, sf);
setpixel(14, 71, sf);
setpixel(15, 71, sf);
setpixel(16, 71, sf);
setpixel(17, 71, se);
setpixel(18, 71, sf);
setpixel(7, 72, se);
setpixel(8, 72, sf);
setpixel(9, 72, se);
setpixel(10, 72, se);
setpixel(11, 72, sf);
setpixel(12, 72, sf);
setpixel(13, 72, sf);
setpixel(14, 72, sf);
setpixel(15, 72, sf);
setpixel(16, 72, sf);
setpixel(17, 72, se);
setpixel(18, 72, sf);
setpixel(7, 73, se);
setpixel(8, 73, sf);
setpixel(9, 73, sf);
setpixel(10, 73, se);
setpixel(11, 73, sf);
setpixel(12, 73, sf);
setpixel(13, 73, sf);
setpixel(14, 73, sf);
setpixel(15, 73, sf);
setpixel(16, 73, sf);
setpixel(17, 73, se);
setpixel(18, 73, sf);
setpixel(7, 74, se);
setpixel(8, 74, sf);
setpixel(9, 74, sf);
setpixel(10, 74, se);
setpixel(11, 74, sf);
setpixel(12, 74, sf);
setpixel(13, 74, sf);
setpixel(14, 74, sf);
setpixel(15, 74, sf);
setpixel(16, 74, se);
setpixel(17, 74, se);
setpixel(18, 74, se);
setpixel(19, 74, se);
setpixel(7, 75, se);
setpixel(8, 75, sf);
setpixel(9, 75, sf);
setpixel(10, 75, se);
setpixel(11, 75, se);
setpixel(12, 75, sf);
setpixel(13, 75, sf);
setpixel(14, 75, sf);
setpixel(15, 75, sf);
setpixel(16, 75, sf);
setpixel(17, 75, sf);
setpixel(18, 75, sf);
setpixel(19, 75, sf);
setpixel(20, 75, se);
setpixel(21, 75, se);
setpixel(7, 76, se);
setpixel(8, 76, sf);
setpixel(9, 76, sf);
setpixel(10, 76, sf);
setpixel(11, 76, se);
setpixel(12, 76, sf);
setpixel(13, 76, sf);
setpixel(14, 76, sf);
setpixel(15, 76, sf);
setpixel(16, 76, sf);
setpixel(17, 76, se);
setpixel(18, 76, se);
setpixel(19, 76, se);
setpixel(20, 76, sf);
setpixel(21, 76, sf);
setpixel(22, 76, se);
setpixel(23, 76, se);
setpixel(7, 77, se);
setpixel(8, 77, sf);
setpixel(9, 77, sf);
setpixel(10, 77, sf);
setpixel(11, 77, sf);
setpixel(12, 77, sf);
setpixel(13, 77, sf);
setpixel(14, 77, sf);
setpixel(15, 77, sf);
setpixel(16, 77, sf);
setpixel(17, 77, sf);
setpixel(18, 77, sf);
setpixel(19, 77, se);
setpixel(20, 77, se);
setpixel(21, 77, sf);
setpixel(22, 77, sf);
setpixel(23, 77, sf);
setpixel(24, 77, se);
setpixel(7, 78, se);
setpixel(8, 78, se);
setpixel(9, 78, se);
setpixel(10, 78, se);
setpixel(11, 78, se);
setpixel(12, 78, se);
setpixel(13, 78, se);
setpixel(14, 78, se);
setpixel(15, 78, se);
setpixel(16, 78, se);
setpixel(17, 78, se);
setpixel(18, 78, se);
setpixel(19, 78, sf);
setpixel(20, 78, sf);
setpixel(21, 78, sf);
setpixel(22, 78, sf);
setpixel(23, 78, sf);
setpixel(24, 78, se);
setpixel(7, 79, se);
setpixel(8, 79, se);
setpixel(9, 79, se);
setpixel(10, 79, se);
setpixel(11, 79, se);
setpixel(12, 79, se);
setpixel(13, 79, se);
setpixel(14, 79, se);
setpixel(15, 79, se);
setpixel(16, 79, se);
setpixel(17, 79, se);
setpixel(18, 79, se);
setpixel(19, 79, se);
setpixel(20, 79, se);
setpixel(21, 79, se);
setpixel(22, 79, se);
setpixel(23, 79, se);
setpixel(24, 79, se);


for ( int c = 0; c < 79; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}



