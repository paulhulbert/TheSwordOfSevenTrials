/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world1;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class elderroom extends insideroom {
    
    private unit w1_vil3;
    
    private chattrigger noteandsword;
    
    public elderroom( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, constants.brown, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        w1_vil3 = new unit( 100, 0, 5, "handsword", 700, 360, new noai(), this.getweap3(), this, 100, 140 );
        
        w1_vil3.setName("Elder Quorr");
        w1_vil3.setStatement("Taldo,  goblins just came through the village.  They took the King's sword!  You have to go get it.");
        w1_vil3.setStatement("You must hurry.");
        
        trigger spoke1 = new trigger( false, "world1_elderroom_spoke1" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat("Taldo,  goblins just came through the village.  They took the King's sword!  You have to go get it.");
        chat1.addchat("You must hurry.");
        
        w1_vil3.addchattrigger(chat1);
        
        trigger gotsword = new trigger( false, "builders_halfsword_spoke1" );
        
        chattrigger chat2 = new chattrigger( gotsword );
        
        chat2.addchat("Good you got the sword back.");
        chat2.addchat("Good job Taldo.");
//        chat2.addchat("Have you spoken to the Tiln about the goblin note yet?");
        
        w1_vil3.addchattrigger(chat2);
        
        trigger gotnoteandsword = new trigger( false, "world1_wizardcom_spokeafternote" );
        
        noteandsword = new chattrigger( gotnoteandsword );
        
        noteandsword.addchat("You should do what Tiln said.");
        
        
        w1_vil3.addchattrigger( noteandsword );
        
        builders.w1_vil3build.buildvil3(w1_vil3);
        
        this.addneutral(w1_vil3);
        
        
    }
    
    
    
    
    
    
}
