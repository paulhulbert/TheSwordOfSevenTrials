/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class archer extends unit {
    
    public archer( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 100, 1, 1, "bow", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        AI ai = new constantattack();
        ai.setperson(this);
        this.setai(ai);
        
        buildvil1();
        
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(25);
        f.setlength(83);
        



Color sa = new Color(51,51,0);
Color sb = new Color(255,204,102);
Color sc = new Color(79,51,0);
Color sd = new Color(255,0,0);
Color se = new Color(30,90,8);
Color sf = new Color(131,115,35);
Color sg = new Color(0,0,0);






//<editor-fold defaultstate="collapsed" desc="build figure">




f.setpixel(7, 0, sa);
f.setpixel(8, 0, sa);
f.setpixel(9, 0, sa);
f.setpixel(10, 0, sa);
f.setpixel(11, 0, sa);
f.setpixel(12, 0, sa);
f.setpixel(13, 0, sa);
f.setpixel(14, 0, sa);
f.setpixel(15, 0, sa);
f.setpixel(5, 1, sa);
f.setpixel(6, 1, sa);
f.setpixel(7, 1, sa);
f.setpixel(8, 1, sa);
f.setpixel(9, 1, sa);
f.setpixel(10, 1, sa);
f.setpixel(11, 1, sa);
f.setpixel(12, 1, sa);
f.setpixel(13, 1, sa);
f.setpixel(14, 1, sa);
f.setpixel(15, 1, sa);
f.setpixel(16, 1, sa);
f.setpixel(4, 2, sa);
f.setpixel(5, 2, sa);
f.setpixel(6, 2, sa);
f.setpixel(7, 2, sa);
f.setpixel(8, 2, sa);
f.setpixel(9, 2, sa);
f.setpixel(10, 2, sa);
f.setpixel(11, 2, sa);
f.setpixel(12, 2, sa);
f.setpixel(13, 2, sa);
f.setpixel(14, 2, sa);
f.setpixel(15, 2, sa);
f.setpixel(16, 2, sa);
f.setpixel(4, 3, sa);
f.setpixel(5, 3, sa);
f.setpixel(6, 3, sa);
f.setpixel(7, 3, sa);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sa);
f.setpixel(10, 3, sa);
f.setpixel(11, 3, sa);
f.setpixel(12, 3, sa);
f.setpixel(13, 3, sb);
f.setpixel(14, 3, sb);
f.setpixel(15, 3, sb);
f.setpixel(16, 3, sb);
f.setpixel(4, 4, sa);
f.setpixel(5, 4, sa);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sa);
f.setpixel(8, 4, sa);
f.setpixel(9, 4, sa);
f.setpixel(10, 4, sa);
f.setpixel(11, 4, sa);
f.setpixel(12, 4, sb);
f.setpixel(13, 4, sb);
f.setpixel(14, 4, sc);
f.setpixel(15, 4, sc);
f.setpixel(16, 4, sb);
f.setpixel(17, 4, sb);
f.setpixel(3, 5, sa);
f.setpixel(4, 5, sa);
f.setpixel(5, 5, sa);
f.setpixel(6, 5, sa);
f.setpixel(7, 5, sa);
f.setpixel(8, 5, sa);
f.setpixel(9, 5, sa);
f.setpixel(10, 5, sa);
f.setpixel(11, 5, sb);
f.setpixel(12, 5, sb);
f.setpixel(13, 5, sb);
f.setpixel(14, 5, sc);
f.setpixel(15, 5, sc);
f.setpixel(16, 5, sb);
f.setpixel(17, 5, sb);
f.setpixel(18, 5, sb);
f.setpixel(3, 6, sa);
f.setpixel(4, 6, sa);
f.setpixel(5, 6, sa);
f.setpixel(6, 6, sa);
f.setpixel(7, 6, sa);
f.setpixel(8, 6, sa);
f.setpixel(9, 6, sa);
f.setpixel(10, 6, sb);
f.setpixel(11, 6, sb);
f.setpixel(12, 6, sb);
f.setpixel(13, 6, sb);
f.setpixel(14, 6, sb);
f.setpixel(15, 6, sb);
f.setpixel(16, 6, sb);
f.setpixel(17, 6, sb);
f.setpixel(18, 6, sb);
f.setpixel(3, 7, sa);
f.setpixel(4, 7, sa);
f.setpixel(5, 7, sa);
f.setpixel(6, 7, sa);
f.setpixel(7, 7, sa);
f.setpixel(8, 7, sa);
f.setpixel(9, 7, sa);
f.setpixel(10, 7, sb);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sb);
f.setpixel(13, 7, sb);
f.setpixel(14, 7, sb);
f.setpixel(15, 7, sb);
f.setpixel(16, 7, sb);
f.setpixel(17, 7, sb);
f.setpixel(18, 7, sb);
f.setpixel(19, 7, sb);
f.setpixel(3, 8, sa);
f.setpixel(4, 8, sa);
f.setpixel(5, 8, sa);
f.setpixel(6, 8, sa);
f.setpixel(7, 8, sa);
f.setpixel(8, 8, sa);
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
f.setpixel(3, 9, sa);
f.setpixel(4, 9, sa);
f.setpixel(5, 9, sa);
f.setpixel(6, 9, sa);
f.setpixel(7, 9, sa);
f.setpixel(8, 9, sa);
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
f.setpixel(3, 10, sa);
f.setpixel(4, 10, sa);
f.setpixel(5, 10, sa);
f.setpixel(6, 10, sa);
f.setpixel(7, 10, sa);
f.setpixel(8, 10, sb);
f.setpixel(9, 10, sb);
f.setpixel(10, 10, sb);
f.setpixel(11, 10, sa);
f.setpixel(12, 10, sa);
f.setpixel(13, 10, sa);
f.setpixel(14, 10, sa);
f.setpixel(15, 10, sa);
f.setpixel(16, 10, sa);
f.setpixel(17, 10, sa);
f.setpixel(18, 10, sa);
f.setpixel(3, 11, sa);
f.setpixel(4, 11, sa);
f.setpixel(5, 11, sa);
f.setpixel(6, 11, sa);
f.setpixel(7, 11, sa);
f.setpixel(8, 11, sa);
f.setpixel(9, 11, sa);
f.setpixel(10, 11, sa);
f.setpixel(11, 11, sa);
f.setpixel(12, 11, sa);
f.setpixel(13, 11, sa);
f.setpixel(14, 11, sa);
f.setpixel(15, 11, sa);
f.setpixel(16, 11, sa);
f.setpixel(17, 11, sa);
f.setpixel(3, 12, sa);
f.setpixel(4, 12, sa);
f.setpixel(5, 12, sa);
f.setpixel(6, 12, sa);
f.setpixel(7, 12, sa);
f.setpixel(8, 12, sa);
f.setpixel(9, 12, sa);
f.setpixel(10, 12, sa);
f.setpixel(11, 12, sa);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, sb);
f.setpixel(14, 12, sb);
f.setpixel(15, 12, sb);
f.setpixel(16, 12, sb);
f.setpixel(2, 13, sa);
f.setpixel(3, 13, sa);
f.setpixel(4, 13, sa);
f.setpixel(5, 13, sa);
f.setpixel(6, 13, sa);
f.setpixel(7, 13, sb);
f.setpixel(8, 13, sb);
f.setpixel(9, 13, sa);
f.setpixel(10, 13, sa);
f.setpixel(11, 13, sa);
f.setpixel(12, 13, sa);
f.setpixel(13, 13, sa);
f.setpixel(14, 13, sd);
f.setpixel(15, 13, sd);
f.setpixel(16, 13, sd);
f.setpixel(2, 14, sa);
f.setpixel(3, 14, sa);
f.setpixel(4, 14, sa);
f.setpixel(5, 14, sa);
f.setpixel(6, 14, sb);
f.setpixel(7, 14, sb);
f.setpixel(8, 14, sb);
f.setpixel(9, 14, sb);
f.setpixel(10, 14, sa);
f.setpixel(11, 14, sa);
f.setpixel(12, 14, sa);
f.setpixel(13, 14, sa);
f.setpixel(14, 14, sa);
f.setpixel(15, 14, sa);
f.setpixel(1, 15, sa);
f.setpixel(2, 15, sa);
f.setpixel(3, 15, sa);
f.setpixel(4, 15, sa);
f.setpixel(5, 15, sa);
f.setpixel(6, 15, sb);
f.setpixel(7, 15, sb);
f.setpixel(8, 15, sb);
f.setpixel(9, 15, sb);
f.setpixel(10, 15, sb);
f.setpixel(11, 15, sa);
f.setpixel(12, 15, sa);
f.setpixel(13, 15, sa);
f.setpixel(14, 15, sa);
f.setpixel(1, 16, sa);
f.setpixel(2, 16, sa);
f.setpixel(3, 16, sa);
f.setpixel(4, 16, sa);
f.setpixel(5, 16, sa);
f.setpixel(6, 16, sb);
f.setpixel(7, 16, sb);
f.setpixel(8, 16, sb);
f.setpixel(9, 16, sb);
f.setpixel(10, 16, sb);
f.setpixel(11, 16, sb);
f.setpixel(12, 16, sb);
f.setpixel(13, 16, sa);
f.setpixel(14, 16, sa);
f.setpixel(2, 17, sa);
f.setpixel(3, 17, sa);
f.setpixel(4, 17, sa);
f.setpixel(6, 17, sb);
f.setpixel(7, 17, sb);
f.setpixel(8, 17, sb);
f.setpixel(9, 17, sb);
f.setpixel(10, 17, sb);
f.setpixel(11, 17, sb);
f.setpixel(12, 17, sb);
f.setpixel(13, 17, sb);
f.setpixel(4, 18, se);
f.setpixel(5, 18, se);
f.setpixel(6, 18, se);
f.setpixel(7, 18, se);
f.setpixel(8, 18, se);
f.setpixel(9, 18, se);
f.setpixel(10, 18, se);
f.setpixel(11, 18, se);
f.setpixel(12, 18, se);
f.setpixel(13, 18, se);
f.setpixel(14, 18, se);
f.setpixel(15, 18, se);
f.setpixel(3, 19, se);
f.setpixel(4, 19, se);
f.setpixel(5, 19, se);
f.setpixel(6, 19, se);
f.setpixel(7, 19, se);
f.setpixel(8, 19, se);
f.setpixel(9, 19, se);
f.setpixel(10, 19, se);
f.setpixel(11, 19, se);
f.setpixel(12, 19, se);
f.setpixel(13, 19, se);
f.setpixel(14, 19, se);
f.setpixel(15, 19, se);
f.setpixel(16, 19, se);
f.setpixel(2, 20, se);
f.setpixel(3, 20, se);
f.setpixel(4, 20, se);
f.setpixel(5, 20, se);
f.setpixel(6, 20, se);
f.setpixel(7, 20, se);
f.setpixel(8, 20, se);
f.setpixel(9, 20, se);
f.setpixel(10, 20, se);
f.setpixel(11, 20, se);
f.setpixel(12, 20, se);
f.setpixel(13, 20, se);
f.setpixel(14, 20, se);
f.setpixel(15, 20, se);
f.setpixel(16, 20, se);
f.setpixel(17, 20, se);
f.setpixel(2, 21, se);
f.setpixel(3, 21, se);
f.setpixel(4, 21, se);
f.setpixel(5, 21, se);
f.setpixel(6, 21, se);
f.setpixel(7, 21, sf);
f.setpixel(8, 21, sf);
f.setpixel(9, 21, sf);
f.setpixel(10, 21, sf);
f.setpixel(11, 21, sf);
f.setpixel(12, 21, sf);
f.setpixel(13, 21, se);
f.setpixel(14, 21, se);
f.setpixel(15, 21, se);
f.setpixel(16, 21, se);
f.setpixel(17, 21, se);
f.setpixel(18, 21, se);
f.setpixel(2, 22, se);
f.setpixel(3, 22, se);
f.setpixel(4, 22, se);
f.setpixel(5, 22, se);
f.setpixel(6, 22, sf);
f.setpixel(7, 22, sf);
f.setpixel(8, 22, sf);
f.setpixel(9, 22, sf);
f.setpixel(10, 22, sf);
f.setpixel(11, 22, sf);
f.setpixel(12, 22, sf);
f.setpixel(13, 22, sf);
f.setpixel(14, 22, se);
f.setpixel(15, 22, se);
f.setpixel(16, 22, se);
f.setpixel(17, 22, se);
f.setpixel(18, 22, se);
f.setpixel(2, 23, se);
f.setpixel(3, 23, se);
f.setpixel(4, 23, se);
f.setpixel(5, 23, se);
f.setpixel(6, 23, sf);
f.setpixel(7, 23, sf);
f.setpixel(8, 23, sf);
f.setpixel(9, 23, sf);
f.setpixel(10, 23, sf);
f.setpixel(11, 23, sf);
f.setpixel(12, 23, sf);
f.setpixel(13, 23, sf);
f.setpixel(14, 23, se);
f.setpixel(15, 23, se);
f.setpixel(16, 23, se);
f.setpixel(17, 23, se);
f.setpixel(18, 23, se);
f.setpixel(2, 24, se);
f.setpixel(3, 24, se);
f.setpixel(4, 24, se);
f.setpixel(5, 24, se);
f.setpixel(6, 24, sf);
f.setpixel(7, 24, sf);
f.setpixel(8, 24, sf);
f.setpixel(9, 24, sf);
f.setpixel(10, 24, sf);
f.setpixel(11, 24, sf);
f.setpixel(12, 24, sf);
f.setpixel(13, 24, sf);
f.setpixel(14, 24, sf);
f.setpixel(15, 24, se);
f.setpixel(16, 24, se);
f.setpixel(17, 24, se);
f.setpixel(18, 24, se);
f.setpixel(19, 24, se);
f.setpixel(2, 25, se);
f.setpixel(3, 25, se);
f.setpixel(4, 25, se);
f.setpixel(5, 25, se);
f.setpixel(6, 25, sf);
f.setpixel(7, 25, sf);
f.setpixel(8, 25, sf);
f.setpixel(9, 25, sf);
f.setpixel(10, 25, sf);
f.setpixel(11, 25, sf);
f.setpixel(12, 25, sf);
f.setpixel(13, 25, sf);
f.setpixel(14, 25, sf);
f.setpixel(15, 25, se);
f.setpixel(16, 25, se);
f.setpixel(17, 25, se);
f.setpixel(18, 25, se);
f.setpixel(19, 25, se);
f.setpixel(2, 26, se);
f.setpixel(3, 26, se);
f.setpixel(4, 26, se);
f.setpixel(5, 26, se);
f.setpixel(6, 26, sf);
f.setpixel(7, 26, sf);
f.setpixel(8, 26, sf);
f.setpixel(9, 26, sf);
f.setpixel(10, 26, sf);
f.setpixel(11, 26, sf);
f.setpixel(12, 26, sf);
f.setpixel(13, 26, sf);
f.setpixel(14, 26, sf);
f.setpixel(15, 26, sf);
f.setpixel(16, 26, se);
f.setpixel(17, 26, se);
f.setpixel(18, 26, se);
f.setpixel(19, 26, se);
f.setpixel(2, 27, se);
f.setpixel(3, 27, se);
f.setpixel(4, 27, se);
f.setpixel(5, 27, se);
f.setpixel(6, 27, se);
f.setpixel(7, 27, sf);
f.setpixel(8, 27, sf);
f.setpixel(9, 27, sf);
f.setpixel(10, 27, sf);
f.setpixel(11, 27, sf);
f.setpixel(12, 27, sf);
f.setpixel(13, 27, sf);
f.setpixel(14, 27, sf);
f.setpixel(15, 27, sf);
f.setpixel(16, 27, sf);
f.setpixel(17, 27, sf);
f.setpixel(18, 27, se);
f.setpixel(19, 27, se);
f.setpixel(2, 28, se);
f.setpixel(3, 28, se);
f.setpixel(4, 28, se);
f.setpixel(5, 28, se);
f.setpixel(6, 28, se);
f.setpixel(7, 28, se);
f.setpixel(8, 28, sf);
f.setpixel(9, 28, sf);
f.setpixel(10, 28, sf);
f.setpixel(11, 28, sf);
f.setpixel(12, 28, sf);
f.setpixel(13, 28, sf);
f.setpixel(14, 28, sf);
f.setpixel(15, 28, sf);
f.setpixel(16, 28, sf);
f.setpixel(17, 28, sf);
f.setpixel(18, 28, sf);
f.setpixel(19, 28, se);
f.setpixel(3, 29, se);
f.setpixel(4, 29, se);
f.setpixel(5, 29, se);
f.setpixel(6, 29, se);
f.setpixel(7, 29, se);
f.setpixel(8, 29, sf);
f.setpixel(9, 29, sf);
f.setpixel(10, 29, sf);
f.setpixel(11, 29, sf);
f.setpixel(12, 29, sf);
f.setpixel(13, 29, sf);
f.setpixel(14, 29, sf);
f.setpixel(15, 29, sf);
f.setpixel(16, 29, sf);
f.setpixel(17, 29, sf);
f.setpixel(18, 29, sf);
f.setpixel(19, 29, sf);
f.setpixel(3, 30, se);
f.setpixel(4, 30, se);
f.setpixel(5, 30, se);
f.setpixel(6, 30, se);
f.setpixel(7, 30, se);
f.setpixel(8, 30, se);
f.setpixel(9, 30, sf);
f.setpixel(10, 30, sf);
f.setpixel(11, 30, sf);
f.setpixel(12, 30, sf);
f.setpixel(13, 30, sf);
f.setpixel(14, 30, sf);
f.setpixel(15, 30, sf);
f.setpixel(16, 30, sf);
f.setpixel(17, 30, sf);
f.setpixel(18, 30, sf);
f.setpixel(19, 30, sf);
f.setpixel(20, 30, sf);
f.setpixel(21, 30, sf);
f.setpixel(3, 31, se);
f.setpixel(4, 31, se);
f.setpixel(5, 31, se);
f.setpixel(6, 31, se);
f.setpixel(7, 31, se);
f.setpixel(8, 31, se);
f.setpixel(9, 31, se);
f.setpixel(10, 31, se);
f.setpixel(11, 31, sf);
f.setpixel(12, 31, sf);
f.setpixel(13, 31, sf);
f.setpixel(14, 31, sf);
f.setpixel(15, 31, sf);
f.setpixel(16, 31, sf);
f.setpixel(17, 31, sf);
f.setpixel(18, 31, sf);
f.setpixel(19, 31, sf);
f.setpixel(20, 31, sf);
f.setpixel(21, 31, sf);
f.setpixel(22, 31, sf);
f.setpixel(23, 31, sf);
f.setpixel(3, 32, se);
f.setpixel(4, 32, se);
f.setpixel(5, 32, se);
f.setpixel(6, 32, se);
f.setpixel(7, 32, se);
f.setpixel(8, 32, se);
f.setpixel(9, 32, se);
f.setpixel(10, 32, se);
f.setpixel(11, 32, se);
f.setpixel(12, 32, sf);
f.setpixel(13, 32, sf);
f.setpixel(14, 32, sf);
f.setpixel(15, 32, sf);
f.setpixel(16, 32, sf);
f.setpixel(17, 32, sf);
f.setpixel(18, 32, sf);
f.setpixel(19, 32, sf);
f.setpixel(20, 32, sf);
f.setpixel(21, 32, sf);
f.setpixel(22, 32, sf);
f.setpixel(23, 32, sf);
f.setpixel(24, 32, sf);
f.setpixel(25, 32, sf);
f.setpixel(3, 33, se);
f.setpixel(4, 33, se);
f.setpixel(5, 33, se);
f.setpixel(6, 33, se);
f.setpixel(7, 33, se);
f.setpixel(8, 33, se);
f.setpixel(9, 33, se);
f.setpixel(10, 33, se);
f.setpixel(11, 33, se);
f.setpixel(12, 33, sf);
f.setpixel(13, 33, sf);
f.setpixel(14, 33, sf);
f.setpixel(15, 33, sf);
f.setpixel(16, 33, sf);
f.setpixel(17, 33, sf);
f.setpixel(18, 33, sf);
f.setpixel(19, 33, sf);
f.setpixel(20, 33, sf);
f.setpixel(21, 33, sf);
f.setpixel(22, 33, sf);
f.setpixel(23, 33, sf);
f.setpixel(24, 33, sf);
f.setpixel(25, 33, sf);
f.setpixel(3, 34, se);
f.setpixel(4, 34, se);
f.setpixel(5, 34, se);
f.setpixel(6, 34, se);
f.setpixel(7, 34, se);
f.setpixel(8, 34, se);
f.setpixel(9, 34, se);
f.setpixel(10, 34, se);
f.setpixel(11, 34, se);
f.setpixel(12, 34, se);
f.setpixel(13, 34, se);
f.setpixel(14, 34, sf);
f.setpixel(15, 34, sf);
f.setpixel(16, 34, sf);
f.setpixel(17, 34, sf);
f.setpixel(18, 34, sf);
f.setpixel(19, 34, sf);
f.setpixel(20, 34, sf);
f.setpixel(21, 34, sf);
f.setpixel(22, 34, sf);
f.setpixel(23, 34, sf);
f.setpixel(24, 34, sf);
f.setpixel(25, 34, sf);
f.setpixel(3, 35, se);
f.setpixel(4, 35, se);
f.setpixel(5, 35, se);
f.setpixel(6, 35, se);
f.setpixel(7, 35, se);
f.setpixel(8, 35, se);
f.setpixel(9, 35, se);
f.setpixel(10, 35, se);
f.setpixel(11, 35, se);
f.setpixel(12, 35, se);
f.setpixel(13, 35, se);
f.setpixel(14, 35, se);
f.setpixel(15, 35, sf);
f.setpixel(16, 35, sf);
f.setpixel(17, 35, sf);
f.setpixel(18, 35, sf);
f.setpixel(19, 35, sf);
f.setpixel(20, 35, sf);
f.setpixel(21, 35, sf);
f.setpixel(22, 35, sf);
f.setpixel(23, 35, sf);
f.setpixel(24, 35, sf);
f.setpixel(25, 35, sf);
f.setpixel(3, 36, se);
f.setpixel(4, 36, se);
f.setpixel(5, 36, se);
f.setpixel(6, 36, se);
f.setpixel(7, 36, se);
f.setpixel(8, 36, se);
f.setpixel(9, 36, se);
f.setpixel(10, 36, se);
f.setpixel(11, 36, se);
f.setpixel(12, 36, se);
f.setpixel(13, 36, se);
f.setpixel(14, 36, se);
f.setpixel(15, 36, se);
f.setpixel(16, 36, sf);
f.setpixel(17, 36, sf);
f.setpixel(18, 36, sf);
f.setpixel(19, 36, sf);
f.setpixel(20, 36, sf);
f.setpixel(21, 36, sf);
f.setpixel(22, 36, sf);
f.setpixel(23, 36, sf);
f.setpixel(24, 36, sf);
f.setpixel(25, 36, sf);
f.setpixel(4, 37, se);
f.setpixel(5, 37, se);
f.setpixel(6, 37, se);
f.setpixel(7, 37, se);
f.setpixel(8, 37, se);
f.setpixel(9, 37, se);
f.setpixel(10, 37, se);
f.setpixel(11, 37, se);
f.setpixel(12, 37, se);
f.setpixel(13, 37, se);
f.setpixel(14, 37, se);
f.setpixel(15, 37, se);
f.setpixel(16, 37, se);
f.setpixel(17, 37, sf);
f.setpixel(18, 37, sf);
f.setpixel(19, 37, sf);
f.setpixel(20, 37, sf);
f.setpixel(21, 37, sf);
f.setpixel(22, 37, sf);
f.setpixel(23, 37, sf);
f.setpixel(24, 37, sf);
f.setpixel(4, 38, se);
f.setpixel(5, 38, se);
f.setpixel(6, 38, se);
f.setpixel(7, 38, se);
f.setpixel(8, 38, se);
f.setpixel(9, 38, se);
f.setpixel(10, 38, se);
f.setpixel(11, 38, se);
f.setpixel(12, 38, se);
f.setpixel(13, 38, se);
f.setpixel(14, 38, se);
f.setpixel(15, 38, se);
f.setpixel(16, 38, se);
f.setpixel(18, 38, sf);
f.setpixel(19, 38, sf);
f.setpixel(20, 38, sf);
f.setpixel(21, 38, sf);
f.setpixel(22, 38, sf);
f.setpixel(23, 38, sf);
f.setpixel(24, 38, sf);
f.setpixel(4, 39, se);
f.setpixel(5, 39, se);
f.setpixel(6, 39, se);
f.setpixel(7, 39, se);
f.setpixel(8, 39, se);
f.setpixel(9, 39, se);
f.setpixel(10, 39, se);
f.setpixel(11, 39, se);
f.setpixel(12, 39, se);
f.setpixel(13, 39, se);
f.setpixel(14, 39, se);
f.setpixel(15, 39, se);
f.setpixel(16, 39, se);
f.setpixel(20, 39, sf);
f.setpixel(21, 39, sf);
f.setpixel(22, 39, sf);
f.setpixel(23, 39, sf);
f.setpixel(24, 39, sf);
f.setpixel(4, 40, sc);
f.setpixel(5, 40, sc);
f.setpixel(6, 40, sc);
f.setpixel(7, 40, sc);
f.setpixel(8, 40, sc);
f.setpixel(9, 40, sc);
f.setpixel(10, 40, sc);
f.setpixel(11, 40, sc);
f.setpixel(12, 40, sc);
f.setpixel(13, 40, sc);
f.setpixel(14, 40, sc);
f.setpixel(15, 40, sc);
f.setpixel(16, 40, sc);
f.setpixel(21, 40, sf);
f.setpixel(22, 40, sf);
f.setpixel(23, 40, sf);
f.setpixel(4, 41, sc);
f.setpixel(5, 41, sc);
f.setpixel(6, 41, sc);
f.setpixel(7, 41, sc);
f.setpixel(8, 41, sc);
f.setpixel(9, 41, sc);
f.setpixel(10, 41, sc);
f.setpixel(11, 41, sc);
f.setpixel(12, 41, sc);
f.setpixel(13, 41, sc);
f.setpixel(14, 41, sc);
f.setpixel(15, 41, sc);
f.setpixel(16, 41, sc);
f.setpixel(4, 42, sc);
f.setpixel(5, 42, sc);
f.setpixel(6, 42, sc);
f.setpixel(7, 42, sc);
f.setpixel(8, 42, sc);
f.setpixel(9, 42, sc);
f.setpixel(10, 42, sc);
f.setpixel(11, 42, sc);
f.setpixel(12, 42, sc);
f.setpixel(13, 42, sc);
f.setpixel(14, 42, sc);
f.setpixel(15, 42, sc);
f.setpixel(16, 42, sc);
f.setpixel(3, 43, se);
f.setpixel(4, 43, se);
f.setpixel(5, 43, se);
f.setpixel(6, 43, se);
f.setpixel(7, 43, se);
f.setpixel(8, 43, se);
f.setpixel(9, 43, se);
f.setpixel(10, 43, se);
f.setpixel(11, 43, se);
f.setpixel(12, 43, se);
f.setpixel(13, 43, se);
f.setpixel(14, 43, se);
f.setpixel(15, 43, se);
f.setpixel(16, 43, se);
f.setpixel(17, 43, se);
f.setpixel(3, 44, se);
f.setpixel(4, 44, se);
f.setpixel(5, 44, se);
f.setpixel(6, 44, se);
f.setpixel(7, 44, se);
f.setpixel(8, 44, se);
f.setpixel(9, 44, se);
f.setpixel(10, 44, se);
f.setpixel(11, 44, se);
f.setpixel(12, 44, se);
f.setpixel(13, 44, se);
f.setpixel(14, 44, se);
f.setpixel(15, 44, se);
f.setpixel(16, 44, se);
f.setpixel(17, 44, se);
f.setpixel(3, 45, se);
f.setpixel(4, 45, se);
f.setpixel(5, 45, se);
f.setpixel(6, 45, se);
f.setpixel(7, 45, se);
f.setpixel(8, 45, se);
f.setpixel(9, 45, se);
f.setpixel(10, 45, se);
f.setpixel(11, 45, se);
f.setpixel(12, 45, se);
f.setpixel(13, 45, se);
f.setpixel(14, 45, se);
f.setpixel(15, 45, se);
f.setpixel(16, 45, se);
f.setpixel(17, 45, se);
f.setpixel(2, 46, se);
f.setpixel(3, 46, se);
f.setpixel(4, 46, se);
f.setpixel(5, 46, se);
f.setpixel(6, 46, se);
f.setpixel(7, 46, se);
f.setpixel(8, 46, se);
f.setpixel(9, 46, se);
f.setpixel(10, 46, se);
f.setpixel(11, 46, se);
f.setpixel(12, 46, se);
f.setpixel(13, 46, se);
f.setpixel(14, 46, se);
f.setpixel(15, 46, se);
f.setpixel(16, 46, se);
f.setpixel(17, 46, se);
f.setpixel(2, 47, se);
f.setpixel(3, 47, se);
f.setpixel(4, 47, se);
f.setpixel(5, 47, se);
f.setpixel(6, 47, se);
f.setpixel(7, 47, se);
f.setpixel(8, 47, se);
f.setpixel(9, 47, se);
f.setpixel(10, 47, se);
f.setpixel(11, 47, se);
f.setpixel(12, 47, se);
f.setpixel(13, 47, se);
f.setpixel(14, 47, se);
f.setpixel(15, 47, se);
f.setpixel(16, 47, se);
f.setpixel(17, 47, se);
f.setpixel(18, 47, se);
f.setpixel(2, 48, se);
f.setpixel(3, 48, se);
f.setpixel(4, 48, se);
f.setpixel(5, 48, se);
f.setpixel(6, 48, se);
f.setpixel(7, 48, se);
f.setpixel(8, 48, se);
f.setpixel(9, 48, se);
f.setpixel(10, 48, se);
f.setpixel(11, 48, se);
f.setpixel(12, 48, se);
f.setpixel(13, 48, se);
f.setpixel(14, 48, se);
f.setpixel(15, 48, se);
f.setpixel(16, 48, se);
f.setpixel(17, 48, se);
f.setpixel(18, 48, se);
f.setpixel(2, 49, se);
f.setpixel(3, 49, se);
f.setpixel(4, 49, se);
f.setpixel(5, 49, se);
f.setpixel(6, 49, se);
f.setpixel(7, 49, se);
f.setpixel(8, 49, se);
f.setpixel(9, 49, se);
f.setpixel(10, 49, se);
f.setpixel(11, 49, se);
f.setpixel(12, 49, se);
f.setpixel(13, 49, se);
f.setpixel(14, 49, se);
f.setpixel(15, 49, se);
f.setpixel(16, 49, se);
f.setpixel(17, 49, se);
f.setpixel(18, 49, se);
f.setpixel(2, 50, se);
f.setpixel(3, 50, se);
f.setpixel(4, 50, se);
f.setpixel(5, 50, se);
f.setpixel(6, 50, se);
f.setpixel(7, 50, se);
f.setpixel(8, 50, se);
f.setpixel(9, 50, se);
f.setpixel(10, 50, se);
f.setpixel(11, 50, se);
f.setpixel(12, 50, se);
f.setpixel(13, 50, se);
f.setpixel(14, 50, se);
f.setpixel(15, 50, se);
f.setpixel(16, 50, se);
f.setpixel(17, 50, se);
f.setpixel(18, 50, se);
f.setpixel(1, 51, se);
f.setpixel(2, 51, se);
f.setpixel(3, 51, se);
f.setpixel(4, 51, se);
f.setpixel(5, 51, se);
f.setpixel(6, 51, se);
f.setpixel(7, 51, se);
f.setpixel(8, 51, se);
f.setpixel(9, 51, se);
f.setpixel(10, 51, se);
f.setpixel(11, 51, se);
f.setpixel(12, 51, se);
f.setpixel(13, 51, se);
f.setpixel(14, 51, se);
f.setpixel(15, 51, se);
f.setpixel(16, 51, se);
f.setpixel(17, 51, se);
f.setpixel(18, 51, se);
f.setpixel(1, 52, se);
f.setpixel(2, 52, se);
f.setpixel(3, 52, se);
f.setpixel(4, 52, se);
f.setpixel(5, 52, se);
f.setpixel(6, 52, se);
f.setpixel(7, 52, se);
f.setpixel(8, 52, se);
f.setpixel(9, 52, se);
f.setpixel(10, 52, se);
f.setpixel(11, 52, se);
f.setpixel(12, 52, se);
f.setpixel(13, 52, se);
f.setpixel(14, 52, se);
f.setpixel(15, 52, se);
f.setpixel(16, 52, se);
f.setpixel(17, 52, se);
f.setpixel(18, 52, se);
f.setpixel(1, 53, se);
f.setpixel(2, 53, se);
f.setpixel(3, 53, se);
f.setpixel(4, 53, se);
f.setpixel(5, 53, se);
f.setpixel(6, 53, se);
f.setpixel(7, 53, se);
f.setpixel(8, 53, se);
f.setpixel(9, 53, se);
f.setpixel(10, 53, se);
f.setpixel(11, 53, se);
f.setpixel(12, 53, se);
f.setpixel(13, 53, se);
f.setpixel(14, 53, se);
f.setpixel(15, 53, se);
f.setpixel(16, 53, se);
f.setpixel(17, 53, se);
f.setpixel(18, 53, se);
f.setpixel(19, 53, se);
f.setpixel(1, 54, se);
f.setpixel(2, 54, se);
f.setpixel(3, 54, se);
f.setpixel(4, 54, se);
f.setpixel(5, 54, se);
f.setpixel(6, 54, se);
f.setpixel(7, 54, se);
f.setpixel(8, 54, se);
f.setpixel(9, 54, se);
f.setpixel(10, 54, se);
f.setpixel(11, 54, se);
f.setpixel(12, 54, se);
f.setpixel(13, 54, se);
f.setpixel(14, 54, se);
f.setpixel(15, 54, se);
f.setpixel(16, 54, se);
f.setpixel(17, 54, se);
f.setpixel(18, 54, se);
f.setpixel(19, 54, se);
f.setpixel(0, 55, se);
f.setpixel(1, 55, se);
f.setpixel(2, 55, se);
f.setpixel(3, 55, se);
f.setpixel(4, 55, se);
f.setpixel(5, 55, se);
f.setpixel(6, 55, se);
f.setpixel(7, 55, se);
f.setpixel(8, 55, se);
f.setpixel(9, 55, se);
f.setpixel(10, 55, se);
f.setpixel(11, 55, se);
f.setpixel(12, 55, se);
f.setpixel(13, 55, se);
f.setpixel(14, 55, se);
f.setpixel(15, 55, se);
f.setpixel(16, 55, se);
f.setpixel(17, 55, se);
f.setpixel(18, 55, se);
f.setpixel(19, 55, se);
f.setpixel(20, 55, se);
f.setpixel(0, 56, se);
f.setpixel(1, 56, se);
f.setpixel(2, 56, se);
f.setpixel(3, 56, se);
f.setpixel(4, 56, se);
f.setpixel(5, 56, se);
f.setpixel(6, 56, se);
f.setpixel(7, 56, se);
f.setpixel(8, 56, se);
f.setpixel(9, 56, se);
f.setpixel(10, 56, se);
f.setpixel(11, 56, se);
f.setpixel(12, 56, se);
f.setpixel(13, 56, se);
f.setpixel(14, 56, se);
f.setpixel(15, 56, se);
f.setpixel(16, 56, se);
f.setpixel(17, 56, se);
f.setpixel(18, 56, se);
f.setpixel(19, 56, se);
f.setpixel(20, 56, se);
f.setpixel(0, 57, se);
f.setpixel(1, 57, se);
f.setpixel(2, 57, se);
f.setpixel(3, 57, se);
f.setpixel(4, 57, se);
f.setpixel(5, 57, se);
f.setpixel(6, 57, se);
f.setpixel(7, 57, se);
f.setpixel(8, 57, se);
f.setpixel(9, 57, se);
f.setpixel(10, 57, se);
f.setpixel(11, 57, se);
f.setpixel(12, 57, se);
f.setpixel(13, 57, se);
f.setpixel(14, 57, se);
f.setpixel(15, 57, se);
f.setpixel(16, 57, se);
f.setpixel(17, 57, se);
f.setpixel(18, 57, se);
f.setpixel(19, 57, se);
f.setpixel(20, 57, se);
f.setpixel(21, 57, se);
f.setpixel(3, 58, sf);
f.setpixel(4, 58, sf);
f.setpixel(5, 58, sf);
f.setpixel(6, 58, sf);
f.setpixel(7, 58, sf);
f.setpixel(8, 58, sf);
f.setpixel(9, 58, sf);
f.setpixel(10, 58, sf);
f.setpixel(11, 58, sg);
f.setpixel(12, 58, sf);
f.setpixel(13, 58, sf);
f.setpixel(14, 58, sf);
f.setpixel(15, 58, sf);
f.setpixel(16, 58, sf);
f.setpixel(17, 58, sf);
f.setpixel(3, 59, sf);
f.setpixel(4, 59, sf);
f.setpixel(5, 59, sf);
f.setpixel(6, 59, sf);
f.setpixel(7, 59, sf);
f.setpixel(8, 59, sf);
f.setpixel(9, 59, sf);
f.setpixel(10, 59, sf);
f.setpixel(11, 59, sg);
f.setpixel(12, 59, sf);
f.setpixel(13, 59, sf);
f.setpixel(14, 59, sf);
f.setpixel(15, 59, sf);
f.setpixel(16, 59, sf);
f.setpixel(17, 59, sf);
f.setpixel(3, 60, sf);
f.setpixel(4, 60, sf);
f.setpixel(5, 60, sf);
f.setpixel(6, 60, sf);
f.setpixel(7, 60, sf);
f.setpixel(8, 60, sf);
f.setpixel(9, 60, sf);
f.setpixel(10, 60, sf);
f.setpixel(11, 60, sg);
f.setpixel(12, 60, sf);
f.setpixel(13, 60, sf);
f.setpixel(14, 60, sf);
f.setpixel(15, 60, sf);
f.setpixel(16, 60, sf);
f.setpixel(17, 60, sf);
f.setpixel(3, 61, sf);
f.setpixel(4, 61, sf);
f.setpixel(5, 61, sf);
f.setpixel(6, 61, sf);
f.setpixel(7, 61, sf);
f.setpixel(8, 61, sf);
f.setpixel(9, 61, sf);
f.setpixel(10, 61, sf);
f.setpixel(11, 61, sg);
f.setpixel(12, 61, sf);
f.setpixel(13, 61, sf);
f.setpixel(14, 61, sf);
f.setpixel(15, 61, sf);
f.setpixel(16, 61, sf);
f.setpixel(17, 61, sf);
f.setpixel(3, 62, sf);
f.setpixel(4, 62, sf);
f.setpixel(5, 62, sf);
f.setpixel(6, 62, sf);
f.setpixel(7, 62, sf);
f.setpixel(8, 62, sf);
f.setpixel(9, 62, sf);
f.setpixel(10, 62, sf);
f.setpixel(11, 62, sg);
f.setpixel(12, 62, sf);
f.setpixel(13, 62, sf);
f.setpixel(14, 62, sf);
f.setpixel(15, 62, sf);
f.setpixel(16, 62, sf);
f.setpixel(17, 62, sf);
f.setpixel(3, 63, sf);
f.setpixel(4, 63, sf);
f.setpixel(5, 63, sf);
f.setpixel(6, 63, sf);
f.setpixel(7, 63, sf);
f.setpixel(8, 63, sf);
f.setpixel(9, 63, sf);
f.setpixel(10, 63, sf);
f.setpixel(11, 63, sg);
f.setpixel(12, 63, sf);
f.setpixel(13, 63, sf);
f.setpixel(14, 63, sf);
f.setpixel(15, 63, sf);
f.setpixel(16, 63, sf);
f.setpixel(17, 63, sf);
f.setpixel(3, 64, sf);
f.setpixel(4, 64, sf);
f.setpixel(5, 64, sf);
f.setpixel(6, 64, sf);
f.setpixel(7, 64, sf);
f.setpixel(8, 64, sf);
f.setpixel(9, 64, sf);
f.setpixel(10, 64, sf);
f.setpixel(11, 64, sg);
f.setpixel(12, 64, sf);
f.setpixel(13, 64, sf);
f.setpixel(14, 64, sf);
f.setpixel(15, 64, sf);
f.setpixel(16, 64, sf);
f.setpixel(17, 64, sf);
f.setpixel(3, 65, sf);
f.setpixel(4, 65, sf);
f.setpixel(5, 65, sf);
f.setpixel(6, 65, sf);
f.setpixel(7, 65, sf);
f.setpixel(8, 65, sf);
f.setpixel(9, 65, sf);
f.setpixel(10, 65, sf);
f.setpixel(11, 65, sg);
f.setpixel(12, 65, sf);
f.setpixel(13, 65, sf);
f.setpixel(14, 65, sf);
f.setpixel(15, 65, sf);
f.setpixel(16, 65, sf);
f.setpixel(17, 65, sf);
f.setpixel(3, 66, sf);
f.setpixel(4, 66, sf);
f.setpixel(5, 66, sf);
f.setpixel(6, 66, sf);
f.setpixel(7, 66, sf);
f.setpixel(8, 66, sf);
f.setpixel(9, 66, sf);
f.setpixel(10, 66, sf);
f.setpixel(11, 66, sg);
f.setpixel(12, 66, sf);
f.setpixel(13, 66, sf);
f.setpixel(14, 66, sf);
f.setpixel(15, 66, sf);
f.setpixel(16, 66, sf);
f.setpixel(17, 66, sf);
f.setpixel(3, 67, sf);
f.setpixel(4, 67, sf);
f.setpixel(5, 67, sf);
f.setpixel(6, 67, sf);
f.setpixel(7, 67, sf);
f.setpixel(8, 67, sf);
f.setpixel(9, 67, sf);
f.setpixel(10, 67, sf);
f.setpixel(11, 67, sg);
f.setpixel(12, 67, sf);
f.setpixel(13, 67, sf);
f.setpixel(14, 67, sf);
f.setpixel(15, 67, sf);
f.setpixel(16, 67, sf);
f.setpixel(17, 67, sf);
f.setpixel(3, 68, sf);
f.setpixel(4, 68, sf);
f.setpixel(5, 68, sf);
f.setpixel(6, 68, sf);
f.setpixel(7, 68, sf);
f.setpixel(8, 68, sf);
f.setpixel(9, 68, sf);
f.setpixel(10, 68, sf);
f.setpixel(11, 68, sg);
f.setpixel(12, 68, sf);
f.setpixel(13, 68, sf);
f.setpixel(14, 68, sf);
f.setpixel(15, 68, sf);
f.setpixel(16, 68, sf);
f.setpixel(3, 69, sf);
f.setpixel(4, 69, sf);
f.setpixel(5, 69, sf);
f.setpixel(6, 69, sf);
f.setpixel(7, 69, sf);
f.setpixel(8, 69, sf);
f.setpixel(9, 69, sf);
f.setpixel(10, 69, sf);
f.setpixel(11, 69, sg);
f.setpixel(12, 69, sf);
f.setpixel(13, 69, sf);
f.setpixel(14, 69, sf);
f.setpixel(15, 69, sf);
f.setpixel(16, 69, sf);
f.setpixel(3, 70, sf);
f.setpixel(4, 70, sf);
f.setpixel(5, 70, sf);
f.setpixel(6, 70, sf);
f.setpixel(7, 70, sf);
f.setpixel(8, 70, sf);
f.setpixel(9, 70, sf);
f.setpixel(10, 70, sf);
f.setpixel(11, 70, sg);
f.setpixel(12, 70, sf);
f.setpixel(13, 70, sf);
f.setpixel(14, 70, sf);
f.setpixel(15, 70, sf);
f.setpixel(16, 70, sf);
f.setpixel(3, 71, sc);
f.setpixel(4, 71, sc);
f.setpixel(5, 71, sc);
f.setpixel(6, 71, sc);
f.setpixel(7, 71, sc);
f.setpixel(8, 71, sc);
f.setpixel(9, 71, sc);
f.setpixel(10, 71, sc);
f.setpixel(11, 71, sg);
f.setpixel(12, 71, sc);
f.setpixel(13, 71, sc);
f.setpixel(14, 71, sc);
f.setpixel(15, 71, sc);
f.setpixel(16, 71, sc);
f.setpixel(3, 72, sc);
f.setpixel(4, 72, sc);
f.setpixel(5, 72, sc);
f.setpixel(6, 72, sc);
f.setpixel(7, 72, sc);
f.setpixel(8, 72, sc);
f.setpixel(9, 72, sc);
f.setpixel(10, 72, sc);
f.setpixel(11, 72, sg);
f.setpixel(12, 72, sc);
f.setpixel(13, 72, sc);
f.setpixel(14, 72, sc);
f.setpixel(15, 72, sc);
f.setpixel(16, 72, sc);
f.setpixel(3, 73, sc);
f.setpixel(4, 73, sc);
f.setpixel(5, 73, sc);
f.setpixel(6, 73, sc);
f.setpixel(7, 73, sc);
f.setpixel(8, 73, sc);
f.setpixel(9, 73, sc);
f.setpixel(10, 73, sc);
f.setpixel(11, 73, sg);
f.setpixel(12, 73, sc);
f.setpixel(13, 73, sc);
f.setpixel(14, 73, sc);
f.setpixel(15, 73, sc);
f.setpixel(16, 73, sc);
f.setpixel(3, 74, sc);
f.setpixel(4, 74, sc);
f.setpixel(5, 74, sc);
f.setpixel(6, 74, sc);
f.setpixel(7, 74, sc);
f.setpixel(8, 74, sc);
f.setpixel(9, 74, sc);
f.setpixel(10, 74, sc);
f.setpixel(11, 74, sg);
f.setpixel(12, 74, sc);
f.setpixel(13, 74, sc);
f.setpixel(14, 74, sc);
f.setpixel(15, 74, sc);
f.setpixel(16, 74, sc);
f.setpixel(3, 75, sc);
f.setpixel(4, 75, sc);
f.setpixel(5, 75, sc);
f.setpixel(6, 75, sc);
f.setpixel(7, 75, sc);
f.setpixel(8, 75, sc);
f.setpixel(9, 75, sc);
f.setpixel(10, 75, sc);
f.setpixel(11, 75, sg);
f.setpixel(12, 75, sc);
f.setpixel(13, 75, sc);
f.setpixel(14, 75, sc);
f.setpixel(15, 75, sc);
f.setpixel(16, 75, sc);
f.setpixel(3, 76, sc);
f.setpixel(4, 76, sc);
f.setpixel(5, 76, sc);
f.setpixel(6, 76, sc);
f.setpixel(7, 76, sc);
f.setpixel(8, 76, sc);
f.setpixel(9, 76, sc);
f.setpixel(10, 76, sc);
f.setpixel(11, 76, sg);
f.setpixel(12, 76, sc);
f.setpixel(13, 76, sc);
f.setpixel(14, 76, sc);
f.setpixel(15, 76, sc);
f.setpixel(16, 76, sc);
f.setpixel(3, 77, sc);
f.setpixel(4, 77, sc);
f.setpixel(5, 77, sc);
f.setpixel(6, 77, sc);
f.setpixel(7, 77, sc);
f.setpixel(8, 77, sc);
f.setpixel(9, 77, sc);
f.setpixel(10, 77, sc);
f.setpixel(11, 77, sg);
f.setpixel(12, 77, sc);
f.setpixel(13, 77, sc);
f.setpixel(14, 77, sc);
f.setpixel(15, 77, sc);
f.setpixel(16, 77, sc);
f.setpixel(3, 78, sc);
f.setpixel(4, 78, sc);
f.setpixel(5, 78, sc);
f.setpixel(6, 78, sc);
f.setpixel(7, 78, sc);
f.setpixel(8, 78, sc);
f.setpixel(9, 78, sc);
f.setpixel(10, 78, sc);
f.setpixel(11, 78, sg);
f.setpixel(12, 78, sc);
f.setpixel(13, 78, sc);
f.setpixel(14, 78, sc);
f.setpixel(15, 78, sc);
f.setpixel(16, 78, sc);
f.setpixel(3, 79, sc);
f.setpixel(4, 79, sc);
f.setpixel(5, 79, sc);
f.setpixel(6, 79, sc);
f.setpixel(7, 79, sc);
f.setpixel(8, 79, sc);
f.setpixel(9, 79, sc);
f.setpixel(10, 79, sc);
f.setpixel(11, 79, sg);
f.setpixel(12, 79, sg);
f.setpixel(13, 79, sc);
f.setpixel(14, 79, sc);
f.setpixel(15, 79, sc);
f.setpixel(16, 79, sc);
f.setpixel(17, 79, sc);
f.setpixel(3, 80, sc);
f.setpixel(4, 80, sc);
f.setpixel(5, 80, sc);
f.setpixel(6, 80, sc);
f.setpixel(7, 80, sc);
f.setpixel(8, 80, sc);
f.setpixel(9, 80, sc);
f.setpixel(10, 80, sc);
f.setpixel(11, 80, sc);
f.setpixel(12, 80, sg);
f.setpixel(13, 80, sg);
f.setpixel(14, 80, sg);
f.setpixel(15, 80, sg);
f.setpixel(16, 80, sc);
f.setpixel(17, 80, sc);
f.setpixel(18, 80, sc);
f.setpixel(19, 80, sc);
f.setpixel(20, 80, sc);
f.setpixel(3, 81, sc);
f.setpixel(4, 81, sc);
f.setpixel(5, 81, sc);
f.setpixel(6, 81, sc);
f.setpixel(7, 81, sc);
f.setpixel(8, 81, sc);
f.setpixel(9, 81, sc);
f.setpixel(10, 81, sc);
f.setpixel(11, 81, sc);
f.setpixel(12, 81, sc);
f.setpixel(13, 81, sc);
f.setpixel(14, 81, sc);
f.setpixel(15, 81, sg);
f.setpixel(16, 81, sg);
f.setpixel(17, 81, sc);
f.setpixel(18, 81, sc);
f.setpixel(19, 81, sc);
f.setpixel(20, 81, sc);
f.setpixel(21, 81, sc);
f.setpixel(3, 82, sc);
f.setpixel(4, 82, sc);
f.setpixel(5, 82, sc);
f.setpixel(6, 82, sc);
f.setpixel(7, 82, sc);
f.setpixel(8, 82, sc);
f.setpixel(9, 82, sc);
f.setpixel(10, 82, sc);
f.setpixel(11, 82, sc);
f.setpixel(12, 82, sc);
f.setpixel(13, 82, sc);
f.setpixel(14, 82, sc);
f.setpixel(15, 82, sc);
f.setpixel(16, 82, sg);
f.setpixel(17, 82, sc);
f.setpixel(18, 82, sc);
f.setpixel(19, 82, sc);
f.setpixel(20, 82, sc);
f.setpixel(21, 82, sc);
f.setpixel(3, 83, sc);
f.setpixel(4, 83, sc);
f.setpixel(5, 83, sc);
f.setpixel(6, 83, sc);
f.setpixel(7, 83, sc);
f.setpixel(8, 83, sc);
f.setpixel(9, 83, sc);
f.setpixel(10, 83, sc);
f.setpixel(11, 83, sc);
f.setpixel(12, 83, sc);
f.setpixel(13, 83, sc);
f.setpixel(14, 83, sc);
f.setpixel(15, 83, sc);
f.setpixel(16, 83, sg);
f.setpixel(17, 83, sc);
f.setpixel(18, 83, sc);
f.setpixel(19, 83, sc);
f.setpixel(20, 83, sc);
f.setpixel(21, 83, sc);


for ( int c = 0; c < 77; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}

