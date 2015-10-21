/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class spearfaceright extends resroomclass {  
    
    
    public spearfaceright( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, room r )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, r);
        
        platform state1 = new hardblock( 400, 400, 5, 100, constants.brown, Color.BLACK, false, this.getweap3() );
        
        
        
        addplatform(state1);
        
        
        
        unit spearman = new builders.spearmanattack(weap3, this, 380, 413);
        
        spearman.setdir(2);
        
        this.addneutral(spearman);
        
        unit signpost = new sign( 800, 441, this.getweap3(), this, "Due to recent attacks by people of the Firevill, we will kill anyone who comes close." );
        
        this.addneutral(signpost);
        
    }
    
    
    
    
    
}
