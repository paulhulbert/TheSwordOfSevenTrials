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
public class spearmanattack extends unit {
    
    public spearmanattack( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 100, 1, 1, "spear", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        AI ai = new constantattack();
        ai.setperson(this);
        this.setai(ai);
        
        buildvil1();
        
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(26);
        f.setlength(87);
        



Color sa = new Color(212,3,0);
Color sb = new Color(101,33,0);
Color sc = new Color(255,111,3);
Color sd = new Color(255,151,0);
Color se = new Color(230,168,96);
Color sf = new Color(45,14,0);
Color sg = new Color(255,255,255);
Color sh = new Color(0,0,0);







//<editor-fold defaultstate="collapsed" desc="build figure">

setpixel(10, 0, sa);
setpixel(11, 0, sb);
setpixel(12, 0, sa);
setpixel(13, 0, sb);
setpixel(14, 0, sa);
setpixel(15, 0, sb);
setpixel(16, 0, sa);
setpixel(17, 0, sb);
setpixel(18, 0, sa);
setpixel(8, 1, sa);
setpixel(9, 1, sb);
setpixel(10, 1, sa);
setpixel(11, 1, sb);
setpixel(12, 1, sa);
setpixel(13, 1, sb);
setpixel(14, 1, sa);
setpixel(15, 1, sb);
setpixel(16, 1, sa);
setpixel(17, 1, sb);
setpixel(18, 1, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sb);
setpixel(8, 2, sa);
setpixel(9, 2, sb);
setpixel(10, 2, sa);
setpixel(11, 2, sb);
setpixel(12, 2, sa);
setpixel(13, 2, sb);
setpixel(14, 2, sa);
setpixel(15, 2, sb);
setpixel(16, 2, sa);
setpixel(17, 2, sb);
setpixel(18, 2, sa);
setpixel(5, 3, sb);
setpixel(6, 3, sa);
setpixel(7, 3, sb);
setpixel(8, 3, sa);
setpixel(9, 3, sb);
setpixel(10, 3, sa);
setpixel(11, 3, sb);
setpixel(12, 3, sa);
setpixel(13, 3, sb);
setpixel(14, 3, sa);
setpixel(15, 3, sb);
setpixel(16, 3, sa);
setpixel(17, 3, sb);
setpixel(18, 3, sa);
setpixel(4, 4, sa);
setpixel(5, 4, sb);
setpixel(6, 4, sa);
setpixel(7, 4, sb);
setpixel(8, 4, sa);
setpixel(9, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sc);
setpixel(12, 4, sc);
setpixel(13, 4, sc);
setpixel(14, 4, sc);
setpixel(15, 4, sc);
setpixel(16, 4, sc);
setpixel(17, 4, sc);
setpixel(18, 4, sc);
setpixel(3, 5, sb);
setpixel(4, 5, sb);
setpixel(5, 5, sa);
setpixel(6, 5, sb);
setpixel(7, 5, sa);
setpixel(8, 5, sc);
setpixel(12, 5, sd);
setpixel(18, 5, sd);
setpixel(3, 6, sa);
setpixel(4, 6, sa);
setpixel(5, 6, sb);
setpixel(6, 6, sa);
setpixel(7, 6, sc);
setpixel(8, 6, sd);
setpixel(10, 6, sd);
setpixel(11, 6, sd);
setpixel(12, 6, sd);
setpixel(13, 6, sd);
setpixel(14, 6, sd);
setpixel(15, 6, sd);
setpixel(16, 6, sd);
setpixel(17, 6, sd);
setpixel(18, 6, sd);
setpixel(19, 6, sd);
setpixel(20, 6, sd);
setpixel(0, 7, sc);
setpixel(2, 7, sb);
setpixel(3, 7, sb);
setpixel(4, 7, sb);
setpixel(5, 7, sa);
setpixel(6, 7, sc);
setpixel(9, 7, sd);
setpixel(10, 7, sd);
setpixel(11, 7, sd);
setpixel(12, 7, sd);
setpixel(13, 7, sd);
setpixel(14, 7, sd);
setpixel(15, 7, sd);
setpixel(16, 7, sd);
setpixel(17, 7, sd);
setpixel(18, 7, sd);
setpixel(19, 7, sd);
setpixel(20, 7, sd);
setpixel(21, 7, sd);
setpixel(2, 8, sa);
setpixel(3, 8, sa);
setpixel(4, 8, sa);
setpixel(5, 8, sc);
setpixel(6, 8, sd);
setpixel(8, 8, sd);
setpixel(9, 8, sd);
setpixel(10, 8, sd);
setpixel(11, 8, sd);
setpixel(12, 8, sd);
setpixel(13, 8, sd);
setpixel(14, 8, sd);
setpixel(15, 8, sd);
setpixel(16, 8, sd);
setpixel(17, 8, sd);
setpixel(18, 8, sc);
setpixel(19, 8, sc);
setpixel(20, 8, sc);
setpixel(21, 8, sd);
setpixel(22, 8, sd);
setpixel(2, 9, sb);
setpixel(3, 9, sb);
setpixel(4, 9, sb);
setpixel(5, 9, sc);
setpixel(7, 9, sd);
setpixel(8, 9, sd);
setpixel(9, 9, sd);
setpixel(10, 9, sd);
setpixel(11, 9, sd);
setpixel(12, 9, sd);
setpixel(13, 9, sd);
setpixel(14, 9, sd);
setpixel(15, 9, sd);
setpixel(16, 9, sd);
setpixel(17, 9, sc);
setpixel(18, 9, se);
setpixel(19, 9, se);
setpixel(20, 9, se);
setpixel(21, 9, sc);
setpixel(22, 9, sd);
setpixel(2, 10, sa);
setpixel(3, 10, sa);
setpixel(4, 10, sa);
setpixel(5, 10, sc);
setpixel(7, 10, sd);
setpixel(8, 10, sd);
setpixel(9, 10, sd);
setpixel(10, 10, sd);
setpixel(11, 10, sd);
setpixel(12, 10, sd);
setpixel(13, 10, sd);
setpixel(14, 10, sd);
setpixel(15, 10, sd);
setpixel(16, 10, sc);
setpixel(17, 10, sf);
setpixel(18, 10, sf);
setpixel(19, 10, sf);
setpixel(20, 10, se);
setpixel(21, 10, sc);
setpixel(22, 10, sd);
setpixel(2, 11, sb);
setpixel(3, 11, sb);
setpixel(4, 11, sb);
setpixel(5, 11, sc);
setpixel(7, 11, sd);
setpixel(8, 11, sd);
setpixel(9, 11, sd);
setpixel(10, 11, sd);
setpixel(11, 11, sd);
setpixel(12, 11, sd);
setpixel(13, 11, sd);
setpixel(14, 11, sd);
setpixel(15, 11, sd);
setpixel(16, 11, sc);
setpixel(17, 11, se);
setpixel(18, 11, sg);
setpixel(19, 11, sh);
setpixel(20, 11, se);
setpixel(21, 11, sc);
setpixel(22, 11, sd);
setpixel(7, 12, sd);
setpixel(8, 12, sd);
setpixel(9, 12, sd);
setpixel(10, 12, sd);
setpixel(11, 12, sd);
setpixel(12, 12, sd);
setpixel(13, 12, sd);
setpixel(14, 12, sd);
setpixel(15, 12, sd);
setpixel(16, 12, sc);
setpixel(17, 12, se);
setpixel(18, 12, sh);
setpixel(19, 12, sh);
setpixel(20, 12, se);
setpixel(21, 12, sc);
setpixel(22, 12, sd);
setpixel(7, 13, sd);
setpixel(8, 13, sd);
setpixel(9, 13, sd);
setpixel(10, 13, sd);
setpixel(11, 13, sd);
setpixel(12, 13, sd);
setpixel(13, 13, sd);
setpixel(14, 13, sd);
setpixel(15, 13, sd);
setpixel(16, 13, sc);
setpixel(17, 13, se);
setpixel(18, 13, se);
setpixel(19, 13, se);
setpixel(20, 13, se);
setpixel(21, 13, sc);
setpixel(22, 13, sd);
setpixel(7, 14, sd);
setpixel(8, 14, sd);
setpixel(9, 14, sd);
setpixel(10, 14, sd);
setpixel(11, 14, sd);
setpixel(12, 14, sd);
setpixel(13, 14, sd);
setpixel(14, 14, sd);
setpixel(15, 14, sd);
setpixel(16, 14, sc);
setpixel(17, 14, se);
setpixel(18, 14, se);
setpixel(19, 14, se);
setpixel(20, 14, se);
setpixel(21, 14, sc);
setpixel(22, 14, sc);
setpixel(7, 15, sd);
setpixel(8, 15, sd);
setpixel(9, 15, sd);
setpixel(10, 15, sd);
setpixel(11, 15, sd);
setpixel(12, 15, sd);
setpixel(13, 15, sd);
setpixel(14, 15, sd);
setpixel(15, 15, sd);
setpixel(16, 15, sc);
setpixel(17, 15, se);
setpixel(18, 15, se);
setpixel(19, 15, se);
setpixel(20, 15, se);
setpixel(21, 15, se);
setpixel(7, 16, sd);
setpixel(8, 16, sd);
setpixel(9, 16, sd);
setpixel(10, 16, sd);
setpixel(11, 16, sd);
setpixel(12, 16, sd);
setpixel(13, 16, sd);
setpixel(14, 16, sd);
setpixel(15, 16, sd);
setpixel(16, 16, sc);
setpixel(17, 16, se);
setpixel(18, 16, se);
setpixel(19, 16, sa);
setpixel(20, 16, sa);
setpixel(21, 16, sa);
setpixel(7, 17, sd);
setpixel(8, 17, sd);
setpixel(9, 17, sd);
setpixel(10, 17, sd);
setpixel(11, 17, sd);
setpixel(12, 17, sd);
setpixel(13, 17, sd);
setpixel(14, 17, sd);
setpixel(15, 17, sd);
setpixel(16, 17, sc);
setpixel(17, 17, se);
setpixel(18, 17, se);
setpixel(19, 17, se);
setpixel(20, 17, se);
setpixel(21, 17, se);
setpixel(7, 18, sd);
setpixel(8, 18, sd);
setpixel(9, 18, sd);
setpixel(10, 18, sd);
setpixel(11, 18, sd);
setpixel(12, 18, sd);
setpixel(13, 18, sd);
setpixel(14, 18, sd);
setpixel(15, 18, sd);
setpixel(16, 18, sc);
setpixel(17, 18, se);
setpixel(18, 18, se);
setpixel(19, 18, se);
setpixel(20, 18, se);
setpixel(21, 18, se);
setpixel(7, 19, sd);
setpixel(8, 19, sd);
setpixel(9, 19, sd);
setpixel(10, 19, sd);
setpixel(11, 19, sd);
setpixel(12, 19, sd);
setpixel(13, 19, sd);
setpixel(14, 19, sd);
setpixel(15, 19, sd);
setpixel(16, 19, sc);
setpixel(17, 19, se);
setpixel(18, 19, se);
setpixel(19, 19, se);
setpixel(20, 19, se);
setpixel(21, 19, se);
setpixel(7, 20, sc);
setpixel(8, 20, sc);
setpixel(9, 20, sc);
setpixel(10, 20, sc);
setpixel(11, 20, sc);
setpixel(12, 20, sc);
setpixel(13, 20, sc);
setpixel(14, 20, sc);
setpixel(15, 20, sc);
setpixel(16, 20, sc);
setpixel(17, 20, se);
setpixel(18, 20, se);
setpixel(10, 21, se);
setpixel(11, 21, se);
setpixel(12, 21, se);
setpixel(13, 21, se);
setpixel(14, 21, se);
setpixel(15, 21, se);
setpixel(16, 21, se);
setpixel(17, 21, se);
setpixel(18, 21, se);
setpixel(19, 21, se);
setpixel(9, 22, sc);
setpixel(10, 22, sc);
setpixel(11, 22, sc);
setpixel(12, 22, sc);
setpixel(13, 22, sc);
setpixel(14, 22, sc);
setpixel(15, 22, sc);
setpixel(16, 22, sc);
setpixel(17, 22, sc);
setpixel(18, 22, sc);
setpixel(19, 22, sc);
setpixel(20, 22, sc);
setpixel(7, 23, sb);
setpixel(8, 23, sb);
setpixel(9, 23, sb);
setpixel(10, 23, sb);
setpixel(11, 23, sc);
setpixel(12, 23, sc);
setpixel(13, 23, sc);
setpixel(14, 23, sd);
setpixel(15, 23, sd);
setpixel(16, 23, sd);
setpixel(17, 23, sd);
setpixel(18, 23, sd);
setpixel(19, 23, sc);
setpixel(20, 23, sd);
setpixel(21, 23, sd);
setpixel(6, 24, sb);
setpixel(7, 24, sb);
setpixel(8, 24, sb);
setpixel(9, 24, sa);
setpixel(10, 24, sa);
setpixel(11, 24, sa);
setpixel(12, 24, sa);
setpixel(13, 24, sa);
setpixel(14, 24, sc);
setpixel(15, 24, sc);
setpixel(16, 24, sd);
setpixel(17, 24, sd);
setpixel(18, 24, sd);
setpixel(19, 24, sc);
setpixel(20, 24, sd);
setpixel(21, 24, sd);
setpixel(6, 25, sb);
setpixel(7, 25, sb);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sa);
setpixel(11, 25, sa);
setpixel(12, 25, sa);
setpixel(13, 25, sa);
setpixel(14, 25, sa);
setpixel(15, 25, sa);
setpixel(16, 25, sc);
setpixel(17, 25, sd);
setpixel(18, 25, sd);
setpixel(19, 25, sd);
setpixel(20, 25, sc);
setpixel(21, 25, sd);
setpixel(22, 25, sd);
setpixel(5, 26, sb);
setpixel(6, 26, sb);
setpixel(7, 26, sa);
setpixel(8, 26, sa);
setpixel(9, 26, sa);
setpixel(10, 26, sa);
setpixel(11, 26, sa);
setpixel(12, 26, sa);
setpixel(13, 26, sa);
setpixel(14, 26, sa);
setpixel(15, 26, sa);
setpixel(16, 26, sc);
setpixel(17, 26, sd);
setpixel(18, 26, sd);
setpixel(19, 26, sd);
setpixel(20, 26, sc);
setpixel(21, 26, sd);
setpixel(22, 26, sd);
setpixel(5, 27, sb);
setpixel(6, 27, sb);
setpixel(7, 27, sa);
setpixel(8, 27, sa);
setpixel(9, 27, sa);
setpixel(10, 27, sa);
setpixel(11, 27, sa);
setpixel(12, 27, sa);
setpixel(13, 27, sa);
setpixel(14, 27, sa);
setpixel(15, 27, sa);
setpixel(16, 27, sa);
setpixel(17, 27, sc);
setpixel(18, 27, sd);
setpixel(19, 27, sd);
setpixel(20, 27, sc);
setpixel(21, 27, sd);
setpixel(22, 27, sd);
setpixel(5, 28, sb);
setpixel(6, 28, sb);
setpixel(7, 28, sa);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(10, 28, sa);
setpixel(11, 28, sa);
setpixel(12, 28, sa);
setpixel(13, 28, sa);
setpixel(14, 28, sa);
setpixel(15, 28, sa);
setpixel(16, 28, sa);
setpixel(17, 28, sc);
setpixel(18, 28, sd);
setpixel(19, 28, sd);
setpixel(20, 28, sc);
setpixel(21, 28, sd);
setpixel(22, 28, sd);
setpixel(5, 29, sb);
setpixel(6, 29, sb);
setpixel(7, 29, sa);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(10, 29, sa);
setpixel(11, 29, sa);
setpixel(12, 29, sa);
setpixel(13, 29, sa);
setpixel(14, 29, sa);
setpixel(15, 29, sa);
setpixel(16, 29, sa);
setpixel(17, 29, sc);
setpixel(18, 29, sd);
setpixel(19, 29, sd);
setpixel(20, 29, sc);
setpixel(21, 29, sd);
setpixel(22, 29, sd);
setpixel(5, 30, sb);
setpixel(6, 30, sb);
setpixel(7, 30, sa);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(10, 30, sa);
setpixel(11, 30, sa);
setpixel(12, 30, sa);
setpixel(13, 30, sa);
setpixel(14, 30, sa);
setpixel(15, 30, sa);
setpixel(16, 30, sa);
setpixel(17, 30, sc);
setpixel(18, 30, sd);
setpixel(19, 30, sd);
setpixel(20, 30, sc);
setpixel(21, 30, sd);
setpixel(22, 30, sd);
setpixel(5, 31, sb);
setpixel(6, 31, sb);
setpixel(7, 31, sa);
setpixel(8, 31, sa);
setpixel(9, 31, sa);
setpixel(10, 31, sa);
setpixel(11, 31, sa);
setpixel(12, 31, sa);
setpixel(13, 31, sa);
setpixel(14, 31, sa);
setpixel(15, 31, sa);
setpixel(16, 31, sa);
setpixel(17, 31, sc);
setpixel(18, 31, sd);
setpixel(19, 31, sd);
setpixel(20, 31, sc);
setpixel(21, 31, sd);
setpixel(22, 31, sd);
setpixel(5, 32, sb);
setpixel(6, 32, sb);
setpixel(7, 32, sa);
setpixel(8, 32, sa);
setpixel(9, 32, sa);
setpixel(10, 32, sa);
setpixel(11, 32, sa);
setpixel(12, 32, sa);
setpixel(13, 32, sa);
setpixel(14, 32, sa);
setpixel(15, 32, sa);
setpixel(16, 32, sa);
setpixel(17, 32, sc);
setpixel(18, 32, sd);
setpixel(19, 32, sd);
setpixel(20, 32, sc);
setpixel(21, 32, sc);
setpixel(22, 32, sc);
setpixel(5, 33, sb);
setpixel(6, 33, sb);
setpixel(7, 33, sa);
setpixel(8, 33, sa);
setpixel(9, 33, sa);
setpixel(10, 33, sa);
setpixel(11, 33, sa);
setpixel(12, 33, sa);
setpixel(13, 33, sa);
setpixel(14, 33, sa);
setpixel(15, 33, sa);
setpixel(16, 33, sa);
setpixel(17, 33, sc);
setpixel(18, 33, sc);
setpixel(19, 33, sc);
setpixel(20, 33, sc);
setpixel(21, 33, sd);
setpixel(22, 33, sd);
setpixel(5, 34, sb);
setpixel(6, 34, sb);
setpixel(7, 34, sa);
setpixel(8, 34, sa);
setpixel(9, 34, sa);
setpixel(10, 34, sa);
setpixel(11, 34, sa);
setpixel(12, 34, sa);
setpixel(13, 34, sa);
setpixel(14, 34, sa);
setpixel(15, 34, sa);
setpixel(16, 34, sc);
setpixel(17, 34, sd);
setpixel(18, 34, sd);
setpixel(19, 34, sd);
setpixel(20, 34, sc);
setpixel(21, 34, sd);
setpixel(22, 34, sd);
setpixel(5, 35, sb);
setpixel(6, 35, sb);
setpixel(7, 35, sa);
setpixel(8, 35, sa);
setpixel(9, 35, sa);
setpixel(10, 35, sa);
setpixel(11, 35, sa);
setpixel(12, 35, sa);
setpixel(13, 35, sa);
setpixel(14, 35, sa);
setpixel(15, 35, sa);
setpixel(16, 35, sc);
setpixel(17, 35, sd);
setpixel(18, 35, sd);
setpixel(19, 35, sd);
setpixel(20, 35, sc);
setpixel(21, 35, sd);
setpixel(22, 35, sd);
setpixel(5, 36, sb);
setpixel(6, 36, sb);
setpixel(7, 36, sa);
setpixel(8, 36, sa);
setpixel(9, 36, sa);
setpixel(10, 36, sa);
setpixel(11, 36, sa);
setpixel(12, 36, sa);
setpixel(13, 36, sa);
setpixel(14, 36, sa);
setpixel(15, 36, sa);
setpixel(16, 36, sd);
setpixel(17, 36, sd);
setpixel(18, 36, sd);
setpixel(19, 36, sd);
setpixel(20, 36, sc);
setpixel(21, 36, sd);
setpixel(22, 36, sd);
setpixel(6, 37, sb);
setpixel(7, 37, sb);
setpixel(8, 37, sa);
setpixel(9, 37, sa);
setpixel(10, 37, sa);
setpixel(11, 37, sa);
setpixel(12, 37, sa);
setpixel(13, 37, sa);
setpixel(14, 37, sc);
setpixel(15, 37, sc);
setpixel(16, 37, sc);
setpixel(17, 37, sc);
setpixel(18, 37, sc);
setpixel(19, 37, sc);
setpixel(20, 37, sc);
setpixel(21, 37, sc);
setpixel(22, 37, sc);
setpixel(23, 37, sc);
setpixel(24, 37, sc);
setpixel(25, 37, sc);
setpixel(6, 38, sc);
setpixel(7, 38, sc);
setpixel(8, 38, sa);
setpixel(9, 38, sa);
setpixel(10, 38, sa);
setpixel(11, 38, sa);
setpixel(12, 38, sc);
setpixel(13, 38, sc);
setpixel(14, 38, sd);
setpixel(15, 38, sd);
setpixel(16, 38, sd);
setpixel(17, 38, sd);
setpixel(18, 38, sd);
setpixel(19, 38, sd);
setpixel(20, 38, sd);
setpixel(21, 38, sd);
setpixel(22, 38, sd);
setpixel(23, 38, sd);
setpixel(24, 38, sd);
setpixel(25, 38, sc);
setpixel(6, 39, sc);
setpixel(7, 39, sd);
setpixel(8, 39, sa);
setpixel(9, 39, sa);
setpixel(10, 39, sc);
setpixel(11, 39, sc);
setpixel(12, 39, sd);
setpixel(13, 39, sd);
setpixel(14, 39, sd);
setpixel(15, 39, sd);
setpixel(16, 39, sd);
setpixel(17, 39, sd);
setpixel(18, 39, sd);
setpixel(19, 39, sd);
setpixel(20, 39, sd);
setpixel(21, 39, sd);
setpixel(22, 39, sd);
setpixel(23, 39, sd);
setpixel(24, 39, sd);
setpixel(25, 39, sc);
setpixel(6, 40, sc);
setpixel(7, 40, sd);
setpixel(8, 40, sc);
setpixel(9, 40, sc);
setpixel(10, 40, sc);
setpixel(11, 40, sc);
setpixel(12, 40, sc);
setpixel(13, 40, sc);
setpixel(14, 40, sc);
setpixel(15, 40, sc);
setpixel(16, 40, sc);
setpixel(17, 40, sc);
setpixel(18, 40, sc);
setpixel(19, 40, sc);
setpixel(20, 40, sc);
setpixel(21, 40, sc);
setpixel(22, 40, sc);
setpixel(23, 40, sc);
setpixel(24, 40, sc);
setpixel(25, 40, sc);
setpixel(6, 41, sc);
setpixel(7, 41, sd);
setpixel(8, 41, sc);
setpixel(9, 41, sd);
setpixel(10, 41, sd);
setpixel(11, 41, sd);
setpixel(12, 41, sd);
setpixel(13, 41, sd);
setpixel(14, 41, sd);
setpixel(15, 41, sd);
setpixel(16, 41, sd);
setpixel(17, 41, sd);
setpixel(18, 41, sd);
setpixel(19, 41, sd);
setpixel(20, 41, sd);
setpixel(21, 41, sd);
setpixel(22, 41, sd);
setpixel(23, 41, sd);
setpixel(24, 41, sd);
setpixel(25, 41, sc);
setpixel(6, 42, sc);
setpixel(7, 42, sd);
setpixel(8, 42, sd);
setpixel(9, 42, sc);
setpixel(10, 42, sc);
setpixel(11, 42, sd);
setpixel(12, 42, sd);
setpixel(13, 42, sd);
setpixel(14, 42, sd);
setpixel(15, 42, sd);
setpixel(16, 42, sd);
setpixel(17, 42, sd);
setpixel(18, 42, sd);
setpixel(19, 42, sd);
setpixel(20, 42, sd);
setpixel(21, 42, sd);
setpixel(22, 42, sd);
setpixel(23, 42, sd);
setpixel(24, 42, sd);
setpixel(25, 42, sc);
setpixel(6, 43, sc);
setpixel(7, 43, sd);
setpixel(8, 43, sd);
setpixel(9, 43, sd);
setpixel(10, 43, sd);
setpixel(11, 43, sc);
setpixel(12, 43, sc);
setpixel(13, 43, sc);
setpixel(14, 43, sc);
setpixel(15, 43, sc);
setpixel(16, 43, sc);
setpixel(17, 43, sd);
setpixel(18, 43, sd);
setpixel(19, 43, sd);
setpixel(20, 43, sd);
setpixel(21, 43, sd);
setpixel(22, 43, sd);
setpixel(23, 43, sd);
setpixel(24, 43, sd);
setpixel(25, 43, sc);
setpixel(6, 44, sc);
setpixel(7, 44, sd);
setpixel(8, 44, sd);
setpixel(9, 44, sd);
setpixel(10, 44, sd);
setpixel(11, 44, sd);
setpixel(12, 44, sd);
setpixel(13, 44, sd);
setpixel(14, 44, sd);
setpixel(15, 44, sd);
setpixel(16, 44, sc);
setpixel(17, 44, sc);
setpixel(18, 44, sc);
setpixel(19, 44, sc);
setpixel(20, 44, sc);
setpixel(21, 44, sc);
setpixel(22, 44, sc);
setpixel(23, 44, sc);
setpixel(24, 44, sc);
setpixel(25, 44, sc);
setpixel(6, 45, sc);
setpixel(7, 45, sc);
setpixel(8, 45, sc);
setpixel(9, 45, sc);
setpixel(10, 45, sc);
setpixel(11, 45, sc);
setpixel(12, 45, sc);
setpixel(13, 45, sc);
setpixel(14, 45, sc);
setpixel(15, 45, sc);
setpixel(16, 45, sc);
setpixel(17, 45, sc);
setpixel(18, 45, sc);
setpixel(19, 45, sc);
setpixel(6, 46, sf);
setpixel(7, 46, sf);
setpixel(8, 46, sf);
setpixel(9, 46, sf);
setpixel(10, 46, sf);
setpixel(11, 46, sf);
setpixel(12, 46, sf);
setpixel(13, 46, sf);
setpixel(14, 46, sf);
setpixel(15, 46, sf);
setpixel(16, 46, sf);
setpixel(17, 46, sf);
setpixel(18, 46, sf);
setpixel(6, 47, sf);
setpixel(7, 47, sf);
setpixel(8, 47, sf);
setpixel(9, 47, sf);
setpixel(10, 47, sf);
setpixel(11, 47, sf);
setpixel(12, 47, sf);
setpixel(13, 47, sf);
setpixel(14, 47, sf);
setpixel(15, 47, sf);
setpixel(16, 47, sf);
setpixel(17, 47, sf);
setpixel(18, 47, sf);
setpixel(6, 48, sf);
setpixel(7, 48, sf);
setpixel(8, 48, sf);
setpixel(9, 48, sf);
setpixel(10, 48, sf);
setpixel(11, 48, sf);
setpixel(12, 48, sf);
setpixel(13, 48, sf);
setpixel(14, 48, sf);
setpixel(15, 48, sf);
setpixel(16, 48, sf);
setpixel(17, 48, sf);
setpixel(18, 48, sf);
setpixel(6, 49, sf);
setpixel(7, 49, sb);
setpixel(8, 49, sb);
setpixel(9, 49, sb);
setpixel(10, 49, sb);
setpixel(11, 49, sf);
setpixel(12, 49, sf);
setpixel(13, 49, sb);
setpixel(14, 49, sb);
setpixel(15, 49, sf);
setpixel(16, 49, sb);
setpixel(17, 49, sb);
setpixel(18, 49, sf);
setpixel(6, 50, sf);
setpixel(7, 50, sb);
setpixel(8, 50, sb);
setpixel(9, 50, sb);
setpixel(10, 50, sb);
setpixel(11, 50, sf);
setpixel(12, 50, sf);
setpixel(13, 50, sb);
setpixel(14, 50, sb);
setpixel(15, 50, sf);
setpixel(16, 50, sb);
setpixel(17, 50, sb);
setpixel(18, 50, sb);
setpixel(19, 50, sf);
setpixel(6, 51, sf);
setpixel(7, 51, sb);
setpixel(8, 51, sb);
setpixel(9, 51, sb);
setpixel(10, 51, sf);
setpixel(11, 51, sb);
setpixel(12, 51, sf);
setpixel(13, 51, sb);
setpixel(14, 51, sb);
setpixel(15, 51, sf);
setpixel(16, 51, sb);
setpixel(17, 51, sb);
setpixel(18, 51, sb);
setpixel(19, 51, sf);
setpixel(5, 52, sf);
setpixel(6, 52, sb);
setpixel(7, 52, sb);
setpixel(8, 52, sb);
setpixel(9, 52, sb);
setpixel(10, 52, sf);
setpixel(11, 52, sb);
setpixel(12, 52, sf);
setpixel(13, 52, sb);
setpixel(14, 52, sb);
setpixel(15, 52, sf);
setpixel(16, 52, sb);
setpixel(17, 52, sb);
setpixel(18, 52, sb);
setpixel(19, 52, sf);
setpixel(5, 53, sf);
setpixel(6, 53, sb);
setpixel(7, 53, sb);
setpixel(8, 53, sb);
setpixel(9, 53, sb);
setpixel(10, 53, sf);
setpixel(11, 53, sb);
setpixel(12, 53, sf);
setpixel(13, 53, sb);
setpixel(14, 53, sb);
setpixel(15, 53, sf);
setpixel(16, 53, sb);
setpixel(17, 53, sb);
setpixel(18, 53, sb);
setpixel(19, 53, sf);
setpixel(5, 54, sf);
setpixel(6, 54, sb);
setpixel(7, 54, sb);
setpixel(8, 54, sb);
setpixel(9, 54, sf);
setpixel(10, 54, sb);
setpixel(11, 54, sb);
setpixel(12, 54, sf);
setpixel(13, 54, sb);
setpixel(14, 54, sb);
setpixel(15, 54, sb);
setpixel(16, 54, sf);
setpixel(17, 54, sb);
setpixel(18, 54, sb);
setpixel(19, 54, sf);
setpixel(5, 55, sf);
setpixel(6, 55, sb);
setpixel(7, 55, sb);
setpixel(8, 55, sb);
setpixel(9, 55, sf);
setpixel(10, 55, sb);
setpixel(11, 55, sb);
setpixel(12, 55, sf);
setpixel(13, 55, sb);
setpixel(14, 55, sb);
setpixel(15, 55, sb);
setpixel(16, 55, sf);
setpixel(17, 55, sb);
setpixel(18, 55, sb);
setpixel(19, 55, sf);
setpixel(5, 56, sf);
setpixel(6, 56, sb);
setpixel(7, 56, sb);
setpixel(8, 56, sb);
setpixel(9, 56, sf);
setpixel(10, 56, sb);
setpixel(11, 56, sb);
setpixel(12, 56, sf);
setpixel(13, 56, sb);
setpixel(14, 56, sb);
setpixel(15, 56, sb);
setpixel(16, 56, sf);
setpixel(17, 56, sb);
setpixel(18, 56, sb);
setpixel(19, 56, sf);
setpixel(4, 57, sf);
setpixel(5, 57, sb);
setpixel(6, 57, sb);
setpixel(7, 57, sb);
setpixel(8, 57, sb);
setpixel(9, 57, sf);
setpixel(10, 57, sb);
setpixel(11, 57, sb);
setpixel(12, 57, sf);
setpixel(13, 57, sb);
setpixel(14, 57, sb);
setpixel(15, 57, sb);
setpixel(16, 57, sf);
setpixel(17, 57, sb);
setpixel(18, 57, sb);
setpixel(19, 57, sf);
setpixel(4, 58, sf);
setpixel(5, 58, sb);
setpixel(6, 58, sb);
setpixel(7, 58, sb);
setpixel(8, 58, sf);
setpixel(9, 58, sb);
setpixel(10, 58, sb);
setpixel(11, 58, sb);
setpixel(12, 58, sf);
setpixel(13, 58, sb);
setpixel(14, 58, sb);
setpixel(15, 58, sb);
setpixel(16, 58, sf);
setpixel(17, 58, sb);
setpixel(18, 58, sb);
setpixel(19, 58, sf);
setpixel(3, 59, sf);
setpixel(4, 59, sb);
setpixel(5, 59, sb);
setpixel(6, 59, sb);
setpixel(7, 59, sb);
setpixel(8, 59, sf);
setpixel(9, 59, sb);
setpixel(10, 59, sb);
setpixel(11, 59, sb);
setpixel(12, 59, sf);
setpixel(13, 59, sb);
setpixel(14, 59, sb);
setpixel(15, 59, sb);
setpixel(16, 59, sf);
setpixel(17, 59, sb);
setpixel(18, 59, sb);
setpixel(19, 59, sb);
setpixel(20, 59, sf);
setpixel(3, 60, sf);
setpixel(4, 60, sb);
setpixel(5, 60, sb);
setpixel(6, 60, sb);
setpixel(7, 60, sb);
setpixel(8, 60, sf);
setpixel(9, 60, sb);
setpixel(10, 60, sb);
setpixel(11, 60, sb);
setpixel(12, 60, sf);
setpixel(13, 60, sb);
setpixel(14, 60, sb);
setpixel(15, 60, sb);
setpixel(16, 60, sf);
setpixel(17, 60, sb);
setpixel(18, 60, sb);
setpixel(19, 60, sb);
setpixel(20, 60, sb);
setpixel(21, 60, sf);
setpixel(3, 61, sf);
setpixel(4, 61, sb);
setpixel(5, 61, sb);
setpixel(6, 61, sb);
setpixel(7, 61, sb);
setpixel(8, 61, sf);
setpixel(9, 61, sb);
setpixel(10, 61, sb);
setpixel(11, 61, sb);
setpixel(12, 61, sf);
setpixel(13, 61, sb);
setpixel(14, 61, sb);
setpixel(15, 61, sb);
setpixel(16, 61, sf);
setpixel(17, 61, sb);
setpixel(18, 61, sb);
setpixel(19, 61, sb);
setpixel(20, 61, sb);
setpixel(21, 61, sf);
setpixel(4, 62, sf);
setpixel(5, 62, sb);
setpixel(6, 62, sb);
setpixel(7, 62, sf);
setpixel(8, 62, sb);
setpixel(9, 62, sb);
setpixel(10, 62, sb);
setpixel(11, 62, sb);
setpixel(12, 62, sf);
setpixel(13, 62, sb);
setpixel(14, 62, sb);
setpixel(15, 62, sb);
setpixel(16, 62, sb);
setpixel(17, 62, sf);
setpixel(18, 62, sb);
setpixel(19, 62, sb);
setpixel(20, 62, sb);
setpixel(21, 62, sf);
setpixel(4, 63, sf);
setpixel(5, 63, sf);
setpixel(6, 63, sf);
setpixel(7, 63, sf);
setpixel(8, 63, sb);
setpixel(9, 63, sb);
setpixel(10, 63, sb);
setpixel(11, 63, sb);
setpixel(12, 63, sf);
setpixel(13, 63, sb);
setpixel(14, 63, sb);
setpixel(15, 63, sb);
setpixel(16, 63, sb);
setpixel(17, 63, sf);
setpixel(18, 63, sf);
setpixel(19, 63, sf);
setpixel(20, 63, sb);
setpixel(21, 63, sf);
setpixel(8, 64, sf);
setpixel(9, 64, sb);
setpixel(10, 64, sb);
setpixel(11, 64, sf);
setpixel(12, 64, sb);
setpixel(13, 64, sf);
setpixel(14, 64, sb);
setpixel(15, 64, sb);
setpixel(16, 64, sf);
setpixel(17, 64, sb);
setpixel(18, 64, sf);
setpixel(19, 64, sb);
setpixel(20, 64, sf);
setpixel(8, 65, sb);
setpixel(9, 65, sf);
setpixel(10, 65, sf);
setpixel(11, 65, sb);
setpixel(12, 65, sb);
setpixel(13, 65, sb);
setpixel(14, 65, sf);
setpixel(15, 65, sf);
setpixel(16, 65, sb);
setpixel(17, 65, sb);
setpixel(18, 65, sf);
setpixel(19, 65, sb);
setpixel(8, 66, sb);
setpixel(9, 66, sb);
setpixel(10, 66, sb);
setpixel(11, 66, sb);
setpixel(12, 66, sb);
setpixel(13, 66, sb);
setpixel(14, 66, sb);
setpixel(15, 66, sb);
setpixel(16, 66, sb);
setpixel(17, 66, sb);
setpixel(18, 66, sf);
setpixel(19, 66, sb);
setpixel(8, 67, sb);
setpixel(9, 67, sb);
setpixel(10, 67, sb);
setpixel(11, 67, sb);
setpixel(12, 67, sb);
setpixel(13, 67, sb);
setpixel(14, 67, sb);
setpixel(15, 67, sb);
setpixel(16, 67, sb);
setpixel(17, 67, sb);
setpixel(18, 67, sf);
setpixel(19, 67, sb);
setpixel(8, 68, sb);
setpixel(9, 68, sb);
setpixel(10, 68, sb);
setpixel(11, 68, sb);
setpixel(12, 68, sb);
setpixel(13, 68, sb);
setpixel(14, 68, sb);
setpixel(15, 68, sb);
setpixel(16, 68, sb);
setpixel(17, 68, sb);
setpixel(18, 68, sf);
setpixel(19, 68, sb);
setpixel(8, 69, sb);
setpixel(9, 69, sb);
setpixel(10, 69, sb);
setpixel(11, 69, sb);
setpixel(12, 69, sb);
setpixel(13, 69, sb);
setpixel(14, 69, sb);
setpixel(15, 69, sb);
setpixel(16, 69, sb);
setpixel(17, 69, sb);
setpixel(18, 69, sf);
setpixel(19, 69, sb);
setpixel(8, 70, sb);
setpixel(9, 70, sb);
setpixel(10, 70, sb);
setpixel(11, 70, sb);
setpixel(12, 70, sb);
setpixel(13, 70, sb);
setpixel(14, 70, sb);
setpixel(15, 70, sb);
setpixel(16, 70, sb);
setpixel(17, 70, sb);
setpixel(18, 70, sf);
setpixel(19, 70, sb);
setpixel(8, 71, sb);
setpixel(9, 71, sb);
setpixel(10, 71, sb);
setpixel(11, 71, sb);
setpixel(12, 71, sb);
setpixel(13, 71, sb);
setpixel(14, 71, sb);
setpixel(15, 71, sb);
setpixel(16, 71, sb);
setpixel(17, 71, sb);
setpixel(18, 71, sf);
setpixel(19, 71, sb);
setpixel(8, 72, sb);
setpixel(9, 72, sb);
setpixel(10, 72, sb);
setpixel(11, 72, sb);
setpixel(12, 72, sb);
setpixel(13, 72, sb);
setpixel(14, 72, sb);
setpixel(15, 72, sb);
setpixel(16, 72, sb);
setpixel(17, 72, sb);
setpixel(18, 72, sf);
setpixel(19, 72, sb);
setpixel(8, 73, sb);
setpixel(9, 73, sb);
setpixel(10, 73, sb);
setpixel(11, 73, sb);
setpixel(12, 73, sb);
setpixel(13, 73, sb);
setpixel(14, 73, sb);
setpixel(15, 73, sb);
setpixel(16, 73, sb);
setpixel(17, 73, sb);
setpixel(18, 73, sf);
setpixel(19, 73, sb);
setpixel(7, 74, sd);
setpixel(8, 74, sd);
setpixel(9, 74, sd);
setpixel(10, 74, sd);
setpixel(11, 74, sd);
setpixel(12, 74, sd);
setpixel(13, 74, sd);
setpixel(14, 74, sd);
setpixel(15, 74, sd);
setpixel(16, 74, sd);
setpixel(17, 74, sd);
setpixel(18, 74, sc);
setpixel(19, 74, sd);
setpixel(7, 75, sd);
setpixel(8, 75, sd);
setpixel(9, 75, sd);
setpixel(10, 75, sd);
setpixel(11, 75, sd);
setpixel(12, 75, sd);
setpixel(13, 75, sd);
setpixel(14, 75, sd);
setpixel(15, 75, sd);
setpixel(16, 75, sd);
setpixel(17, 75, sd);
setpixel(18, 75, sc);
setpixel(19, 75, sd);
setpixel(8, 76, sc);
setpixel(9, 76, sc);
setpixel(10, 76, sc);
setpixel(11, 76, sc);
setpixel(12, 76, sc);
setpixel(13, 76, sc);
setpixel(14, 76, sc);
setpixel(15, 76, sc);
setpixel(16, 76, sc);
setpixel(17, 76, sc);
setpixel(18, 76, sc);
setpixel(19, 76, sd);
setpixel(8, 77, sd);
setpixel(9, 77, sd);
setpixel(10, 77, sd);
setpixel(11, 77, sd);
setpixel(12, 77, sd);
setpixel(13, 77, sd);
setpixel(14, 77, sd);
setpixel(15, 77, sd);
setpixel(16, 77, sd);
setpixel(17, 77, sd);
setpixel(18, 77, sc);
setpixel(19, 77, sd);
setpixel(8, 78, sd);
setpixel(9, 78, sd);
setpixel(10, 78, sd);
setpixel(11, 78, sd);
setpixel(12, 78, sd);
setpixel(13, 78, sd);
setpixel(14, 78, sd);
setpixel(15, 78, sd);
setpixel(16, 78, sd);
setpixel(17, 78, sd);
setpixel(18, 78, sc);
setpixel(19, 78, sd);
setpixel(8, 79, sd);
setpixel(9, 79, sd);
setpixel(10, 79, sd);
setpixel(11, 79, sd);
setpixel(12, 79, sd);
setpixel(13, 79, sd);
setpixel(14, 79, sd);
setpixel(15, 79, sd);
setpixel(16, 79, sd);
setpixel(17, 79, sd);
setpixel(18, 79, sc);
setpixel(19, 79, sd);
setpixel(8, 80, sd);
setpixel(9, 80, sd);
setpixel(10, 80, sd);
setpixel(11, 80, sd);
setpixel(12, 80, sd);
setpixel(13, 80, sd);
setpixel(14, 80, sd);
setpixel(15, 80, sd);
setpixel(16, 80, sd);
setpixel(17, 80, sd);
setpixel(18, 80, sc);
setpixel(19, 80, sd);
setpixel(8, 81, sd);
setpixel(9, 81, sd);
setpixel(10, 81, sd);
setpixel(11, 81, sd);
setpixel(12, 81, sd);
setpixel(13, 81, sd);
setpixel(14, 81, sd);
setpixel(15, 81, sd);
setpixel(16, 81, sd);
setpixel(17, 81, sc);
setpixel(18, 81, sd);
setpixel(8, 82, sd);
setpixel(9, 82, sd);
setpixel(10, 82, sd);
setpixel(11, 82, sd);
setpixel(12, 82, sd);
setpixel(13, 82, sd);
setpixel(14, 82, sd);
setpixel(15, 82, sd);
setpixel(16, 82, sd);
setpixel(17, 82, sc);
setpixel(18, 82, sc);
setpixel(8, 83, sd);
setpixel(9, 83, sd);
setpixel(10, 83, sd);
setpixel(11, 83, sd);
setpixel(12, 83, sd);
setpixel(13, 83, sd);
setpixel(14, 83, sd);
setpixel(15, 83, sd);
setpixel(16, 83, sc);
setpixel(17, 83, sc);
setpixel(18, 83, sc);
setpixel(19, 83, sc);
setpixel(20, 83, sc);
setpixel(21, 83, sc);
setpixel(22, 83, sc);
setpixel(23, 83, sc);
setpixel(8, 84, sd);
setpixel(9, 84, sd);
setpixel(10, 84, sd);
setpixel(11, 84, sd);
setpixel(12, 84, sd);
setpixel(13, 84, sd);
setpixel(14, 84, sd);
setpixel(15, 84, sc);
setpixel(16, 84, sc);
setpixel(17, 84, sd);
setpixel(18, 84, sd);
setpixel(19, 84, sc);
setpixel(20, 84, sc);
setpixel(21, 84, sc);
setpixel(22, 84, sd);
setpixel(23, 84, sc);
setpixel(24, 84, sc);
setpixel(8, 85, sd);
setpixel(9, 85, sd);
setpixel(10, 85, sd);
setpixel(11, 85, sd);
setpixel(12, 85, sd);
setpixel(13, 85, sd);
setpixel(14, 85, sc);
setpixel(15, 85, sd);
setpixel(16, 85, sd);
setpixel(17, 85, sd);
setpixel(18, 85, sd);
setpixel(19, 85, sc);
setpixel(20, 85, sd);
setpixel(21, 85, sd);
setpixel(22, 85, sd);
setpixel(23, 85, sc);
setpixel(24, 85, sd);
setpixel(25, 85, sc);
setpixel(8, 86, sd);
setpixel(9, 86, sd);
setpixel(10, 86, sd);
setpixel(11, 86, sd);
setpixel(12, 86, sd);
setpixel(13, 86, sd);
setpixel(14, 86, sc);
setpixel(15, 86, sd);
setpixel(16, 86, sd);
setpixel(17, 86, sd);
setpixel(18, 86, sd);
setpixel(19, 86, sc);
setpixel(20, 86, sd);
setpixel(21, 86, sd);
setpixel(22, 86, sd);
setpixel(23, 86, sc);
setpixel(24, 86, sd);
setpixel(25, 86, sd);
setpixel(26, 86, sc);
setpixel(8, 87, sd);
setpixel(9, 87, sd);
setpixel(10, 87, sd);
setpixel(11, 87, sd);
setpixel(12, 87, sd);
setpixel(13, 87, sd);
setpixel(14, 87, sc);
setpixel(15, 87, sd);
setpixel(16, 87, sd);
setpixel(17, 87, sd);
setpixel(18, 87, sd);
setpixel(19, 87, sc);
setpixel(20, 87, sd);
setpixel(21, 87, sd);
setpixel(22, 87, sd);
setpixel(23, 87, sc);
setpixel(24, 87, sd);
setpixel(25, 87, sd);
setpixel(26, 87, sc);


for ( int c = 0; c < 87; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}

