/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class blankweap extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa = new Color(153,153,153);
    
    public blankweap( int x, int y, int dir)
    {
        super( 10000000, 100000, 1, 1, 10, 10, true, new boolean[10], new Color[10], 100, 140, 0, 0 );
        
        buildpic();
        
        name = "blankweap";
        
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    public void buildpic()
    {
        for ( int c = 0; c < 14000; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        setpixel(63, 38, sa);
setpixel(64, 38, sa);
setpixel(65, 38, sa);
setpixel(62, 39, sa);
setpixel(63, 39, sa);
setpixel(64, 39, sa);
setpixel(61, 40, sa);
setpixel(62, 40, sa);
setpixel(63, 40, sa);
setpixel(64, 40, sa);
setpixel(59, 41, sa);
setpixel(60, 41, sa);
setpixel(61, 41, sa);
setpixel(62, 41, sa);
setpixel(63, 41, sa);
setpixel(58, 42, sa);
setpixel(59, 42, sa);
setpixel(60, 42, sa);
setpixel(61, 42, sa);
setpixel(62, 42, sa);
setpixel(63, 42, sa);
setpixel(57, 43, sa);
setpixel(58, 43, sa);
setpixel(59, 43, sa);
setpixel(60, 43, sa);
setpixel(61, 43, sa);
setpixel(62, 43, sa);
setpixel(57, 44, sa);
setpixel(58, 44, sa);
setpixel(59, 44, sa);
setpixel(60, 44, sa);
setpixel(61, 44, sa);
setpixel(56, 45, sa);
setpixel(57, 45, sa);
setpixel(58, 45, sa);
setpixel(59, 45, sa);
setpixel(60, 45, sa);
setpixel(55, 46, sa);
setpixel(56, 46, sa);
setpixel(57, 46, sa);
setpixel(58, 46, sa);
setpixel(59, 46, sa);
setpixel(60, 46, sa);
setpixel(53, 47, sa);
setpixel(54, 47, sa);
setpixel(55, 47, sa);
setpixel(56, 47, sa);
setpixel(57, 47, sa);
setpixel(58, 47, sa);
setpixel(59, 47, sa);
setpixel(60, 47, sa);
setpixel(52, 48, sa);
setpixel(53, 48, sa);
setpixel(54, 48, sa);
setpixel(55, 48, sa);
setpixel(56, 48, sa);
setpixel(57, 48, sa);
setpixel(58, 48, sa);
setpixel(59, 48, sa);
setpixel(51, 49, sa);
setpixel(52, 49, sa);
setpixel(53, 49, sa);
setpixel(54, 49, sa);
setpixel(55, 49, sa);
setpixel(56, 49, sa);
setpixel(57, 49, sa);
setpixel(58, 49, sa);
setpixel(50, 50, sa);
setpixel(51, 50, sa);
setpixel(52, 50, sa);
setpixel(53, 50, sa);
setpixel(54, 50, sa);
setpixel(55, 50, sa);
setpixel(56, 50, sa);
setpixel(57, 50, sa);
setpixel(49, 51, sa);
setpixel(50, 51, sa);
setpixel(51, 51, sa);
setpixel(52, 51, sa);
setpixel(53, 51, sa);
setpixel(54, 51, sa);
setpixel(55, 51, sa);
setpixel(56, 51, sa);
setpixel(48, 52, sa);
setpixel(49, 52, sa);
setpixel(50, 52, sa);
setpixel(51, 52, sa);
setpixel(52, 52, sa);
setpixel(53, 52, sa);
setpixel(54, 52, sa);
setpixel(55, 52, sa);
setpixel(46, 53, sa);
setpixel(47, 53, sa);
setpixel(48, 53, sa);
setpixel(49, 53, sa);
setpixel(50, 53, sa);
setpixel(51, 53, sa);
setpixel(52, 53, sa);
setpixel(53, 53, sa);
setpixel(54, 53, sa);
setpixel(46, 54, sa);
setpixel(47, 54, sa);
setpixel(48, 54, sa);
setpixel(49, 54, sa);
setpixel(50, 54, sa);
setpixel(51, 54, sa);
setpixel(52, 54, sa);
setpixel(53, 54, sa);
setpixel(45, 55, sa);
setpixel(46, 55, sa);
setpixel(47, 55, sa);
setpixel(48, 55, sa);
setpixel(49, 55, sa);
setpixel(50, 55, sa);
setpixel(51, 55, sa);
setpixel(52, 55, sa);
setpixel(44, 56, sa);
setpixel(45, 56, sa);
setpixel(46, 56, sa);
setpixel(47, 56, sa);
setpixel(48, 56, sa);
setpixel(49, 56, sa);
setpixel(50, 56, sa);
setpixel(51, 56, sa);
setpixel(52, 56, sa);
setpixel(43, 57, sa);
setpixel(44, 57, sa);
setpixel(45, 57, sa);
setpixel(46, 57, sa);
setpixel(47, 57, sa);
setpixel(48, 57, sa);
setpixel(49, 57, sa);
setpixel(50, 57, sa);
setpixel(51, 57, sa);
setpixel(42, 58, sa);
setpixel(43, 58, sa);
setpixel(44, 58, sa);
setpixel(45, 58, sa);
setpixel(46, 58, sa);
setpixel(47, 58, sa);
setpixel(48, 58, sa);
setpixel(49, 58, sa);
setpixel(50, 58, sa);
setpixel(51, 58, sa);
setpixel(42, 59, sa);
setpixel(43, 59, sa);
setpixel(44, 59, sa);
setpixel(45, 59, sa);
setpixel(46, 59, sa);
setpixel(47, 59, sa);
setpixel(48, 59, sa);
setpixel(49, 59, sa);
setpixel(50, 59, sa);
setpixel(41, 60, sa);
setpixel(42, 60, sa);
setpixel(43, 60, sa);
setpixel(44, 60, sa);
setpixel(45, 60, sa);
setpixel(46, 60, sa);
setpixel(47, 60, sa);
setpixel(48, 60, sa);
setpixel(49, 60, sa);
setpixel(40, 61, sa);
setpixel(41, 61, sa);
setpixel(42, 61, sa);
setpixel(43, 61, sa);
setpixel(44, 61, sa);
setpixel(45, 61, sa);
setpixel(46, 61, sa);
setpixel(47, 61, sa);
setpixel(48, 61, sa);
setpixel(40, 62, sa);
setpixel(41, 62, sa);
setpixel(42, 62, sa);
setpixel(43, 62, sa);
setpixel(44, 62, sa);
setpixel(45, 62, sa);
setpixel(46, 62, sa);
setpixel(47, 62, sa);
setpixel(39, 63, sa);
setpixel(40, 63, sa);
setpixel(41, 63, sa);
setpixel(42, 63, sa);
setpixel(43, 63, sa);
setpixel(44, 63, sa);
setpixel(45, 63, sa);
setpixel(46, 63, sa);
setpixel(38, 64, sa);
setpixel(39, 64, sa);
setpixel(40, 64, sa);
setpixel(41, 64, sa);
setpixel(42, 64, sa);
setpixel(43, 64, sa);
setpixel(44, 64, sa);
setpixel(45, 64, sa);
setpixel(37, 65, sa);
setpixel(38, 65, sa);
setpixel(39, 65, sa);
setpixel(40, 65, sa);
setpixel(41, 65, sa);
setpixel(42, 65, sa);
setpixel(43, 65, sa);
setpixel(44, 65, sa);
setpixel(36, 66, sa);
setpixel(37, 66, sa);
setpixel(38, 66, sa);
setpixel(39, 66, sa);
setpixel(40, 66, sa);
setpixel(41, 66, sa);
setpixel(42, 66, sa);
setpixel(43, 66, sa);
setpixel(44, 66, sa);
setpixel(36, 67, sa);
setpixel(37, 67, sa);
setpixel(38, 67, sa);
setpixel(39, 67, sa);
setpixel(40, 67, sa);
setpixel(41, 67, sa);
setpixel(42, 67, sa);
setpixel(43, 67, sa);
setpixel(35, 68, sa);
setpixel(36, 68, sa);
setpixel(37, 68, sa);
setpixel(38, 68, sa);
setpixel(39, 68, sa);
setpixel(40, 68, sa);
setpixel(41, 68, sa);
setpixel(42, 68, sa);
setpixel(34, 69, sa);
setpixel(35, 69, sa);
setpixel(36, 69, sa);
setpixel(37, 69, sa);
setpixel(38, 69, sa);
setpixel(39, 69, sa);
setpixel(40, 69, sa);
setpixel(41, 69, sa);
setpixel(33, 70, sa);
setpixel(34, 70, sa);
setpixel(35, 70, sa);
setpixel(36, 70, sa);
setpixel(37, 70, sa);
setpixel(38, 70, sa);
setpixel(39, 70, sa);
setpixel(40, 70, sa);
setpixel(32, 71, sa);
setpixel(33, 71, sa);
setpixel(34, 71, sa);
setpixel(35, 71, sa);
setpixel(36, 71, sa);
setpixel(37, 71, sa);
setpixel(38, 71, sa);
setpixel(39, 71, sa);
setpixel(31, 72, sa);
setpixel(32, 72, sa);
setpixel(33, 72, sa);
setpixel(34, 72, sa);
setpixel(35, 72, sa);
setpixel(36, 72, sa);
setpixel(37, 72, sa);
setpixel(38, 72, sa);
setpixel(29, 73, sa);
setpixel(30, 73, sa);
setpixel(31, 73, sa);
setpixel(32, 73, sa);
setpixel(33, 73, sa);
setpixel(34, 73, sa);
setpixel(35, 73, sa);
setpixel(36, 73, sa);
setpixel(37, 73, sa);
setpixel(28, 74, sa);
setpixel(29, 74, sa);
setpixel(30, 74, sa);
setpixel(31, 74, sa);
setpixel(32, 74, sa);
setpixel(33, 74, sa);
setpixel(34, 74, sa);
setpixel(35, 74, sa);
setpixel(36, 74, sa);
setpixel(28, 75, sa);
setpixel(29, 75, sa);
setpixel(30, 75, sa);
setpixel(31, 75, sa);
setpixel(32, 75, sa);
setpixel(33, 75, sa);
setpixel(34, 75, sa);
setpixel(35, 75, sa);
setpixel(27, 76, sa);
setpixel(28, 76, sa);
setpixel(29, 76, sa);
setpixel(30, 76, sa);
setpixel(31, 76, sa);
setpixel(32, 76, sa);
setpixel(33, 76, sa);
setpixel(34, 76, sa);
setpixel(26, 77, sa);
setpixel(27, 77, sa);
setpixel(28, 77, sa);
setpixel(29, 77, sa);
setpixel(30, 77, sa);
setpixel(31, 77, sa);
setpixel(32, 77, sa);
setpixel(33, 77, sa);
setpixel(26, 78, sa);
setpixel(27, 78, sa);
setpixel(28, 78, sa);
setpixel(29, 78, sa);
setpixel(30, 78, sa);
setpixel(31, 78, sa);
setpixel(32, 78, sa);
setpixel(33, 78, sa);
setpixel(27, 79, sa);
setpixel(28, 79, sa);
setpixel(29, 79, sa);
setpixel(30, 79, sa);
setpixel(31, 79, sa);
setpixel(32, 79, sa);
setpixel(27, 80, sa);
setpixel(29, 80, sa);
setpixel(30, 80, sa);
setpixel(29, 81, sa);
setpixel(28, 82, sa);
        
        
        
        
        
        
    }
    
    
    
}
