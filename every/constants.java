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
public class constants {
    
    public static trigger truetrigger = new trigger( true );
    public static trigger falsetrigger = new trigger( false );
    
    public static room startingroom;
    
    public static gobdun.warp_vil gobdun_bossroom;
    
    public static Color gold = new Color( 219, 209, 3 );
    
    public static Color darkgold = new Color( 190, 181, 2 );
    
    public static Color sidebar = new Color( 32, 160, 32 );
    
    
    public static Color fadedred = new Color( 255, 0, 0, 187 );
    
    
    
    
    public static boolean cheatbool = false;
    
    //#################### color ###########################
    
    public static Color sky = new Color( 105, 213, 201 );
    public static Color grass = new Color( 7, 173, 7 );
    public static Color brown = new Color( 63, 33, 20 );
    public static Color field = new Color( 18, 84, 0 );
    public static Color swordvil = new Color( 143, 207, 1 );
    public static Color spearvil = new Color( 188, 112, 0 );
    public static Color bowvil = new Color( 9, 200, 0 );
    public static Color dnagvil = new Color( 0, 210, 40 );
    public static Color penvil = new Color( 110, 255, 0 );
    public static Color darkbrown = new Color( 45, 22, 14 );
    public static Color firevil = new Color( 46, 4, 0 );
    
    
    public static Color sworddunwall = Color.LIGHT_GRAY;
    public static Color sworddunfloor = Color.DARK_GRAY;
    
    public static Color speardunwall = new Color( 171, 171, 171 );
    public static Color speardunfloor = new Color( 200, 200, 200 );
    
    
    public static String speardunladder = "spear";
    
    public static Color firedunwall = new Color( 155, 94, 67 );
    public static Color firedunfloor = new Color( 72, 0, 0 );
    
    
    public static String firedunladder = "LIGHT_GRAY";
    
    public static Color bowdunwall = new Color( 241, 163, 23 );
    public static Color bowdunfloor = new Color( 163, 120, 13 );
    
    public static Color bowdunlowwall = new Color( 184, 138, 46 );
    public static Color bowdunlowfloor = new Color( 94, 71, 24 );
    
    public static String bowdunladder = "LIGHT_GRAY";
    public static String bowdunlowladder = "LIGHT_GRAY";
    
    public static Color gobdunwall = new Color( 86, 86, 86 );
    public static Color gobdunfloor = new Color( 42, 42, 42 );
    
    public static Color fadedblack = new Color( 0, 0, 0, 128 );
    
    
    
    //#################### color end ########################
    
    private static unit taldo;
    private static jpanel1 panel;
    
    
    public static int right_of_screen = 1250;
    public static int bottom_of_screen = 750;
    
    
    
    
    
    public static void setpanel( jpanel1 pan )
    {
        panel = pan;
    }
    
    public static jpanel1 getpanel()
    {
        return panel;
    }
    
    
    public static void settaldo( unit u )
    {
        taldo = u;
    }
    
    public static unit gettaldo()
    {
        return taldo;
    }
    
    
    
    
    
    
    public static int taldoheight()
    {
        return 79;
    }
    
    public static int taldowidth()
    {
        return 26;
    }
    
    
    
    
    
    
    public static int distance( int x1, int y1, int x2, int y2 )
    {
        return ( int ) Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ));
    }
    
}
