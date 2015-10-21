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
public class heart extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    private Color sg;
    
    
    public heart( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x, y + 20, 0, 0, -10, 1000000, false, new boolean[10], new Color[10], 20, 20, 0, 0 );
        
        
        
sa = new Color(153,153,153);
sb = new Color(255,0,35,120);
sc = new Color(255,0,14,140);
sd = new Color(255,23,1,150);
se = new Color(255,19,0,200);
sf = new Color(255,0,22,170);
sg = new Color(255,0,0,240);

        
        buildpic();
        
        name = "heart";
        
        
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 20 * 20; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        setpixel(5, 0, sa);
setpixel(6, 0, sa);
setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(12, 0, sa);
setpixel(13, 0, sa);
setpixel(14, 0, sa);
setpixel(15, 0, sa);
setpixel(4, 1, sa);
setpixel(5, 1, sa);
setpixel(6, 1, sb);
setpixel(7, 1, sb);
setpixel(8, 1, sb);
setpixel(9, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sb);
setpixel(13, 1, sb);
setpixel(14, 1, sb);
setpixel(15, 1, sa);
setpixel(16, 1, sa);
setpixel(3, 2, sa);
setpixel(4, 2, sa);
setpixel(5, 2, sb);
setpixel(6, 2, sb);
setpixel(7, 2, sb);
setpixel(8, 2, sb);
setpixel(9, 2, sb);
setpixel(10, 2, sa);
setpixel(11, 2, sb);
setpixel(12, 2, sb);
setpixel(13, 2, sb);
setpixel(14, 2, sb);
setpixel(15, 2, sb);
setpixel(16, 2, sa);
setpixel(17, 2, sa);
setpixel(2, 3, sa);
setpixel(3, 3, sa);
setpixel(4, 3, sb);
setpixel(5, 3, sb);
setpixel(6, 3, sc);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sb);
setpixel(11, 3, sc);
setpixel(12, 3, sc);
setpixel(13, 3, sc);
setpixel(14, 3, sc);
setpixel(15, 3, sb);
setpixel(16, 3, sb);
setpixel(17, 3, sa);
setpixel(18, 3, sa);
setpixel(1, 4, sa);
setpixel(2, 4, sa);
setpixel(3, 4, sb);
setpixel(4, 4, sb);
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
setpixel(16, 4, sb);
setpixel(17, 4, sb);
setpixel(18, 4, sa);
setpixel(19, 4, sa);
setpixel(1, 5, sa);
setpixel(2, 5, sb);
setpixel(3, 5, sb);
setpixel(4, 5, sc);
setpixel(5, 5, sc);
setpixel(6, 5, sc);
setpixel(7, 5, sd);
setpixel(8, 5, sd);
setpixel(9, 5, sd);
setpixel(10, 5, sc);
setpixel(11, 5, sd);
setpixel(12, 5, sd);
setpixel(13, 5, sd);
setpixel(14, 5, sc);
setpixel(15, 5, sc);
setpixel(16, 5, sc);
setpixel(17, 5, sb);
setpixel(18, 5, sb);
setpixel(19, 5, sa);
setpixel(20, 5, sa);
setpixel(1, 6, sa);
setpixel(2, 6, sb);
setpixel(3, 6, sc);
setpixel(4, 6, sc);
setpixel(5, 6, sc);
setpixel(6, 6, sd);
setpixel(7, 6, sd);
setpixel(8, 6, se);
setpixel(9, 6, se);
setpixel(10, 6, sd);
setpixel(11, 6, se);
setpixel(12, 6, se);
setpixel(13, 6, sd);
setpixel(14, 6, sd);
setpixel(15, 6, sc);
setpixel(16, 6, sc);
setpixel(17, 6, sc);
setpixel(18, 6, sb);
setpixel(19, 6, sa);
setpixel(0, 7, sa);
setpixel(1, 7, sa);
setpixel(2, 7, sb);
setpixel(3, 7, sf);
setpixel(4, 7, sc);
setpixel(5, 7, sd);
setpixel(6, 7, sd);
setpixel(7, 7, se);
setpixel(8, 7, se);
setpixel(9, 7, sg);
setpixel(10, 7, se);
setpixel(11, 7, sg);
setpixel(12, 7, se);
setpixel(13, 7, se);
setpixel(14, 7, sd);
setpixel(15, 7, sd);
setpixel(16, 7, sc);
setpixel(17, 7, sc);
setpixel(18, 7, sb);
setpixel(19, 7, sa);
setpixel(1, 8, sa);
setpixel(2, 8, sb);
setpixel(3, 8, sf);
setpixel(4, 8, sc);
setpixel(5, 8, sd);
setpixel(6, 8, se);
setpixel(7, 8, se);
setpixel(8, 8, sg);
setpixel(9, 8, sg);
setpixel(10, 8, sg);
setpixel(11, 8, sg);
setpixel(12, 8, sg);
setpixel(13, 8, se);
setpixel(14, 8, se);
setpixel(15, 8, sd);
setpixel(16, 8, sc);
setpixel(17, 8, sc);
setpixel(18, 8, sb);
setpixel(19, 8, sa);
setpixel(1, 9, sa);
setpixel(2, 9, sb);
setpixel(3, 9, sf);
setpixel(4, 9, sc);
setpixel(5, 9, sd);
setpixel(6, 9, se);
setpixel(7, 9, se);
setpixel(8, 9, sg);
setpixel(9, 9, sg);
setpixel(10, 9, sg);
setpixel(11, 9, sg);
setpixel(12, 9, sg);
setpixel(13, 9, se);
setpixel(14, 9, se);
setpixel(15, 9, sd);
setpixel(16, 9, sc);
setpixel(17, 9, sc);
setpixel(18, 9, sb);
setpixel(19, 9, sa);
setpixel(1, 10, sa);
setpixel(2, 10, sb);
setpixel(3, 10, sc);
setpixel(4, 10, sc);
setpixel(5, 10, sd);
setpixel(6, 10, sd);
setpixel(7, 10, se);
setpixel(8, 10, se);
setpixel(9, 10, sg);
setpixel(10, 10, sg);
setpixel(11, 10, sg);
setpixel(12, 10, se);
setpixel(13, 10, se);
setpixel(14, 10, sd);
setpixel(15, 10, sd);
setpixel(16, 10, sc);
setpixel(17, 10, sc);
setpixel(18, 10, sb);
setpixel(19, 10, sa);
setpixel(1, 11, sa);
setpixel(2, 11, sa);
setpixel(3, 11, sb);
setpixel(4, 11, sc);
setpixel(5, 11, sc);
setpixel(6, 11, sd);
setpixel(7, 11, sd);
setpixel(8, 11, se);
setpixel(9, 11, se);
setpixel(10, 11, sg);
setpixel(11, 11, se);
setpixel(12, 11, se);
setpixel(13, 11, sd);
setpixel(14, 11, sd);
setpixel(15, 11, sc);
setpixel(16, 11, sc);
setpixel(17, 11, sb);
setpixel(18, 11, sa);
setpixel(19, 11, sa);
setpixel(2, 12, sa);
setpixel(3, 12, sa);
setpixel(4, 12, sb);
setpixel(5, 12, sc);
setpixel(6, 12, sc);
setpixel(7, 12, sd);
setpixel(8, 12, sd);
setpixel(9, 12, se);
setpixel(10, 12, se);
setpixel(11, 12, se);
setpixel(12, 12, sd);
setpixel(13, 12, sd);
setpixel(14, 12, sc);
setpixel(15, 12, sc);
setpixel(16, 12, sb);
setpixel(17, 12, sa);
setpixel(18, 12, sa);
setpixel(3, 13, sa);
setpixel(4, 13, sa);
setpixel(5, 13, sb);
setpixel(6, 13, sc);
setpixel(7, 13, sc);
setpixel(8, 13, sd);
setpixel(9, 13, sd);
setpixel(10, 13, se);
setpixel(11, 13, sd);
setpixel(12, 13, sd);
setpixel(13, 13, sc);
setpixel(14, 13, sc);
setpixel(15, 13, sb);
setpixel(16, 13, sa);
setpixel(17, 13, sa);
setpixel(4, 14, sa);
setpixel(5, 14, sa);
setpixel(6, 14, sb);
setpixel(7, 14, sc);
setpixel(8, 14, sc);
setpixel(9, 14, sd);
setpixel(10, 14, sd);
setpixel(11, 14, sd);
setpixel(12, 14, sc);
setpixel(13, 14, sc);
setpixel(14, 14, sb);
setpixel(15, 14, sa);
setpixel(16, 14, sa);
setpixel(5, 15, sa);
setpixel(6, 15, sa);
setpixel(7, 15, sb);
setpixel(8, 15, sc);
setpixel(9, 15, sc);
setpixel(10, 15, sd);
setpixel(11, 15, sc);
setpixel(12, 15, sc);
setpixel(13, 15, sb);
setpixel(14, 15, sa);
setpixel(15, 15, sa);
setpixel(6, 16, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sb);
setpixel(9, 16, sc);
setpixel(10, 16, sc);
setpixel(11, 16, sc);
setpixel(12, 16, sb);
setpixel(13, 16, sa);
setpixel(14, 16, sa);
setpixel(7, 17, sa);
setpixel(8, 17, sa);
setpixel(9, 17, sb);
setpixel(10, 17, sb);
setpixel(11, 17, sb);
setpixel(12, 17, sa);
setpixel(13, 17, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sa);
setpixel(10, 18, sb);
setpixel(11, 18, sa);
setpixel(12, 18, sa);
setpixel(9, 19, sa);
setpixel(10, 19, sa);
setpixel(11, 19, sa);
setpixel(10, 20, sa);
        
        

for ( int c = 0; c < 20; c++ ) {
    erasepixel( 0, c );
}






        
        
        
        
        
        
    }
    
    
    
}
