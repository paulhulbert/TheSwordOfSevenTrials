/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;

/**
 *
 * @author Dad
 */
public class heavygobspear extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public heavygobspear( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x - dir * 10, y + 40, dir * 5, 0, 6, 80, true, new boolean[10], new Color[10], 96, 8, momentx, momenty, u );
        
        
        sa = new Color(153,153,153);
        sb = new Color(204,204,204);
        sc = new Color(175,118,74);
        
        

        startuserdistance = -50;
        enduserdistance = -5;

        
        buildpic();
        
        
        name = "heavygobspear";
        
        
    }
    
    public static int getrange()
    {
        
        return 25;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 96 * 8; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        

















setpixel(87, 0, sa);
setpixel(88, 0, sa);
setpixel(86, 1, sa);
setpixel(87, 1, sb);
setpixel(88, 1, sb);
setpixel(89, 1, sa);
setpixel(90, 1, sa);
setpixel(86, 2, sa);
setpixel(87, 2, sa);
setpixel(88, 2, sb);
setpixel(89, 2, sb);
setpixel(90, 2, sb);
setpixel(91, 2, sa);
setpixel(92, 2, sa);
setpixel(0, 3, sc);
setpixel(1, 3, sc);
setpixel(2, 3, sc);
setpixel(3, 3, sc);
setpixel(4, 3, sc);
setpixel(5, 3, sc);
setpixel(6, 3, sc);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sc);
setpixel(12, 3, sc);
setpixel(13, 3, sc);
setpixel(14, 3, sc);
setpixel(15, 3, sc);
setpixel(16, 3, sc);
setpixel(17, 3, sc);
setpixel(18, 3, sc);
setpixel(19, 3, sc);
setpixel(20, 3, sc);
setpixel(21, 3, sc);
setpixel(22, 3, sc);
setpixel(23, 3, sc);
setpixel(24, 3, sc);
setpixel(25, 3, sc);
setpixel(26, 3, sc);
setpixel(27, 3, sc);
setpixel(28, 3, sc);
setpixel(29, 3, sc);
setpixel(30, 3, sc);
setpixel(31, 3, sc);
setpixel(32, 3, sc);
setpixel(33, 3, sc);
setpixel(34, 3, sc);
setpixel(35, 3, sc);
setpixel(36, 3, sc);
setpixel(37, 3, sc);
setpixel(38, 3, sc);
setpixel(39, 3, sc);
setpixel(40, 3, sc);
setpixel(41, 3, sc);
setpixel(42, 3, sc);
setpixel(43, 3, sc);
setpixel(44, 3, sc);
setpixel(45, 3, sc);
setpixel(46, 3, sc);
setpixel(47, 3, sc);
setpixel(48, 3, sc);
setpixel(49, 3, sc);
setpixel(50, 3, sc);
setpixel(51, 3, sc);
setpixel(52, 3, sc);
setpixel(53, 3, sc);
setpixel(54, 3, sc);
setpixel(55, 3, sc);
setpixel(56, 3, sc);
setpixel(57, 3, sc);
setpixel(58, 3, sc);
setpixel(59, 3, sc);
setpixel(60, 3, sc);
setpixel(61, 3, sc);
setpixel(62, 3, sc);
setpixel(63, 3, sc);
setpixel(64, 3, sc);
setpixel(65, 3, sc);
setpixel(66, 3, sc);
setpixel(67, 3, sc);
setpixel(68, 3, sc);
setpixel(69, 3, sc);
setpixel(70, 3, sc);
setpixel(71, 3, sc);
setpixel(72, 3, sc);
setpixel(73, 3, sc);
setpixel(74, 3, sc);
setpixel(75, 3, sc);
setpixel(76, 3, sc);
setpixel(77, 3, sc);
setpixel(78, 3, sc);
setpixel(79, 3, sc);
setpixel(80, 3, sc);
setpixel(81, 3, sc);
setpixel(82, 3, sc);
setpixel(83, 3, sc);
setpixel(84, 3, sc);
setpixel(85, 3, sc);
setpixel(86, 3, sc);
setpixel(87, 3, sa);
setpixel(88, 3, sb);
setpixel(89, 3, sb);
setpixel(90, 3, sb);
setpixel(91, 3, sb);
setpixel(92, 3, sb);
setpixel(93, 3, sa);
setpixel(94, 3, sa);
setpixel(0, 4, sc);
setpixel(1, 4, sc);
setpixel(2, 4, sc);
setpixel(3, 4, sc);
setpixel(4, 4, sc);
setpixel(5, 4, sc);
setpixel(6, 4, sc);
setpixel(7, 4, sc);
setpixel(8, 4, sc);
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
setpixel(19, 4, sc);
setpixel(20, 4, sc);
setpixel(21, 4, sc);
setpixel(22, 4, sc);
setpixel(23, 4, sc);
setpixel(24, 4, sc);
setpixel(25, 4, sc);
setpixel(26, 4, sc);
setpixel(27, 4, sc);
setpixel(28, 4, sc);
setpixel(29, 4, sc);
setpixel(30, 4, sc);
setpixel(31, 4, sc);
setpixel(32, 4, sc);
setpixel(33, 4, sc);
setpixel(34, 4, sc);
setpixel(35, 4, sc);
setpixel(36, 4, sc);
setpixel(37, 4, sc);
setpixel(38, 4, sc);
setpixel(39, 4, sc);
setpixel(40, 4, sc);
setpixel(41, 4, sc);
setpixel(42, 4, sc);
setpixel(43, 4, sc);
setpixel(44, 4, sc);
setpixel(45, 4, sc);
setpixel(46, 4, sc);
setpixel(47, 4, sc);
setpixel(48, 4, sc);
setpixel(49, 4, sc);
setpixel(50, 4, sc);
setpixel(51, 4, sc);
setpixel(52, 4, sc);
setpixel(53, 4, sc);
setpixel(54, 4, sc);
setpixel(55, 4, sc);
setpixel(56, 4, sc);
setpixel(57, 4, sc);
setpixel(58, 4, sc);
setpixel(59, 4, sc);
setpixel(60, 4, sc);
setpixel(61, 4, sc);
setpixel(62, 4, sc);
setpixel(63, 4, sc);
setpixel(64, 4, sc);
setpixel(65, 4, sc);
setpixel(66, 4, sc);
setpixel(67, 4, sc);
setpixel(68, 4, sc);
setpixel(69, 4, sc);
setpixel(70, 4, sc);
setpixel(71, 4, sc);
setpixel(72, 4, sc);
setpixel(73, 4, sc);
setpixel(74, 4, sc);
setpixel(75, 4, sc);
setpixel(76, 4, sc);
setpixel(77, 4, sc);
setpixel(78, 4, sc);
setpixel(79, 4, sc);
setpixel(80, 4, sc);
setpixel(81, 4, sc);
setpixel(82, 4, sc);
setpixel(83, 4, sc);
setpixel(84, 4, sc);
setpixel(85, 4, sc);
setpixel(86, 4, sc);
setpixel(87, 4, sa);
setpixel(88, 4, sa);
setpixel(89, 4, sa);
setpixel(90, 4, sa);
setpixel(91, 4, sa);
setpixel(92, 4, sa);
setpixel(93, 4, sa);
setpixel(94, 4, sa);
setpixel(95, 4, sa);
setpixel(96, 4, sa);
setpixel(0, 5, sc);
setpixel(1, 5, sc);
setpixel(2, 5, sc);
setpixel(3, 5, sc);
setpixel(4, 5, sc);
setpixel(5, 5, sc);
setpixel(6, 5, sc);
setpixel(7, 5, sc);
setpixel(8, 5, sc);
setpixel(9, 5, sc);
setpixel(10, 5, sc);
setpixel(11, 5, sc);
setpixel(12, 5, sc);
setpixel(13, 5, sc);
setpixel(14, 5, sc);
setpixel(15, 5, sc);
setpixel(16, 5, sc);
setpixel(17, 5, sc);
setpixel(18, 5, sc);
setpixel(19, 5, sc);
setpixel(20, 5, sc);
setpixel(21, 5, sc);
setpixel(22, 5, sc);
setpixel(23, 5, sc);
setpixel(24, 5, sc);
setpixel(25, 5, sc);
setpixel(26, 5, sc);
setpixel(27, 5, sc);
setpixel(28, 5, sc);
setpixel(29, 5, sc);
setpixel(30, 5, sc);
setpixel(31, 5, sc);
setpixel(32, 5, sc);
setpixel(33, 5, sc);
setpixel(34, 5, sc);
setpixel(35, 5, sc);
setpixel(36, 5, sc);
setpixel(37, 5, sc);
setpixel(38, 5, sc);
setpixel(39, 5, sc);
setpixel(40, 5, sc);
setpixel(41, 5, sc);
setpixel(42, 5, sc);
setpixel(43, 5, sc);
setpixel(44, 5, sc);
setpixel(45, 5, sc);
setpixel(46, 5, sc);
setpixel(47, 5, sc);
setpixel(48, 5, sc);
setpixel(49, 5, sc);
setpixel(50, 5, sc);
setpixel(51, 5, sc);
setpixel(52, 5, sc);
setpixel(53, 5, sc);
setpixel(54, 5, sc);
setpixel(55, 5, sc);
setpixel(56, 5, sc);
setpixel(57, 5, sc);
setpixel(58, 5, sc);
setpixel(59, 5, sc);
setpixel(60, 5, sc);
setpixel(61, 5, sc);
setpixel(62, 5, sc);
setpixel(63, 5, sc);
setpixel(64, 5, sc);
setpixel(65, 5, sc);
setpixel(66, 5, sc);
setpixel(67, 5, sc);
setpixel(68, 5, sc);
setpixel(69, 5, sc);
setpixel(70, 5, sc);
setpixel(71, 5, sc);
setpixel(72, 5, sc);
setpixel(73, 5, sc);
setpixel(74, 5, sc);
setpixel(75, 5, sc);
setpixel(76, 5, sc);
setpixel(77, 5, sc);
setpixel(78, 5, sc);
setpixel(79, 5, sc);
setpixel(80, 5, sc);
setpixel(81, 5, sc);
setpixel(82, 5, sc);
setpixel(83, 5, sc);
setpixel(84, 5, sc);
setpixel(85, 5, sc);
setpixel(86, 5, sc);
setpixel(87, 5, sa);
setpixel(88, 5, sb);
setpixel(89, 5, sb);
setpixel(90, 5, sb);
setpixel(91, 5, sb);
setpixel(92, 5, sb);
setpixel(93, 5, sa);
setpixel(94, 5, sa);
setpixel(86, 6, sa);
setpixel(87, 6, sa);
setpixel(88, 6, sb);
setpixel(89, 6, sb);
setpixel(90, 6, sb);
setpixel(91, 6, sa);
setpixel(92, 6, sa);
setpixel(86, 7, sa);
setpixel(87, 7, sb);
setpixel(88, 7, sb);
setpixel(89, 7, sa);
setpixel(90, 7, sa);
setpixel(87, 8, sa);
setpixel(88, 8, sa);
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
