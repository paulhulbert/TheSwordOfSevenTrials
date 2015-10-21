/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world1;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class wizardcom extends unit {
    
//    public boolean egwsegjik = false;
    
    public trigger spoke25;
    
    private chattrigger chat5;
    
    private trigger spokeafternote;
    private boolean added;
    private int addedcounter = 0;
    
    public wizardcom( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 100, 1, 1, "spear", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        this.setName("Wizard Tiln");
        this.setStatement("The Elder needs to talk to you.  Hurry!");
        
        added =false;
        
        trigger spoke1 = new trigger( false, "world1_wizardcom_spoke1" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat("The Elder needs to talk to you.  Hurry!");
        
        addchattrigger(chat1);
        
        trigger elder_spoke1 = new trigger( false, "world1_elderroom_spoke1" );
        
        spoke25 = elder_spoke1;
        
        chattrigger chat2 = new chattrigger( elder_spoke1 );
        
        
        chat2.addchat("Taldo the goblins just came through here.  Go get them!");
        chat2.addchat("Stand on the platform and press \"enter\"");
        
        addchattrigger(chat2);
        
        trigger gotsword = new trigger( false, "builders_halfsword_spoke1" );
        
        chattrigger chat3 = new chattrigger( gotsword );
        
        
        chat3.addchat("Was there anything else in the tent?");
        chat3.addchat("It might help us understand why they stole it.");
        
        addchattrigger(chat3);
        
        trigger gotnote = new trigger( false, "builders_talk_note1_spoke1" );
        
        spokeafternote = new trigger( false, "world1_wizardcom_spokeafternote" );
        
        chattrigger chat4 = new chattrigger( gotnote, spokeafternote, true );
        
        
        chat4.addchat("That note you have is very distressing.");
        chat4.addchat("I will send a message to the High Regent.");
        chat4.addchat(" ");
        chat4.addchat("I just spoke telepathically to the High Regent's wizard.  He told me the men will be sent to get the Sword of Seven Trials.");
        chat4.addchat("This means the Goblins are on the rise again.");
        chat4.addchat("Taldo, the army has fallen apart since the King died.");
        chat4.addchat("They are incapable, you must help them.");
        chat4.addchat("Go past the goblin thieves' camp to the giant rock with writing on it.");
        chat4.addchat("Here is a speaking charm.  Press S to use it if you ever need to talk to me.");
        chat4.addchat("I will barely be able to touch the world around you when you use it.");
        chat4.addchat("Press S again to send me back.");
        chat4.addchat("Stand on the platform and enter it.");
        
        addchattrigger(chat4);
        
        chat5 = new chattrigger( spokeafternote );
        
        chat5.addchat("Taldo, the army has fallen apart since the King died.");
        chat5.addchat("They are incapable, you must help them.");
        chat5.addchat("Go past the goblin thieves' camp to the giant rock with writing on it.");
        chat5.addchat("Stand on the platform and enter it.");
        
        buildvil1();
        
    
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( spokeafternote.gettrigger( current.getpanel() ) && !added ) {
//            clearchattriggers();
            if ( addedcounter < 15 ) {
                addedcounter++;
                return;
            }
            addchattrigger(chat5);
            
            added = true;
        }
    }
    
    
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(28);
        f.setlength(76);



Color sa = new Color(255,64,17);
Color sb = new Color(255,204,102);
Color sc = new Color(0,0,0);
Color sd = new Color(255,0,0);
Color se = new Color(115,35,0);
Color sf = new Color(153,51,0);
Color sg = new Color(89,24,0);
Color sh = new Color(51,51,51);









//<editor-fold defaultstate="collapsed" desc="build figure">

f.setpixel(10, 0, sa);
f.setpixel(11, 0, sa);
f.setpixel(12, 0, sa);
f.setpixel(13, 0, sa);
f.setpixel(14, 0, sa);
f.setpixel(15, 0, sa);
f.setpixel(16, 0, sa);
f.setpixel(17, 0, sa);
f.setpixel(9, 1, sa);
f.setpixel(10, 1, sa);
f.setpixel(11, 1, sa);
f.setpixel(12, 1, sa);
f.setpixel(13, 1, sa);
f.setpixel(14, 1, sa);
f.setpixel(15, 1, sa);
f.setpixel(16, 1, sa);
f.setpixel(17, 1, sa);
f.setpixel(18, 1, sa);
f.setpixel(8, 2, sa);
f.setpixel(9, 2, sa);
f.setpixel(10, 2, sa);
f.setpixel(11, 2, sa);
f.setpixel(12, 2, sa);
f.setpixel(13, 2, sa);
f.setpixel(14, 2, sa);
f.setpixel(15, 2, sa);
f.setpixel(16, 2, sa);
f.setpixel(17, 2, sb);
f.setpixel(18, 2, sb);
f.setpixel(7, 3, sa);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sa);
f.setpixel(10, 3, sa);
f.setpixel(11, 3, sa);
f.setpixel(12, 3, sa);
f.setpixel(13, 3, sa);
f.setpixel(14, 3, sa);
f.setpixel(15, 3, sa);
f.setpixel(16, 3, sb);
f.setpixel(17, 3, sb);
f.setpixel(18, 3, sb);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sa);
f.setpixel(8, 4, sa);
f.setpixel(9, 4, sa);
f.setpixel(10, 4, sa);
f.setpixel(11, 4, sa);
f.setpixel(12, 4, sa);
f.setpixel(13, 4, sb);
f.setpixel(14, 4, sb);
f.setpixel(15, 4, sb);
f.setpixel(16, 4, sc);
f.setpixel(17, 4, sc);
f.setpixel(18, 4, sb);
f.setpixel(19, 4, sb);
f.setpixel(5, 5, sa);
f.setpixel(6, 5, sa);
f.setpixel(7, 5, sa);
f.setpixel(8, 5, sa);
f.setpixel(9, 5, sa);
f.setpixel(10, 5, sa);
f.setpixel(11, 5, sb);
f.setpixel(12, 5, sb);
f.setpixel(13, 5, sb);
f.setpixel(14, 5, sb);
f.setpixel(15, 5, sb);
f.setpixel(16, 5, sc);
f.setpixel(17, 5, sc);
f.setpixel(18, 5, sb);
f.setpixel(19, 5, sb);
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
f.setpixel(19, 6, sb);
f.setpixel(20, 6, sb);
f.setpixel(5, 7, sa);
f.setpixel(6, 7, sa);
f.setpixel(7, 7, sa);
f.setpixel(8, 7, sa);
f.setpixel(9, 7, sb);
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
f.setpixel(20, 7, sb);
f.setpixel(21, 7, sb);
f.setpixel(5, 8, sa);
f.setpixel(6, 8, sa);
f.setpixel(7, 8, sa);
f.setpixel(8, 8, sb);
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
f.setpixel(20, 8, sb);
f.setpixel(21, 8, sb);
f.setpixel(5, 9, sa);
f.setpixel(6, 9, sa);
f.setpixel(7, 9, sa);
f.setpixel(8, 9, sb);
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
f.setpixel(5, 10, sa);
f.setpixel(6, 10, sa);
f.setpixel(7, 10, sa);
f.setpixel(8, 10, sb);
f.setpixel(9, 10, sb);
f.setpixel(10, 10, sb);
f.setpixel(11, 10, sb);
f.setpixel(12, 10, sb);
f.setpixel(13, 10, sb);
f.setpixel(14, 10, sb);
f.setpixel(15, 10, sb);
f.setpixel(16, 10, sb);
f.setpixel(17, 10, sb);
f.setpixel(18, 10, sb);
f.setpixel(19, 10, sb);
f.setpixel(5, 11, sa);
f.setpixel(6, 11, sa);
f.setpixel(7, 11, sa);
f.setpixel(8, 11, sb);
f.setpixel(9, 11, sb);
f.setpixel(10, 11, sb);
f.setpixel(11, 11, sb);
f.setpixel(12, 11, sb);
f.setpixel(13, 11, sb);
f.setpixel(14, 11, sb);
f.setpixel(15, 11, sb);
f.setpixel(16, 11, sd);
f.setpixel(17, 11, sd);
f.setpixel(18, 11, sd);
f.setpixel(4, 12, sa);
f.setpixel(5, 12, sa);
f.setpixel(6, 12, sa);
f.setpixel(7, 12, sa);
f.setpixel(8, 12, sb);
f.setpixel(9, 12, sb);
f.setpixel(10, 12, sb);
f.setpixel(11, 12, sb);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, sb);
f.setpixel(14, 12, sb);
f.setpixel(15, 12, sb);
f.setpixel(16, 12, sb);
f.setpixel(17, 12, sb);
f.setpixel(4, 13, sa);
f.setpixel(5, 13, sa);
f.setpixel(6, 13, sa);
f.setpixel(7, 13, sa);
f.setpixel(8, 13, sa);
f.setpixel(9, 13, sb);
f.setpixel(10, 13, sb);
f.setpixel(11, 13, sb);
f.setpixel(12, 13, sb);
f.setpixel(13, 13, sb);
f.setpixel(14, 13, sb);
f.setpixel(15, 13, sb);
f.setpixel(16, 13, sb);
f.setpixel(4, 14, sa);
f.setpixel(5, 14, sa);
f.setpixel(6, 14, sa);
f.setpixel(7, 14, sa);
f.setpixel(8, 14, sa);
f.setpixel(9, 14, sa);
f.setpixel(10, 14, sb);
f.setpixel(11, 14, sb);
f.setpixel(12, 14, sb);
f.setpixel(13, 14, sb);
f.setpixel(14, 14, sb);
f.setpixel(15, 14, sb);
f.setpixel(16, 14, sb);
f.setpixel(10, 15, sb);
f.setpixel(11, 15, sb);
f.setpixel(12, 15, sb);
f.setpixel(13, 15, sb);
f.setpixel(14, 15, sb);
f.setpixel(15, 15, sb);
f.setpixel(16, 15, sb);
f.setpixel(9, 16, se);
f.setpixel(10, 16, se);
f.setpixel(11, 16, se);
f.setpixel(12, 16, se);
f.setpixel(13, 16, se);
f.setpixel(14, 16, se);
f.setpixel(15, 16, se);
f.setpixel(16, 16, se);
f.setpixel(17, 16, se);
f.setpixel(8, 17, se);
f.setpixel(9, 17, se);
f.setpixel(10, 17, se);
f.setpixel(11, 17, se);
f.setpixel(12, 17, se);
f.setpixel(13, 17, se);
f.setpixel(14, 17, se);
f.setpixel(15, 17, se);
f.setpixel(16, 17, se);
f.setpixel(17, 17, se);
f.setpixel(18, 17, se);
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
f.setpixel(16, 18, se);
f.setpixel(17, 18, se);
f.setpixel(18, 18, se);
f.setpixel(19, 18, se);
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
f.setpixel(17, 19, se);
f.setpixel(18, 19, se);
f.setpixel(19, 19, sf);
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
f.setpixel(17, 20, sf);
f.setpixel(18, 20, sf);
f.setpixel(19, 20, sf);
f.setpixel(5, 21, se);
f.setpixel(6, 21, se);
f.setpixel(7, 21, se);
f.setpixel(8, 21, se);
f.setpixel(9, 21, se);
f.setpixel(10, 21, se);
f.setpixel(11, 21, se);
f.setpixel(12, 21, se);
f.setpixel(13, 21, se);
f.setpixel(14, 21, se);
f.setpixel(15, 21, se);
f.setpixel(16, 21, sc);
f.setpixel(17, 21, sc);
f.setpixel(18, 21, sf);
f.setpixel(19, 21, sf);
f.setpixel(5, 22, se);
f.setpixel(6, 22, se);
f.setpixel(7, 22, se);
f.setpixel(8, 22, se);
f.setpixel(9, 22, se);
f.setpixel(10, 22, se);
f.setpixel(11, 22, se);
f.setpixel(12, 22, se);
f.setpixel(13, 22, se);
f.setpixel(14, 22, se);
f.setpixel(15, 22, sc);
f.setpixel(16, 22, sc);
f.setpixel(17, 22, sc);
f.setpixel(18, 22, sc);
f.setpixel(19, 22, sf);
f.setpixel(5, 23, se);
f.setpixel(6, 23, se);
f.setpixel(7, 23, se);
f.setpixel(8, 23, se);
f.setpixel(9, 23, se);
f.setpixel(10, 23, se);
f.setpixel(11, 23, se);
f.setpixel(12, 23, se);
f.setpixel(13, 23, se);
f.setpixel(14, 23, sc);
f.setpixel(15, 23, sc);
f.setpixel(16, 23, sc);
f.setpixel(17, 23, sc);
f.setpixel(18, 23, sc);
f.setpixel(19, 23, sf);
f.setpixel(5, 24, se);
f.setpixel(6, 24, se);
f.setpixel(7, 24, se);
f.setpixel(8, 24, se);
f.setpixel(9, 24, se);
f.setpixel(10, 24, se);
f.setpixel(11, 24, se);
f.setpixel(12, 24, se);
f.setpixel(13, 24, sc);
f.setpixel(14, 24, sc);
f.setpixel(15, 24, sc);
f.setpixel(16, 24, sc);
f.setpixel(17, 24, sc);
f.setpixel(18, 24, sc);
f.setpixel(19, 24, sc);
f.setpixel(5, 25, se);
f.setpixel(6, 25, se);
f.setpixel(7, 25, se);
f.setpixel(8, 25, se);
f.setpixel(9, 25, se);
f.setpixel(10, 25, se);
f.setpixel(11, 25, se);
f.setpixel(12, 25, sc);
f.setpixel(13, 25, sc);
f.setpixel(14, 25, sc);
f.setpixel(15, 25, sc);
f.setpixel(16, 25, sc);
f.setpixel(17, 25, sc);
f.setpixel(18, 25, sc);
f.setpixel(19, 25, sc);
f.setpixel(5, 26, se);
f.setpixel(6, 26, se);
f.setpixel(7, 26, se);
f.setpixel(8, 26, se);
f.setpixel(9, 26, se);
f.setpixel(10, 26, se);
f.setpixel(11, 26, se);
f.setpixel(12, 26, sc);
f.setpixel(13, 26, sc);
f.setpixel(14, 26, sc);
f.setpixel(15, 26, sc);
f.setpixel(16, 26, sc);
f.setpixel(17, 26, sc);
f.setpixel(18, 26, sc);
f.setpixel(19, 26, sc);
f.setpixel(20, 26, sc);
f.setpixel(5, 27, se);
f.setpixel(6, 27, se);
f.setpixel(7, 27, se);
f.setpixel(8, 27, se);
f.setpixel(9, 27, se);
f.setpixel(10, 27, se);
f.setpixel(11, 27, sc);
f.setpixel(12, 27, sc);
f.setpixel(13, 27, sc);
f.setpixel(14, 27, sc);
f.setpixel(15, 27, sc);
f.setpixel(16, 27, sc);
f.setpixel(17, 27, sc);
f.setpixel(18, 27, sc);
f.setpixel(19, 27, sc);
f.setpixel(20, 27, sc);
f.setpixel(4, 28, se);
f.setpixel(5, 28, se);
f.setpixel(6, 28, se);
f.setpixel(7, 28, se);
f.setpixel(8, 28, se);
f.setpixel(9, 28, se);
f.setpixel(10, 28, sf);
f.setpixel(11, 28, sf);
f.setpixel(12, 28, sc);
f.setpixel(13, 28, sc);
f.setpixel(14, 28, sc);
f.setpixel(15, 28, sc);
f.setpixel(16, 28, sc);
f.setpixel(17, 28, sc);
f.setpixel(18, 28, sc);
f.setpixel(19, 28, sc);
f.setpixel(20, 28, sc);
f.setpixel(21, 28, sc);
f.setpixel(4, 29, se);
f.setpixel(5, 29, se);
f.setpixel(6, 29, se);
f.setpixel(7, 29, se);
f.setpixel(8, 29, se);
f.setpixel(9, 29, se);
f.setpixel(10, 29, sf);
f.setpixel(11, 29, sf);
f.setpixel(12, 29, sc);
f.setpixel(13, 29, sc);
f.setpixel(14, 29, sc);
f.setpixel(15, 29, sc);
f.setpixel(16, 29, sc);
f.setpixel(17, 29, sc);
f.setpixel(18, 29, sc);
f.setpixel(19, 29, sc);
f.setpixel(20, 29, sc);
f.setpixel(21, 29, sc);
f.setpixel(22, 29, sc);
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
f.setpixel(14, 30, sc);
f.setpixel(15, 30, sc);
f.setpixel(16, 30, sc);
f.setpixel(17, 30, sc);
f.setpixel(18, 30, sc);
f.setpixel(19, 30, sc);
f.setpixel(20, 30, sc);
f.setpixel(21, 30, sc);
f.setpixel(22, 30, sc);
f.setpixel(23, 30, sc);
f.setpixel(4, 31, se);
f.setpixel(5, 31, se);
f.setpixel(6, 31, se);
f.setpixel(7, 31, se);
f.setpixel(8, 31, se);
f.setpixel(9, 31, sf);
f.setpixel(10, 31, sf);
f.setpixel(11, 31, sf);
f.setpixel(12, 31, sf);
f.setpixel(13, 31, sf);
f.setpixel(14, 31, sf);
f.setpixel(15, 31, sc);
f.setpixel(16, 31, sc);
f.setpixel(17, 31, sc);
f.setpixel(18, 31, sc);
f.setpixel(19, 31, sc);
f.setpixel(20, 31, sc);
f.setpixel(21, 31, sc);
f.setpixel(22, 31, sc);
f.setpixel(23, 31, sc);
f.setpixel(3, 32, se);
f.setpixel(4, 32, se);
f.setpixel(5, 32, se);
f.setpixel(6, 32, se);
f.setpixel(7, 32, se);
f.setpixel(8, 32, se);
f.setpixel(9, 32, sf);
f.setpixel(10, 32, sf);
f.setpixel(11, 32, sf);
f.setpixel(12, 32, sf);
f.setpixel(13, 32, sf);
f.setpixel(14, 32, sf);
f.setpixel(15, 32, sf);
f.setpixel(16, 32, sc);
f.setpixel(17, 32, sc);
f.setpixel(18, 32, sc);
f.setpixel(19, 32, sc);
f.setpixel(20, 32, sc);
f.setpixel(21, 32, sc);
f.setpixel(22, 32, sc);
f.setpixel(23, 32, sc);
f.setpixel(24, 32, sc);
f.setpixel(3, 33, se);
f.setpixel(4, 33, se);
f.setpixel(5, 33, se);
f.setpixel(6, 33, se);
f.setpixel(7, 33, se);
f.setpixel(8, 33, se);
f.setpixel(9, 33, sf);
f.setpixel(10, 33, sf);
f.setpixel(11, 33, sf);
f.setpixel(12, 33, sf);
f.setpixel(13, 33, sf);
f.setpixel(14, 33, sf);
f.setpixel(15, 33, sf);
f.setpixel(16, 33, sc);
f.setpixel(17, 33, sc);
f.setpixel(18, 33, sc);
f.setpixel(19, 33, sc);
f.setpixel(20, 33, sc);
f.setpixel(21, 33, sc);
f.setpixel(22, 33, sc);
f.setpixel(23, 33, sc);
f.setpixel(24, 33, sc);
f.setpixel(25, 33, sc);
f.setpixel(3, 34, se);
f.setpixel(4, 34, se);
f.setpixel(5, 34, se);
f.setpixel(6, 34, se);
f.setpixel(7, 34, se);
f.setpixel(8, 34, se);
f.setpixel(9, 34, sf);
f.setpixel(10, 34, sf);
f.setpixel(11, 34, sf);
f.setpixel(12, 34, sf);
f.setpixel(13, 34, sf);
f.setpixel(14, 34, sf);
f.setpixel(15, 34, sf);
f.setpixel(16, 34, sf);
f.setpixel(17, 34, sc);
f.setpixel(18, 34, sc);
f.setpixel(19, 34, sc);
f.setpixel(20, 34, sc);
f.setpixel(21, 34, sc);
f.setpixel(22, 34, sc);
f.setpixel(23, 34, sc);
f.setpixel(24, 34, sc);
f.setpixel(25, 34, sc);
f.setpixel(3, 35, se);
f.setpixel(4, 35, se);
f.setpixel(5, 35, se);
f.setpixel(6, 35, se);
f.setpixel(7, 35, se);
f.setpixel(8, 35, sf);
f.setpixel(9, 35, sf);
f.setpixel(10, 35, sf);
f.setpixel(11, 35, sf);
f.setpixel(12, 35, sf);
f.setpixel(13, 35, sf);
f.setpixel(14, 35, sf);
f.setpixel(15, 35, sf);
f.setpixel(16, 35, sf);
f.setpixel(17, 35, sc);
f.setpixel(18, 35, sc);
f.setpixel(19, 35, sc);
f.setpixel(20, 35, sc);
f.setpixel(21, 35, sc);
f.setpixel(22, 35, sc);
f.setpixel(23, 35, sc);
f.setpixel(24, 35, sc);
f.setpixel(25, 35, sc);
f.setpixel(26, 35, sb);
f.setpixel(27, 35, sb);
f.setpixel(3, 36, se);
f.setpixel(4, 36, se);
f.setpixel(5, 36, se);
f.setpixel(6, 36, se);
f.setpixel(7, 36, sf);
f.setpixel(8, 36, sf);
f.setpixel(9, 36, sf);
f.setpixel(10, 36, sf);
f.setpixel(11, 36, sf);
f.setpixel(12, 36, sf);
f.setpixel(13, 36, sf);
f.setpixel(14, 36, sf);
f.setpixel(15, 36, sf);
f.setpixel(16, 36, sf);
f.setpixel(17, 36, sc);
f.setpixel(18, 36, sc);
f.setpixel(19, 36, sc);
f.setpixel(20, 36, sc);
f.setpixel(21, 36, sc);
f.setpixel(22, 36, sc);
f.setpixel(23, 36, sc);
f.setpixel(24, 36, sc);
f.setpixel(25, 36, sb);
f.setpixel(26, 36, sb);
f.setpixel(27, 36, sb);
f.setpixel(28, 36, sb);
f.setpixel(3, 37, se);
f.setpixel(4, 37, se);
f.setpixel(5, 37, se);
f.setpixel(6, 37, se);
f.setpixel(7, 37, sg);
f.setpixel(8, 37, sg);
f.setpixel(9, 37, sg);
f.setpixel(10, 37, sg);
f.setpixel(11, 37, sg);
f.setpixel(12, 37, sg);
f.setpixel(13, 37, sg);
f.setpixel(14, 37, sg);
f.setpixel(15, 37, sg);
f.setpixel(16, 37, sg);
f.setpixel(17, 37, sg);
f.setpixel(18, 37, sc);
f.setpixel(19, 37, sc);
f.setpixel(20, 37, sc);
f.setpixel(21, 37, sc);
f.setpixel(22, 37, sc);
f.setpixel(23, 37, sb);
f.setpixel(24, 37, sb);
f.setpixel(25, 37, sb);
f.setpixel(26, 37, sb);
f.setpixel(27, 37, sb);
f.setpixel(28, 37, sb);
f.setpixel(3, 38, se);
f.setpixel(4, 38, se);
f.setpixel(5, 38, se);
f.setpixel(6, 38, se);
f.setpixel(7, 38, sg);
f.setpixel(8, 38, sg);
f.setpixel(9, 38, sg);
f.setpixel(10, 38, sg);
f.setpixel(11, 38, sg);
f.setpixel(12, 38, sg);
f.setpixel(13, 38, sg);
f.setpixel(14, 38, sg);
f.setpixel(15, 38, sg);
f.setpixel(16, 38, sg);
f.setpixel(17, 38, sg);
f.setpixel(18, 38, sg);
f.setpixel(19, 38, sc);
f.setpixel(20, 38, sc);
f.setpixel(21, 38, sc);
f.setpixel(22, 38, sb);
f.setpixel(23, 38, sb);
f.setpixel(24, 38, sb);
f.setpixel(25, 38, sb);
f.setpixel(26, 38, sb);
f.setpixel(27, 38, sb);
f.setpixel(28, 38, sb);
f.setpixel(3, 39, se);
f.setpixel(4, 39, se);
f.setpixel(5, 39, se);
f.setpixel(6, 39, sg);
f.setpixel(7, 39, sg);
f.setpixel(8, 39, sg);
f.setpixel(9, 39, sg);
f.setpixel(10, 39, sg);
f.setpixel(11, 39, sg);
f.setpixel(12, 39, sg);
f.setpixel(13, 39, sg);
f.setpixel(14, 39, sg);
f.setpixel(15, 39, sg);
f.setpixel(16, 39, sg);
f.setpixel(17, 39, sg);
f.setpixel(18, 39, sg);
f.setpixel(21, 39, sb);
f.setpixel(22, 39, sb);
f.setpixel(23, 39, sb);
f.setpixel(24, 39, sb);
f.setpixel(25, 39, sb);
f.setpixel(26, 39, sb);
f.setpixel(27, 39, sb);
f.setpixel(3, 40, se);
f.setpixel(4, 40, se);
f.setpixel(5, 40, se);
f.setpixel(6, 40, sg);
f.setpixel(7, 40, sg);
f.setpixel(8, 40, sg);
f.setpixel(9, 40, sg);
f.setpixel(10, 40, sg);
f.setpixel(11, 40, sg);
f.setpixel(12, 40, sg);
f.setpixel(13, 40, sg);
f.setpixel(14, 40, sg);
f.setpixel(15, 40, sg);
f.setpixel(16, 40, sg);
f.setpixel(17, 40, sg);
f.setpixel(18, 40, sg);
f.setpixel(22, 40, sb);
f.setpixel(23, 40, sb);
f.setpixel(24, 40, sb);
f.setpixel(25, 40, sb);
f.setpixel(3, 41, se);
f.setpixel(4, 41, se);
f.setpixel(5, 41, se);
f.setpixel(6, 41, sf);
f.setpixel(7, 41, sf);
f.setpixel(8, 41, sf);
f.setpixel(9, 41, sf);
f.setpixel(10, 41, sf);
f.setpixel(11, 41, sf);
f.setpixel(12, 41, sf);
f.setpixel(13, 41, sf);
f.setpixel(14, 41, sf);
f.setpixel(15, 41, sf);
f.setpixel(16, 41, sf);
f.setpixel(17, 41, sf);
f.setpixel(18, 41, sf);
f.setpixel(23, 41, sb);
f.setpixel(24, 41, sb);
f.setpixel(3, 42, se);
f.setpixel(4, 42, se);
f.setpixel(5, 42, sf);
f.setpixel(6, 42, sf);
f.setpixel(7, 42, sf);
f.setpixel(8, 42, sf);
f.setpixel(9, 42, sf);
f.setpixel(10, 42, sf);
f.setpixel(11, 42, sf);
f.setpixel(12, 42, sf);
f.setpixel(13, 42, sf);
f.setpixel(14, 42, sf);
f.setpixel(15, 42, sf);
f.setpixel(16, 42, sf);
f.setpixel(17, 42, sf);
f.setpixel(18, 42, sf);
f.setpixel(3, 43, se);
f.setpixel(4, 43, se);
f.setpixel(5, 43, sf);
f.setpixel(6, 43, sf);
f.setpixel(7, 43, sf);
f.setpixel(8, 43, sf);
f.setpixel(9, 43, sf);
f.setpixel(10, 43, sf);
f.setpixel(11, 43, sf);
f.setpixel(12, 43, sf);
f.setpixel(13, 43, sf);
f.setpixel(14, 43, sf);
f.setpixel(15, 43, sf);
f.setpixel(16, 43, sf);
f.setpixel(17, 43, sf);
f.setpixel(18, 43, sf);
f.setpixel(2, 44, se);
f.setpixel(3, 44, se);
f.setpixel(4, 44, se);
f.setpixel(5, 44, sf);
f.setpixel(6, 44, sf);
f.setpixel(7, 44, sf);
f.setpixel(8, 44, sf);
f.setpixel(9, 44, sf);
f.setpixel(10, 44, sf);
f.setpixel(11, 44, sf);
f.setpixel(12, 44, sf);
f.setpixel(13, 44, sf);
f.setpixel(14, 44, sf);
f.setpixel(15, 44, sf);
f.setpixel(16, 44, sf);
f.setpixel(17, 44, sf);
f.setpixel(18, 44, sf);
f.setpixel(2, 45, se);
f.setpixel(3, 45, se);
f.setpixel(4, 45, se);
f.setpixel(5, 45, sf);
f.setpixel(6, 45, sf);
f.setpixel(7, 45, sf);
f.setpixel(8, 45, sf);
f.setpixel(9, 45, sf);
f.setpixel(10, 45, sf);
f.setpixel(11, 45, sf);
f.setpixel(12, 45, sf);
f.setpixel(13, 45, sf);
f.setpixel(14, 45, sf);
f.setpixel(15, 45, sf);
f.setpixel(16, 45, sf);
f.setpixel(17, 45, sf);
f.setpixel(18, 45, sf);
f.setpixel(19, 45, sf);
f.setpixel(2, 46, se);
f.setpixel(3, 46, se);
f.setpixel(4, 46, se);
f.setpixel(5, 46, sf);
f.setpixel(6, 46, sf);
f.setpixel(7, 46, sf);
f.setpixel(8, 46, sf);
f.setpixel(9, 46, sf);
f.setpixel(10, 46, sf);
f.setpixel(11, 46, sf);
f.setpixel(12, 46, sf);
f.setpixel(13, 46, sf);
f.setpixel(14, 46, sf);
f.setpixel(15, 46, sf);
f.setpixel(16, 46, sf);
f.setpixel(17, 46, sf);
f.setpixel(18, 46, sf);
f.setpixel(19, 46, sf);
f.setpixel(2, 47, se);
f.setpixel(3, 47, se);
f.setpixel(4, 47, se);
f.setpixel(5, 47, sf);
f.setpixel(6, 47, sf);
f.setpixel(7, 47, sf);
f.setpixel(8, 47, sf);
f.setpixel(9, 47, sf);
f.setpixel(10, 47, sf);
f.setpixel(11, 47, sf);
f.setpixel(12, 47, sf);
f.setpixel(13, 47, sf);
f.setpixel(14, 47, sf);
f.setpixel(15, 47, sf);
f.setpixel(16, 47, sf);
f.setpixel(17, 47, sf);
f.setpixel(18, 47, sf);
f.setpixel(19, 47, sf);
f.setpixel(2, 48, se);
f.setpixel(3, 48, se);
f.setpixel(4, 48, se);
f.setpixel(5, 48, sf);
f.setpixel(6, 48, sf);
f.setpixel(7, 48, sf);
f.setpixel(8, 48, sf);
f.setpixel(9, 48, sf);
f.setpixel(10, 48, sf);
f.setpixel(11, 48, sf);
f.setpixel(12, 48, sf);
f.setpixel(13, 48, sf);
f.setpixel(14, 48, sf);
f.setpixel(15, 48, sf);
f.setpixel(16, 48, sf);
f.setpixel(17, 48, sf);
f.setpixel(18, 48, sf);
f.setpixel(19, 48, sf);
f.setpixel(2, 49, se);
f.setpixel(3, 49, se);
f.setpixel(4, 49, sf);
f.setpixel(5, 49, sf);
f.setpixel(6, 49, sf);
f.setpixel(7, 49, sf);
f.setpixel(8, 49, sf);
f.setpixel(9, 49, sf);
f.setpixel(10, 49, sf);
f.setpixel(11, 49, sf);
f.setpixel(12, 49, sf);
f.setpixel(13, 49, sf);
f.setpixel(14, 49, sf);
f.setpixel(15, 49, sf);
f.setpixel(16, 49, sf);
f.setpixel(17, 49, sf);
f.setpixel(18, 49, sf);
f.setpixel(19, 49, sf);
f.setpixel(2, 50, se);
f.setpixel(3, 50, se);
f.setpixel(4, 50, sf);
f.setpixel(5, 50, sf);
f.setpixel(6, 50, sf);
f.setpixel(7, 50, sf);
f.setpixel(8, 50, sf);
f.setpixel(9, 50, sf);
f.setpixel(10, 50, sf);
f.setpixel(11, 50, sf);
f.setpixel(12, 50, sf);
f.setpixel(13, 50, sf);
f.setpixel(14, 50, sf);
f.setpixel(15, 50, sf);
f.setpixel(16, 50, sf);
f.setpixel(17, 50, sf);
f.setpixel(18, 50, sf);
f.setpixel(19, 50, sf);
f.setpixel(2, 51, se);
f.setpixel(3, 51, se);
f.setpixel(5, 51, sc);
f.setpixel(6, 51, sc);
f.setpixel(7, 51, sc);
f.setpixel(8, 51, sc);
f.setpixel(9, 51, sc);
f.setpixel(10, 51, sc);
f.setpixel(11, 51, sc);
f.setpixel(12, 51, sh);
f.setpixel(13, 51, sh);
f.setpixel(14, 51, sc);
f.setpixel(15, 51, sc);
f.setpixel(16, 51, sc);
f.setpixel(17, 51, sc);
f.setpixel(2, 52, se);
f.setpixel(3, 52, se);
f.setpixel(5, 52, sc);
f.setpixel(6, 52, sc);
f.setpixel(7, 52, sc);
f.setpixel(8, 52, sc);
f.setpixel(9, 52, sc);
f.setpixel(10, 52, sc);
f.setpixel(11, 52, sc);
f.setpixel(12, 52, sh);
f.setpixel(13, 52, sc);
f.setpixel(14, 52, sc);
f.setpixel(15, 52, sc);
f.setpixel(16, 52, sc);
f.setpixel(17, 52, sc);
f.setpixel(2, 53, se);
f.setpixel(3, 53, se);
f.setpixel(5, 53, sc);
f.setpixel(6, 53, sc);
f.setpixel(7, 53, sc);
f.setpixel(8, 53, sc);
f.setpixel(9, 53, sc);
f.setpixel(10, 53, sc);
f.setpixel(11, 53, sc);
f.setpixel(12, 53, sh);
f.setpixel(13, 53, sc);
f.setpixel(14, 53, sc);
f.setpixel(15, 53, sc);
f.setpixel(16, 53, sc);
f.setpixel(17, 53, sc);
f.setpixel(2, 54, se);
f.setpixel(3, 54, se);
f.setpixel(5, 54, sc);
f.setpixel(6, 54, sc);
f.setpixel(7, 54, sc);
f.setpixel(8, 54, sc);
f.setpixel(9, 54, sc);
f.setpixel(10, 54, sc);
f.setpixel(11, 54, sc);
f.setpixel(12, 54, sh);
f.setpixel(13, 54, sc);
f.setpixel(14, 54, sc);
f.setpixel(15, 54, sc);
f.setpixel(16, 54, sc);
f.setpixel(2, 55, se);
f.setpixel(3, 55, se);
f.setpixel(5, 55, sc);
f.setpixel(6, 55, sc);
f.setpixel(7, 55, sc);
f.setpixel(8, 55, sc);
f.setpixel(9, 55, sc);
f.setpixel(10, 55, sc);
f.setpixel(11, 55, sc);
f.setpixel(12, 55, sh);
f.setpixel(13, 55, sc);
f.setpixel(14, 55, sc);
f.setpixel(15, 55, sc);
f.setpixel(16, 55, sc);
f.setpixel(2, 56, se);
f.setpixel(3, 56, se);
f.setpixel(5, 56, sc);
f.setpixel(6, 56, sc);
f.setpixel(7, 56, sc);
f.setpixel(8, 56, sc);
f.setpixel(9, 56, sc);
f.setpixel(10, 56, sc);
f.setpixel(11, 56, sc);
f.setpixel(12, 56, sh);
f.setpixel(13, 56, sc);
f.setpixel(14, 56, sc);
f.setpixel(15, 56, sc);
f.setpixel(16, 56, sc);
f.setpixel(2, 57, se);
f.setpixel(3, 57, se);
f.setpixel(5, 57, sc);
f.setpixel(6, 57, sc);
f.setpixel(7, 57, sc);
f.setpixel(8, 57, sc);
f.setpixel(9, 57, sc);
f.setpixel(10, 57, sc);
f.setpixel(11, 57, sh);
f.setpixel(12, 57, sh);
f.setpixel(13, 57, sc);
f.setpixel(14, 57, sc);
f.setpixel(15, 57, sc);
f.setpixel(16, 57, sc);
f.setpixel(1, 58, se);
f.setpixel(2, 58, se);
f.setpixel(3, 58, se);
f.setpixel(5, 58, sc);
f.setpixel(6, 58, sc);
f.setpixel(7, 58, sc);
f.setpixel(8, 58, sc);
f.setpixel(9, 58, sc);
f.setpixel(10, 58, sc);
f.setpixel(11, 58, sh);
f.setpixel(12, 58, sc);
f.setpixel(13, 58, sc);
f.setpixel(14, 58, sc);
f.setpixel(15, 58, sc);
f.setpixel(16, 58, sc);
f.setpixel(1, 59, se);
f.setpixel(2, 59, se);
f.setpixel(3, 59, se);
f.setpixel(5, 59, sc);
f.setpixel(6, 59, sc);
f.setpixel(7, 59, sc);
f.setpixel(8, 59, sc);
f.setpixel(9, 59, sc);
f.setpixel(10, 59, sc);
f.setpixel(11, 59, sh);
f.setpixel(12, 59, sc);
f.setpixel(13, 59, sc);
f.setpixel(14, 59, sc);
f.setpixel(15, 59, sc);
f.setpixel(16, 59, sc);
f.setpixel(1, 60, se);
f.setpixel(2, 60, se);
f.setpixel(3, 60, se);
f.setpixel(5, 60, sc);
f.setpixel(6, 60, sc);
f.setpixel(7, 60, sc);
f.setpixel(8, 60, sc);
f.setpixel(9, 60, sc);
f.setpixel(10, 60, sc);
f.setpixel(11, 60, sh);
f.setpixel(12, 60, sc);
f.setpixel(13, 60, sc);
f.setpixel(14, 60, sc);
f.setpixel(15, 60, sc);
f.setpixel(1, 61, se);
f.setpixel(2, 61, se);
f.setpixel(3, 61, se);
f.setpixel(5, 61, sc);
f.setpixel(6, 61, sc);
f.setpixel(7, 61, sc);
f.setpixel(8, 61, sc);
f.setpixel(9, 61, sc);
f.setpixel(10, 61, sc);
f.setpixel(11, 61, sh);
f.setpixel(12, 61, sc);
f.setpixel(13, 61, sc);
f.setpixel(14, 61, sc);
f.setpixel(15, 61, sc);
f.setpixel(1, 62, se);
f.setpixel(2, 62, se);
f.setpixel(3, 62, se);
f.setpixel(5, 62, sg);
f.setpixel(6, 62, sg);
f.setpixel(7, 62, sg);
f.setpixel(8, 62, sg);
f.setpixel(9, 62, sg);
f.setpixel(10, 62, sg);
f.setpixel(11, 62, sf);
f.setpixel(12, 62, sg);
f.setpixel(13, 62, sg);
f.setpixel(14, 62, sg);
f.setpixel(15, 62, sg);
f.setpixel(1, 63, se);
f.setpixel(2, 63, se);
f.setpixel(3, 63, se);
f.setpixel(5, 63, sg);
f.setpixel(6, 63, sg);
f.setpixel(7, 63, sg);
f.setpixel(8, 63, sg);
f.setpixel(9, 63, sg);
f.setpixel(10, 63, sg);
f.setpixel(11, 63, sf);
f.setpixel(12, 63, sg);
f.setpixel(13, 63, sg);
f.setpixel(14, 63, sg);
f.setpixel(15, 63, sg);
f.setpixel(1, 64, se);
f.setpixel(2, 64, se);
f.setpixel(3, 64, se);
f.setpixel(5, 64, sg);
f.setpixel(6, 64, sg);
f.setpixel(7, 64, sg);
f.setpixel(8, 64, sg);
f.setpixel(9, 64, sg);
f.setpixel(10, 64, sg);
f.setpixel(11, 64, sf);
f.setpixel(12, 64, sg);
f.setpixel(13, 64, sg);
f.setpixel(14, 64, sg);
f.setpixel(15, 64, sg);
f.setpixel(1, 65, se);
f.setpixel(2, 65, se);
f.setpixel(3, 65, se);
f.setpixel(5, 65, sg);
f.setpixel(6, 65, sg);
f.setpixel(7, 65, sg);
f.setpixel(8, 65, sg);
f.setpixel(9, 65, sg);
f.setpixel(10, 65, sg);
f.setpixel(11, 65, sf);
f.setpixel(12, 65, sg);
f.setpixel(13, 65, sg);
f.setpixel(14, 65, sg);
f.setpixel(15, 65, sg);
f.setpixel(1, 66, se);
f.setpixel(2, 66, se);
f.setpixel(3, 66, se);
f.setpixel(5, 66, sg);
f.setpixel(6, 66, sg);
f.setpixel(7, 66, sg);
f.setpixel(8, 66, sg);
f.setpixel(9, 66, sg);
f.setpixel(10, 66, sg);
f.setpixel(11, 66, sf);
f.setpixel(12, 66, sg);
f.setpixel(13, 66, sg);
f.setpixel(14, 66, sg);
f.setpixel(15, 66, sg);
f.setpixel(0, 67, se);
f.setpixel(1, 67, se);
f.setpixel(2, 67, se);
f.setpixel(3, 67, se);
f.setpixel(5, 67, sg);
f.setpixel(6, 67, sg);
f.setpixel(7, 67, sg);
f.setpixel(8, 67, sg);
f.setpixel(9, 67, sg);
f.setpixel(10, 67, sg);
f.setpixel(11, 67, sf);
f.setpixel(12, 67, sg);
f.setpixel(13, 67, sg);
f.setpixel(14, 67, sg);
f.setpixel(15, 67, sg);
f.setpixel(0, 68, se);
f.setpixel(1, 68, se);
f.setpixel(2, 68, se);
f.setpixel(3, 68, se);
f.setpixel(5, 68, sg);
f.setpixel(6, 68, sg);
f.setpixel(7, 68, sg);
f.setpixel(8, 68, sg);
f.setpixel(9, 68, sg);
f.setpixel(10, 68, sg);
f.setpixel(11, 68, sf);
f.setpixel(12, 68, sg);
f.setpixel(13, 68, sg);
f.setpixel(14, 68, sg);
f.setpixel(15, 68, sg);
f.setpixel(0, 69, se);
f.setpixel(1, 69, se);
f.setpixel(2, 69, se);
f.setpixel(3, 69, se);
f.setpixel(5, 69, sg);
f.setpixel(6, 69, sg);
f.setpixel(7, 69, sg);
f.setpixel(8, 69, sg);
f.setpixel(9, 69, sg);
f.setpixel(10, 69, sg);
f.setpixel(11, 69, sf);
f.setpixel(12, 69, sg);
f.setpixel(13, 69, sg);
f.setpixel(14, 69, sg);
f.setpixel(15, 69, sg);
f.setpixel(0, 70, se);
f.setpixel(1, 70, se);
f.setpixel(2, 70, se);
f.setpixel(3, 70, se);
f.setpixel(5, 70, sg);
f.setpixel(6, 70, sg);
f.setpixel(7, 70, sg);
f.setpixel(8, 70, sg);
f.setpixel(9, 70, sg);
f.setpixel(10, 70, sg);
f.setpixel(11, 70, sf);
f.setpixel(12, 70, sg);
f.setpixel(13, 70, sg);
f.setpixel(14, 70, sg);
f.setpixel(15, 70, sg);
f.setpixel(0, 71, se);
f.setpixel(1, 71, se);
f.setpixel(2, 71, se);
f.setpixel(3, 71, se);
f.setpixel(5, 71, sg);
f.setpixel(6, 71, sg);
f.setpixel(7, 71, sg);
f.setpixel(8, 71, sg);
f.setpixel(9, 71, sg);
f.setpixel(10, 71, sg);
f.setpixel(11, 71, sf);
f.setpixel(12, 71, sf);
f.setpixel(13, 71, sg);
f.setpixel(14, 71, sg);
f.setpixel(15, 71, sg);
f.setpixel(16, 71, sg);
f.setpixel(5, 72, sg);
f.setpixel(6, 72, sg);
f.setpixel(7, 72, sg);
f.setpixel(8, 72, sg);
f.setpixel(9, 72, sg);
f.setpixel(10, 72, sg);
f.setpixel(11, 72, sg);
f.setpixel(12, 72, sf);
f.setpixel(13, 72, sf);
f.setpixel(14, 72, sg);
f.setpixel(15, 72, sg);
f.setpixel(16, 72, sg);
f.setpixel(17, 72, sg);
f.setpixel(5, 73, sg);
f.setpixel(6, 73, sg);
f.setpixel(7, 73, sg);
f.setpixel(8, 73, sg);
f.setpixel(9, 73, sg);
f.setpixel(10, 73, sg);
f.setpixel(11, 73, sg);
f.setpixel(12, 73, sg);
f.setpixel(13, 73, sf);
f.setpixel(14, 73, sf);
f.setpixel(15, 73, sg);
f.setpixel(16, 73, sg);
f.setpixel(17, 73, sg);
f.setpixel(18, 73, sg);
f.setpixel(5, 74, sg);
f.setpixel(6, 74, sg);
f.setpixel(7, 74, sg);
f.setpixel(8, 74, sg);
f.setpixel(9, 74, sg);
f.setpixel(10, 74, sg);
f.setpixel(11, 74, sg);
f.setpixel(12, 74, sg);
f.setpixel(13, 74, sg);
f.setpixel(14, 74, sf);
f.setpixel(15, 74, sf);
f.setpixel(16, 74, sg);
f.setpixel(17, 74, sg);
f.setpixel(18, 74, sg);
f.setpixel(19, 74, sg);
f.setpixel(5, 75, sg);
f.setpixel(6, 75, sg);
f.setpixel(7, 75, sg);
f.setpixel(8, 75, sg);
f.setpixel(9, 75, sg);
f.setpixel(10, 75, sg);
f.setpixel(11, 75, sg);
f.setpixel(12, 75, sg);
f.setpixel(13, 75, sg);
f.setpixel(14, 75, sf);
f.setpixel(15, 75, sf);
f.setpixel(16, 75, sg);
f.setpixel(17, 75, sg);
f.setpixel(18, 75, sg);
f.setpixel(19, 75, sg);
f.setpixel(5, 76, sg);
f.setpixel(6, 76, sg);
f.setpixel(7, 76, sg);
f.setpixel(8, 76, sg);
f.setpixel(9, 76, sg);
f.setpixel(10, 76, sg);
f.setpixel(11, 76, sg);
f.setpixel(12, 76, sg);
f.setpixel(13, 76, sg);
f.setpixel(14, 76, sf);
f.setpixel(15, 76, sf);
f.setpixel(16, 76, sg);
f.setpixel(17, 76, sg);
f.setpixel(18, 76, sg);
f.setpixel(19, 76, sg);


for ( int c = 0; c < 77; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}



