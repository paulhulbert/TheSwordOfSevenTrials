/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;


import every.*;
import java.awt.Color;
/**
 *
 * @author Dad
 */
public class ZoraZapper extends unit {
    
    public ZoraZapper( room currentroom, int x, int y, AI ai )
    {
        super( 100, 0, 5, "zz_lightning", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(42);
        f.setlength(77);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        

Color sa = new Color(49,124,184);
Color sb = new Color(92,163,219);
Color sc = new Color(0,204,204);
Color sd = new Color(102,0,0);
Color se = new Color(154,110,46);
Color sf = new Color(173,135,81);










//<editor-fold defaultstate="collapsed" desc="build figure">




f.setpixel(5, 0, sa);
f.setpixel(6, 0, sb);
f.setpixel(7, 0, sb);
f.setpixel(8, 0, sa);
f.setpixel(9, 0, sa);
f.setpixel(4, 1, sb);
f.setpixel(5, 1, sb);
f.setpixel(6, 1, sa);
f.setpixel(7, 1, sb);
f.setpixel(8, 1, sb);
f.setpixel(9, 1, sa);
f.setpixel(10, 1, sa);
f.setpixel(11, 1, sb);
f.setpixel(12, 1, sb);
f.setpixel(4, 2, sa);
f.setpixel(5, 2, sb);
f.setpixel(6, 2, sb);
f.setpixel(7, 2, sa);
f.setpixel(8, 2, sb);
f.setpixel(9, 2, sb);
f.setpixel(10, 2, sa);
f.setpixel(11, 2, sb);
f.setpixel(12, 2, sb);
f.setpixel(13, 2, sb);
f.setpixel(14, 2, sb);
f.setpixel(5, 3, sa);
f.setpixel(6, 3, sb);
f.setpixel(7, 3, sb);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sb);
f.setpixel(10, 3, sb);
f.setpixel(11, 3, sb);
f.setpixel(12, 3, sb);
f.setpixel(13, 3, sb);
f.setpixel(14, 3, sb);
f.setpixel(15, 3, sb);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sb);
f.setpixel(8, 4, sb);
f.setpixel(9, 4, sb);
f.setpixel(10, 4, sb);
f.setpixel(11, 4, sb);
f.setpixel(12, 4, sb);
f.setpixel(13, 4, sb);
f.setpixel(14, 4, sb);
f.setpixel(15, 4, sb);
f.setpixel(16, 4, sb);
f.setpixel(17, 4, sb);
f.setpixel(7, 5, sa);
f.setpixel(8, 5, sb);
f.setpixel(9, 5, sb);
f.setpixel(10, 5, sb);
f.setpixel(11, 5, sb);
f.setpixel(12, 5, sb);
f.setpixel(13, 5, sb);
f.setpixel(14, 5, sb);
f.setpixel(15, 5, sb);
f.setpixel(16, 5, sb);
f.setpixel(17, 5, sb);
f.setpixel(18, 5, sb);
f.setpixel(8, 6, sb);
f.setpixel(9, 6, sb);
f.setpixel(10, 6, sa);
f.setpixel(11, 6, sa);
f.setpixel(12, 6, sb);
f.setpixel(13, 6, sb);
f.setpixel(14, 6, sb);
f.setpixel(15, 6, sb);
f.setpixel(16, 6, sb);
f.setpixel(17, 6, sb);
f.setpixel(18, 6, sb);
f.setpixel(19, 6, sb);
f.setpixel(8, 7, sb);
f.setpixel(9, 7, sa);
f.setpixel(10, 7, sb);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sa);
f.setpixel(13, 7, sa);
f.setpixel(14, 7, sb);
f.setpixel(15, 7, sb);
f.setpixel(16, 7, sc);
f.setpixel(17, 7, sc);
f.setpixel(18, 7, sb);
f.setpixel(19, 7, sb);
f.setpixel(8, 8, sb);
f.setpixel(9, 8, sa);
f.setpixel(10, 8, sb);
f.setpixel(11, 8, sb);
f.setpixel(12, 8, sb);
f.setpixel(13, 8, sb);
f.setpixel(14, 8, sb);
f.setpixel(15, 8, sb);
f.setpixel(16, 8, sb);
f.setpixel(17, 8, sc);
f.setpixel(18, 8, sc);
f.setpixel(19, 8, sb);
f.setpixel(20, 8, sb);
f.setpixel(8, 9, sb);
f.setpixel(9, 9, sb);
f.setpixel(10, 9, sa);
f.setpixel(11, 9, sb);
f.setpixel(12, 9, sa);
f.setpixel(13, 9, sa);
f.setpixel(14, 9, sb);
f.setpixel(15, 9, sb);
f.setpixel(16, 9, sb);
f.setpixel(17, 9, sb);
f.setpixel(18, 9, sb);
f.setpixel(19, 9, sb);
f.setpixel(20, 9, sb);
f.setpixel(8, 10, sb);
f.setpixel(9, 10, sb);
f.setpixel(10, 10, sb);
f.setpixel(11, 10, sa);
f.setpixel(12, 10, sb);
f.setpixel(13, 10, sb);
f.setpixel(14, 10, sb);
f.setpixel(15, 10, sb);
f.setpixel(16, 10, sb);
f.setpixel(17, 10, sb);
f.setpixel(18, 10, sb);
f.setpixel(19, 10, sb);
f.setpixel(20, 10, sb);
f.setpixel(9, 11, sb);
f.setpixel(10, 11, sb);
f.setpixel(11, 11, sb);
f.setpixel(12, 11, sa);
f.setpixel(13, 11, sa);
f.setpixel(14, 11, sb);
f.setpixel(15, 11, sb);
f.setpixel(16, 11, sb);
f.setpixel(17, 11, sb);
f.setpixel(18, 11, sb);
f.setpixel(19, 11, sb);
f.setpixel(20, 11, sb);
f.setpixel(10, 12, sb);
f.setpixel(11, 12, sb);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, sb);
f.setpixel(14, 12, sb);
f.setpixel(15, 12, sb);
f.setpixel(16, 12, sb);
f.setpixel(17, 12, sa);
f.setpixel(18, 12, sa);
f.setpixel(19, 12, sa);
f.setpixel(20, 12, sa);
f.setpixel(10, 13, sb);
f.setpixel(11, 13, sb);
f.setpixel(12, 13, sb);
f.setpixel(13, 13, sb);
f.setpixel(14, 13, sb);
f.setpixel(15, 13, sb);
f.setpixel(16, 13, sb);
f.setpixel(17, 13, sb);
f.setpixel(18, 13, sb);
f.setpixel(19, 13, sb);
f.setpixel(20, 13, sb);
f.setpixel(11, 14, sb);
f.setpixel(12, 14, sa);
f.setpixel(13, 14, sb);
f.setpixel(14, 14, sb);
f.setpixel(15, 14, sb);
f.setpixel(16, 14, sb);
f.setpixel(17, 14, sb);
f.setpixel(18, 14, sb);
f.setpixel(19, 14, sb);
f.setpixel(20, 14, sb);
f.setpixel(11, 15, sb);
f.setpixel(12, 15, sb);
f.setpixel(13, 15, sa);
f.setpixel(14, 15, sa);
f.setpixel(15, 15, sa);
f.setpixel(16, 15, sa);
f.setpixel(17, 15, sa);
f.setpixel(18, 15, sa);
f.setpixel(19, 15, sa);
f.setpixel(20, 15, sb);
f.setpixel(11, 16, sb);
f.setpixel(12, 16, sb);
f.setpixel(13, 16, sb);
f.setpixel(14, 16, sb);
f.setpixel(15, 16, sb);
f.setpixel(16, 16, sb);
f.setpixel(17, 16, sb);
f.setpixel(18, 16, sb);
f.setpixel(20, 16, sa);
f.setpixel(11, 17, sb);
f.setpixel(12, 17, sb);
f.setpixel(13, 17, sb);
f.setpixel(14, 17, sb);
f.setpixel(15, 17, sb);
f.setpixel(16, 17, sb);
f.setpixel(17, 17, sb);
f.setpixel(18, 17, sb);
f.setpixel(8, 18, sd);
f.setpixel(9, 18, sd);
f.setpixel(10, 18, se);
f.setpixel(11, 18, sd);
f.setpixel(12, 18, sd);
f.setpixel(13, 18, sd);
f.setpixel(14, 18, sb);
f.setpixel(15, 18, sb);
f.setpixel(16, 18, sb);
f.setpixel(17, 18, sb);
f.setpixel(18, 18, sb);
f.setpixel(19, 18, sb);
f.setpixel(5, 19, se);
f.setpixel(6, 19, se);
f.setpixel(7, 19, se);
f.setpixel(8, 19, se);
f.setpixel(9, 19, sd);
f.setpixel(10, 19, sd);
f.setpixel(11, 19, sd);
f.setpixel(12, 19, sf);
f.setpixel(13, 19, sd);
f.setpixel(14, 19, sd);
f.setpixel(15, 19, sd);
f.setpixel(16, 19, sd);
f.setpixel(17, 19, sd);
f.setpixel(18, 19, sd);
f.setpixel(19, 19, sd);
f.setpixel(20, 19, sd);
f.setpixel(5, 20, se);
f.setpixel(6, 20, sf);
f.setpixel(7, 20, sf);
f.setpixel(8, 20, se);
f.setpixel(9, 20, sf);
f.setpixel(10, 20, sf);
f.setpixel(11, 20, sf);
f.setpixel(12, 20, sf);
f.setpixel(13, 20, sf);
f.setpixel(14, 20, sf);
f.setpixel(15, 20, sf);
f.setpixel(16, 20, sf);
f.setpixel(17, 20, sf);
f.setpixel(18, 20, sf);
f.setpixel(19, 20, sf);
f.setpixel(20, 20, sf);
f.setpixel(5, 21, se);
f.setpixel(6, 21, sf);
f.setpixel(7, 21, sf);
f.setpixel(8, 21, se);
f.setpixel(9, 21, sf);
f.setpixel(10, 21, sf);
f.setpixel(11, 21, sf);
f.setpixel(12, 21, sd);
f.setpixel(13, 21, sd);
f.setpixel(14, 21, sd);
f.setpixel(15, 21, sf);
f.setpixel(16, 21, sf);
f.setpixel(17, 21, sf);
f.setpixel(18, 21, sf);
f.setpixel(19, 21, sf);
f.setpixel(20, 21, sf);
f.setpixel(5, 22, se);
f.setpixel(6, 22, sf);
f.setpixel(7, 22, sf);
f.setpixel(8, 22, se);
f.setpixel(9, 22, sf);
f.setpixel(10, 22, sf);
f.setpixel(11, 22, sd);
f.setpixel(12, 22, sf);
f.setpixel(13, 22, sf);
f.setpixel(14, 22, sf);
f.setpixel(15, 22, sd);
f.setpixel(16, 22, sd);
f.setpixel(17, 22, sf);
f.setpixel(18, 22, se);
f.setpixel(19, 22, se);
f.setpixel(20, 22, sf);
f.setpixel(5, 23, se);
f.setpixel(6, 23, sf);
f.setpixel(7, 23, sf);
f.setpixel(8, 23, se);
f.setpixel(9, 23, sf);
f.setpixel(10, 23, sd);
f.setpixel(11, 23, sf);
f.setpixel(12, 23, sd);
f.setpixel(13, 23, sf);
f.setpixel(14, 23, sf);
f.setpixel(15, 23, sf);
f.setpixel(16, 23, sf);
f.setpixel(17, 23, sd);
f.setpixel(18, 23, sf);
f.setpixel(19, 23, se);
f.setpixel(20, 23, se);
f.setpixel(5, 24, se);
f.setpixel(6, 24, sf);
f.setpixel(7, 24, sf);
f.setpixel(8, 24, se);
f.setpixel(9, 24, sf);
f.setpixel(10, 24, sd);
f.setpixel(11, 24, sf);
f.setpixel(12, 24, sf);
f.setpixel(13, 24, sd);
f.setpixel(14, 24, sf);
f.setpixel(15, 24, sf);
f.setpixel(16, 24, sf);
f.setpixel(17, 24, sf);
f.setpixel(18, 24, sd);
f.setpixel(19, 24, sf);
f.setpixel(20, 24, se);
f.setpixel(4, 25, se);
f.setpixel(5, 25, se);
f.setpixel(6, 25, sf);
f.setpixel(7, 25, se);
f.setpixel(8, 25, sf);
f.setpixel(9, 25, sf);
f.setpixel(10, 25, sd);
f.setpixel(11, 25, sf);
f.setpixel(12, 25, sf);
f.setpixel(13, 25, sf);
f.setpixel(14, 25, sd);
f.setpixel(15, 25, sf);
f.setpixel(16, 25, sf);
f.setpixel(17, 25, sf);
f.setpixel(18, 25, sf);
f.setpixel(19, 25, sd);
f.setpixel(20, 25, sf);
f.setpixel(4, 26, se);
f.setpixel(5, 26, sf);
f.setpixel(6, 26, sf);
f.setpixel(7, 26, se);
f.setpixel(8, 26, sf);
f.setpixel(9, 26, sf);
f.setpixel(10, 26, sf);
f.setpixel(11, 26, sd);
f.setpixel(12, 26, sf);
f.setpixel(13, 26, sf);
f.setpixel(14, 26, sf);
f.setpixel(15, 26, sd);
f.setpixel(16, 26, sf);
f.setpixel(17, 26, sf);
f.setpixel(18, 26, sf);
f.setpixel(19, 26, sf);
f.setpixel(20, 26, sd);
f.setpixel(4, 27, se);
f.setpixel(5, 27, sf);
f.setpixel(6, 27, sf);
f.setpixel(7, 27, se);
f.setpixel(8, 27, sf);
f.setpixel(9, 27, sf);
f.setpixel(10, 27, sf);
f.setpixel(11, 27, sf);
f.setpixel(12, 27, sd);
f.setpixel(13, 27, sf);
f.setpixel(14, 27, sf);
f.setpixel(15, 27, sf);
f.setpixel(16, 27, sd);
f.setpixel(17, 27, sf);
f.setpixel(18, 27, sf);
f.setpixel(19, 27, sf);
f.setpixel(20, 27, sf);
f.setpixel(21, 27, sd);
f.setpixel(4, 28, se);
f.setpixel(5, 28, sf);
f.setpixel(6, 28, se);
f.setpixel(7, 28, se);
f.setpixel(9, 28, sf);
f.setpixel(10, 28, sf);
f.setpixel(11, 28, sf);
f.setpixel(12, 28, sf);
f.setpixel(13, 28, sd);
f.setpixel(14, 28, sf);
f.setpixel(15, 28, sf);
f.setpixel(16, 28, sf);
f.setpixel(17, 28, sd);
f.setpixel(18, 28, sf);
f.setpixel(19, 28, sf);
f.setpixel(20, 28, sf);
f.setpixel(21, 28, sd);
f.setpixel(4, 29, se);
f.setpixel(5, 29, sf);
f.setpixel(6, 29, se);
f.setpixel(9, 29, sf);
f.setpixel(10, 29, sf);
f.setpixel(11, 29, sf);
f.setpixel(12, 29, sf);
f.setpixel(13, 29, sf);
f.setpixel(14, 29, sd);
f.setpixel(15, 29, sf);
f.setpixel(16, 29, sf);
f.setpixel(17, 29, sf);
f.setpixel(18, 29, sd);
f.setpixel(19, 29, sf);
f.setpixel(20, 29, sf);
f.setpixel(21, 29, sd);
f.setpixel(4, 30, se);
f.setpixel(5, 30, sf);
f.setpixel(6, 30, se);
f.setpixel(9, 30, sf);
f.setpixel(10, 30, sf);
f.setpixel(11, 30, sf);
f.setpixel(12, 30, sf);
f.setpixel(13, 30, sf);
f.setpixel(14, 30, sf);
f.setpixel(15, 30, sd);
f.setpixel(16, 30, sf);
f.setpixel(17, 30, sf);
f.setpixel(18, 30, sf);
f.setpixel(19, 30, sd);
f.setpixel(20, 30, sf);
f.setpixel(21, 30, sf);
f.setpixel(22, 30, sd);
f.setpixel(4, 31, se);
f.setpixel(5, 31, sf);
f.setpixel(6, 31, se);
f.setpixel(9, 31, sf);
f.setpixel(10, 31, sf);
f.setpixel(11, 31, sf);
f.setpixel(12, 31, sf);
f.setpixel(13, 31, sf);
f.setpixel(14, 31, sf);
f.setpixel(15, 31, sf);
f.setpixel(16, 31, sd);
f.setpixel(17, 31, sf);
f.setpixel(18, 31, sf);
f.setpixel(19, 31, sf);
f.setpixel(20, 31, sd);
f.setpixel(21, 31, sf);
f.setpixel(22, 31, sf);
f.setpixel(23, 31, sd);
f.setpixel(24, 31, sb);
f.setpixel(25, 31, sb);
f.setpixel(26, 31, sb);
f.setpixel(27, 31, sb);
f.setpixel(4, 32, se);
f.setpixel(5, 32, se);
f.setpixel(10, 32, sf);
f.setpixel(11, 32, sf);
f.setpixel(12, 32, sf);
f.setpixel(13, 32, sf);
f.setpixel(14, 32, sf);
f.setpixel(15, 32, sf);
f.setpixel(16, 32, sf);
f.setpixel(17, 32, sd);
f.setpixel(18, 32, sf);
f.setpixel(19, 32, sf);
f.setpixel(20, 32, sf);
f.setpixel(21, 32, sd);
f.setpixel(22, 32, sf);
f.setpixel(23, 32, sd);
f.setpixel(27, 32, sb);
f.setpixel(28, 32, sb);
f.setpixel(29, 32, sb);
f.setpixel(30, 32, sb);
f.setpixel(4, 33, se);
f.setpixel(5, 33, se);
f.setpixel(10, 33, sf);
f.setpixel(11, 33, sf);
f.setpixel(12, 33, sf);
f.setpixel(13, 33, se);
f.setpixel(14, 33, sf);
f.setpixel(15, 33, sf);
f.setpixel(16, 33, sf);
f.setpixel(17, 33, sf);
f.setpixel(18, 33, sd);
f.setpixel(19, 33, sf);
f.setpixel(20, 33, sf);
f.setpixel(21, 33, sf);
f.setpixel(22, 33, sd);
f.setpixel(23, 33, sd);
f.setpixel(24, 33, sb);
f.setpixel(25, 33, sb);
f.setpixel(26, 33, sb);
f.setpixel(30, 33, sb);
f.setpixel(31, 33, sb);
f.setpixel(32, 33, sb);
f.setpixel(33, 33, sb);
f.setpixel(34, 33, sb);
f.setpixel(35, 33, sb);
f.setpixel(36, 33, sb);
f.setpixel(37, 33, sb);
f.setpixel(38, 33, sb);
f.setpixel(39, 33, sb);
f.setpixel(40, 33, sb);
f.setpixel(10, 34, sf);
f.setpixel(11, 34, sf);
f.setpixel(12, 34, sf);
f.setpixel(13, 34, se);
f.setpixel(14, 34, sf);
f.setpixel(15, 34, sf);
f.setpixel(16, 34, sf);
f.setpixel(17, 34, sf);
f.setpixel(18, 34, sf);
f.setpixel(19, 34, sd);
f.setpixel(20, 34, sf);
f.setpixel(21, 34, sf);
f.setpixel(22, 34, sf);
f.setpixel(23, 34, sd);
f.setpixel(27, 34, sb);
f.setpixel(28, 34, sb);
f.setpixel(29, 34, sb);
f.setpixel(30, 34, sb);
f.setpixel(31, 34, sb);
f.setpixel(10, 35, sf);
f.setpixel(11, 35, sf);
f.setpixel(12, 35, sf);
f.setpixel(13, 35, se);
f.setpixel(14, 35, sf);
f.setpixel(15, 35, sf);
f.setpixel(16, 35, sf);
f.setpixel(17, 35, se);
f.setpixel(18, 35, sf);
f.setpixel(19, 35, sf);
f.setpixel(20, 35, sd);
f.setpixel(21, 35, sd);
f.setpixel(22, 35, sd);
f.setpixel(23, 35, sd);
f.setpixel(24, 35, sb);
f.setpixel(25, 35, sb);
f.setpixel(26, 35, sb);
f.setpixel(31, 35, sb);
f.setpixel(32, 35, sb);
f.setpixel(33, 35, sb);
f.setpixel(34, 35, sb);
f.setpixel(35, 35, sb);
f.setpixel(36, 35, sb);
f.setpixel(37, 35, sb);
f.setpixel(38, 35, sb);
f.setpixel(10, 36, sf);
f.setpixel(11, 36, sf);
f.setpixel(12, 36, sf);
f.setpixel(13, 36, se);
f.setpixel(14, 36, sf);
f.setpixel(15, 36, sf);
f.setpixel(16, 36, se);
f.setpixel(17, 36, se);
f.setpixel(18, 36, sf);
f.setpixel(19, 36, sf);
f.setpixel(26, 36, sb);
f.setpixel(27, 36, sb);
f.setpixel(28, 36, sb);
f.setpixel(39, 36, sb);
f.setpixel(40, 36, sb);
f.setpixel(41, 36, sb);
f.setpixel(42, 36, sb);
f.setpixel(10, 37, sf);
f.setpixel(11, 37, sf);
f.setpixel(12, 37, sf);
f.setpixel(13, 37, se);
f.setpixel(14, 37, sf);
f.setpixel(15, 37, sf);
f.setpixel(16, 37, sf);
f.setpixel(17, 37, sf);
f.setpixel(18, 37, sf);
f.setpixel(19, 37, sf);
f.setpixel(28, 37, sb);
f.setpixel(29, 37, sb);
f.setpixel(30, 37, sb);
f.setpixel(10, 38, sf);
f.setpixel(11, 38, sf);
f.setpixel(12, 38, sf);
f.setpixel(13, 38, sf);
f.setpixel(14, 38, sf);
f.setpixel(15, 38, sf);
f.setpixel(16, 38, sf);
f.setpixel(17, 38, sf);
f.setpixel(18, 38, sf);
f.setpixel(19, 38, sf);
f.setpixel(30, 38, sb);
f.setpixel(31, 38, sb);
f.setpixel(32, 38, sb);
f.setpixel(33, 38, sb);
f.setpixel(34, 38, sb);
f.setpixel(35, 38, sb);
f.setpixel(36, 38, sb);
f.setpixel(10, 39, sf);
f.setpixel(11, 39, sf);
f.setpixel(12, 39, sf);
f.setpixel(13, 39, sf);
f.setpixel(14, 39, sf);
f.setpixel(15, 39, sf);
f.setpixel(16, 39, sf);
f.setpixel(17, 39, sf);
f.setpixel(18, 39, sf);
f.setpixel(19, 39, sf);
f.setpixel(36, 39, sb);
f.setpixel(37, 39, sb);
f.setpixel(38, 39, sb);
f.setpixel(39, 39, sb);
f.setpixel(9, 40, sd);
f.setpixel(10, 40, sd);
f.setpixel(11, 40, sd);
f.setpixel(12, 40, sd);
f.setpixel(13, 40, sd);
f.setpixel(14, 40, sd);
f.setpixel(15, 40, sd);
f.setpixel(16, 40, sd);
f.setpixel(17, 40, sd);
f.setpixel(18, 40, sd);
f.setpixel(19, 40, sd);
f.setpixel(20, 40, sd);
f.setpixel(8, 41, sd);
f.setpixel(9, 41, sd);
f.setpixel(10, 41, sd);
f.setpixel(11, 41, sd);
f.setpixel(12, 41, sd);
f.setpixel(13, 41, sd);
f.setpixel(14, 41, sd);
f.setpixel(15, 41, sd);
f.setpixel(16, 41, sd);
f.setpixel(17, 41, sd);
f.setpixel(18, 41, sd);
f.setpixel(19, 41, sd);
f.setpixel(20, 41, sd);
f.setpixel(8, 42, sd);
f.setpixel(10, 42, sf);
f.setpixel(11, 42, sf);
f.setpixel(12, 42, sf);
f.setpixel(13, 42, sf);
f.setpixel(14, 42, sf);
f.setpixel(15, 42, sf);
f.setpixel(16, 42, sf);
f.setpixel(17, 42, se);
f.setpixel(18, 42, sf);
f.setpixel(19, 42, sf);
f.setpixel(8, 43, sd);
f.setpixel(10, 43, sf);
f.setpixel(11, 43, sf);
f.setpixel(12, 43, sf);
f.setpixel(13, 43, sf);
f.setpixel(14, 43, sf);
f.setpixel(15, 43, sf);
f.setpixel(16, 43, sf);
f.setpixel(17, 43, se);
f.setpixel(18, 43, sf);
f.setpixel(19, 43, sf);
f.setpixel(8, 44, sd);
f.setpixel(10, 44, sf);
f.setpixel(11, 44, sf);
f.setpixel(12, 44, sf);
f.setpixel(13, 44, sf);
f.setpixel(14, 44, sf);
f.setpixel(15, 44, sf);
f.setpixel(16, 44, sf);
f.setpixel(17, 44, se);
f.setpixel(18, 44, sf);
f.setpixel(19, 44, sf);
f.setpixel(7, 45, sd);
f.setpixel(8, 45, sd);
f.setpixel(10, 45, sf);
f.setpixel(11, 45, sf);
f.setpixel(12, 45, sf);
f.setpixel(13, 45, sf);
f.setpixel(14, 45, sf);
f.setpixel(15, 45, sf);
f.setpixel(16, 45, sf);
f.setpixel(17, 45, se);
f.setpixel(18, 45, sf);
f.setpixel(19, 45, sf);
f.setpixel(10, 46, sf);
f.setpixel(11, 46, sf);
f.setpixel(12, 46, sf);
f.setpixel(13, 46, sf);
f.setpixel(14, 46, sf);
f.setpixel(15, 46, sf);
f.setpixel(16, 46, sf);
f.setpixel(17, 46, se);
f.setpixel(18, 46, sf);
f.setpixel(19, 46, sf);
f.setpixel(10, 47, sf);
f.setpixel(11, 47, sf);
f.setpixel(12, 47, se);
f.setpixel(13, 47, se);
f.setpixel(14, 47, sf);
f.setpixel(15, 47, sf);
f.setpixel(16, 47, sf);
f.setpixel(17, 47, se);
f.setpixel(18, 47, sf);
f.setpixel(19, 47, sf);
f.setpixel(10, 48, sf);
f.setpixel(11, 48, sf);
f.setpixel(12, 48, sf);
f.setpixel(13, 48, se);
f.setpixel(14, 48, sf);
f.setpixel(15, 48, sf);
f.setpixel(16, 48, sf);
f.setpixel(17, 48, se);
f.setpixel(18, 48, sf);
f.setpixel(19, 48, sf);
f.setpixel(10, 49, sf);
f.setpixel(11, 49, sf);
f.setpixel(12, 49, sf);
f.setpixel(13, 49, se);
f.setpixel(14, 49, sf);
f.setpixel(15, 49, sf);
f.setpixel(16, 49, sf);
f.setpixel(17, 49, se);
f.setpixel(18, 49, sf);
f.setpixel(19, 49, sf);
f.setpixel(10, 50, sf);
f.setpixel(11, 50, sf);
f.setpixel(12, 50, sf);
f.setpixel(13, 50, se);
f.setpixel(14, 50, sf);
f.setpixel(15, 50, sf);
f.setpixel(16, 50, sf);
f.setpixel(17, 50, se);
f.setpixel(18, 50, sf);
f.setpixel(19, 50, sf);
f.setpixel(10, 51, sf);
f.setpixel(11, 51, sf);
f.setpixel(12, 51, sf);
f.setpixel(13, 51, se);
f.setpixel(14, 51, sf);
f.setpixel(15, 51, sf);
f.setpixel(16, 51, sf);
f.setpixel(17, 51, se);
f.setpixel(18, 51, sf);
f.setpixel(19, 51, sf);
f.setpixel(10, 52, sf);
f.setpixel(11, 52, sf);
f.setpixel(12, 52, sf);
f.setpixel(13, 52, se);
f.setpixel(14, 52, sf);
f.setpixel(15, 52, sf);
f.setpixel(16, 52, sf);
f.setpixel(17, 52, se);
f.setpixel(18, 52, sf);
f.setpixel(19, 52, sf);
f.setpixel(10, 53, sf);
f.setpixel(11, 53, sf);
f.setpixel(12, 53, sf);
f.setpixel(13, 53, se);
f.setpixel(14, 53, sf);
f.setpixel(15, 53, sf);
f.setpixel(16, 53, sf);
f.setpixel(17, 53, se);
f.setpixel(18, 53, sf);
f.setpixel(19, 53, sf);
f.setpixel(20, 53, sf);
f.setpixel(10, 54, sf);
f.setpixel(11, 54, sf);
f.setpixel(12, 54, sf);
f.setpixel(13, 54, sf);
f.setpixel(14, 54, sf);
f.setpixel(15, 54, sf);
f.setpixel(16, 54, sf);
f.setpixel(17, 54, se);
f.setpixel(18, 54, se);
f.setpixel(19, 54, sf);
f.setpixel(20, 54, sf);
f.setpixel(10, 55, sf);
f.setpixel(11, 55, sf);
f.setpixel(12, 55, sf);
f.setpixel(13, 55, sf);
f.setpixel(14, 55, sf);
f.setpixel(15, 55, sf);
f.setpixel(16, 55, sf);
f.setpixel(17, 55, sf);
f.setpixel(18, 55, se);
f.setpixel(19, 55, sf);
f.setpixel(20, 55, sf);
f.setpixel(10, 56, sf);
f.setpixel(11, 56, sf);
f.setpixel(12, 56, sf);
f.setpixel(13, 56, sf);
f.setpixel(14, 56, sf);
f.setpixel(15, 56, sf);
f.setpixel(16, 56, sf);
f.setpixel(17, 56, sf);
f.setpixel(18, 56, se);
f.setpixel(19, 56, sf);
f.setpixel(20, 56, sf);
f.setpixel(10, 57, sf);
f.setpixel(11, 57, sf);
f.setpixel(12, 57, sf);
f.setpixel(13, 57, sf);
f.setpixel(14, 57, sf);
f.setpixel(15, 57, sf);
f.setpixel(16, 57, sf);
f.setpixel(17, 57, sf);
f.setpixel(18, 57, se);
f.setpixel(19, 57, sf);
f.setpixel(20, 57, sf);
f.setpixel(10, 58, sf);
f.setpixel(11, 58, sf);
f.setpixel(12, 58, sf);
f.setpixel(13, 58, sf);
f.setpixel(14, 58, sf);
f.setpixel(15, 58, sf);
f.setpixel(16, 58, sf);
f.setpixel(17, 58, sf);
f.setpixel(18, 58, se);
f.setpixel(19, 58, sf);
f.setpixel(20, 58, sf);
f.setpixel(9, 59, sf);
f.setpixel(10, 59, sf);
f.setpixel(11, 59, sf);
f.setpixel(12, 59, sf);
f.setpixel(13, 59, sf);
f.setpixel(14, 59, sf);
f.setpixel(15, 59, sf);
f.setpixel(16, 59, sf);
f.setpixel(17, 59, sf);
f.setpixel(18, 59, se);
f.setpixel(19, 59, sf);
f.setpixel(20, 59, sf);
f.setpixel(21, 59, sf);
f.setpixel(9, 60, sf);
f.setpixel(10, 60, sf);
f.setpixel(11, 60, sf);
f.setpixel(12, 60, sf);
f.setpixel(13, 60, sf);
f.setpixel(14, 60, sf);
f.setpixel(15, 60, se);
f.setpixel(16, 60, sf);
f.setpixel(17, 60, sf);
f.setpixel(18, 60, se);
f.setpixel(19, 60, se);
f.setpixel(20, 60, sf);
f.setpixel(21, 60, sf);
f.setpixel(9, 61, sf);
f.setpixel(10, 61, sf);
f.setpixel(11, 61, sf);
f.setpixel(12, 61, sf);
f.setpixel(13, 61, sf);
f.setpixel(14, 61, sf);
f.setpixel(15, 61, se);
f.setpixel(16, 61, sf);
f.setpixel(17, 61, sf);
f.setpixel(18, 61, sf);
f.setpixel(19, 61, se);
f.setpixel(20, 61, sf);
f.setpixel(21, 61, sf);
f.setpixel(9, 62, sf);
f.setpixel(10, 62, sf);
f.setpixel(11, 62, sf);
f.setpixel(12, 62, sf);
f.setpixel(13, 62, sf);
f.setpixel(14, 62, sf);
f.setpixel(15, 62, se);
f.setpixel(16, 62, sf);
f.setpixel(17, 62, sf);
f.setpixel(18, 62, sf);
f.setpixel(19, 62, se);
f.setpixel(20, 62, sf);
f.setpixel(21, 62, sf);
f.setpixel(9, 63, sf);
f.setpixel(10, 63, sf);
f.setpixel(11, 63, sf);
f.setpixel(12, 63, sf);
f.setpixel(13, 63, sf);
f.setpixel(14, 63, sf);
f.setpixel(15, 63, sf);
f.setpixel(16, 63, se);
f.setpixel(17, 63, sf);
f.setpixel(18, 63, sf);
f.setpixel(19, 63, se);
f.setpixel(20, 63, sf);
f.setpixel(21, 63, sf);
f.setpixel(8, 64, sf);
f.setpixel(9, 64, sf);
f.setpixel(10, 64, sf);
f.setpixel(11, 64, sf);
f.setpixel(12, 64, se);
f.setpixel(13, 64, sf);
f.setpixel(14, 64, sf);
f.setpixel(15, 64, sf);
f.setpixel(16, 64, se);
f.setpixel(17, 64, sf);
f.setpixel(18, 64, sf);
f.setpixel(19, 64, se);
f.setpixel(20, 64, sf);
f.setpixel(21, 64, sf);
f.setpixel(8, 65, sf);
f.setpixel(9, 65, sf);
f.setpixel(10, 65, sf);
f.setpixel(11, 65, sf);
f.setpixel(12, 65, se);
f.setpixel(13, 65, sf);
f.setpixel(14, 65, sf);
f.setpixel(15, 65, sf);
f.setpixel(16, 65, se);
f.setpixel(17, 65, sf);
f.setpixel(18, 65, sf);
f.setpixel(19, 65, se);
f.setpixel(20, 65, sf);
f.setpixel(21, 65, sf);
f.setpixel(8, 66, sf);
f.setpixel(9, 66, sf);
f.setpixel(10, 66, sf);
f.setpixel(11, 66, sf);
f.setpixel(12, 66, se);
f.setpixel(13, 66, sf);
f.setpixel(14, 66, sf);
f.setpixel(15, 66, sf);
f.setpixel(16, 66, sf);
f.setpixel(17, 66, sf);
f.setpixel(18, 66, sf);
f.setpixel(19, 66, se);
f.setpixel(20, 66, sf);
f.setpixel(21, 66, sf);
f.setpixel(8, 67, sf);
f.setpixel(9, 67, sf);
f.setpixel(10, 67, sf);
f.setpixel(11, 67, sf);
f.setpixel(12, 67, se);
f.setpixel(13, 67, sf);
f.setpixel(14, 67, sf);
f.setpixel(15, 67, sf);
f.setpixel(16, 67, sf);
f.setpixel(17, 67, sf);
f.setpixel(18, 67, sf);
f.setpixel(19, 67, se);
f.setpixel(20, 67, sf);
f.setpixel(21, 67, sf);
f.setpixel(7, 68, sf);
f.setpixel(8, 68, sf);
f.setpixel(9, 68, sf);
f.setpixel(10, 68, sf);
f.setpixel(11, 68, sf);
f.setpixel(12, 68, se);
f.setpixel(13, 68, sf);
f.setpixel(14, 68, sf);
f.setpixel(15, 68, sf);
f.setpixel(16, 68, sf);
f.setpixel(17, 68, sf);
f.setpixel(18, 68, sf);
f.setpixel(19, 68, se);
f.setpixel(20, 68, se);
f.setpixel(21, 68, sf);
f.setpixel(22, 68, sf);
f.setpixel(7, 69, sf);
f.setpixel(8, 69, sf);
f.setpixel(9, 69, se);
f.setpixel(10, 69, se);
f.setpixel(11, 69, sf);
f.setpixel(12, 69, sf);
f.setpixel(13, 69, se);
f.setpixel(14, 69, sf);
f.setpixel(15, 69, sf);
f.setpixel(16, 69, sf);
f.setpixel(17, 69, sf);
f.setpixel(18, 69, sf);
f.setpixel(19, 69, sf);
f.setpixel(20, 69, se);
f.setpixel(21, 69, sf);
f.setpixel(22, 69, sf);
f.setpixel(7, 70, sf);
f.setpixel(8, 70, sf);
f.setpixel(9, 70, se);
f.setpixel(10, 70, sf);
f.setpixel(11, 70, sf);
f.setpixel(12, 70, sf);
f.setpixel(13, 70, se);
f.setpixel(14, 70, sf);
f.setpixel(15, 70, sf);
f.setpixel(16, 70, sf);
f.setpixel(17, 70, sf);
f.setpixel(18, 70, sf);
f.setpixel(19, 70, sf);
f.setpixel(20, 70, se);
f.setpixel(21, 70, sf);
f.setpixel(22, 70, sf);
f.setpixel(23, 70, sf);
f.setpixel(7, 71, sf);
f.setpixel(8, 71, se);
f.setpixel(9, 71, sf);
f.setpixel(10, 71, sf);
f.setpixel(11, 71, sf);
f.setpixel(12, 71, sf);
f.setpixel(13, 71, sf);
f.setpixel(14, 71, sf);
f.setpixel(15, 71, sf);
f.setpixel(16, 71, sf);
f.setpixel(17, 71, se);
f.setpixel(18, 71, sf);
f.setpixel(19, 71, sf);
f.setpixel(20, 71, se);
f.setpixel(21, 71, se);
f.setpixel(22, 71, sf);
f.setpixel(23, 71, sf);
f.setpixel(6, 72, sf);
f.setpixel(7, 72, sf);
f.setpixel(8, 72, sf);
f.setpixel(9, 72, sf);
f.setpixel(10, 72, sf);
f.setpixel(11, 72, sf);
f.setpixel(12, 72, sf);
f.setpixel(13, 72, sf);
f.setpixel(14, 72, sf);
f.setpixel(15, 72, sf);
f.setpixel(16, 72, sf);
f.setpixel(17, 72, se);
f.setpixel(18, 72, sf);
f.setpixel(19, 72, sf);
f.setpixel(20, 72, sf);
f.setpixel(21, 72, se);
f.setpixel(22, 72, sf);
f.setpixel(23, 72, sf);
f.setpixel(6, 73, sf);
f.setpixel(7, 73, sf);
f.setpixel(8, 73, sf);
f.setpixel(9, 73, sf);
f.setpixel(10, 73, sf);
f.setpixel(11, 73, sf);
f.setpixel(12, 73, sf);
f.setpixel(13, 73, sf);
f.setpixel(14, 73, sf);
f.setpixel(15, 73, sf);
f.setpixel(16, 73, sf);
f.setpixel(17, 73, se);
f.setpixel(18, 73, sf);
f.setpixel(19, 73, sf);
f.setpixel(20, 73, sf);
f.setpixel(21, 73, se);
f.setpixel(22, 73, sf);
f.setpixel(23, 73, sf);
f.setpixel(24, 73, sf);
f.setpixel(4, 74, sf);
f.setpixel(5, 74, sf);
f.setpixel(6, 74, sf);
f.setpixel(7, 74, sf);
f.setpixel(8, 74, sf);
f.setpixel(9, 74, sf);
f.setpixel(10, 74, sf);
f.setpixel(11, 74, sf);
f.setpixel(12, 74, sf);
f.setpixel(13, 74, sf);
f.setpixel(14, 74, sf);
f.setpixel(15, 74, sf);
f.setpixel(16, 74, sf);
f.setpixel(17, 74, sf);
f.setpixel(18, 74, se);
f.setpixel(19, 74, sf);
f.setpixel(20, 74, sf);
f.setpixel(21, 74, se);
f.setpixel(22, 74, se);
f.setpixel(23, 74, sf);
f.setpixel(24, 74, sf);
f.setpixel(4, 75, sf);
f.setpixel(5, 75, sf);
f.setpixel(6, 75, sf);
f.setpixel(7, 75, sf);
f.setpixel(8, 75, sf);
f.setpixel(9, 75, sf);
f.setpixel(10, 75, sf);
f.setpixel(11, 75, sf);
f.setpixel(12, 75, sf);
f.setpixel(13, 75, sf);
f.setpixel(14, 75, sf);
f.setpixel(15, 75, sf);
f.setpixel(16, 75, sf);
f.setpixel(17, 75, sf);
f.setpixel(18, 75, sf);
f.setpixel(19, 75, sf);
f.setpixel(20, 75, sf);
f.setpixel(21, 75, sf);
f.setpixel(22, 75, se);
f.setpixel(23, 75, se);
f.setpixel(24, 75, sf);
f.setpixel(25, 75, sf);
f.setpixel(3, 76, sf);
f.setpixel(4, 76, sf);
f.setpixel(5, 76, sd);
f.setpixel(6, 76, sd);
f.setpixel(7, 76, sd);
f.setpixel(8, 76, sf);
f.setpixel(9, 76, sf);
f.setpixel(10, 76, sf);
f.setpixel(11, 76, sd);
f.setpixel(12, 76, sd);
f.setpixel(13, 76, sd);
f.setpixel(14, 76, sf);
f.setpixel(15, 76, sf);
f.setpixel(16, 76, sf);
f.setpixel(17, 76, sd);
f.setpixel(18, 76, sd);
f.setpixel(19, 76, sd);
f.setpixel(20, 76, sf);
f.setpixel(21, 76, sf);
f.setpixel(22, 76, sf);
f.setpixel(23, 76, se);
f.setpixel(24, 76, se);
f.setpixel(25, 76, sf);
f.setpixel(26, 76, sf);
f.setpixel(0, 77, sb);
f.setpixel(1, 77, sd);
f.setpixel(2, 77, sd);
f.setpixel(3, 77, sd);
f.setpixel(4, 77, sd);
f.setpixel(5, 77, sd);
f.setpixel(6, 77, sf);
f.setpixel(7, 77, sd);
f.setpixel(8, 77, sd);
f.setpixel(9, 77, sd);
f.setpixel(10, 77, sd);
f.setpixel(11, 77, sd);
f.setpixel(12, 77, sf);
f.setpixel(13, 77, sd);
f.setpixel(14, 77, sd);
f.setpixel(15, 77, sd);
f.setpixel(16, 77, sd);
f.setpixel(17, 77, sd);
f.setpixel(18, 77, sf);
f.setpixel(19, 77, sd);
f.setpixel(20, 77, sd);
f.setpixel(21, 77, sd);
f.setpixel(22, 77, sd);
f.setpixel(23, 77, sd);
f.setpixel(24, 77, se);
f.setpixel(25, 77, sd);
f.setpixel(26, 77, sd);
f.setpixel(27, 77, sd);
for ( int c = 0; c < 77; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}

