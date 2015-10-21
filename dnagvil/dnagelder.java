/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class dnagelder extends unit {
    
    private chattrigger chat2;
    
    private int counter;
    
    
    private boolean added;
    
    public dnagelder( room currentroom, int x, int y, AI ai )
    {
        super( 9000, 0, 4, "blankweap", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
        
        counter = 0;
        added = false;
        
        
        this.setName("Dnagvil Elder");
        this.setStatement("Greetings, Taldo.");
        
        
        trigger spoke1 = new trigger( false, "spearvil_spearelder_spoke1" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat("Greetings, Taldo.");
        chat1.addchat("I am sure you have heard similar stories from the other elders, but I will tell you anyway.");
        chat1.addchat("I have known of your coming for some time now, but in this war-stricken land, there is little trust between peoples.");
        chat1.addchat("My people will not give you our weapon.");
        chat1.addchat("My people have always allowed for challengers to try to take the weapon.");
        chat1.addchat("They believe that only a hero of legend can get in and defeat the Guardian.");
        chat1.addchat("If you can defeat the Guardian, my people will allow you to take the weapon.");
        chat1.addchat("Good luck.");
        
        addchattrigger(chat1);
        
        chat2 = new chattrigger( current.getpanel().getsavefile().spearvil_spearelder_spoke1 );
        
        
        chat2.addchat("If you defeat the Guardian, the weapon is yours.  Good luck.");
        
        
        
    
    }
    
    
    @Override
    public void respawn()
    {
        
        super.respawn();
        
        
        if ( current.getpanel().getsavefile().spearvil_spearelder_spoke1.gettrigger() && !added ) {
            
            addchattrigger( chat2 );
            added = true;
            
        }
        
    }
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( current.getpanel().getsavefile().spearvil_spearelder_spoke1.gettrigger() )
        {
//            addchattrigger(chat2);
            
            counter++;
            
            if ( counter >= 10 && !added ) {
                addchattrigger(chat2);
                added = true;
            }
            
            
        }
    }
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(29);
        f.setlength(71);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
Color sa = new Color(191,155,105);
Color sb = new Color(221,196,162);
Color sc = new Color(238,189,140);
Color sd = new Color(204,204,204);
Color se = new Color(255,255,255);
Color sf = new Color(0,0,0);
Color sg = new Color(210,157,105);
Color sh = new Color(25,12,0);








//<editor-fold defaultstate="collapsed" desc="build figure">







setpixel(15, 0, sa);
setpixel(16, 0, sa);
setpixel(17, 0, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sb);
setpixel(16, 1, sa);
setpixel(17, 1, sb);
setpixel(18, 1, sa);
setpixel(19, 1, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sb);
setpixel(14, 2, sb);
setpixel(15, 2, sa);
setpixel(16, 2, sb);
setpixel(17, 2, sa);
setpixel(18, 2, sb);
setpixel(19, 2, sb);
setpixel(20, 2, sa);
setpixel(21, 2, sa);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sb);
setpixel(14, 3, sa);
setpixel(15, 3, sb);
setpixel(16, 3, sa);
setpixel(17, 3, sb);
setpixel(18, 3, sa);
setpixel(19, 3, sb);
setpixel(20, 3, sb);
setpixel(21, 3, sb);
setpixel(22, 3, sa);
setpixel(23, 3, sa);
setpixel(7, 4, sa);
setpixel(8, 4, sa);
setpixel(9, 4, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sa);
setpixel(14, 4, sb);
setpixel(15, 4, sb);
setpixel(16, 4, sa);
setpixel(17, 4, sb);
setpixel(18, 4, sb);
setpixel(19, 4, sa);
setpixel(20, 4, sb);
setpixel(21, 4, sb);
setpixel(22, 4, sb);
setpixel(23, 4, sb);
setpixel(24, 4, sa);
setpixel(25, 4, sa);
setpixel(5, 5, sa);
setpixel(6, 5, sa);
setpixel(7, 5, sb);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(10, 5, sb);
setpixel(11, 5, sb);
setpixel(12, 5, sa);
setpixel(13, 5, sb);
setpixel(14, 5, sb);
setpixel(15, 5, sb);
setpixel(16, 5, sa);
setpixel(17, 5, sb);
setpixel(18, 5, sb);
setpixel(19, 5, sb);
setpixel(20, 5, sa);
setpixel(21, 5, sa);
setpixel(22, 5, sa);
setpixel(23, 5, sa);
setpixel(24, 5, sa);
setpixel(6, 6, sa);
setpixel(7, 6, sa);
setpixel(8, 6, sa);
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
setpixel(20, 6, sc);
setpixel(21, 6, sc);
setpixel(22, 6, sc);
setpixel(11, 7, sd);
setpixel(12, 7, sd);
setpixel(13, 7, sd);
setpixel(14, 7, sd);
setpixel(15, 7, sd);
setpixel(16, 7, sd);
setpixel(17, 7, sc);
setpixel(18, 7, sc);
setpixel(19, 7, sc);
setpixel(20, 7, sc);
setpixel(21, 7, sc);
setpixel(22, 7, sc);
setpixel(10, 8, sd);
setpixel(11, 8, sd);
setpixel(12, 8, sd);
setpixel(13, 8, sd);
setpixel(14, 8, sd);
setpixel(15, 8, sd);
setpixel(16, 8, sc);
setpixel(17, 8, sc);
setpixel(18, 8, sc);
setpixel(19, 8, se);
setpixel(20, 8, sf);
setpixel(21, 8, sc);
setpixel(22, 8, sc);
setpixel(9, 9, sd);
setpixel(10, 9, sd);
setpixel(11, 9, sd);
setpixel(12, 9, sd);
setpixel(13, 9, sd);
setpixel(14, 9, sd);
setpixel(15, 9, sd);
setpixel(16, 9, sc);
setpixel(17, 9, sc);
setpixel(18, 9, sc);
setpixel(19, 9, sf);
setpixel(20, 9, sf);
setpixel(21, 9, sc);
setpixel(22, 9, sc);
setpixel(8, 10, sd);
setpixel(9, 10, sd);
setpixel(10, 10, sd);
setpixel(11, 10, sd);
setpixel(12, 10, sd);
setpixel(13, 10, sc);
setpixel(14, 10, sd);
setpixel(15, 10, sd);
setpixel(16, 10, sc);
setpixel(17, 10, sc);
setpixel(18, 10, sc);
setpixel(19, 10, sc);
setpixel(20, 10, sc);
setpixel(21, 10, sc);
setpixel(22, 10, sc);
setpixel(23, 10, sc);
setpixel(7, 11, sd);
setpixel(8, 11, sd);
setpixel(9, 11, sd);
setpixel(10, 11, sd);
setpixel(11, 11, sd);
setpixel(12, 11, sc);
setpixel(13, 11, sc);
setpixel(14, 11, sc);
setpixel(15, 11, sd);
setpixel(16, 11, sc);
setpixel(17, 11, sc);
setpixel(18, 11, sc);
setpixel(19, 11, sc);
setpixel(20, 11, sc);
setpixel(21, 11, sc);
setpixel(22, 11, sc);
setpixel(23, 11, sc);
setpixel(6, 12, sd);
setpixel(7, 12, sd);
setpixel(8, 12, sd);
setpixel(9, 12, sd);
setpixel(10, 12, se);
setpixel(11, 12, se);
setpixel(12, 12, se);
setpixel(13, 12, sc);
setpixel(14, 12, sc);
setpixel(15, 12, sd);
setpixel(16, 12, sd);
setpixel(17, 12, sc);
setpixel(18, 12, sc);
setpixel(19, 12, sd);
setpixel(20, 12, sd);
setpixel(21, 12, sd);
setpixel(22, 12, sc);
setpixel(4, 13, sd);
setpixel(5, 13, sd);
setpixel(6, 13, sd);
setpixel(7, 13, sd);
setpixel(8, 13, se);
setpixel(9, 13, se);
setpixel(10, 13, sd);
setpixel(11, 13, se);
setpixel(12, 13, se);
setpixel(13, 13, sc);
setpixel(14, 13, sc);
setpixel(15, 13, sc);
setpixel(16, 13, sd);
setpixel(17, 13, sd);
setpixel(18, 13, sc);
setpixel(19, 13, sc);
setpixel(20, 13, sg);
setpixel(21, 13, sg);
setpixel(22, 13, sg);
setpixel(3, 14, sd);
setpixel(4, 14, sd);
setpixel(5, 14, sd);
setpixel(6, 14, se);
setpixel(7, 14, se);
setpixel(8, 14, sd);
setpixel(9, 14, sd);
setpixel(10, 14, sd);
setpixel(11, 14, se);
setpixel(12, 14, se);
setpixel(13, 14, se);
setpixel(14, 14, sc);
setpixel(15, 14, sc);
setpixel(16, 14, sc);
setpixel(17, 14, sd);
setpixel(18, 14, sd);
setpixel(19, 14, sd);
setpixel(20, 14, sc);
setpixel(21, 14, sc);
setpixel(22, 14, sc);
setpixel(2, 15, sd);
setpixel(3, 15, sd);
setpixel(4, 15, sd);
setpixel(5, 15, se);
setpixel(6, 15, se);
setpixel(7, 15, sd);
setpixel(8, 15, se);
setpixel(9, 15, se);
setpixel(10, 15, se);
setpixel(11, 15, se);
setpixel(12, 15, se);
setpixel(13, 15, se);
setpixel(14, 15, se);
setpixel(15, 15, se);
setpixel(16, 15, se);
setpixel(17, 15, sc);
setpixel(18, 15, sc);
setpixel(19, 15, sd);
setpixel(20, 15, sd);
setpixel(21, 15, sd);
setpixel(22, 15, sd);
setpixel(23, 15, sd);
setpixel(3, 16, sd);
setpixel(4, 16, se);
setpixel(5, 16, se);
setpixel(6, 16, se);
setpixel(7, 16, se);
setpixel(8, 16, se);
setpixel(9, 16, se);
setpixel(10, 16, se);
setpixel(11, 16, se);
setpixel(12, 16, se);
setpixel(13, 16, se);
setpixel(14, 16, se);
setpixel(15, 16, se);
setpixel(16, 16, se);
setpixel(17, 16, se);
setpixel(18, 16, se);
setpixel(19, 16, sc);
setpixel(20, 16, sc);
setpixel(21, 16, sc);
setpixel(22, 16, sd);
setpixel(23, 16, sd);
setpixel(3, 17, sd);
setpixel(4, 17, se);
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
setpixel(17, 17, se);
setpixel(18, 17, se);
setpixel(19, 17, se);
setpixel(20, 17, se);
setpixel(22, 17, sd);
setpixel(3, 18, se);
setpixel(4, 18, se);
setpixel(5, 18, se);
setpixel(6, 18, se);
setpixel(7, 18, sd);
setpixel(8, 18, se);
setpixel(9, 18, se);
setpixel(10, 18, se);
setpixel(11, 18, se);
setpixel(12, 18, se);
setpixel(13, 18, se);
setpixel(14, 18, se);
setpixel(15, 18, se);
setpixel(16, 18, se);
setpixel(17, 18, sd);
setpixel(18, 18, se);
setpixel(19, 18, se);
setpixel(20, 18, se);
setpixel(2, 19, se);
setpixel(3, 19, se);
setpixel(4, 19, se);
setpixel(5, 19, se);
setpixel(6, 19, sd);
setpixel(7, 19, sd);
setpixel(8, 19, sd);
setpixel(9, 19, se);
setpixel(10, 19, se);
setpixel(11, 19, se);
setpixel(12, 19, se);
setpixel(13, 19, se);
setpixel(14, 19, se);
setpixel(15, 19, se);
setpixel(16, 19, se);
setpixel(17, 19, sd);
setpixel(18, 19, se);
setpixel(19, 19, se);
setpixel(20, 19, se);
setpixel(2, 20, se);
setpixel(3, 20, se);
setpixel(4, 20, se);
setpixel(5, 20, sd);
setpixel(6, 20, sd);
setpixel(7, 20, se);
setpixel(8, 20, se);
setpixel(9, 20, sd);
setpixel(10, 20, se);
setpixel(11, 20, se);
setpixel(12, 20, se);
setpixel(13, 20, se);
setpixel(14, 20, se);
setpixel(15, 20, se);
setpixel(16, 20, se);
setpixel(17, 20, sd);
setpixel(18, 20, se);
setpixel(19, 20, se);
setpixel(2, 21, se);
setpixel(3, 21, se);
setpixel(4, 21, sd);
setpixel(5, 21, sd);
setpixel(6, 21, se);
setpixel(7, 21, se);
setpixel(8, 21, se);
setpixel(9, 21, se);
setpixel(10, 21, sd);
setpixel(11, 21, sd);
setpixel(12, 21, se);
setpixel(13, 21, se);
setpixel(14, 21, se);
setpixel(15, 21, se);
setpixel(16, 21, se);
setpixel(17, 21, sd);
setpixel(18, 21, se);
setpixel(19, 21, se);
setpixel(2, 22, se);
setpixel(3, 22, sd);
setpixel(4, 22, sd);
setpixel(5, 22, se);
setpixel(6, 22, se);
setpixel(7, 22, se);
setpixel(8, 22, se);
setpixel(9, 22, se);
setpixel(10, 22, se);
setpixel(11, 22, sd);
setpixel(12, 22, sd);
setpixel(13, 22, se);
setpixel(14, 22, se);
setpixel(15, 22, se);
setpixel(16, 22, se);
setpixel(17, 22, sd);
setpixel(18, 22, se);
setpixel(19, 22, se);
setpixel(2, 23, se);
setpixel(3, 23, sd);
setpixel(4, 23, se);
setpixel(5, 23, se);
setpixel(6, 23, se);
setpixel(7, 23, se);
setpixel(8, 23, se);
setpixel(9, 23, se);
setpixel(10, 23, se);
setpixel(11, 23, se);
setpixel(12, 23, sd);
setpixel(13, 23, sd);
setpixel(14, 23, se);
setpixel(15, 23, se);
setpixel(16, 23, se);
setpixel(17, 23, se);
setpixel(18, 23, se);
setpixel(2, 24, se);
setpixel(3, 24, sd);
setpixel(4, 24, sd);
setpixel(5, 24, se);
setpixel(6, 24, se);
setpixel(7, 24, se);
setpixel(8, 24, se);
setpixel(9, 24, se);
setpixel(10, 24, se);
setpixel(11, 24, se);
setpixel(12, 24, se);
setpixel(13, 24, se);
setpixel(14, 24, sd);
setpixel(15, 24, sd);
setpixel(16, 24, se);
setpixel(17, 24, se);
setpixel(18, 24, se);
setpixel(2, 25, se);
setpixel(3, 25, se);
setpixel(4, 25, sd);
setpixel(5, 25, se);
setpixel(6, 25, se);
setpixel(7, 25, se);
setpixel(8, 25, se);
setpixel(9, 25, se);
setpixel(10, 25, se);
setpixel(11, 25, se);
setpixel(12, 25, se);
setpixel(13, 25, se);
setpixel(14, 25, se);
setpixel(15, 25, sd);
setpixel(16, 25, se);
setpixel(17, 25, se);
setpixel(18, 25, se);
setpixel(26, 25, sh);
setpixel(2, 26, se);
setpixel(3, 26, se);
setpixel(4, 26, sd);
setpixel(5, 26, se);
setpixel(6, 26, se);
setpixel(7, 26, se);
setpixel(8, 26, se);
setpixel(9, 26, se);
setpixel(10, 26, se);
setpixel(11, 26, se);
setpixel(12, 26, se);
setpixel(13, 26, se);
setpixel(14, 26, se);
setpixel(15, 26, se);
setpixel(16, 26, sd);
setpixel(17, 26, se);
setpixel(18, 26, se);
setpixel(25, 26, sh);
setpixel(26, 26, sh);
setpixel(27, 26, sh);
setpixel(2, 27, se);
setpixel(3, 27, se);
setpixel(4, 27, sd);
setpixel(5, 27, sd);
setpixel(6, 27, se);
setpixel(7, 27, se);
setpixel(8, 27, se);
setpixel(9, 27, se);
setpixel(10, 27, se);
setpixel(11, 27, se);
setpixel(12, 27, se);
setpixel(13, 27, se);
setpixel(14, 27, se);
setpixel(15, 27, se);
setpixel(16, 27, sd);
setpixel(17, 27, sd);
setpixel(18, 27, sd);
setpixel(19, 27, sd);
setpixel(20, 27, sd);
setpixel(21, 27, sd);
setpixel(25, 27, sh);
setpixel(26, 27, sh);
setpixel(27, 27, sh);
setpixel(2, 28, se);
setpixel(3, 28, se);
setpixel(4, 28, se);
setpixel(5, 28, sd);
setpixel(6, 28, sd);
setpixel(7, 28, se);
setpixel(8, 28, se);
setpixel(9, 28, se);
setpixel(10, 28, se);
setpixel(11, 28, se);
setpixel(12, 28, se);
setpixel(13, 28, se);
setpixel(14, 28, se);
setpixel(15, 28, se);
setpixel(16, 28, se);
setpixel(17, 28, sd);
setpixel(18, 28, se);
setpixel(19, 28, se);
setpixel(20, 28, se);
setpixel(21, 28, se);
setpixel(22, 28, sd);
setpixel(23, 28, sd);
setpixel(24, 28, sd);
setpixel(25, 28, sd);
setpixel(26, 28, sh);
setpixel(27, 28, sh);
setpixel(2, 29, se);
setpixel(3, 29, se);
setpixel(4, 29, se);
setpixel(5, 29, se);
setpixel(6, 29, sd);
setpixel(7, 29, sd);
setpixel(8, 29, se);
setpixel(9, 29, se);
setpixel(10, 29, se);
setpixel(11, 29, se);
setpixel(12, 29, se);
setpixel(13, 29, se);
setpixel(14, 29, se);
setpixel(15, 29, se);
setpixel(16, 29, se);
setpixel(17, 29, se);
setpixel(18, 29, se);
setpixel(19, 29, se);
setpixel(20, 29, se);
setpixel(21, 29, se);
setpixel(22, 29, se);
setpixel(23, 29, se);
setpixel(24, 29, se);
setpixel(25, 29, se);
setpixel(26, 29, sd);
setpixel(27, 29, sh);
setpixel(3, 30, se);
setpixel(4, 30, se);
setpixel(5, 30, se);
setpixel(6, 30, se);
setpixel(7, 30, se);
setpixel(8, 30, sd);
setpixel(9, 30, se);
setpixel(10, 30, se);
setpixel(11, 30, se);
setpixel(12, 30, se);
setpixel(13, 30, se);
setpixel(14, 30, se);
setpixel(15, 30, se);
setpixel(16, 30, se);
setpixel(17, 30, se);
setpixel(18, 30, se);
setpixel(19, 30, se);
setpixel(20, 30, se);
setpixel(21, 30, se);
setpixel(22, 30, se);
setpixel(23, 30, se);
setpixel(24, 30, sd);
setpixel(25, 30, sd);
setpixel(26, 30, sc);
setpixel(27, 30, sc);
setpixel(28, 30, sc);
setpixel(3, 31, se);
setpixel(4, 31, se);
setpixel(5, 31, se);
setpixel(6, 31, se);
setpixel(7, 31, se);
setpixel(8, 31, sd);
setpixel(9, 31, sd);
setpixel(10, 31, sd);
setpixel(11, 31, se);
setpixel(12, 31, se);
setpixel(13, 31, se);
setpixel(14, 31, se);
setpixel(15, 31, se);
setpixel(16, 31, se);
setpixel(17, 31, se);
setpixel(18, 31, se);
setpixel(19, 31, se);
setpixel(20, 31, se);
setpixel(21, 31, se);
setpixel(22, 31, se);
setpixel(23, 31, sd);
setpixel(24, 31, sc);
setpixel(25, 31, sc);
setpixel(26, 31, sc);
setpixel(27, 31, sg);
setpixel(28, 31, sg);
setpixel(29, 31, sg);
setpixel(3, 32, se);
setpixel(4, 32, se);
setpixel(5, 32, se);
setpixel(6, 32, se);
setpixel(7, 32, se);
setpixel(8, 32, se);
setpixel(9, 32, se);
setpixel(10, 32, sd);
setpixel(11, 32, sd);
setpixel(12, 32, se);
setpixel(13, 32, se);
setpixel(14, 32, se);
setpixel(15, 32, se);
setpixel(16, 32, se);
setpixel(17, 32, se);
setpixel(18, 32, se);
setpixel(19, 32, se);
setpixel(20, 32, se);
setpixel(21, 32, se);
setpixel(22, 32, se);
setpixel(23, 32, sd);
setpixel(24, 32, sc);
setpixel(25, 32, sc);
setpixel(26, 32, sc);
setpixel(27, 32, sc);
setpixel(28, 32, sc);
setpixel(29, 32, sc);
setpixel(3, 33, se);
setpixel(4, 33, se);
setpixel(5, 33, se);
setpixel(6, 33, se);
setpixel(7, 33, se);
setpixel(8, 33, se);
setpixel(9, 33, se);
setpixel(10, 33, se);
setpixel(11, 33, se);
setpixel(12, 33, sd);
setpixel(13, 33, sd);
setpixel(14, 33, sd);
setpixel(15, 33, se);
setpixel(16, 33, se);
setpixel(17, 33, se);
setpixel(18, 33, se);
setpixel(19, 33, se);
setpixel(20, 33, se);
setpixel(21, 33, se);
setpixel(22, 33, sd);
setpixel(23, 33, sd);
setpixel(24, 33, sc);
setpixel(25, 33, sc);
setpixel(26, 33, sc);
setpixel(27, 33, sg);
setpixel(28, 33, sg);
setpixel(29, 33, sg);
setpixel(4, 34, se);
setpixel(5, 34, se);
setpixel(6, 34, se);
setpixel(7, 34, se);
setpixel(8, 34, se);
setpixel(9, 34, se);
setpixel(10, 34, se);
setpixel(11, 34, se);
setpixel(12, 34, se);
setpixel(13, 34, se);
setpixel(14, 34, sd);
setpixel(15, 34, sd);
setpixel(16, 34, sd);
setpixel(17, 34, sd);
setpixel(18, 34, sd);
setpixel(19, 34, sd);
setpixel(20, 34, sd);
setpixel(21, 34, sd);
setpixel(22, 34, sd);
setpixel(23, 34, sc);
setpixel(24, 34, sc);
setpixel(25, 34, sc);
setpixel(26, 34, sc);
setpixel(27, 34, sc);
setpixel(28, 34, sc);
setpixel(4, 35, se);
setpixel(5, 35, se);
setpixel(6, 35, se);
setpixel(7, 35, se);
setpixel(8, 35, se);
setpixel(9, 35, se);
setpixel(10, 35, se);
setpixel(11, 35, se);
setpixel(12, 35, se);
setpixel(13, 35, se);
setpixel(14, 35, se);
setpixel(15, 35, se);
setpixel(16, 35, se);
setpixel(17, 35, se);
setpixel(22, 35, sd);
setpixel(25, 35, sh);
setpixel(26, 35, sh);
setpixel(27, 35, sh);
setpixel(4, 36, sh);
setpixel(5, 36, sh);
setpixel(6, 36, sh);
setpixel(7, 36, sh);
setpixel(8, 36, sh);
setpixel(9, 36, sh);
setpixel(10, 36, sh);
setpixel(11, 36, sh);
setpixel(12, 36, sh);
setpixel(13, 36, sh);
setpixel(14, 36, sh);
setpixel(15, 36, sh);
setpixel(16, 36, sh);
setpixel(17, 36, sh);
setpixel(25, 36, sh);
setpixel(26, 36, sh);
setpixel(27, 36, sh);
setpixel(4, 37, sh);
setpixel(5, 37, sh);
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
setpixel(25, 37, sh);
setpixel(26, 37, sh);
setpixel(27, 37, sh);
setpixel(4, 38, sh);
setpixel(5, 38, sh);
setpixel(6, 38, sh);
setpixel(7, 38, sh);
setpixel(8, 38, sh);
setpixel(9, 38, sh);
setpixel(10, 38, sh);
setpixel(11, 38, sh);
setpixel(12, 38, sh);
setpixel(13, 38, sh);
setpixel(14, 38, sh);
setpixel(15, 38, sh);
setpixel(16, 38, sh);
setpixel(17, 38, sh);
setpixel(25, 38, sh);
setpixel(26, 38, sh);
setpixel(27, 38, sh);
setpixel(28, 38, sh);
setpixel(4, 39, se);
setpixel(5, 39, se);
setpixel(6, 39, se);
setpixel(7, 39, se);
setpixel(8, 39, se);
setpixel(9, 39, sd);
setpixel(10, 39, se);
setpixel(11, 39, se);
setpixel(12, 39, se);
setpixel(13, 39, se);
setpixel(14, 39, se);
setpixel(15, 39, se);
setpixel(16, 39, se);
setpixel(17, 39, se);
setpixel(25, 39, sh);
setpixel(26, 39, sh);
setpixel(27, 39, sh);
setpixel(4, 40, se);
setpixel(5, 40, se);
setpixel(6, 40, se);
setpixel(7, 40, se);
setpixel(8, 40, se);
setpixel(9, 40, se);
setpixel(10, 40, se);
setpixel(11, 40, se);
setpixel(12, 40, se);
setpixel(13, 40, se);
setpixel(14, 40, se);
setpixel(15, 40, se);
setpixel(16, 40, se);
setpixel(17, 40, se);
setpixel(25, 40, sh);
setpixel(26, 40, sh);
setpixel(27, 40, sh);
setpixel(3, 41, se);
setpixel(4, 41, se);
setpixel(5, 41, se);
setpixel(6, 41, se);
setpixel(7, 41, se);
setpixel(8, 41, se);
setpixel(9, 41, se);
setpixel(10, 41, se);
setpixel(11, 41, se);
setpixel(12, 41, se);
setpixel(13, 41, se);
setpixel(14, 41, se);
setpixel(15, 41, se);
setpixel(16, 41, se);
setpixel(17, 41, se);
setpixel(25, 41, sh);
setpixel(26, 41, sh);
setpixel(27, 41, sh);
setpixel(3, 42, se);
setpixel(4, 42, se);
setpixel(5, 42, se);
setpixel(6, 42, se);
setpixel(7, 42, se);
setpixel(8, 42, se);
setpixel(9, 42, se);
setpixel(10, 42, se);
setpixel(11, 42, se);
setpixel(12, 42, se);
setpixel(13, 42, sd);
setpixel(14, 42, se);
setpixel(15, 42, se);
setpixel(16, 42, se);
setpixel(17, 42, se);
setpixel(25, 42, sh);
setpixel(26, 42, sh);
setpixel(27, 42, sh);
setpixel(3, 43, se);
setpixel(4, 43, se);
setpixel(5, 43, se);
setpixel(6, 43, se);
setpixel(7, 43, se);
setpixel(8, 43, se);
setpixel(9, 43, sd);
setpixel(10, 43, se);
setpixel(11, 43, se);
setpixel(12, 43, se);
setpixel(13, 43, sd);
setpixel(14, 43, se);
setpixel(15, 43, se);
setpixel(16, 43, se);
setpixel(17, 43, se);
setpixel(25, 43, sh);
setpixel(26, 43, sh);
setpixel(27, 43, sh);
setpixel(3, 44, se);
setpixel(4, 44, se);
setpixel(5, 44, se);
setpixel(6, 44, se);
setpixel(7, 44, se);
setpixel(8, 44, sd);
setpixel(9, 44, sd);
setpixel(10, 44, se);
setpixel(11, 44, se);
setpixel(12, 44, se);
setpixel(13, 44, sd);
setpixel(14, 44, sd);
setpixel(15, 44, se);
setpixel(16, 44, se);
setpixel(17, 44, se);
setpixel(18, 44, se);
setpixel(25, 44, sh);
setpixel(26, 44, sh);
setpixel(27, 44, sh);
setpixel(2, 45, se);
setpixel(3, 45, se);
setpixel(4, 45, se);
setpixel(5, 45, se);
setpixel(6, 45, se);
setpixel(7, 45, sd);
setpixel(8, 45, sd);
setpixel(9, 45, se);
setpixel(10, 45, se);
setpixel(11, 45, se);
setpixel(12, 45, se);
setpixel(13, 45, se);
setpixel(14, 45, sd);
setpixel(15, 45, sd);
setpixel(16, 45, se);
setpixel(17, 45, se);
setpixel(18, 45, se);
setpixel(25, 45, sh);
setpixel(26, 45, sh);
setpixel(27, 45, sh);
setpixel(2, 46, se);
setpixel(3, 46, se);
setpixel(4, 46, se);
setpixel(5, 46, se);
setpixel(6, 46, se);
setpixel(7, 46, sd);
setpixel(8, 46, se);
setpixel(9, 46, se);
setpixel(10, 46, se);
setpixel(11, 46, se);
setpixel(12, 46, se);
setpixel(13, 46, se);
setpixel(14, 46, se);
setpixel(15, 46, sd);
setpixel(16, 46, se);
setpixel(17, 46, se);
setpixel(18, 46, se);
setpixel(25, 46, sh);
setpixel(26, 46, sh);
setpixel(27, 46, sh);
setpixel(2, 47, se);
setpixel(3, 47, se);
setpixel(4, 47, se);
setpixel(5, 47, se);
setpixel(6, 47, se);
setpixel(7, 47, sd);
setpixel(8, 47, se);
setpixel(9, 47, se);
setpixel(10, 47, se);
setpixel(11, 47, se);
setpixel(12, 47, se);
setpixel(13, 47, se);
setpixel(14, 47, se);
setpixel(15, 47, sd);
setpixel(16, 47, se);
setpixel(17, 47, se);
setpixel(18, 47, se);
setpixel(25, 47, sh);
setpixel(26, 47, sh);
setpixel(27, 47, sh);
setpixel(1, 48, se);
setpixel(2, 48, se);
setpixel(3, 48, se);
setpixel(4, 48, se);
setpixel(5, 48, se);
setpixel(6, 48, se);
setpixel(7, 48, sd);
setpixel(8, 48, se);
setpixel(9, 48, se);
setpixel(10, 48, se);
setpixel(11, 48, se);
setpixel(12, 48, se);
setpixel(13, 48, se);
setpixel(14, 48, se);
setpixel(15, 48, sd);
setpixel(16, 48, se);
setpixel(17, 48, se);
setpixel(18, 48, se);
setpixel(25, 48, sh);
setpixel(26, 48, sh);
setpixel(27, 48, sh);
setpixel(1, 49, se);
setpixel(2, 49, se);
setpixel(3, 49, se);
setpixel(4, 49, se);
setpixel(5, 49, se);
setpixel(6, 49, sd);
setpixel(7, 49, se);
setpixel(8, 49, se);
setpixel(9, 49, se);
setpixel(10, 49, se);
setpixel(11, 49, se);
setpixel(12, 49, se);
setpixel(13, 49, se);
setpixel(14, 49, se);
setpixel(15, 49, se);
setpixel(16, 49, sd);
setpixel(17, 49, se);
setpixel(18, 49, se);
setpixel(19, 49, se);
setpixel(25, 49, sh);
setpixel(26, 49, sh);
setpixel(27, 49, sh);
setpixel(28, 49, sh);
setpixel(1, 50, se);
setpixel(2, 50, se);
setpixel(3, 50, se);
setpixel(4, 50, se);
setpixel(5, 50, se);
setpixel(6, 50, sd);
setpixel(7, 50, se);
setpixel(8, 50, se);
setpixel(9, 50, se);
setpixel(10, 50, se);
setpixel(11, 50, se);
setpixel(12, 50, se);
setpixel(13, 50, se);
setpixel(14, 50, se);
setpixel(15, 50, se);
setpixel(16, 50, sd);
setpixel(17, 50, se);
setpixel(18, 50, se);
setpixel(19, 50, se);
setpixel(25, 50, sh);
setpixel(26, 50, sh);
setpixel(27, 50, sh);
setpixel(0, 51, sh);
setpixel(1, 51, se);
setpixel(2, 51, se);
setpixel(3, 51, se);
setpixel(4, 51, se);
setpixel(5, 51, se);
setpixel(6, 51, sd);
setpixel(7, 51, se);
setpixel(8, 51, se);
setpixel(9, 51, se);
setpixel(10, 51, se);
setpixel(11, 51, se);
setpixel(12, 51, se);
setpixel(13, 51, se);
setpixel(14, 51, se);
setpixel(15, 51, se);
setpixel(16, 51, sd);
setpixel(17, 51, sd);
setpixel(18, 51, se);
setpixel(19, 51, se);
setpixel(20, 51, se);
setpixel(25, 51, sh);
setpixel(26, 51, sh);
setpixel(27, 51, sh);
setpixel(1, 52, se);
setpixel(2, 52, se);
setpixel(3, 52, se);
setpixel(4, 52, se);
setpixel(5, 52, se);
setpixel(6, 52, se);
setpixel(7, 52, se);
setpixel(8, 52, se);
setpixel(9, 52, se);
setpixel(10, 52, se);
setpixel(11, 52, se);
setpixel(12, 52, se);
setpixel(13, 52, se);
setpixel(14, 52, se);
setpixel(15, 52, se);
setpixel(16, 52, se);
setpixel(17, 52, sd);
setpixel(18, 52, se);
setpixel(19, 52, se);
setpixel(20, 52, se);
setpixel(25, 52, sh);
setpixel(26, 52, sh);
setpixel(27, 52, sh);
setpixel(1, 53, se);
setpixel(2, 53, se);
setpixel(3, 53, se);
setpixel(4, 53, se);
setpixel(5, 53, se);
setpixel(6, 53, se);
setpixel(7, 53, se);
setpixel(8, 53, se);
setpixel(9, 53, se);
setpixel(10, 53, se);
setpixel(11, 53, se);
setpixel(12, 53, se);
setpixel(13, 53, se);
setpixel(14, 53, se);
setpixel(15, 53, se);
setpixel(16, 53, se);
setpixel(17, 53, se);
setpixel(18, 53, se);
setpixel(25, 53, sh);
setpixel(26, 53, sh);
setpixel(27, 53, sh);
setpixel(3, 54, se);
setpixel(4, 54, se);
setpixel(5, 54, se);
setpixel(6, 54, se);
setpixel(7, 54, se);
setpixel(8, 54, se);
setpixel(9, 54, se);
setpixel(10, 54, se);
setpixel(11, 54, se);
setpixel(12, 54, se);
setpixel(13, 54, se);
setpixel(14, 54, se);
setpixel(15, 54, se);
setpixel(16, 54, se);
setpixel(25, 54, sh);
setpixel(26, 54, sh);
setpixel(27, 54, sh);
setpixel(6, 55, sc);
setpixel(7, 55, sc);
setpixel(8, 55, sc);
setpixel(9, 55, sc);
setpixel(10, 55, sc);
setpixel(11, 55, sc);
setpixel(12, 55, sc);
setpixel(13, 55, sg);
setpixel(14, 55, sc);
setpixel(25, 55, sh);
setpixel(26, 55, sh);
setpixel(27, 55, sh);
setpixel(6, 56, sc);
setpixel(7, 56, sc);
setpixel(8, 56, sc);
setpixel(9, 56, sc);
setpixel(10, 56, sc);
setpixel(11, 56, sc);
setpixel(12, 56, sc);
setpixel(13, 56, sg);
setpixel(14, 56, sc);
setpixel(25, 56, sh);
setpixel(26, 56, sh);
setpixel(27, 56, sh);
setpixel(6, 57, sc);
setpixel(7, 57, sc);
setpixel(8, 57, sc);
setpixel(9, 57, sc);
setpixel(10, 57, sc);
setpixel(11, 57, sc);
setpixel(12, 57, sc);
setpixel(13, 57, sg);
setpixel(14, 57, sc);
setpixel(25, 57, sh);
setpixel(26, 57, sh);
setpixel(27, 57, sh);
setpixel(6, 58, sc);
setpixel(7, 58, sc);
setpixel(8, 58, sc);
setpixel(9, 58, sc);
setpixel(10, 58, sc);
setpixel(11, 58, sc);
setpixel(12, 58, sc);
setpixel(13, 58, sg);
setpixel(14, 58, sc);
setpixel(24, 58, sh);
setpixel(25, 58, sh);
setpixel(26, 58, sh);
setpixel(27, 58, sh);
setpixel(6, 59, sc);
setpixel(7, 59, sc);
setpixel(8, 59, sc);
setpixel(9, 59, sc);
setpixel(10, 59, sc);
setpixel(11, 59, sc);
setpixel(12, 59, sc);
setpixel(13, 59, sg);
setpixel(14, 59, sc);
setpixel(25, 59, sh);
setpixel(26, 59, sh);
setpixel(27, 59, sh);
setpixel(6, 60, sc);
setpixel(7, 60, sc);
setpixel(8, 60, sc);
setpixel(9, 60, sc);
setpixel(10, 60, sc);
setpixel(11, 60, sc);
setpixel(12, 60, sc);
setpixel(13, 60, sg);
setpixel(14, 60, sc);
setpixel(25, 60, sh);
setpixel(26, 60, sh);
setpixel(27, 60, sh);
setpixel(5, 61, sh);
setpixel(6, 61, sh);
setpixel(7, 61, sh);
setpixel(8, 61, sh);
setpixel(9, 61, sh);
setpixel(10, 61, sh);
setpixel(11, 61, sh);
setpixel(12, 61, sh);
setpixel(13, 61, sh);
setpixel(14, 61, sa);
setpixel(15, 61, sh);
setpixel(25, 61, sh);
setpixel(26, 61, sh);
setpixel(27, 61, sh);
setpixel(5, 62, sh);
setpixel(6, 62, sh);
setpixel(7, 62, sh);
setpixel(8, 62, sh);
setpixel(9, 62, sh);
setpixel(10, 62, sh);
setpixel(11, 62, sh);
setpixel(12, 62, sh);
setpixel(13, 62, sh);
setpixel(14, 62, sa);
setpixel(15, 62, sh);
setpixel(25, 62, sh);
setpixel(26, 62, sh);
setpixel(27, 62, sh);
setpixel(6, 63, sh);
setpixel(7, 63, sh);
setpixel(8, 63, sh);
setpixel(9, 63, sh);
setpixel(10, 63, sh);
setpixel(11, 63, sh);
setpixel(12, 63, sh);
setpixel(13, 63, sa);
setpixel(14, 63, sh);
setpixel(25, 63, sh);
setpixel(26, 63, sh);
setpixel(27, 63, sh);
setpixel(6, 64, sh);
setpixel(7, 64, sh);
setpixel(8, 64, sh);
setpixel(9, 64, sh);
setpixel(10, 64, sh);
setpixel(11, 64, sh);
setpixel(12, 64, sh);
setpixel(13, 64, sa);
setpixel(14, 64, sh);
setpixel(25, 64, sh);
setpixel(26, 64, sh);
setpixel(27, 64, sh);
setpixel(6, 65, sh);
setpixel(7, 65, sh);
setpixel(8, 65, sh);
setpixel(9, 65, sh);
setpixel(10, 65, sh);
setpixel(11, 65, sh);
setpixel(12, 65, sh);
setpixel(13, 65, sa);
setpixel(14, 65, sh);
setpixel(25, 65, sh);
setpixel(26, 65, sh);
setpixel(27, 65, sh);
setpixel(6, 66, sh);
setpixel(7, 66, sh);
setpixel(8, 66, sh);
setpixel(9, 66, sh);
setpixel(10, 66, sh);
setpixel(11, 66, sh);
setpixel(12, 66, sh);
setpixel(13, 66, sa);
setpixel(14, 66, sh);
setpixel(25, 66, sh);
setpixel(26, 66, sh);
setpixel(27, 66, sh);
setpixel(28, 66, sh);
setpixel(6, 67, sh);
setpixel(7, 67, sh);
setpixel(8, 67, sh);
setpixel(9, 67, sh);
setpixel(10, 67, sh);
setpixel(11, 67, sh);
setpixel(12, 67, sh);
setpixel(13, 67, sa);
setpixel(14, 67, sa);
setpixel(15, 67, sa);
setpixel(25, 67, sh);
setpixel(26, 67, sh);
setpixel(27, 67, sh);
setpixel(6, 68, sh);
setpixel(7, 68, sh);
setpixel(8, 68, sh);
setpixel(9, 68, sh);
setpixel(10, 68, sh);
setpixel(11, 68, sh);
setpixel(12, 68, sh);
setpixel(13, 68, sh);
setpixel(14, 68, sh);
setpixel(15, 68, sh);
setpixel(16, 68, sa);
setpixel(17, 68, sa);
setpixel(25, 68, sh);
setpixel(26, 68, sh);
setpixel(27, 68, sh);
setpixel(6, 69, sh);
setpixel(7, 69, sh);
setpixel(8, 69, sh);
setpixel(9, 69, sh);
setpixel(10, 69, sh);
setpixel(11, 69, sh);
setpixel(12, 69, sh);
setpixel(13, 69, sh);
setpixel(14, 69, sh);
setpixel(15, 69, sh);
setpixel(16, 69, sh);
setpixel(17, 69, sh);
setpixel(18, 69, sa);
setpixel(25, 69, sh);
setpixel(26, 69, sh);
setpixel(27, 69, sh);
setpixel(6, 70, sh);
setpixel(7, 70, sh);
setpixel(8, 70, sh);
setpixel(9, 70, sh);
setpixel(10, 70, sh);
setpixel(11, 70, sh);
setpixel(12, 70, sh);
setpixel(13, 70, sh);
setpixel(14, 70, sh);
setpixel(15, 70, sh);
setpixel(16, 70, sh);
setpixel(17, 70, sh);
setpixel(18, 70, sa);
setpixel(25, 70, sh);
setpixel(26, 70, sh);
setpixel(27, 70, sh);
setpixel(6, 71, sh);
setpixel(7, 71, sh);
setpixel(8, 71, sh);
setpixel(9, 71, sh);
setpixel(10, 71, sh);
setpixel(11, 71, sh);
setpixel(12, 71, sh);
setpixel(13, 71, sh);
setpixel(14, 71, sh);
setpixel(15, 71, sh);
setpixel(16, 71, sh);
setpixel(17, 71, sh);
setpixel(18, 71, sa);
setpixel(25, 71, sh);
setpixel(26, 71, sh);
setpixel(27, 71, sh);


for ( int c = 0; c < 71; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}



