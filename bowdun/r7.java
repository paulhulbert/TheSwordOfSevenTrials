/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowdun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r7 extends room {  
    
    
    
    public r7( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
        button b1 = new every.button(1100, 500, 20, Color.YELLOW, weap3, w.lock_3, this, false);
        
        this.addplatform(b1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.junglemonkeylizard(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    
    
    
}



