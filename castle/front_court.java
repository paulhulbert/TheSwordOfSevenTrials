/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class front_court extends room2 {  
    
    
    private ImageIcon tree;
    
    public front_court( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        
        platform hard1 = new hardblock( -5, 380, 2000, 120, Color.DARK_GRAY, Color.DARK_GRAY, false, this.getweap3());
        
        this.addplatform( hard1 );
        
        unit man1 = new castle.royalguard(this, 800, 380);
        
        addneutral(man1);
        
        unit man2 = new castle.royalguard(this, 700, 380);
        
        addneutral(man2);
    }
    
    
    
    
}

