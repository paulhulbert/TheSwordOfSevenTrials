/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class castle_entry extends room2 {  
    
    
    
    public castle_entry( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        platform hard1 = new hardblock( 700, 460, 50, 40, Color.DARK_GRAY, Color.DARK_GRAY, false, this.getweap3());
        
        this.addplatform( hard1 );
        
        platform hard2 = new hardblock( 750, 420, 50, 80, Color.DARK_GRAY, Color.DARK_GRAY, false, this.getweap3());
        
        this.addplatform( hard2 );
        
        platform hard3 = new hardblock( 800, 380, 800, 120, Color.DARK_GRAY, Color.DARK_GRAY, false, this.getweap3());
        
        this.addplatform( hard3 );
        
        
        unit man1 = new castle.royalguard(this, 200, 500);
        
        addneutral(man1);
        
        unit man2 = new castle.royalguard(this, 300, 500);
        
        addneutral(man2);
        
        unit man3 = new castle.royalguard(this, 900, 380);
        
        addneutral(man3);
        
        unit man4 = new castle.royalguard(this, 1000, 380);
        
        addneutral(man4);
        
    }
    
    
    
    
    
}
