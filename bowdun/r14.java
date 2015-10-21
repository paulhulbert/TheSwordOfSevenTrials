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
public class r14 extends room {  
    
    
    
    private ladder ladder1;
    
    
    public r14( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        ladder1 = new ladderdown( 900, 500, constants.bowdunfloor, this.weap3, this, constants.bowdunladder );
        
        ladder1.setWarpx(100);
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(700, 500, 200, base, Color.YELLOW, weap3, w.lock_3, panel);
        
        
        this.addplatform(l1);
        
        button b1 = new every.button(100, 500, 20, Color.RED, weap3, w.lock_1, this, false);
        
        this.addplatform(b1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.junglemonkeylizard(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
    
    
}


